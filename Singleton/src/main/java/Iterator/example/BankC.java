package Iterator.example;

import java.util.HashMap;

public class BankC implements IList{
    private HashMap<Integer,Customer> customers;
    private int position;

    public BankC(){
        customers = new HashMap<>();
        position = 0;
    }

    public void add(Customer value){
        customers.put(position,value);
        position++;
    }

    @Override
    public IteratorBankC iterator() {
        return new IteratorBankC(this.customers);
    }
}
