public class Loops
{
    public static void main(String... args)
    {
        short[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        String result = "";


        // FOR LOOP
        for(int i = 0; i < daysOfMonth.length; i++)
        {
            result += daysOfMonth[i];

            if (i == daysOfMonth.length - 1)
                result += ".";
            else
                result += ", ";
        }

        // FOR-EACH LOOP
        for(int i : daysOfMonth)
        {
            System.out.print(i + if(i.hasNext())?", ":".";);
        }

        System.out.print(
                "\nThese numbers were displayed by Loop FOR:\n" + result
        );


    }
}
