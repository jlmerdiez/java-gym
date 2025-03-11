package chapter2;

import java.util.Calendar;
import java.util.Date;

public class Casting {
    double doubleVar = 42.3d;
    float floatVar = (float) doubleVar;
    long longVar = (long) floatVar;
    int intVar = (int) longVar;
    short shortVar = (short) intVar;
    byte byteVar = (byte) shortVar;
    // When casting ﬂoating point primitives (float, double) to whole number primitives, the number is rounded down.

    static void testNumericPromotion() {
        char char1 = 1, char2 = 2;
        short short1 = 1, short2 = 2;
        int int1 = 1, int2 = 2;
        float float1 = 1.0f, float2 = 2.0f;

        // char1 = char1 + char2; // error: no se puede convertir int a char
        // short1 = short1 + short2; // error: no se puede convertir int a short
    }

    static void testInstanceOf() {
        Object obj = Calendar.getInstance();
        Date time = 0;
        if (obj instanceof Calendar)
        {
            time = ((Calendar)obj).getTime();
        }
        if (obj instanceof Date)
        {
            time = ((Date)obj).getTime(); // Nunca se ejecuta, ya que obj no es del tipo Date
        }
    }
}
