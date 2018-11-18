package pl.developerpi91.viewActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pl.developerpi91.mainMVC.GeneratorView;

public class ConsoleListener implements ActionListener {

	   
		private static final Logger LOG = LogManager.getLogger(CheckSumListener.class);
		private GeneratorView view;
		
		public ConsoleListener(GeneratorView view) {
			this.view = view;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			BufferedReader br;
			StringBuffer sbf = new StringBuffer();;
			
			try {
				br = new BufferedReader(new FileReader("D:\\Workspaces\\rpi\\GeneratorOrange2\\logs\\propertieslogs.log"));
				String line;
				while((line=br.readLine())!=null) {
					try {

						sbf.append(line+"\n");
	
					}catch(Exception e2) {
						System.out.println(e2.getMessage());
					}
					

				}
				view.setConsole(sbf.toString());
				sbf= null;
				System.out.println(sbf);


				br.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
		

}
