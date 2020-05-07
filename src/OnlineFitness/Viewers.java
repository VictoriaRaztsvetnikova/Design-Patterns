package OnlineFitness;

public class Viewers implements Observer {

	private String name;
	private Observable trainerPosition;

	public Viewers(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.trainerPosition == null) {
			System.out.println("There is no trainer!");
		}
		String latestTrainer = this.trainerPosition.getUpdate();
		System.out.println(name +" updated " + latestTrainer);
	}

	@Override
	public void setTraining(Observable training) {
		this.trainerPosition = trainerPosition;
	}
}
