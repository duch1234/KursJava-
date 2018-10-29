package pl.developerpi91.mainMVC;   
import java.awt.EventQueue;

import pl.developerpi91.mainMVC.GeneratorController;
import pl.developerpi91.mainMVC.GeneratorModel;
import pl.developerpi91.mainMVC.GeneratorView;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger LOG = LogManager.getLogger(Main.class);
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					GeneratorView view = new GeneratorView();
					GeneratorModel model = new GeneratorModel();
					GeneratorController controller = new GeneratorController(model, view);
					LOG.info("RUN Application << OK >>");


				} catch (Exception e) {
					LOG.error("RUN Application << NOK >>");
					e.printStackTrace();
					LOG.error(e.getMessage());
				}
			}
		});
	}

}
