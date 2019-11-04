package Composite.exercise;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();
    private int est;

    public Composite(int est){
        super(est);
    }

    public int getEst(){
        return this.est;
    }

    @Override
    public void estimacion(){
        // some actions when we iterate with list
        for (Component comp : list){
            comp.setEst(comp.getEst()+1);
            comp.estimacion();
        }
    }

    @Override
    public void add(Component component){
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void getChild(int pos){
        System.out.println(list.get(pos).getEst());
    }
}
