
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class NewClass {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Senin");
        ll.add("Selasa");
        ll.add("Rabu");

        LinkedList ll2 = new LinkedList();
        ll2.add("lowokwaru");
        ll2.add("klojen");
        ll2.add("sukun");

        HashMap<String, LinkedList> hm = new HashMap();
        hm.put("hari", ll);
        hm.put("kecamatan", ll2);

        LinkedList daat = hm.get("hari");
        LinkedList kec = hm.get("kecamatan");

        Iterator it = kec.listIterator();
        while (it.hasNext()) {
            System.out.println("" + it.next());
        }
    }
}
