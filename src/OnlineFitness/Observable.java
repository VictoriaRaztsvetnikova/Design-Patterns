package OnlineFitness;

public interface Observable {

	public void subscrite(Observer observer);
	public void unsubscribe(Observer observer);
	public void notifyObservers();
	public String getUpdate();
}
