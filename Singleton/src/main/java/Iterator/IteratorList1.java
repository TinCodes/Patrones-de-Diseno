package Iterator;

public class IteratorList1 implements Iterator {
    private int position;
    private String [] names;

    public IteratorList1(String [] names){
        this.names = names;
    }

    @Override
    public Object next(){
        return names[position++];
    }

    @Override
    public boolean hasNext(){
        return names.length != 0 && position < names.length;
    }
}
