package backend;

import java.sql.*;
import java.util.*;

public class Pembayaran {
    private int kdPembayaran, kdPasien;
    private int jumlahHarga;
    private int isConfirmed;
    private Pasien pasien;

    public int getKdPembayaran() {
        return kdPembayaran;
    }

    public void setKdPembayaran(int kdPembayaran) {
        this.kdPembayaran = kdPembayaran;
    }

    public int getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(int isConfirmed) {
        this.isConfirmed = isConfirmed;
    }
    
    
    public int getKdPasien() {
        return kdPasien;
    }

    public void setKdPasien(int kdPasien) {
        this.kdPasien = kdPasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public int getJumlahHarga() {
        return jumlahHarga;
    }

    public void setJumlahHarga(int jumlahHarga) {
        this.jumlahHarga = jumlahHarga;
    }

    public Pembayaran() {
    }

    public Pembayaran(int kdPasien, int jumlahHarga) {
        this.kdPasien = kdPasien;
        this.jumlahHarga = jumlahHarga;
    }
    
    public Pembayaran getById(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembayaran"
                + " WHERE kd_pembayaran = '" + id + "'");
        
        return binderOne(rs);
    }
    
    public Pembayaran getByKdPasien(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembayaran"
                + " WHERE kd_pasien = '" + id + "'");
        
        return binderOne(rs);
    }
    
    public ArrayList<Pembayaran> getAll() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembayaran");
        return binderMany(rs);
    }
    
    public ArrayList<Pembayaran> getAllWhereZero() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembayaran WHERE jumlah_harga = 0");
        return binderMany(rs);
    }
    
    public ArrayList<Pembayaran> getAllWhereNotZero() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembayaran WHERE jumlah_harga != 0");
        return binderMany(rs);
    }
    
    public ArrayList<Pembayaran> getAllWhereUnconfirmed() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembayaran WHERE is_confirmed = 0");
        return binderMany(rs);
    }
    
    public ArrayList<Pembayaran> getAllWhereConfirmed() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembayaran WHERE is_confirmed = 1");
        return binderMany(rs);
    }
    public void save() {
        if (getById(kdPembayaran).getKdPembayaran() == 0) {
            String SQL = "INSERT INTO pembayaran (kd_pasien, jumlah_harga) VALUES("
                    + " '" + this.kdPasien + "', "
                    + " '" + this.jumlahHarga + "' "
                    + ")";
            this.kdPembayaran = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE pembayaran SET "
                    + " kd_pasien = '" + this.kdPasien + "', "
                    + " jumlah_harga = '" + this.jumlahHarga + "', "
                    + " is_confirmed = '" + this.isConfirmed + "' "
                    + " WHERE kd_pembayaran = '" + this.kdPembayaran + "' ";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM pembayaran WHERE kd_pembayaran = '" + this.kdPembayaran + "' ";
        DBHelper.executeQuery(SQL);
    }
    
    private ArrayList<Pembayaran> binderMany(ResultSet rs) {
        ArrayList<Pembayaran> listPembayaran = new ArrayList();
        
        try {
            while(rs.next()) {
                Pembayaran pem = new Pembayaran();
                pem.setKdPembayaran(rs.getInt("kd_pembayaran"));
                pem.setKdPasien(rs.getInt("kd_pasien"));
                pem.setJumlahHarga(rs.getInt("jumlah_harga"));
                pem.setIsConfirmed(rs.getInt("is_confirmed"));
                pem.setPasien(new Pasien().getByIdWithDeleted(pem.getKdPasien()));
                listPembayaran.add(pem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listPembayaran;
    }
    
    private Pembayaran binderOne(ResultSet rs) {
        Pembayaran pem = new Pembayaran();
        try {
            while(rs.next()) {
                pem.setKdPembayaran(rs.getInt("kd_pembayaran"));
                pem.setKdPasien(rs.getInt("kd_pasien"));
                pem.setJumlahHarga(rs.getInt("jumlah_harga"));
                pem.setIsConfirmed(rs.getInt("is_confirmed"));
                pem.setPasien(new Pasien().getByIdWithDeleted(pem.getKdPasien()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pem;
    }
    
}
