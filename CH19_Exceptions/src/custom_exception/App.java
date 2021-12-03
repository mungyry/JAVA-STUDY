package custom_exception;

import custom_exception.exceptions.TempOutOfRangeException;
import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooLowException2;

public class App {

	public static void main(String[] args) {
Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(-36);
		} catch (TempTooHighException e) {
					System.out.println(e.getMessage());					
		} catch (TempTooLowException2 e) {
			System.out.println(e.getMessage());
		}
	}
}