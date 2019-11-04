package Iterator.example;

import java.util.ArrayList;
import java.util.List;

public class BankB implements IList{
    List<Customer> customers;

    public BankB(){
        customers = new ArrayList<>();
    }

    public void add(Customer value){
       customers.add(value);
    }

    @Override
    public IteratorBankB iterator() {
        return new IteratorBankB(this.customers);
    }
}
