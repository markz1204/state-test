/**
 * Created by MZhang on 7/06/2017.
 */
public class Machine {

    private State currentState;

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void accept(){
        this.currentState.accept(this);
    }

    public void assign(){
        this.currentState.assign(this);
    }

    public void send(){
        this.currentState.send(this);
    }

    public void finish(){
        this.currentState.finish(this);
    }
}
