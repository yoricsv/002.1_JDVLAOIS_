public class TypesVariables
{
    public static void main(String... argc)
    {
        // declaring character
        boolean    flag = false; // Range "true" or "false"

        byte    byteVar = 4;     // Range "-128 ... 127"
        byte       bVar = 126;

        char    charVar = 'G';

        short  shortVar = 56;    // Range "-32768 ... 32767"

        int      intVar = 89;

        long    longVar = 15424; // Range "-9223372036854775808 ... 9223372036854775807"

        double doubleVar = 4.355453532; // Range "up to 16 decimal digits"

    /*
     ************************************************
     *          >>> BE CAREFULLY <<<                *
     *                                              *
     *      for FLOAT must use 'f' as suffix        *
     * by DEFAULT fraction value is DOUBLE in java  *
     ************************************************
    */
        float         a = 3.2f;     // Range "-32768 ... 32767"
        float         b = 4.5f;
        float  floatVar = 4.7333434f;
        float      summ = a + b;



        summ++;

        if (!flag)  // flag is false -> is TRUE
            System.out.println(
                    "\nThis flag hasn't been activated!"
            );
        else
            System.out.println(
                    "\nThis flag is activated!"
            );

        System.out.println("\n\t" + bVar);   //Output: 126
        System.out.println("\t"   + bVar++); //Output: 126 [increment after -> firstly print(bVar) then add(1)]
        System.out.println(
                "\n\t\t>>> WARNING: OVERFLOW!!! <<<"        +
                "\nIt overflows here because byte can " +
                "hold values from -128 to 127"
        );
        System.out.println("\t"   + ++bVar); //Output: -128 [increment before -> firstly add(1) then print(bVar)]
        System.out.println(
                "Looping back within the range"
        );
        System.out.println("\t"   + ++bVar); //Output: -127

        System.out.println("\n"   + summ);   //Output: 8.7

        System.out.println("\n---------------------");
        System.out.println("\tchar: "    + charVar  );    //Output: G
        System.out.println("\tinteger: " + intVar   );    //Output: 89
        System.out.println("\tbyte: "    + byteVar  );    //Output: 4
        System.out.println("\tshort: "   + shortVar );    //Output: 56
        System.out.println("\tfloat: "   + floatVar );    //Output: 4.7333436
        System.out.println("\tdouble: "  + doubleVar);    //Output: 4.355453532

    }
}
