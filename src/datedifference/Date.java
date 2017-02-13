package datedifference;

public class Date {
    
    final int year;
    final int month;
    final int day;
    
    Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int daysTo(Date newDate) {
        
        int newDateDays = newDate.getDay();
        int newDateMonths = newDate.getMonth() * 30;
        int newDateYears = newDate.getYear() * 365;
        
        int newDateSum = newDateDays + newDateMonths + newDateYears;
        int oldDateSum = this.day + (this.month * 30) + (this.year * 365);
        
        return Math.abs(newDateSum - oldDateSum);
    }
    
    public void printDate() {
        System.out.println(year + "/" + month + "/" + day);
    }
    
    public int getYear() {
        return this.year;
    }
    
    public int getMonth() {
        return this.month;
    }
    
    public int getDay() {
        return this.day;
    }
}
