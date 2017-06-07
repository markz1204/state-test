/**
 * Created by MZhang on 7/06/2017.
 */
public enum State {

    NEW{
        @Override
        public void accept(Machine machine) {
            System.out.println("Cannot do 'accept' in state: " + machine.getCurrentState());
        }

        @Override
        public void assign(Machine machine) {
            machine.setCurrentState(BOOKED);
        }

        @Override
        public void send(Machine machine) {
            System.out.println("Cannot do 'send' in state: " + machine.getCurrentState());
        }

        @Override
        public void finish(Machine machine) {
            System.out.println("Cannot do 'finish' in state: " + machine.getCurrentState());
        }
    },

    BOOKED{
        @Override
        public void accept(Machine machine) {
            System.out.println("Cannot do 'accept' in state: " + machine.getCurrentState());
        }

        @Override
        public void assign(Machine machine) {
            System.out.println("Cannot do 'assign' in state: " + machine.getCurrentState());
        }

        @Override
        public void send(Machine machine) {
            machine.setCurrentState(IN_TRANSIT);
        }

        @Override
        public void finish(Machine machine) {
            System.out.println("Cannot do 'finish' in state: " + machine.getCurrentState());
        }
    },

    IN_TRANSIT{
        @Override
        public void accept(Machine machine) {
            System.out.println("Cannot do 'accept' in state: " + machine.getCurrentState());
        }

        @Override
        public void assign(Machine machine) {
            System.out.println("Cannot do 'assign' in state: " + machine.getCurrentState());
        }

        @Override
        public void send(Machine machine) {
            System.out.println("Cannot do 'send' in state: " + machine.getCurrentState());
        }

        @Override
        public void finish(Machine machine) {
            machine.setCurrentState(COMPLETE);
        }
    },

    COMPLETE{
        @Override
        public void accept(Machine machine) {
            System.out.println("Cannot do 'accept' in state: " + machine.getCurrentState());
        }

        @Override
        public void assign(Machine machine) {
            System.out.println("Cannot do 'assign' in state: " + machine.getCurrentState());
        }

        @Override
        public void send(Machine machine) {
            System.out.println("Cannot do 'send' in state: " + machine.getCurrentState());
        }

        @Override
        public void finish(Machine machine) {
            System.out.println("Cannot do 'finish' in state: " + machine.getCurrentState());
        }
    };

    State() {

    }

    public abstract void accept(Machine machine);
    public abstract void assign(Machine machine);
    public abstract void send(Machine machine);
    public abstract void finish(Machine machine);
}
