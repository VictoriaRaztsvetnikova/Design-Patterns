package OnlineFitness;

import java.util.ArrayList;
import java.util.List;

public class Trainer implements Observable {
	
   private String TrainerPosition;
   
	
	public void GetUp() {
		System.out.println("Trainer is get up!");
		this.TrainerPosition = "GetUp";
		notifyObservers();
	}
	
	public void LieDown() {
		System.out.println("Trainer is lie down!");
		this.TrainerPosition = "LieDown";
		notifyObservers();
	}

	private List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void subscrite(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : this.observers) {
			observer.update();
		}

	}

	public void setNewTrainerPosition(String TrainerPosition) {
		this.TrainerPosition = TrainerPosition;
		notifyObservers();
	}
	@Override
	public String getUpdate() {
		return this.TrainerPosition;
	}

	

}
