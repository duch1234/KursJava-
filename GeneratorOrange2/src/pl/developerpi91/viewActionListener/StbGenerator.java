package pl.developerpi91.viewActionListener;

import pl.developerpi91.mainMVC.GeneratorController;
import pl.developerpi91.mainMVC.GeneratorModel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class StbGenerator {

	private int ilosc;
	
	private String prefixSN;
	private String prefixEsn;
	private String rok;
	private String eow;
	private String numerPaczki;
	private String zakres;
	
	public StbGenerator(GeneratorModel model) {
		this.prefixSN = model.getStbPrefixSn();
		this.prefixEsn = model.getStbPrefixEsn();
		this.rok = model.getRok();
		this.eow = model.getEow();
		this.numerPaczki = model.getStbNumerPaczki();
		this.zakres = model.getStbZakres();
		
		this.ilosc = model.getIlosc();
	}
		


	
	private void generateStb() {
		try {
			PrintWriter raportNumSnMac = new PrintWriter(new BufferedWriter(new FileWriter("stbTestowe_E181_p4_SnMac.txt", false)));
			PrintWriter raportNumFlatfile = new PrintWriter(new BufferedWriter(new FileWriter("stbTestowe_E181_p4_flatFile.txt", false)));
			
			String macAdr="";
			long numStart = Long.parseLong(this.prefixSN + this.rok + this.eow + this.numerPaczki + this.zakres);
			long licznik = numStart;
			while(licznik<numStart+ilosc) {
				String sL = Long.toString(licznik);
				macAdr = "00:"+sL.substring(0, 2)+":"+sL.substring(0, 2)+":"+sL.substring(2, 4)+":"+sL.substring(4, 6)+":"+sL.substring(6, 8);
				raportNumSnMac.println(this.prefixSN + licznik + ";" + macAdr);
				
				licznik++;
			}
			raportNumSnMac.close();
			raportNumFlatfile.close();
		}
		catch (Exception e) {
			
		}
		
	}
}
