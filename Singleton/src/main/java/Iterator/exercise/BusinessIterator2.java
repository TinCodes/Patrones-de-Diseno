package Iterator.exercise;

public class BusinessIterator2 implements Iterator{

    private int position;
    private Employee [] employees;

    public BusinessIterator2(Employee [] employees){
        this.employees = employees;
    }

    @Override
    public int next(){
        return employees[position++].getId();
    }

    @Override
    public boolean hasNext(){
        return employees.length != 0 && position < employees.length;
    }
    
}
