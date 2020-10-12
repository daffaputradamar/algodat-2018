package backend;

import java.sql.*;
import java.util.*;

public class Spesialisasi {
    private int kdSpesialisasi;
    private String nama;    

    public int getKdSpesialisasi() {
        return kdSpesialisasi;
    }

    public void setKdSpesialisasi(int kdSpesialisasi) {
        this.kdSpesialisasi = kdSpesialisasi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Spesialisasi() {
    }

    public Spesialisasi(String nama) {
        this.nama = nama;
    }
    
    public Spesialisasi getById(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM spesialisasi"
                + " WHERE kd_spesialisasi = '" + id + "'");
        
        return binderOne(rs);
    }
    
    public Spesialisasi getByName(String name) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM spesialisasi "
                + "WHERE nama = '" + name + "'");
        return binderOne(rs);
    }
    
    public ArrayList<Spesialisasi> getAll() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM spesialisasi");
        return binderMany(rs);
    }
    
    private ArrayList<Spesialisasi> binderMany(ResultSet rs) {
        ArrayList<Spesialisasi> listSpesialisasi = new ArrayList();
        
        try {
            while(rs.next()) {
                Spesialisasi spe = new Spesialisasi();
                spe.setKdSpesialisasi(rs.getInt("kd_spesialisasi"));
                spe.setNama(rs.getString("nama"));
                
                listSpesialisasi.add(spe);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listSpesialisasi;
    }
    
    private Spesialisasi binderOne(ResultSet rs) {
        Spesialisasi spe = new Spesialisasi();
        try {
            while(rs.next()) {
                spe = new Spesialisasi();
                spe.setKdSpesialisasi(rs.getInt("kd_spesialisasi"));
                spe.setNama(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return spe;
    }

    @Override
    public String toString() {
        return nama;
    }
    
    
}
