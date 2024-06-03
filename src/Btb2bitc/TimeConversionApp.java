package Btb2bitc;

public class TimeConversionApp {
    public int convertHoursToMinutes(int hours) {
        return hours * 60;
    }
    public int convertDaysToMinutes(int days) {
        return days * 24 * 60;
    }
    public static void main(String[] args) {
        TimeConversionApp timeConversionApp = new TimeConversionApp(); 
        int covertHourToMinute = timeConversionApp.convertHoursToMinutes(2); 
        System.out.println(covertHourToMinute);
        int covertDayToMinute = timeConversionApp.convertDaysToMinutes(3); 
        System.out.println(covertDayToMinute);  

    }
}
