package datedifference;

public class DateDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Date d1 = new Date(2016, 2, 15);
        Date d2 = new Date(2017, 2, 16);

        int daysBetween = d1.daysTo(d2);

        System.out.println(daysBetween);
    }
}
