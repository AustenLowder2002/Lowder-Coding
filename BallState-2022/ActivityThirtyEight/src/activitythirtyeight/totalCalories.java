package activitythirtyeight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class totalCalories {
    public totalCalories(int calories,String startDate, String endDate) throws ParseException {
        String pattern = "MM/DD/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date firstDate = simpleDateFormat.parse(startDate);
        Date secondDate = simpleDateFormat.parse(endDate);

        long diff = Math.abs(secondDate.getTime() - firstDate.getTime());
        long days = TimeUnit.MILLISECONDS.toDays(diff);
        int totalCalaories = (int) (calories * days);
        System.out.println("Amount of time on diet(in days): " + days);
        System.out.println("Amount of total calories consumed across diet time: " + totalCalaories);

    }
}
