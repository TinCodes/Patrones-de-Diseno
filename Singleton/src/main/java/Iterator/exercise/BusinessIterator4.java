package Iterator.exercise;

import java.util.Stack;

public class BusinessIterator4 implements Iterator{

    private Stack<Employee> employees = new Stack<>();
    private int pos;

    public BusinessIterator4(Stack<Employee> employees){
        this.employees = employees;
    }

    @Override
    public int next(){
        return employees.pop().getId();
    }

    @Override
    public boolean hasNext(){
        return employees.size() != 0 && pos < employees.size();
    }

}
