import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyReportSet implements IDailyReport {
	private LinkedList<DailyWeatherReport> aWeatherReport;
	DailyReportSet(LinkedList<DailyWeatherReport> aWeatherReport){
		this.aWeatherReport = aWeatherReport;
	}
	/**
	 * 
	 * @param aDate
	 * @param dateReading
	 * @return the DailyWeatherReport and the newDateReading aWeatherReport
	 */
	public void addReport(GregorianCalendar aDate, LinkedList<Reading> dateReading) {
		int dateHigh = Integer.MIN_VALUE;
		int dateLow = Integer.MAX_VALUE;
		Reading highReading = null;
		Reading lowReading = null;

		for(Reading aReading : dateReading) {
			if(aReading.getTemp() > dateHigh) {
				dateHigh = aReading.getTemp();
				highReading = aReading;
			}
			if(aReading.getTemp() < dateLow) {
				dateLow = aReading.getTemp();
				lowReading = aReading;
			}
		}
		DailyWeatherReport newDateReading = new DailyWeatherReport(aDate, highReading, lowReading);
		this.aWeatherReport.add(newDateReading);
	}
	/**
	 * 
	 * @param aMonth
	 * @param aYear
	 * @return the average low based on the input month
	 */
	public double averageLowReportMonth(int aMonth, int aYear) {
		int numOfReadings = 0;
		double averageLowTemp = 0;

		for(DailyWeatherReport d: this.aWeatherReport)
		{
			if(d.dateCheck(aMonth, aYear) == true) 
			{				
				averageLowTemp = averageLowTemp + d.getLow().getTemp();
			}
		}

		for(DailyWeatherReport d : this.aWeatherReport) {
			if(d.dateCheck(aMonth, aYear) == true) 
			{
				numOfReadings = numOfReadings + 1;
			}
		}

		averageLowTemp = averageLowTemp / numOfReadings;
		return averageLowTemp;

	}

	/**
	 * 
	 * @param aMonth
	 * @param aYear
	 * @return the average high based on the input month
	 */
	public double averageHighReportMonth(int aMonth, int aYear) {
		int numOfReadings = 0;
		double totalHighTemp = 0;
		double averageHighTemp = 0;

		for(DailyWeatherReport d: this.aWeatherReport)
		{
			if(d.dateCheck(aMonth, aYear) == true) 
			{		
				totalHighTemp = totalHighTemp + d.getHigh().getTemp();
				numOfReadings = numOfReadings + 1;
			}
		}
		averageHighTemp = totalHighTemp*1.0 / numOfReadings;
		return averageHighTemp;
	}
}
