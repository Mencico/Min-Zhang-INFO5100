import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DrivingLicenseApplication {

    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);

        System.out.println("Please Enter Your Birth Year");
        String strYear = text.nextLine();
        int year = Integer.parseInt(strYear);

        System.out.println("Please Enter Your Birth Month");
        String strMonth = text.nextLine();
        int month = Integer.parseInt(strMonth);

        System.out.println("Please Enter Your Birth Date");
        String strDate = text.nextLine();
        int day = Integer.parseInt(strDate);

        Date now = new Date();
        Date birth = new GregorianCalendar(year, month, day).getTime();

        //for test 1111


    }
}


