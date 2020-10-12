package backend;

import java.sql.*;
import java.util.*;

public class Petugas implements CanLogin{
    private int kdPetugas;
    private String namaPetugas;
    private String password;
    private String alamatPetugas;

    public int getKdPetugas() {
        return kdPetugas;
    }

    public void setKdPetugas(int kdPetugas) {
        this.kdPetugas = kdPetugas;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamatPetugas() {
        return alamatPetugas;
    }

    public void setAlamatPetugas(String alamatPetugas) {
        this.alamatPetugas = alamatPetugas;
    }

    public Petugas() {
    }

    public Petugas(String namaPetugas, String password, String alamatPetugas) {
        this.namaPetugas = namaPetugas;
        this.password = password;
        this.alamatPetugas = alamatPetugas;
    }
    
    public Petugas getById(int id) {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM petugas"
                + " WHERE kd_petugas = '" + id + "'");
        
        return binderOne(rs);
    }
    
    public ArrayList<Petugas> getAll() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM petugas");
        return binderMany(rs);
    }
    
    public void save() {
        if (getById(kdPetugas).getKdPetugas()== 0) {
            String SQL = "INSERT INTO petugas (nama_petugas, password, alamat_petugas) VALUES("
                    + " '" + this.namaPetugas + "', "
                    + " '" + this.password + "', "
                    + " '" + this.alamatPetugas + "'"
                    + ")";
            this.kdPetugas = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE petugas SET "
                    + " nama_petugas = '" + this.namaPetugas + "', "
                    + " password = '" + this.password + "', "
                    + " alamat_petugas = '" + this.alamatPetugas + "' "
                    + " WHERE kd_petugas = '" + this.kdPetugas + "' ";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM petugas WHERE kd_petugas = '" + this.kdPetugas + "' ";
        DBHelper.executeQuery(SQL);
    }
    
    private ArrayList<Petugas> binderMany(ResultSet rs) {
        ArrayList<Petugas> listDokter = new ArrayList();
        
        try {
            while(rs.next()) {
                Petugas pet = new Petugas();
                pet = new Petugas();
                pet.setKdPetugas(rs.getInt("kd_petugas"));
                pet.setNamaPetugas(rs.getString("nama_petugas"));
                pet.setAlamatPetugas(rs.getString("alamat_petugas"));
                
                listDokter.add(pet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listDokter;
    }
    
    private Petugas binderOne(ResultSet rs) {
        Petugas pet = new Petugas();
        try {
            while(rs.next()) {
                pet = new Petugas();
                pet.setKdPetugas(rs.getInt("kd_petugas"));
                pet.setNamaPetugas(rs.getString("nama_petugas"));
                pet.setAlamatPetugas(rs.getString("alamat_petugas"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pet;
    }

    @Override
    public boolean login() {
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM petugas "
                + "WHERE kd_petugas = '"+ kdPetugas +"' AND password = '" + password + "'");
        Petugas dok = new Petugas();
        try {
            while(rs.next()) {
                dok.setKdPetugas(rs.getInt("kd_petugas"));
                dok.setPassword(rs.getString("password"));   
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return dok.getKdPetugas()!= 0;
    }
}
