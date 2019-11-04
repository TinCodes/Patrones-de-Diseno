package Iterator.exercise;

import java.util.Stack;

public class Business4 implements IList{

    private Stack<Employee> employees = new Stack<>();

    public Business4(){

    }

    public void add(int id){
        employees.push(new Employee(id));
    }

    @Override
    public BusinessIterator4 iterator() {
        return new BusinessIterator4(this.employees);
    }

}
