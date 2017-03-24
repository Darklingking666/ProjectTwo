package pro2e.Team6.model;
import java.util.Observable;

public class Model extends Observable {
	
	private Measurement measurement;
	private Modeling modeling;
	
	public Model() {
		measurement = new Measurement();
		modeling = new Modeling();
	}
}
