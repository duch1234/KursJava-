package pl.developerpi91.mainMVC;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GeneratorModel {

 private String ilosc = "1000";
 
//card
 private String cardPrefix = "88";
 private String cardNumerPaczki = "";
 private String cardZakres = "";
 //stb
 private String stbPrefixSn = "1L78F3C";
 private String stbPrefixEsn = "ORANICU1000001";
 private String stbNumerPaczki = "";
 private String stbZakres = "";
 //General Part
 private String rok = "";
 private String eow = "";
 
 
 private static final Logger LOG = LogManager.getLogger(GeneratorModel.class);
 
	public GeneratorModel() {
		setYear();
	}
	
	private  void setYear() {
		SimpleDateFormat dateFormater = new SimpleDateFormat("YY");
		Date date = new Date();
		this.rok = dateFormater.format(date).toString();
	}
	
	public String getCardPrefix() {
		return cardPrefix;
	}
	
	public String getCardNumerPaczki() {
		return cardNumerPaczki;
	}
	
	public String getCardZakres() {
		return cardZakres;
	}
	
	public String getStbPrefixSn() {
		return stbPrefixSn;
	}
	
	public String getStbPrefixEsn() {
		return stbPrefixEsn;
	}
	
	public String getStbNumerPaczki() {
		return stbNumerPaczki;
	}
	
	public String getStbZakres() {
		return stbZakres;
	}
	
	public String getRok() {
		return rok;
	}
	
	public String getEow() {
		return eow;
	}
	
	public int getIlosc() {
		return Integer.parseInt(ilosc);
	}
	
	
	public void setCardPrefix(String cardPrefix) {
		this.cardPrefix = cardPrefix;
	}
	
	public void setCardNumerPaczki(String cardNumerPaczki) {
		this.cardNumerPaczki = cardNumerPaczki;
	}
	
	public void setCardZakres(String cardZakres) {
		this.cardZakres = cardZakres;
	}
	
	public void setStbPrefixSn(String stbPrefixSn) {
		this.stbPrefixSn = stbPrefixSn;
	}
	
	public void setStbPrefixEsn(String stbPrefixEsn) {
		this.stbPrefixEsn = stbPrefixEsn;
	}
	
	public void setStbNumerPaczki(String stbNumerPaczki) {
		this.stbNumerPaczki = stbNumerPaczki;
	}
	
	public void setStbZakres(String stbZakres) {
		this.stbZakres = stbZakres;
	}
	
	public void setRok(String rok) {
		this.rok = rok;
	}
	
	public void setEow(String eow) {
		this.eow = eow;
	}
	
	public void setIlosc(String ilosc) {
		this.ilosc = ilosc;
	}

	
	@Override
		public String toString() {
		
		return ("Card: \n" +
				"\tPrefix: " + this.cardPrefix +
				"\tRok: " + this.rok +
				"\tEow: " + this.eow +
				"\tNumer Paczki: " + this.stbNumerPaczki +
				"\tZakres: " + "\n" + this.cardZakres +
				"STB: \n" +
				"\tPrefixSn: " + this.stbPrefixSn +
				"\tPrefixEsn: " + this.stbPrefixEsn +
				"\tRok: " + this.rok +
				"\tEow: " + this.eow + 
				"\tNumer Paczki: " + this.stbNumerPaczki +
				"\tZakres: " + this.stbZakres + 
				"\nIloœæ: " + this.ilosc
				);
		}


}
