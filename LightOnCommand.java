
//Concrete Command
public class LightOnCommand implements Command {
    // reference to the light
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        System.out.println("execute LightOnCommand switchOn...");
        light.switchOn();
    }
}