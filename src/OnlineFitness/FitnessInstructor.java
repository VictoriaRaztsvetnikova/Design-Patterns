package OnlineFitness;

public class FitnessInstructor {

	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void GiveInstructions() {
		this.command.execute();
	}
}
