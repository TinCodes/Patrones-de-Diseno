package Memento;

public class Originator {
    private ConcreteObject state;
    public void setMemento(ConcreteObject state){
        System.out.println("Originator: Setting state to " + state.getState());
        state.show();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("Originator: Creating Memento...");
        state.show();
        return new Memento(state);
    }

    public void restoreFromMemento(Memento n){
        state = n.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state.getState());
        state.show();
    }


}
