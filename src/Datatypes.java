import java.sql.SQLOutput;

public class Datatypes
{
    public static void main(String... args)
    {
        boolean flag = false;   // Value "true" or "false"
        byte    bVar = 126;     // Value "-128 ... 127"

        short shortVar;         // Value "-32768 ... 32767"

        float      a = 3.2f;
        float      b = 4.5f;

        float   summ = a + b;

        summ++;

        if (!flag)
            System.out.println("This flag hasn't been activated!");
        else
            System.out.println("This flag is activated!");


        // byte is 8 bit value
        System.out.println(bVar);
        System.out.println(bVar++); // if the increment located after -> firstly print(bVar) then add(1)
        // It overflows here because
        // byte can hold values from -128 to 127
        System.out.println(++bVar); // if the increment located before -> firstly add(1) then print(bVar)
        // Looping back within the range
        bVar++;
        System.out.println(bVar);

        System.out.println(summ);

    }
}
