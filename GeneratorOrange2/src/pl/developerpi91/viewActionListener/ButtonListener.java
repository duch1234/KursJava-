package pl.developerpi91.viewActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pl.developerpi91.viewActionListener.GeneratorCard;
import pl.developerpi91.viewActionListener.GeneratorStb;

import pl.developerpi91.mainMVC.GeneratorView;;

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
			buttonType=e.getActionCommand().toString();
			LOG.debug("Button Clicked: << {} >>", buttonType );
			if (buttonType.equals("Generatuj Karty")) {
				System.out.println("pizda");
			}else if(buttonType.equals("Generatuj Stb")){
				System.out.println("pizda2");
			}
			else {
				LOG.error("Button Clicked: << {} >> UNKNOWN OPEARTION", buttonType);
			}
			LOG.debug("Button Clicked: << {} >> Action END", buttonType);
		}catch(Exception exc) {
			LOG.error("EROR occurs");
			LOG.error(exc.getMessage());
		}
		
		
	}
}
