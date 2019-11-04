package Iterator.exercise;

import java.util.Vector;

public class BusinessIterator3 implements Iterator{

    private Vector<Employee> employees = new Vector<>();
    private int pos;

    public BusinessIterator3(Vector<Employee> employees){
        this.employees = employees;
    }

    @Override
    public int next(){
        return employees.get(pos++).getId();
    }

    @Override
    public boolean hasNext(){
        return employees.size() != 0 && pos < employees.size();
    }
}
