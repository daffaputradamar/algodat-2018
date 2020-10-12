package daffa.inheritance.percobaan6;

public class Inheritance1 {
    public static void main(String[] args) {
        StaffTetap st = new StaffTetap("2A", 100000, 200000, 250000, "Budi", "Malang", "Lakilaki", 20, 2000000);
        st.tampilStaffTetap();
        
        StaffHarian sh = new StaffHarian(100, 100000, 50000, "Indah", "Malang", "Perempuan", 27, 10000);
        sh.tampilStaffHarian();
        
    }
}
