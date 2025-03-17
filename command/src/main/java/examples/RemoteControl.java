package examples;

// This is Invoker
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            builder.append("[slot ");
            builder.append(i);
            builder.append("] ");
            builder.append(onCommands[i].getClass().getName());
            builder.append("    ");
            builder.append(offCommands[i].getClass().getName());
            builder.append("\n");
        }
        return builder.toString();
    }
}
