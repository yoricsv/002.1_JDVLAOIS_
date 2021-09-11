public class TypesVariables
{
    public static void main(String... argc)
    {
        // declaring character
        boolean    flag = false;        // Range: "true" or "false" Size: 1 bit

        byte    byteVar = 4;            // Range: "-128 ... 127" Size: 8 bit (1 Byte)
        byte       bVar = 126;

        char    charVar = 'G';          // Range: "ASCII 0 ... 256" Size: 16 bit (2 Bytes)
        char    endLine = '\n';         // Char type can contain of the escape consequences

        short  shortVar = 56;           // Range: "-32768 ... 32767" Size: 16 bit (2 Bytes)

        int      intVar = 89;           // Range: "-32768 ... 32767"  Size: 32 bit (4 Bytes)

        long    longVar = 15424;        // Range: "-9223372036854775808 ... 9223372036854775807" Size: 64 bit (8 Bytes)

        double  doubleV = 4.355453532;  // Range: "up to 16 decimal digits"  Size: 64 bit (8 Bytes)

    /*
     ************************************************
     *          >>> BE CAREFULLY <<<                *
     *                                              *
     *      for FLOAT must use 'f' as suffix        *
     * by DEFAULT fraction value is DOUBLE in java  *
     ************************************************
    */
        float         a = 3.2f;         // Range: "up to 7 decimal digits"  Size: 32 bit (4 Bytes)
        float         b = 4.5f;
        float  floatVar = 4.7333434f;
        float      summ = a + b;



        summ++;

        if (!flag)  // flag is false -> condition is TRUE
            // operates if condition is TRUE
            System.out.println(
                    "\nThis flag hasn't been activated!"
            );
        else
            // operates if condition is FALSE
            System.out.println(
                    "\nThis flag is activated!"
            );

        System.out.println("\n\t" + bVar  ); //Output: 126
        System.out.println("\t"   + bVar++); //Output: 126 [increment after -> firstly print(bVar) then add(1)]
        System.out.println(
                "\n\t\t>>> WARNING: OVERFLOW!!! <<<"    +
                "\nIt overflows here because byte can " +
                "hold values from -128 to 127"
        );
        System.out.println("\t"   + ++bVar); //Output: -128 [increment before -> firstly add(1) then print(bVar)]
        System.out.println(
                "Looping back within the range"
        );
        System.out.println("\t"   + ++bVar); //Output: -127

        System.out.println(endLine  + "" + summ    );   //Output: 8.7

        System.out.println("\n--------------------");
        System.out.println("\tbool: "    + flag    );   //Output: false
        System.out.println("\tbyte: "    + byteVar );   //Output: 4
        System.out.println("\tchar: "    + charVar );   //Output: G
        System.out.println("\tshort: "   + shortVar);   //Output: 56
        System.out.println("\tinteger: " + intVar  );   //Output: 89
        System.out.println("\tlong: "    + longVar );   //Output: 15424
        System.out.println("\tdouble: "  + doubleV );   //Output: 4.355453532
        System.out.println("\tfloat: "   + floatVar);   //Output: 4.7333436

    }
}
