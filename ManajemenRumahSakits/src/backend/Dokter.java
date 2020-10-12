package backend;

import java.sql.*;
import java.util.*;

public class Dokter implements CanLogin {
    private int kdDokter, kdSpesialisasi;
    private String namaDokter;
    private String password;
    private String alamatDokter;
    private Spesialisasi spesialisasi;

    public int getKdDokter() {
        return kdDokter;
    }

    public void setKdDokter(int kdDokter) {
        this.kdDokter = kdDokter;
    }

    public int getKdSpesialisasi() {
        return kdSpesialisasi;
    }

    public void setKdSpesialisasi(int kdSpesialisasi) {
        this.kdSpesialisasi = kdSpesialisasi;
    }

    public void setSpesialisasi(Spesialisasi spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public Spesialisasi getSpesialisasi() {
        return spesialisasi;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamatDokter() {
        return alamatDokter;
    }

    public void setAlamatDokter(String alamatDokter) {
        this.alamatDokter = alamatDokter;
    }

    public Dokter() {
    }

    public Dokter(int kdSpesialisasi, String namaDokter, String password, String alamatDokter) {
        this.kdSpesialisasi = kdSpesialisasi;
        this.namaDokter = namaDokter;
        this.password = password;
        this.alamatDokter = alamatDokter;
    }
    
    public Dokter getByIdWithDeleted(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM dokter"
                + " WHERE kd_dokter = '" + id + "'");
        
        return binderOne(rs);
    }
    
    public Dokter getById(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM dokter"
                + " WHERE kd_dokter = '" + id + "' AND is_deleted = 0");
        
        return binderOne(rs);
    }
    
    public Dokter getByName(String name) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM dokter"
                + " WHERE nama_dokter = '" + name + "' AND is_deleted = 0");
        
        return binderOne(rs);
    }
    
    public ArrayList<Dokter> getBySpesialisasi(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM dokter "
                + "WHERE kd_spesialisasi = '" + id + "' AND is_deleted = 0");
        return binderMany(rs);
    }
    
    public ArrayList<Dokter> getAllWithDeleted() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM dokter");
        return binderMany(rs);
    }
    
    public ArrayList<Dokter> getAll() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM dokter WHERE is_deleted = 0");
        return binderMany(rs);
    }
    
    public void save() {
        if (getById(kdDokter).getKdDokter() == 0) {
            String SQL = "INSERT INTO dokter (nama_dokter, password, alamat_dokter, kd_spesialisasi) VALUES("
                    + " '" + this.namaDokter + "', "
                    + " '" + this.password + "', "
                    + " '" + this.alamatDokter + "', "
                    + " '" + this.kdSpesialisasi + "' "
                    + ")";
            this.kdDokter = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE dokter SET "
                    + " nama_dokter = '" + this.namaDokter + "', "
                    + " alamat_dokter = '" + this.alamatDokter + "', "
                    + " kd_spesialisasi = '" + this.kdSpesialisasi + "' "
                    + " WHERE kd_dokter = '" + this.kdDokter + "' ";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "UPDATE dokter SET is_deleted = 1 WHERE kd_dokter = '" + this.kdDokter +"' ";
        DBHelper.executeQuery(SQL);
    }
    
    private ArrayList<Dokter> binderMany(ResultSet rs) {
        ArrayList<Dokter> listDokter = new ArrayList();
        
        try {
            while(rs.next()) {
                Dokter dok = new Dokter();
                dok.setKdDokter(rs.getInt("kd_dokter"));
                dok.setNamaDokter(rs.getString("nama_dokter"));
                dok.setAlamatDokter(rs.getString("alamat_dokter"));
                dok.setKdSpesialisasi(rs.getInt("kd_spesialisasi"));
                dok.setSpesialisasi(new Spesialisasi().getById(dok.getKdSpesialisasi()));
                listDokter.add(dok);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listDokter;
    }
    
    private Dokter binderOne(ResultSet rs) {
        Dokter dok = new Dokter();
        try {
            while(rs.next()) {
                dok.setKdDokter(rs.getInt("kd_dokter"));
                dok.setNamaDokter(rs.getString("nama_dokter"));
                dok.setAlamatDokter(rs.getString("alamat_dokter"));
                dok.setKdSpesialisasi(rs.getInt("kd_spesialisasi"));
                dok.setSpesialisasi(new Spesialisasi().getById(dok.getKdSpesialisasi()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dok;
    }

    @Override
    public String toString() {
        return namaDokter; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean login() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM dokter "
                + "WHERE kd_dokter = '"+ kdDokter +"' AND password = '" + password + "' AND is_deleted = 0");
        Dokter dok = new Dokter();
        try {
            while(rs.next()) {
                dok.setKdDokter(rs.getInt("kd_dokter"));
                dok.setPassword(rs.getString("password"));   
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return dok.getKdDokter() != 0;
    }
    
    
}