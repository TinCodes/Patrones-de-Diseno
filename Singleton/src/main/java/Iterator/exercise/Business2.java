package Iterator.exercise;

public class Business2 implements IList{
    private Employee [] employees;
    private int position;

    public Business2(){
        position = 0;
        employees = new Employee[3];
    }

    public void add(int id){
        employees[position] = new Employee(id);
        position++;
    }

    @Override
    public BusinessIterator2 iterator() {
        return new BusinessIterator2(this.employees);
    }
}
