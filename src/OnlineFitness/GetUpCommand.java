package OnlineFitness;

public class GetUpCommand implements Command {

	private Trainer trainer;
	
	public GetUpCommand(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public void execute() {
		this.trainer.GetUp();
	}

}
