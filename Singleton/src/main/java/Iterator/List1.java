package Iterator;

public class List1 implements IList {
    private int position;
    private String [] names;
    public List1(){
        position = 0;
        names = new String[4];
    }

    public void add(String value){
        names[position] = value;
        position++;
    }

    @Override
    public IteratorList1 iterator() {
        return new IteratorList1(this.names);
    }
}
