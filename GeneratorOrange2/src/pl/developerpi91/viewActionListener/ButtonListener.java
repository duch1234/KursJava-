package pl.developerpi91.viewActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import pl.developerpi91.mainMVC.GeneratorView;
import pl.developerpi91.mainMVC.GeneratorController;

public class ButtonListener implements ActionListener {
	private GeneratorView view;
	
    private static final Logger LOG = LogManager.getLogger(ButtonListener.class);

	public ButtonListener(GeneratorView view) {
		this.view = view;		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonType;
				
		try {
			GeneratorController.updateModel();

			buttonType=e.getActionCommand().toString();
			LOG.debug("Button Clicked: << {} >>", buttonType );
			
			if (buttonType.equals("Generuj Karty")) {
				
			}else if(buttonType.equals("Generuj STB")){
				
			}
			else {
				LOG.error("Button Clicked: << {} >> UNKNOWN OPEARTION", buttonType);
			}
			LOG.debug("Button Clicked: << {} >> Action FINISHED << OK >>", buttonType);
		}catch(Exception exc) {
			LOG.error("EROR occurs");
			LOG.error(exc.getMessage());
		}
	}
	

}
