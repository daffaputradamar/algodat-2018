package backend;

import java.sql.*;
import java.util.*;

public class Kamar {
    private int kdKamar;
    private String namaKamar;

    public int getKdKamar() {
        return kdKamar;
    }

    public void setKdKamar(int kdKamar) {
        this.kdKamar = kdKamar;
    }

    public String getNamaKamar() {
        return namaKamar;
    }

    public void setNamaKamar(String namaKamar) {
        this.namaKamar = namaKamar;
    }

    public Kamar() {
    }

    public Kamar(String namaKamar) {
        this.namaKamar = namaKamar;
    }
    
    public Kamar getById(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kamar"
                + " WHERE kd_kamar = '" + id + "' AND is_deleted = 0");
        
        return binderOne(rs);
    }
    
    public Kamar getByName(String name) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kamar"
                + " WHERE nama_kamar = '" + name + "' AND is_deleted = 0");
        
        return binderOne(rs);
    }
    
    public ArrayList<Kamar> getAll() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kamar WHERE is_deleted = 0");
        return binderMany(rs);
    }
    
    public void save() {
        if (getById(kdKamar).getKdKamar()== 0) {
            String SQL = "INSERT INTO kamar (nama_kamar) VALUES("
                    + " '" + this.namaKamar + "' "
                    + ")";
            this.kdKamar = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE kamar SET "
                    + " nama_kamar = '" + this.namaKamar + "' "
                    + " WHERE kd_kamar = '" + this.kdKamar + "' ";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "UPDATE kamar SET is_deleted = 1 WHERE kd_kamar = '" + this.kdKamar + "' ";
        DBHelper.executeQuery(SQL);
    }
    
    private ArrayList<Kamar> binderMany(ResultSet rs) {
        ArrayList<Kamar> listKamar = new ArrayList();
        
        try {
            while(rs.next()) {
                Kamar kam = new Kamar();
                kam.setKdKamar(rs.getInt("kd_kamar"));
                kam.setNamaKamar(rs.getString("nama_kamar"));
                listKamar.add(kam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listKamar;
    }
    
    private Kamar binderOne(ResultSet rs) {
        Kamar kam = new Kamar();
        try {
            while(rs.next()) {
                kam.setKdKamar(rs.getInt("kd_kamar"));
                kam.setNamaKamar(rs.getString("nama_kamar"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kam;
    }

    @Override
    public String toString() {
        return namaKamar; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
