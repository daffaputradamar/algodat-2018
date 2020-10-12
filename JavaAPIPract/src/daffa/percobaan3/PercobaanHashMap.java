package daffa.percobaan3;

import java.util.*;

public class PercobaanHashMap {
    public static void main(String[] args) {
        HashMap hMap = new HashMap();
        
        hMap.put("1", "Adi");
        hMap.put("2", "Bagus");
        hMap.put("3", "Sintia");
        
        Collection c = hMap.values();
        Iterator itr = c.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        System.out.println("Total HashMap adalah : " + hMap.size());
        
        System.out.println("=====================================");
        
        Object obj = hMap.remove("2");
        System.out.println(obj + "Dihapus dari HashMap");
        System.out.println("Total HashMap adalah : " + hMap.size());
        System.out.println(hMap);
        
        System.out.println("=====================================");
        
        hMap.clear();
        System.out.println("Total HashMap adalah : " + hMap.size());

    }
}
