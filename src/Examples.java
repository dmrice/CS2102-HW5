import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;
/**
 * 
 * @author Deanna Rice and Phillip Abell
 *
 */

public class Examples {

	Reading reading1 = new Reading (new Time(30, 31), 70);
	Reading reading2 = new Reading (new Time(1, 10), 32);
	Reading reading3 = new Reading (new Time(6, 36), 60);
	Reading reading4 = new Reading (new Time(5, 20), 55);
	Reading reading5 = new Reading (new Time(24, 49), 69);
	Reading reading6 = new Reading (new Time(5, 12), 47);
	Reading reading7 = new Reading (new Time(15, 45), 42);
	Reading reading8 = new Reading (new Time(12, 24), 27);

	DailyWeatherReport report1 = new DailyWeatherReport(new GregorianCalendar(2017, 11, 19), reading1, reading2);
	DailyWeatherReport report2 = new DailyWeatherReport(new GregorianCalendar(2018, 11, 11), reading3, reading4);
	DailyWeatherReport report3 = new DailyWeatherReport(new GregorianCalendar(2017, 10, 31), reading5, reading6);
	DailyWeatherReport report4 = new DailyWeatherReport(new GregorianCalendar(2018, 11, 4), reading7, reading8);

	GregorianCalendar addedDate = new GregorianCalendar(2017, 10, 1);
	DailyWeatherReport report5 = new DailyWeatherReport(addedDate, reading2, reading5);

	LinkedList<DailyWeatherReport> weatherReports = new LinkedList<DailyWeatherReport>();
	LinkedList<DailyWeatherReport> addedWeatherReport = new LinkedList<DailyWeatherReport>();

	LinkedList<Reading> newReadings = new LinkedList<Reading> ();



	public Examples() {
		//averageHigh and averageLow tests
		weatherReports.add(report1);
		weatherReports.add(report2);
		weatherReports.add(report3);
		weatherReports.add(report4);

		//add new report
		addedWeatherReport.add(report1);
		addedWeatherReport.add(report2);
		addedWeatherReport.add(report3);
		addedWeatherReport.add(report4);
		addedWeatherReport.add(report5);

		newReadings.add(reading1);
		newReadings.add(reading2);
		newReadings.add(reading3);
	}

	DailyReportSet reportSet = new DailyReportSet(weatherReports);
	DailyReportSet addedReportSet = new DailyReportSet(addedWeatherReport);

	WeatherMonitor aMonitor = new WeatherMonitor(reportSet);


	//High for November 2017
	@Test
	public void averageHighNovember2017() {
		assertEquals(69.5, aMonitor.averageHighMonth(11, 2017), 0.1);
	}

	//High for November 2018
	@Test
	public void averageHighNovember2018() {
		assertEquals(51.0, aMonitor.averageHighMonth(11, 2018), 0.1);
	}

	//High for October 2017
	@Test
	public void averageHighOctober2017() {
		assertEquals(1, aMonitor.averageHighMonth(10, 2017), 0.1);
	}

	
	
	//Low for November 2017
	@Test
	public void averageLowNovember2017() {
		assertEquals(39.5, aMonitor.averageLowMonth(11, 2017), 0.1);
	}

	//Low for November 2018
	@Test
	public void averageLowNovember2018() {
		assertEquals(41.0, aMonitor.averageLowMonth(11, 2018), 0.1);
	}

	//Low for October 2018
	@Test
	public void averageLowOctober2017() {
		assertEquals(1, aMonitor.averageLowMonth(10, 2017), 0.1);
		}
}

