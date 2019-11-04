package Iterator.example;

public class IteratorBankA implements Iterator {
    private int position;
    private Customer [] names;

    public IteratorBankA(Customer [] names){
        this.names = names;
    }

    @Override
    public Object next(){
        String name = names[position].getName() + " " + names[position].getLastname();
        position++;
        return name;
    }

    @Override
    public boolean hasNext(){
        return names.length != 0 && position < names.length;
    }
}
