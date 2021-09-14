import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Loops
{
    public static void main(String... args) {
        short[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String result = "";


        // FOR LOOP
        for (int i = 0; i < daysOfMonth.length; i++) {
            result += daysOfMonth[i];

            if (i == daysOfMonth.length - 1)
                result += ".";
            else
                result += ", ";
        }

        // FOR-EACH LOOP
        for (int i : daysOfMonth) {
            System.out.print(i + ", ");
        }

        System.out.print(
                "\nThese numbers were displayed by Loop FOR:\n" + result
        );

        System.out.println(
                "\n---------------------------------------" +
                "\n\t Measurement of loops speed"             +
                "\n---------------------------------------"
        );


        List<Integer> list = new ArrayList<>();
        long startTime;
        long endTime;

        for ( int i = 0;
                  i < 1000000;
                  i++)
            list.add(i);

        // Type 1
        startTime = Calendar.getInstance().getTimeInMillis();

        for (int i : list)
        {
            int a = i;
        }

        endTime = Calendar.getInstance().getTimeInMillis();

        System.out.println(
                "For each loop : " + (endTime - startTime) + " ms"
        );


        // Type 2
        startTime = Calendar.getInstance().getTimeInMillis();

        for ( int j = 0;
                  j < list.size();
                  j++)
        {
            int a = list.get(j);
        }

        endTime = Calendar.getInstance().getTimeInMillis();

        System.out.println(
                "Using collection.size() : " + (endTime - startTime) + " ms"
        );


        // Type 3
        startTime = Calendar.getInstance().getTimeInMillis();

        int size = list.size();

        for ( int j = 0;
                  j < size;
                  j++)
        {
            int a = list.get(j);
        }

        endTime = Calendar.getInstance().getTimeInMillis();

        System.out.println(
                "By calculating collection.size() first : " + (endTime - startTime) + " ms"
        );

        // Type 4
        startTime = Calendar.getInstance().getTimeInMillis();

        for ( int j = list.size() - 1;
                  j >= 0;
                  j--)
        {
            int a = list.get(j);
        }

        endTime = Calendar.getInstance().getTimeInMillis();

        System.out.println(
                "Using [int j = list.size(); j > size ; j--] : " + (endTime - startTime) + " ms"
        );
    }
}
