package Iterator.exercise;

import java.util.Vector;

public class Business3 implements IList{
    private Vector<Employee> employees = new Vector<>();

    public Business3(){
        this.employees = employees;
    }

    public void add(int id){
        employees.add(new Employee(id));
    }

    @Override
    public BusinessIterator3 iterator() {
        return new BusinessIterator3(this.employees);
    }
}
