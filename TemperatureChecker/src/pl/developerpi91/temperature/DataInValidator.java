package pl.developerpi91.temperature;


public class DataInValidator {
	

	static boolean validateData(String inputData) {
		
	    return inputData.matches("[-+]?\\d*\\.?\\d+");
	}

}
