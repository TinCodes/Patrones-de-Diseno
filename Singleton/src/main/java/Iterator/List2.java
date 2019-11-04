package Iterator;

import java.util.Vector;

public class List2 implements IList {

    Vector<String> names;

    public List2(){
        names = new Vector<>();
    }

    public void add(String value){
        names.add(value);
    }

    @Override
    public IteratorList2 iterator(){
        return new IteratorList2(this.names);
    }

}
