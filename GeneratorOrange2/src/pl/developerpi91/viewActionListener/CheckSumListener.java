package pl.developerpi91.viewActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pl.developerpi91.mainMVC.GeneratorView;
public class CheckSumListener implements ActionListener  {
   
	private static final Logger LOG = LogManager.getLogger(CheckSumListener.class);
	private GeneratorView view;
	
	public CheckSumListener(GeneratorView view) {
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		view.setChckbxCheckSum(view.getChckbxCheckSum());
		LOG.info("Current checksum  SET as << {} >>", view.getChckbxCheckSum());
		}
		catch(Exception exc) {
			LOG.error("EROR occurs");
			LOG.error(exc.getMessage());
		}
		
	}
	
}
