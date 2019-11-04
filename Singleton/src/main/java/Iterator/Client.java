package Iterator;

public class Client {
    public static void main(String []args){
        List1 list1 = new List1();
        list1.add("10");
        list1.add("20");
        list1.add("30");
        list1.add("40");

        List2 list2 = new List2();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");

        Iterator iterator;
        iterator = list1.iterator();
        while ( iterator.hasNext() ){
            String value =  (String) iterator.next();
            System.out.println("Value: " +  value);
        }

        iterator = list2.iterator();
        while ( iterator.hasNext() ){
            String value =  (String) iterator.next();
            System.out.println("Value: " + value);
        }

    }
}
