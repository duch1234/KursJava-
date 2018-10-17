package pl.developerpi91.temperature;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Checker {

	 static String checkTemperature() {
		
		String temptemperatureResult="";
		try {

			BufferedReader currentValue = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Podaj obecn� temperatur�:");
			String dataIn=currentValue.readLine();

			if(DataInValidator.validateData(dataIn)) {
				
				if (Double.parseDouble(dataIn)>=0){
					System.out.println("Temperatura jest dodania");
					temptemperatureResult="Temperatura jest dodania";

				}else {
					System.out.println("Temperatura jest ujemna");
					temptemperatureResult="Temperatura jest ujemna";

				}
				
			}else {
				System.out.println("Podano z�� warto��  !!!");
			}
			
			
		}catch(Exception e) {
			System.out.println("wyst�pi� b�ad: " + e);
			
		}
		return temptemperatureResult;

	}

	
}
