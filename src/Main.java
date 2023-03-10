import javax.swing.*;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    String day[] = {"SUN" , "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    String month[] = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

    static Calendar calender = Calendar.getInstance();
    static JFrame frame = new JFrame("mTracker");

    static JPanel panel = new JPanel();
    static JLabel week = new JLabel();

    static int weekCount = calender.get(Calendar.WEEK_OF_MONTH);
    static TimeZone blank = calender.getTimeZone();

    static int dayOfMonth = calender.get(Calendar.DAY_OF_MONTH);
    static Date date = calender.getTime();
    static int dayCount = calender.getActualMaximum(Calendar.DAY_OF_MONTH);


    public static void main(String[] args) {

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);


        week.setText(String.valueOf(num));
        frame.add(week);


    }



    static public void menu () {



    }
}