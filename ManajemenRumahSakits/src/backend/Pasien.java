package backend;

import java.sql.*;
import java.util.*;

public class Pasien {
    private int kdPasien, kdDokter;
    private String namaPasien;
    private String alamatPasien;
    private String tglDatang;
    private String keluhan;
    private Dokter dokter;

    public int getKdPasien() {
        return kdPasien;
    }

    public void setKdPasien(int kdPasien) {
        this.kdPasien = kdPasien;
    }

    public int getKdDokter() {
        return kdDokter;
    }

    public void setKdDokter(int kdDokter) {
        this.kdDokter = kdDokter;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }
    
    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getAlamatPasien() {
        return alamatPasien;
    }

    public void setAlamatPasien(String alamatPasien) {
        this.alamatPasien = alamatPasien;
    }

    public String getTglDatang() {
        return tglDatang;
    }

    public void setTglDatang(String tglDatang) {
        this.tglDatang = tglDatang;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public Pasien() {
    }

    public Pasien(int kdDokter, String namaPasien, String alamatPasien, String keluhan) {
        this.kdDokter = kdDokter;
        this.namaPasien = namaPasien;
        this.alamatPasien = alamatPasien;
        this.keluhan = keluhan;
    }
    
    public Pasien getById(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pasien"
                + " WHERE kd_pasien = '" + id + "' AND is_deleted = 0");
        
        return binderOne(rs);
    }
    
    public Pasien getByIdWithDeleted(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pasien"
                + " WHERE kd_pasien = '" + id + "'");
        
        return binderOne(rs);
    }
    
    public ArrayList<Pasien> getAll() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pasien WHERE is_deleted = 0");
        return binderMany(rs);
    }
    
    public ArrayList<Pasien> getAllWithDeleted() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pasien");
        return binderMany(rs);
    }
    
    public ArrayList<Pasien> getAllByDoctorWait(int idDoctor) {
        ArrayList<Pembayaran> pem = new Pembayaran().getAllWhereZero();
        ArrayList<Pasien> listPasien = new ArrayList();
        for (Pembayaran pembayaran : pem) {
            if (pembayaran.getPasien().getKdDokter() == idDoctor) {
                listPasien.add(pembayaran.getPasien());
            }
        }
        return listPasien;
    }
    
    public ArrayList<Pasien> getAllByDoctorDone(int idDoctor) {
        ArrayList<Pembayaran> pem = new Pembayaran().getAllWhereNotZero();
        ArrayList<Pasien> listPasien = new ArrayList();
        for (Pembayaran pembayaran : pem) {
            if (pembayaran.getPasien().getKdDokter() == idDoctor) {
                listPasien.add(pembayaran.getPasien());
            }
        }
        return listPasien;
    }
    
    public void save() {
        if (getById(kdPasien).getKdPasien()== 0) {
            String SQL = "INSERT INTO pasien (nama_pasien, alamat_pasien, tgl_datang, keluhan, kd_dokter) VALUES("
                    + " '" + this.namaPasien + "', "
                    + " '" + this.alamatPasien + "', "
                    + " CURRENT_TIMESTAMP(), "
                    + " '" + this.keluhan + "', "
                    + " '" + this.kdDokter + "'"
                    + ")";
            this.kdPasien = DBHelper.insertQueryGetId(SQL);
            new Pembayaran(kdPasien, 0).save();
        } else {
            String SQL = "UPDATE pasien SET "
                    + " nama_pasien = '" + this.namaPasien + "', "
                    + " alamat_pasien = '" + this.alamatPasien + "', "
                    + " keluhan = '" + this.keluhan + "', "
                    + " kd_dokter = '" + this.kdDokter + "' "
                    + " WHERE kd_pasien = '" + this.kdPasien + "' ";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "UPDATE pasien SET is_deleted = 1 WHERE kd_pasien = '" + this.kdPasien + "' ";
        DBHelper.executeQuery(SQL);
    }
    
    private ArrayList<Pasien> binderMany(ResultSet rs) {
        ArrayList<Pasien> listPasien = new ArrayList();
        
        try {
            while(rs.next()) {
                Pasien pas = new Pasien();
                pas.setKdPasien(rs.getInt("kd_pasien"));
                pas.setNamaPasien(rs.getString("nama_pasien"));
                pas.setAlamatPasien(rs.getString("alamat_pasien"));
                pas.setTglDatang(rs.getString("tgl_datang"));
                pas.setKeluhan(rs.getString("keluhan"));
                pas.setKdDokter(rs.getInt("kd_dokter"));
                pas.setDokter(new Dokter().getById(pas.getKdDokter()));
                listPasien.add(pas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listPasien;
    }
    
    private Pasien binderOne(ResultSet rs) {
        Pasien pas = new Pasien();
        try {
            while(rs.next()) {
                pas.setKdPasien(rs.getInt("kd_pasien"));
                pas.setNamaPasien(rs.getString("nama_pasien"));
                pas.setAlamatPasien(rs.getString("alamat_pasien"));
                pas.setTglDatang(rs.getString("tgl_datang"));
                pas.setKeluhan(rs.getString("keluhan"));
                pas.setKdDokter(rs.getInt("kd_dokter"));
                pas.setDokter(new Dokter().getById(pas.getKdDokter()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pas;
    }
}
