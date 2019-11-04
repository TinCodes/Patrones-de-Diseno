package Iterator.exercise;

import java.util.ArrayList;
import java.util.List;

public class Business1 implements IList{
    private List<Employee> employees = new ArrayList<>();
    private int pos;

    public Business1(){
        pos = 0;
    }

    public void add(int id){
        employees.add(new Employee(id));
        pos++;
    }

    @Override
    public BusinessIterator1 iterator() {
        return new BusinessIterator1(this.employees);
    }

}
