import java.util.GregorianCalendar;

public class DailyWeatherReport {
	private GregorianCalendar date;
	private Reading high;
	private Reading low;
	
	DailyWeatherReport(GregorianCalendar date, Reading high, Reading low){
		this.date = date;
		this.high = high;
		this.low = low;
	}
	//functions for variables
	
	/**
	 * 
	 * @return the date
	 */
	GregorianCalendar getDate() {
		return this.date;
	}
	/**
	 * 
	 * @return the high temperature
	 */
	Reading getHigh() {
		return this.high;
	}
	/**
	 * 
	 * @return the low temperature
	 */
	Reading getLow() {
		return this.low;
	}
	/**
	 * 
	 * @param month
	 * @param year
	 * @return true or false if the date entered matches the date you are checking
	 */
	boolean dateCheck(int month, int year) {
		return (this.date.get(GregorianCalendar.MONTH) ==month && this.date.get(GregorianCalendar.YEAR) == year);
	}
}
