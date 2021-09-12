public class Loops
{
    public static void main(String... args)
    {
        short[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};


        System.out.print(
                "These numbers were displayed by Loop For:\n"
        );
        String result = "";

        // for loop
        for(int i = 0; i < daysOfMonth.length; i++)
        {
            result += daysOfMonth[i];

            if (i == daysOfMonth.length - 1)
                result += ".";
            else
                result += ", ";
        }

        System.out.print(
                result +
                "\n\n" +
                "These numbers were displayed by For-Each Loop:\n"
        );


        // for-each loop
        for(int i : daysOfMonth)
        {
            System.out.print(i);
            System.out.print(" ");
        }

    }
}
