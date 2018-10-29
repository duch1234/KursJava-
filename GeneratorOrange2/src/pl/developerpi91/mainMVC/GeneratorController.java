package pl.developerpi91.mainMVC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pl.developerpi91.viewActionListener.CardTypeListener;
import pl.developerpi91.viewActionListener.CheckSumListener;
import pl.developerpi91.viewActionListener.InputListenerValidator;
import pl.developerpi91.viewActionListener.ButtonListener;


public class GeneratorController {

	private GeneratorView view;
	private GeneratorModel model;
	
    private static final Logger LOG = LogManager.getLogger(GeneratorController.class);

	public GeneratorController(GeneratorModel model,GeneratorView view) {
		this.view = view;
		this.model = model;
		
		this.view.addCardTypeListener(new CardTypeListener(view));
		this.view.addCheckSumListener(new CheckSumListener(view));
		this.view.addInputListenerValidator(new InputListenerValidator(view));
		this.view.addButtonListener(new ButtonListener(view));
	}
	
}
