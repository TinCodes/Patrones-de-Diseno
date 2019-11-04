package Iterator.example;

public class Client {
    public static void main(String []args){
        BankA list1 = new BankA();
        list1.add(new Customer("Juan","Juanes"));
        list1.add(new Customer("Alvaro", "Alvarez"));
        list1.add(new Customer("Muerte","Ardiente"));
        list1.add(new Customer("Quien","Sabe"));
        list1.add(new Customer("Kein","Becil"));

        BankB list2 = new BankB();
        list2.add(new Customer("Esteban", "Quito"));
        list2.add(new Customer("Chan","Guito"));
        list2.add(new Customer("Flor","Cita"));
        list2.add(new Customer("Nombre","X"));

        BankC list3 = new BankC();
        list3.add(new Customer("Lol", "Lolingson"));
        list3.add(new Customer("Pan","Cito"));
        list3.add(new Customer("Geno","Beba"));
        list3.add(new Customer("Jacki","Sieras"));


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

        iterator = list3.iterator();
        while ( iterator.hasNext() ){
            String value =  (String) iterator.next();
            System.out.println("Value: " + value);
        }
    }
}
