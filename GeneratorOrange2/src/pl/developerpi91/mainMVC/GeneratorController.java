package pl.developerpi91.mainMVC;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pl.developerpi91.viewActionListener.CardTypeListener;
import pl.developerpi91.viewActionListener.CheckSumListener;
import pl.developerpi91.viewActionListener.InputListenerValidator;
import pl.developerpi91.viewActionListener.ButtonListener;
import pl.developerpi91.viewActionListener.ConsoleListener;

public class GeneratorController {

	private static GeneratorView view;
	private static GeneratorModel model;
	
	
    private static final Logger LOG = LogManager.getLogger(GeneratorController.class);

	public GeneratorController(GeneratorModel model,GeneratorView view) {
		GeneratorController.view = view;
		GeneratorController.model = model;
		LOG.info("INITIALIZE VIEW");
		initialView();
		LOG.info("INITIALIZE VIEW << OK >>");
//		readLog();

		GeneratorController.view.addCardTypeListener(new CardTypeListener(view));
		GeneratorController.view.addCheckSumListener(new CheckSumListener(view));
		GeneratorController.view.addInputListenerValidator(new InputListenerValidator(view));
		GeneratorController.view.addButtonListener(new ButtonListener(view));
		GeneratorController.view.addConsoleListener(new ConsoleListener(view) );

	}
	
	private void initialView() {
		try {
		//CARD View
		view.setFtfPrefixCard(model.getCardPrefix());
		view.setFtfRokCard(model.getRok());
		view.setFtfEowCard(model.getEow());
		view.setFtfNumerPaczkiStb(model.getCardNumerPaczki());
		view.setFtfZakresCard(model.getCardZakres());
		LOG.info("initlialize card view << OK >>");
		}
		catch(Exception e) {
			LOG.error("CARD VIEW not set properly \n{}", e.getMessage());
		}
		
		try {	
		//STB View
		view.setFtfPrefixStb(model.getStbPrefixSn());
		view.setFtfRokStb(model.getRok());
		view.setFtfEowStb(model.getEow());
		view.setFtfNumerPaczkiStb(model.getStbNumerPaczki());
		view.setFtfZakresStb(model.getStbZakres());
		LOG.info("initlialize stb view << OK >>");
		}
		catch(Exception e) {
			LOG.error("STB VIEW not set properly \n{}", e.getMessage());
		}
		
		//General View
		view.setTextFieldIlosc(Integer.toString(model.getIlosc()));			
	}
	public static void updateModel() {
		try {
		//CARD View
		model.setCardPrefix(view.getFtfPrefixCard().getText());
		model.setRok(view.getFtfRokCard().getText());
		model.setEow(view.getFtfEowCard().getText());
		model.setCardNumerPaczki(view.getFtfNumerPaczkiCard().getText());
		model.setCardZakres(view.getFtfZakresCard().getText());
		}
		catch(Exception e) {
			LOG.error("CARD Model not update properly \n{}", e.getMessage());
		}
		
		try {
		//STB View
		model.setStbPrefixSn(view.getFtfPrefixStb().getText());
		model.setRok(view.getFtfRokStb().getText());
		model.setEow(view.getFtfEowStb().getText());
		model.setStbNumerPaczki(view.getFtfNumerPaczkiStb().getText());
		model.setStbZakres(view.getFtfZakresStb().getText());
		model.setStbPrefixEsn(view.getFtfPrefixEsnSTB().getText());
		}
		catch(Exception e) {
			LOG.error("STB Model not update properly \n{}", e.getMessage());
			
		//General View
		model.setIlosc(view.getTextFieldIlosc().getText());
		LOG.info("Model updated << OK >>");
		}
		

	}

	
}
