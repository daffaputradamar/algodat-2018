package daffa.percobaan2;

import java.util.*;

public class PercobaanList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Apel");
        list.add("Strawberry");
        list.add("Durian");
        list.add("Jeruk");
        list.add("Anggur");
//        System.out.println(list);
//        System.out.println("List ke-2 : " + list.get(2));
//        System.out.println("List ke-0 : " + list.get(0));
        
        System.out.println("Daftar Buah - Buahan: ");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
            
        }
    }
}
