package kuis1;

public class Mahasiswa {
    String nim;
    String nama;
    double[] ipSemester = new double[4];
    String kelas;
    
    double hitungIpRataRata(){
        int rata_rata = 0;
        for (int i = 0; i < ipSemester.length; i++) {
            rata_rata += ipSemester[i];
        }
        return rata_rata/ipSemester.length;
    }
    
    void tampil(){
        System.out.println("NIM \t: " + nim);
        System.out.println("Nama \t: " + nama);
        System.out.println("IP: ");
        for (int i = 0; i < ipSemester.length; i++) {
            System.out.print("Semester ke-"+(i+1)+": ");
            System.out.println(ipSemester[i]);
        }
        System.out.println("Kelas\t: "+ kelas);
    }
}
