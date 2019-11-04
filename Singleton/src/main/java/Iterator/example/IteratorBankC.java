package Iterator.example;

import java.util.HashMap;

public class IteratorBankC implements Iterator{
    private int position;
    private HashMap<Integer,Customer> names;

    public IteratorBankC(HashMap<Integer,Customer> names){
        this.names = names;
    }

    @Override
    public Object next(){
        String name = names.get(position).getName() + " " + names.get(position).getLastname();
        position++;
        return name;
    }

    @Override
    public boolean hasNext(){
        return names.size() != 0 && position < names.size();
    }
}
