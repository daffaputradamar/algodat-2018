package kuliahtugas;

public class Jurusan {
    private String nama;
    private Prodi[] prod;
    
    public Jurusan(String nama){
        this.nama = nama;
    }
    
    public Jurusan(int jml) {
        prod = new Prodi[jml];
        initProdi();
    }
   
    public Jurusan(){
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Prodi[] getProd() {
        return prod;
    }

    public void setProd(Prodi[] prod) {
        this.prod = prod;
    }
    
    private void initProdi(){
        for (int i = 0; i < prod.length; i++) {
            this.prod[i] = new Prodi();
        }
    }

    public void tampilkanInfo() {
        System.out.println("Jurusan");
        System.out.println("\tNama    : " + nama);
    }
    
    public void tampilkanProdi(){
        for (Prodi prodi : prod) {
            prodi.tampilkanInfo();
        }
    }
    
}
