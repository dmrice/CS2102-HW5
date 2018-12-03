import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
	private IDailyReport aWeatherReport;
	
	WeatherMonitor(IDailyReport aWeatherReport){
		this.aWeatherReport = aWeatherReport;
	}
	/**
	 * 
	 * @param aMonth
	 * @param aYear
	 * @return the average high based on the input month
	 */
	public double averageHighMonth(int aMonth, int aYear) {
		return aWeatherReport.averageHighReportMonth(aMonth, aYear);
	}
	
	/**
	 * 
	 * @param aMonth
	 * @param aYear
	 * @return the average low based on the input month
	 */
	public double averageLowMonth(int aMonth, int aYear) {
		return aWeatherReport.averageLowReportMonth(aMonth, aYear);
	}

	/**
	 * 
	 * @param aDate
	 * @param dateReading
	 */
	public void addDailyReport(GregorianCalendar aDate, LinkedList<Reading> dateReading) {
		this.addDailyReport(aDate, dateReading);
	}
}
