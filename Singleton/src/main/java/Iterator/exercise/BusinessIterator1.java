package Iterator.exercise;

import java.util.ArrayList;
import java.util.List;

public class BusinessIterator1 implements Iterator {
    private List<Employee> employees = new ArrayList<>();
    private int pos;

    public BusinessIterator1(List<Employee> employees){
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
