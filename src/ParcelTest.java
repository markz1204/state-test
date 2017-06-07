import java.util.ArrayList;
import java.util.List;

/**
 * Created by MZhang on 7/06/2017.
 */
public class ParcelTest {

    public static void main(String[] args){

        Machine machine = new Machine();

        List<State> states = new ArrayList<>();
        states.add(State.NEW);
        states.add(State.IN_TRANSIT);
        states.add(State.COMPLETE);
        states.add(State.BOOKED);

        states.forEach(state -> {
            machine.setCurrentState(state);
            machine.accept();
        });

        states.forEach(state -> {
            machine.setCurrentState(state);
            machine.send();
        });

        states.forEach(state -> {
            machine.setCurrentState(state);
            machine.assign();
        });

    }
}
