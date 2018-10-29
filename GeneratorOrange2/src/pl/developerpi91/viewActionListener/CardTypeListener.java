package pl.developerpi91.viewActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pl.developerpi91.mainMVC.GeneratorView;;

public class CardTypeListener implements ActionListener {
	private GeneratorView view;
	
	public CardTypeListener(GeneratorView view) {
		this.view = view;
	}
	
    private static final Logger LOG = LogManager.getLogger(CardTypeListener.class);
	
    @Override
	public void actionPerformed(ActionEvent e) {
		String cardType;
		cardType= e.getActionCommand().toString();
		try {	
			if(cardType.equals("PC2.6")){
				
				view.setChckbxCheckSum(true);
				LOG.info("CHOSE card type << PC2.6 >>");
				LOG.info("SET checksum as << TRUE >>");
			}
			else if (cardType.equals("PC3.0")) {
				view.setChckbxCheckSum(true);
				LOG.info("CHOSE card type << PC3.0 >>");
				LOG.info("SET checksum as << TRUE >>");
			}
			else {
				view.setChckbxCheckSum(false);
				LOG.info("CHOSE card type << PC5.0 >>");
				LOG.info("SET checksum as << FALSE >>");
			}
		}
		catch(Exception exc) {
			LOG.error("EROR occurs");
			LOG.error(exc.getMessage());
		}
	}
}