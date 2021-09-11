public class Array
{
    public static void main(String... args)
    {
        // First variant to create an array
        short[] arr;        // declaration
        arr = new short[5]; // memory allocation

        arr [0] = 1;        // assigning
        arr [1] = 2;
        arr [2] = 3;
        arr [3] = 4;
        arr [4] = 5;


        // Second variant to create an array
        short[] numbers = new short[5]; // declaration and memory allocation for an array

        numbers [0] = 1;                // assigning values
        numbers [1] = 2;
        numbers [2] = 3;
        numbers [3] = 4;
        numbers [4] = 5;


        // Third variant to create an array
        char[]   hello = {'H','e','l','l','o',',',' ','w','o','r','l','d','!'};
        // or the same by C-style
        char   world[] = {'H','e','l','l','o',',',' ','w','o','r','l','d','!'};




        // Displaying The First variant
        System.out.println(
                "\nDisplaying the values of array arr[] "     +
                "(declared and then allocated memory):"
        );
        System.out.println(     arr[0]);
        System.out.println(     arr[1]);
        System.out.println(     arr[2]);
        System.out.println(     arr[3]);
        System.out.println(     arr[4]);

        // Displaying The Second variant
        System.out.println(
                "\nDisplaying the values of array numbers[] " +
                "(declared with memory allocation):"
        );
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        // Displaying The Third variant
        System.out.println(
                "\nDisplaying the values of array hello[] "   +
                "(declared by Java-style):"
        );
        System.out.println(     hello);

        System.out.println(
                "\nDisplaying the values of array world[] "   +
                "(declared by C-style):"
        );
        System.out.println(     world);

    }
}
