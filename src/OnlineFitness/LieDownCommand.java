package OnlineFitness;

public class LieDownCommand implements Command {

	private Trainer trainer;
	
	public LieDownCommand(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public void execute() {
	this.trainer.LieDown();
	}

}
