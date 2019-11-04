package Iterator;

import java.util.Vector;

public class IteratorList2 implements Iterator{

    private int position;
    private Vector<String> names;

    public IteratorList2(Vector<String> names){
        this.names = names;
    }

    @Override
    public Object next(){
        return names.get(position++);
    }

    @Override
    public boolean hasNext(){
        return names.size() != 0 && position < names.size();
    }

}
