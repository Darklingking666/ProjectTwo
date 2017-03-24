package pro2e.Team6.userinterface;

import pro2e.Team6.MVCFramework;
import pro2e.Team6.model.Model;

public class Controller {
	private Model model;
	private MVCFramework mvcFramework;

	public Controller(Model model, MVCFramework mvcFramework) {
		this.model = model;
		this.mvcFramework = mvcFramework;

	}
}
