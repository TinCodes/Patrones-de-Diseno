package Iterator.example;

public class BankA implements IList{
    private Customer [] customers;
    private int position;

    public BankA(){
        position = 0;
        customers = new Customer[5];
    }

    public void add(Customer value){
        customers[position] = value;
        position++;
    }

    @Override
    public IteratorBankA iterator() {
        return new IteratorBankA(this.customers);
    }

}
