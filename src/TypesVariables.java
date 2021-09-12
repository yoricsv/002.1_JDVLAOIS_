public class TypesVariables
{
    public static void main(String... argc)
    {
        // Logical types
        boolean        flag = false;        // Range: "true" or "false" Size: 1 bit

        // Number types
        byte        byteVar = 4;            // Range: "-128 ... 127" Size: 8 bit (1 Byte)
        byte           bVar = 126;

        short      shortVar = 56;           // Range: "-32768 ... 32767" Size: 16 bit (2 Bytes)

        int          intVar = 89;           // Range: "-32768 ... 32767"  Size: 32 bit (4 Bytes)

        long        longVar = 15424;        // Range: "-9223372036854775808 ... 9223372036854775807"
        long      castToInt = 15424;        // Size: 64 bit (8 Bytes)

        // Symbolic types
        char        charVar = 'G';          // Range: "ASCII 0 ... 256" Size: 16 bit (2 Bytes)
        char        endLine = '\n';         // Char type can contain of the escape consequences

        // Real types
        double      doubleV = 4.355453532;  // Range: "up to 16 decimal digits"  Size: 64 bit (8 Bytes)
        double  castToFloat = 26.35;

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

        // Manual type casting
        float    radius = (float) castToFloat;
        int        days =   (int) castToInt;

        // Reverse type casting
        double radiusInDouble = radius;                                 // if the type is less than needed,
                                                                        // Java does an automatic casting

        int       wholeRadius = (int) radiusInDouble;                   // get whole part
        double  wipeWholePart = radiusInDouble - (double) wholeRadius;  // get fractional part
        int  fractionalRadius = (int) (wipeWholePart * 100);            // TODO: May add the ranks check

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

        System.out.println(
                "\n\t"   + bVar                         +   //Output: 126
                 // if increment after variable
                 // -> make PRINT(bVar) then ADD(1)
                "\n\t"   + bVar++                       +   //Output: 126

                "\n\t\t>>> WARNING: OVERFLOW!!! <<<"    +
                "\nIt overflows here because byte can " +
                "hold values from -128 to 127"          +

                // if increment before variable
                // -> make ADD(1) then PRINT(bVar)
                "\n\t"   + ++bVar                       +   //Output: -128
                "\nLooping back within the range"       +
                "\n\t"   + ++bVar                           //Output: -127
        );

        System.out.println(endLine  + "" + summ    );   //Output: 8.7

        System.out.println(
                "\n--------------------" +
                "\n\tbool: "    + flag     +   //Output: false
                "\n\tbyte: "    + byteVar  +   //Output: 4
                "\n\tchar: "    + charVar  +   //Output: G
                "\n\tshort: "   + shortVar +   //Output: 56
                "\n\tinteger: " + intVar   +   //Output: 89
                "\n\tlong: "    + longVar  +   //Output: 15424
                "\n\tdouble: "  + doubleV  +   //Output: 4.355453532
                "\n\tfloat: "   + floatVar     //Output: 4.7333436
        );

        System.out.print(
                "\nDISPLAY THE RADIUS, WHOLE AND FRACTIONAL PARTS:"  + "\n" +
                "The radius is: "                 + radius           + "\n" +
                "Whole part of the radius: "      + wholeRadius      + "\n" +
                "Fractional part of the radius: " + fractionalRadius + "\n"
        );
    }
}
