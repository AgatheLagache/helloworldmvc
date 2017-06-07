package org.helloworldmvc.main;

import org.helloworldmvc.contract.IModel;
import org.helloworldmvc.contract.IView;
import org.helloworldmvc.controller.Controller;
import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) {
		IModel model = new Model();
		IView view = new View();
		Controller controller = new Controller(view, model);
		controller.run();
	}
}

