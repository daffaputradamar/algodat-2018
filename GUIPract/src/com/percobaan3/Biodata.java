package com.percobaan3;

public class Biodata {
    private String nim, nama, jurusan, gender;
    private boolean baca, makan, tidur;
    private String alamat;

    public Biodata() {
    }
    
    public Biodata(String nim, String nama, String jurusan, String gender, boolean baca, boolean makan, boolean tidur, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.gender = gender;
        this.baca = baca;
        this.makan = makan;
        this.tidur = tidur;
        this.alamat = alamat;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isBaca() {
        return baca;
    }

    public void setBaca(boolean baca) {
        this.baca = baca;
    }

    public boolean isMakan() {
        return makan;
    }

    public void setMakan(boolean makan) {
        this.makan = makan;
    }

    public boolean isTidur() {
        return tidur;
    }

    public void setTidur(boolean tidur) {
        this.tidur = tidur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nim: ").append(this.nim).append("\n");
        sb.append("Nama: ").append(this.nama).append("\n");
        sb.append("Jurusan: ").append(this.jurusan != null ? this.jurusan: "-").append("\n");
        sb.append("Gender: ").append(this.gender != null ? this.gender : "-").append("\n");
        sb.append("Hobi: \n");
        if (this.baca) {
            sb.append("-  Membaca").append("\n");
        }
        if (this.makan) {
            sb.append("-  Makan").append("\n");
        }
        if (this.tidur) {
            sb.append("-  Tidur").append("\n");
        }
        sb.append("\nAlamat: ").append(this.alamat).append("\n");
        return sb.toString();
    }
    
    
}
