package SegundoParcial.State;

import java.util.ArrayList;

public class Computadora {
    private IState state;

    public void request() {
        state.handle();
    }

    public void setState(IState state){
        this.state = state;
    }

    public IState getState(){
        return state;
    }

}
