# 002.1_JDVLAOIS_

The project is include the next list of topics:<br/>
* DataTypes,
* Variables,
* Loops,
* Arrays,
* Operators,
* If-Else operator 
* Switch operator
---

## <p align=center>DataTypes</p>

Java is a statically and strongly typed language because these functions are inherited from C and C ++.

Data Types in Java:
![Data types in Java](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191105111644/Data-types-in-Java.jpg)
---
<br/>

# Java has two categories of data: 
 
**Primitive Data Type**: such as *boolean, char, int, short, byte, long, float, and double*<br/>
**Non-Primitive Data Type** or **Object Data type**: such as *String, Array and etc.*

![Data types in Java](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191105122725/Primitive-Data-Types-in-Java-4.jpg)
<br/>
<br/>

## <p align=center><b>Primitive Data Types</b></p>
# 

1. **boolean:** - data type represents only one bit of information either true or false, but the size of the boolean data type is virtual machine-dependent.<br/>
2. **byte:** The byte data type is an 8-bit signed two’s complement integer. Useful for saving memory in large arrays.<br/>
3. **short:** The short data type is a 16-bit signed integer. Useful for saving memory in large arrays such as byte.<br/>
4. **int:** It is a 32-bit signed two’s complement integer.<br/> *Note:* In Java SE 8 and later, we can use the int data type to represent an unsigned 32-bit integer, which has value in the range [0, 232-1]. Use the Integer class to use int data type as an unsigned integer. <br/>
5. **long:** The long data type is a 64-bit two’s complement integer.<br/> *Note:* In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1. The Long class also contains methods like comparing Unsigned, divide Unsigned, etc to support arithmetic operations for unsigned long.
6.  **float:** The float data type is a single-precision 32-bit [IEEE 754](https://en.wikipedia.org/wiki/IEEE_floating_point) floating-point. Use a float (instead of double) if you need to save memory in large arrays of floating-point numbers.
7.  **double:** The double data type is a double-precision 64-bit [IEEE 754](https://en.wikipedia.org/wiki/IEEE_floating_point) floating-point. For decimal values, this data type is generally the default choice.<br/>*Note:* Both float and double data types were designed especially for scientific calculations, where approximation errors are acceptable. If accuracy is the most prior concern then, it is recommended not to use these data types and use [*BigDecimal*](http://docs.oracle.com/javase/1.5.0/docs/api/java/math/BigDecimal.html) class instead.<br/> Please see this for details: [*Rounding off errors in Java*](https://www.geeksforgeeks.org/rounding-off-errors-java/)
8.  **char:** The char data type is a single 16-bit Unicode character. <br><br/>**Why is the size of char is 2 byte in java..?** <br/>
In other languages like C/C++ uses only ASCII characters and to represent all ASCII characters 8-bits is enough, 
But java uses the Unicode system not the ASCII code system and to represent Unicode system 8 bit is not enough to represent all characters so java uses 2 bytes for characters.<br/>
***Unicode** defines a fully international character set that can represent most of the world’s written languages. It is a unification of dozens of character sets, such as Latin, Greeks, Cyrillic, Katakana, Arabic, and many more.*
---
<br/>
<br/>

## <p align=center><b>Non-Primitive</b> Data Type or <b>Reference</b> Data Types</p>
# 

The **Reference Data Types** will contain a memory address of variable value because the reference types won’t store the variable value directly in memory. They are *strings, objects, arrays etc.* 
 

* **String:** Strings are defined as an array of characters. The difference between a character array and a string in Java is, the string is designed to hold a sequence of characters in a single variable whereas, a character array is a collection of separate char type entities.
* Unlike C/C++, Java strings are not terminated with a null character.
Below is the basic syntax for declaring a string in Java programming language.