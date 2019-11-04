package State;

public class Context {
    private IState state;

    public void setState(IState state){
        this.state = state;
    }

    public IState getState(){
        return state;
    }

    public void request() {
        state.handle();
    }
}
