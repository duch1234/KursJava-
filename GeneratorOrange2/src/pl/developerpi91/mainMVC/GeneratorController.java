package pl.developerpi91.mainMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pl.developerpi91.viewActionListener.CardTypeListener;
import pl.developerpi91.viewActionListener.CheckSumListener;
import pl.developerpi91.viewActionListener.InputListenerValidator;
import pl.developerpi91.viewActionListener.ButtonListener;
import pl.developerpi91.viewActionListener.ConsoleListener;

public class GeneratorController {

	private GeneratorView view;
	private GeneratorModel model;
	
	private Timer timer = null;
	
    private static final Logger LOG = LogManager.getLogger(GeneratorController.class);

	public GeneratorController(GeneratorModel model,GeneratorView view) {
		this.view = view;
		this.model = model;
		LOG.info("INITIALIZE VIEW");
		initialView();
		LOG.info("INITIALIZE VIEW << OK >>");
//		readLog();

		this.view.addCardTypeListener(new CardTypeListener(view));
		this.view.addCheckSumListener(new CheckSumListener(view));
		this.view.addInputListenerValidator(new InputListenerValidator(view));
		this.view.addButtonListener(new ButtonListener(view));
		this.view.addConsoleListener(new ConsoleListener(view) );

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
		view.setTextFieldIlosc(model.getIlosc());			
	}
	private void readLog() {
		System.out.println("dupa");
		timer = new Timer(100, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BufferedReader br;
				try {
					br = new BufferedReader(new FileReader("D:\\Workspaces\\rpi\\GeneratorOrange2\\logs\\propertieslogs.log"));
					String line;
					while((line=br.readLine())!=null) {
						System.out.println(line);
						view.setConsole(line);
						
						System.out.println("asdasdasdasdsdasdasada");

					}
//					System.out.println(br.readLine().toString());
//					System.out.println("dupa");
//					view.setConsole(br.readLine().toString());
//					System.out.println(br.readLine());
//					view.setConsole("piiiii");
					br.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
	
			}
			
		});
		

	}
	
}
