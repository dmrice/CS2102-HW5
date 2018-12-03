import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface IDailyReport {
	void addReport(GregorianCalendar aDate, LinkedList<Reading> dateReading);
	double averageLowReportMonth(int aMonth, int aYear);
	double averageHighReportMonth(int aMonth, int aYear);
	

}
