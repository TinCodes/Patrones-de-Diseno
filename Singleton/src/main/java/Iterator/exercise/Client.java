package Iterator.exercise;

import java.util.HashMap;

public class Client {
    public static void main(String []args){
        Business1 list1 = new Business1();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        Business2 list2 = new Business2();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        Business3 list3 = new Business3();
        list3.add(7);
        list3.add(8);
        list3.add(9);

        Business4 list4 = new Business4();
        list4.add(10);
        list4.add(11);
        list4.add(12);

        HashMap<Integer,Object> all = new HashMap<>();
        int pos = 0;


        Iterator iterator;
        iterator = list1.iterator();
        while ( iterator.hasNext() ){
            int value = iterator.next();
            all.put(pos++,value);
            System.out.println("Value added: " +  value);
        }

        iterator = list2.iterator();
        while ( iterator.hasNext() ){
            int value =  (int) iterator.next();
            all.put(pos++,value);
            System.out.println("Value added: " + value);
        }

        iterator = list3.iterator();
        while ( iterator.hasNext() ){
            int value =  (int) iterator.next();
            all.put(pos++,value);
            System.out.println("Value added: " + value);
        }

        iterator = list4.iterator();
        while ( iterator.hasNext() ){
            int value =  (int) iterator.next();
            all.put(pos++,value);
            System.out.println("Value added: " + value);
        }
    }
}
