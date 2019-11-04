package Iterator.example;

import java.util.List;
import java.util.Vector;

public class IteratorBankB implements Iterator {

    private int position;
    private List<Customer> names;

    public IteratorBankB(List<Customer> names){
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
