
public class Reading {
	private Time timeReading;
	private int temp;
	
	Reading(Time timeReading, int temp){
		this.timeReading = timeReading;
		this.temp = temp;
	}
	
	//functions for variables
	/**
	 * 
	 * @return the time
	 */
	Time getTime() {
		return this.timeReading;
	}
	/**
	 * 
	 * @return the temperature
	 */
	int getTemp() {
		return this.temp;
	}

}
