public class Switcher
{
    public static void main(String... args)
    {
        int expression = 9;
        switch (expression)
        {
            case 0:
                System.out.println(
                        "Expression is zero."               // Output: ... noting ...
                );
                break;

            case 1:
                System.out.println(
                        "Expression is one."                // Output: ... noting ...
                );
                break;

            case 2:
                System.out.println(
                        "Expression is two."                // Output: ... noting ...
                );
                break;

            default:
                System.out.println(
                        "Expression is greater than 2."    // Output: Expression is greater than 2.
                );
        }
    }
}
