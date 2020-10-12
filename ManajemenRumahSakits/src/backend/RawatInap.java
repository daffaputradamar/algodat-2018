package backend;

import java.sql.*;
import java.util.*;

public class RawatInap {
    private int kdRawatinap, kdKamar, kdPasien;
    private Kamar kamar;
    private Pasien pasien;

    public int getKdRawatinap() {
        return kdRawatinap;
    }

    public void setKdRawatinap(int kdRawatinap) {
        this.kdRawatinap = kdRawatinap;
    }

    public int getKdKamar() {
        return kdKamar;
    }

    public void setKdKamar(int kdKamar) {
        this.kdKamar = kdKamar;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    public int getKdPasien() {
        return kdPasien;
    }

    public void setKdPasien(int kdPasien) {
        this.kdPasien = kdPasien;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public RawatInap(int kdKamar, int kdPasien) {
        this.kdKamar = kdKamar;
        this.kdPasien = kdPasien;
    }

    public RawatInap() {
    }
    
    public RawatInap getById(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM rawat_inap"
                + " WHERE kd_rawatinap = '" + id + "' AND is_deleted = 0");
        
        return binderOne(rs);
    }
    
    public ArrayList<RawatInap> getAll() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM rawat_inap WHERE is_deleted = 0");
        return binderMany(rs);
    }
    
    public void save() {
        if (getById(kdRawatinap).getKdRawatinap() == 0) {
            String SQL = "INSERT INTO rawat_inap (kd_kamar, kd_pasien) VALUES("
                    + " '" + this.kdKamar + "', "
                    + " '" + this.kdPasien + "' "
                    + ")";
            this.kdRawatinap = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE rawat_inap SET "
                    + " kd_pasien = '" + this.kdPasien + "', "
                    + " kd_kamar = '" + this.kdKamar + "' "
                    + " WHERE kd_rawatinap = '" + this.kdRawatinap + "' ";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "UPDATE rawat_inap SET is_deleted = 1 WHERE kd_rawatinap = '" + this.kdRawatinap + "' ";
        DBHelper.executeQuery(SQL);
    }
    
    private ArrayList<RawatInap> binderMany(ResultSet rs) {
        ArrayList<RawatInap> listRawatInap = new ArrayList();
        
        try {
            while(rs.next()) {
                RawatInap raw = new RawatInap();
                raw.setKdRawatinap(rs.getInt("kd_rawatinap"));
                raw.setKdPasien(rs.getInt("kd_pasien"));
                raw.setKdKamar(rs.getInt("kd_kamar"));
                raw.setPasien(new Pasien().getById(raw.getKdPasien()));
                raw.setKamar(new Kamar().getById(raw.getKdKamar()));
                listRawatInap.add(raw);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listRawatInap;
    }
    
    private RawatInap binderOne(ResultSet rs) {
        RawatInap raw = new RawatInap();
        try {
            while(rs.next()) {
                raw.setKdRawatinap(rs.getInt("kd_rawatinap"));
                raw.setKdPasien(rs.getInt("kd_pasien"));
                raw.setKdKamar(rs.getInt("kd_kamar"));
                raw.setPasien(new Pasien().getById(raw.getKdPasien()));
                raw.setKamar(new Kamar().getById(raw.getKdKamar()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return raw;
    }
}
