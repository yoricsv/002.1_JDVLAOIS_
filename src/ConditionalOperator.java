public class ConditionalOperator
{
    public static void main(String... args)
    {
        for ( int i = 0;
              i < 10;
              i++)
        {
            if (i == 5)
                break;                  // terminate loop when i is 5.

            System.out.println(
                    "Value of I is: " + i   // Output: 0, 1, 2, 3, 4
            );
        }

        System.out.println(
                "Loop complete."            // Output: Loop complete.
        );

        System.out.println(
                "\nBelow is the result of the IF-ELSE-IF \"Ladder\" operation"
        );

        int num = 20;

        if (num == 10)
            System.out.println(
                    "Num is 10"             // Output: ... noting ...
            );
        else if (num == 15)
            System.out.println(
                    "Num is 15"             // Output: ... noting ...
            );
        else if (num == 20)
            System.out.println(
                    "Num is 20"             // Output: Num is 20
            );
        else
            System.out.println(
                    "Num is not present"    // Output: ... noting ...
            );

    }
}
