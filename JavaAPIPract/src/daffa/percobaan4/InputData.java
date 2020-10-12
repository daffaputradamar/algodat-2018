package daffa.percobaan4;

import java.util.*;

public class InputData {
    ArrayList<Mahasiswa> ListMahasiswa;

    public InputData() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiData(String nim, String nama, String alamat) {
        Mahasiswa mhs = new Mahasiswa(nim, nama, alamat);
        ListMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa> getData() {
        return ListMahasiswa;
    }
}
