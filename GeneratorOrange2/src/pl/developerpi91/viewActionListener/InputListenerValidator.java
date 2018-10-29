package pl.developerpi91.viewActionListener;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pl.developerpi91.mainMVC.GeneratorView;
import pl.developerpi91.viewActionListener.Range;

public class InputListenerValidator extends InputVerifier implements ActionListener {
	private static final Logger LOG = LogManager.getLogger(InputListenerValidator.class);
	private GeneratorView view;
	
	private final Range ILOSC_RANGE = new Range(1, 10000); 		// Create range for ilosc 

	private final Range ROK_RANGE = new Range(18, 99); 			// Create range for year 
	private final Range EOW_RANGE = new Range(0, 9); 			// Create range for eow 
	private final Range NUMER_PACZKI_RANGE = new Range(0, 9);	// Create range for numer paczki 
	private final Range ZAKRES_RANGE = new Range(0, 9999);		// Create range for zakres 

	
	public InputListenerValidator(GeneratorView view) {
		this.view = view;	
	}
	
	@Override
	public boolean verify(JComponent input) {
		
		boolean validationStatus=false; 
		//JTextField tf = (JTextField) input;
		 //System.out.println(tf.getName());
		System.out.println(input.getName());
		
//		try {
//			 int value = new Integer(tf.getText());
//			 LOG.info(ILOSC_RANGE.isInRange(value));
//			 if(value<99 & value>0) {
//				 validationStatus=true;
//				 LOG.info("Validation << OK >>");
//			 }else if(value == 0) {
//				 validationStatus=false;
//				 LOG.debug("Validation << NOK >>");
//				 LOG.debug("Select amount different than 0");
//			 }
//			 else {
//				 validationStatus=false;
//				 LOG.debug("Validation << NOK >>");
//			 }
//		 }
//		 catch(Exception exc){
//				LOG.error("EROR occurs");
//				LOG.error(exc.getMessage());	 
//		 }
		 return validationStatus;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField textField = (JTextField)(e.getSource());
		System.out.println(e.getSource());
		System.out.println(e.getActionCommand());
		verify(textField);
			
		
	}
	
}
