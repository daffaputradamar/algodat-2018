package daffa.relasiclass.percobaan4;

public class MainPercobaan4 {

    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);

        Penumpang budi = new Penumpang("67890", "Budi");
        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.info());
    }
}
