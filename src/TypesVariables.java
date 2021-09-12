public class TypesVariables
{
    public static void main(String... argc)
    {
        // Logical types
        boolean        flag = false;        // Range: "true" or "false" Size: 1 bit
        boolean      bigger = 25 > 20;      // For a boolean variable, we can assign the result of the condition

        // Number types
        byte        byteVar = 4;            // Range: "-128 ... 127" Size: 8 bit (1 Byte)
        byte           bVar = 126;

        short      shortVar = 56;           // Range: "-32768 ... 32767" Size: 16 bit (2 Bytes)

        int          intVar = 89;           // Range: "-32768 ... 32767"  Size: 32 bit (4 Bytes)
        int            legA = 15;
        int            legB = 10;

        long        longVar = 15424;        // Range: "-9223372036854775808 ... 9223372036854775807"
        long      castToInt = 15424;        // Size: 64 bit (8 Bytes)

        // Symbolic types
        char        charVar = 'G';          // Range: "ASCII 0 ... 256" Size: 16 bit (2 Bytes)
        char        endLine = '\n';         // Char type can contain of the escape consequences
        char          symH  = 72;           // Is symbol 'H' (by ASCII table) in decimal format
        char          symE  = 101;          // Is symbol 'e' (by ASCII table) in decimal format
        char          symL  = 0x6C;         // Is symbol 'l' (by ASCII table) in hexadecimal format
        char          symO  = 0x6F;         // Is symbol 'o' (by ASCII table) in hexadecimal format

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
        float          a = 3.2f;            // Range: "up to 7 decimal digits"  Size: 32 bit (4 Bytes)
        float          b = 4.5f;
        float   floatVar = 4.7333434f;
        float       summ = a + b;
        float         PI = 3.14f;


        // Manual type casting
        float          radius = (float) castToFloat;
        int              days =   (int) castToInt;
        float legACastToFloat = (float) legA;
        float legBCastToFloat = (float) legB;
        float      squareLegA = legACastToFloat * legACastToFloat;
        float      squareLegB = legBCastToFloat * legBCastToFloat;
        float  sumSquareLegAB = squareLegA + squareLegB;

        // Reverse type casting (auto)
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

        if (bigger)  // The bigger variable is TRUE
            // operates if condition is TRUE
            System.out.println(
                    "\nThe condition is TRUE!"
            );
        else
            // operates if condition is FALSE
            System.out.println(
                    "\nThe condition is FALSE!"
            );

        System.out.println(
                "\n----------------------"              +
                "\n\t"   + bVar                         +                           //Output: 126
                 // if increment after variable
                 // -> make PRINT(bVar) then ADD(1)
                "\n\t"   + bVar++                       +                           //Output: 126

                "\n\n>>> WARNING: OVERFLOW!!! <<<"      +
                "\nIt overflows here because byte "     +
                "\ncan hold values from -128 to 127"    +

                // if increment before variable
                // -> make ADD(1) then PRINT(bVar)
                "\n\n\t"   + ++bVar                     +                           //Output: -128
                "\nLooping back within the range"       +
                "\n\t"   + ++bVar                       +                           //Output: -127
                "\n----------------------"
        );

        System.out.println(endLine  + "" + summ    );                               //Output: 8.7

        System.out.println(
                "\n----------------------" +
                "\n\tbool: "    + flag     +                                        //Output: false
                "\n\tbyte: "    + byteVar  +                                        //Output: 4
                "\n\tchar: "    + charVar  +                                        //Output: G

                "\n\n\t"        + symH     +                                        //Output: H
                                  symE     +                                        //Output: e
                                  symL     +                                        //Output: l
                                  symL     +                                        //Output: l
                                  symO     +                                        //Output: o

                "\n\n\tshort: " + shortVar +                                        //Output: 56
                "\n\tinteger: " + intVar   +                                        //Output: 89
                "\n\tlong: "    + longVar  +                                        //Output: 15424
                "\n\tdouble: "  + doubleV  +                                        //Output: 4.355453532
                "\n\tfloat: "   + floatVar                                          //Output: 4.7333436
        );

        System.out.println(
                "\nRound square is: " + (PI * radius * radius)                      // Output: 2180.1729
        );

        System.out.println(
                "\nTHERE WILL BE AUTOMATIC CASTING TO DOUBLE\n"      +
                "(Math.sqrt requires a double, "                     +
                "but sumSquareLegAB is float)\n"                     +

                "Hypotenuse is: "   + Math.sqrt(sumSquareLegAB)                     // Output: 18.027756377319946
        );

        System.out.print(                                              endLine +
                "DISPLAY THE RADIUS, WHOLE AND FRACTIONAL PARTS:"    + endLine +
                "The radius is: "                 + radius           + endLine +    // Output: 26.35
                "Whole part of the radius: "      + wholeRadius      + endLine +    // Output: 26
                "Fractional part of the radius: " + fractionalRadius + endLine      // Output: 35
        );
    }
}
