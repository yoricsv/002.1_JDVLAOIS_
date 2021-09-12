# 002.1_JDVLAOIS_

The project scope:<br/>
* DataTypes,
* Variables,
* Loops,
* Arrays,
* Operators,
* If-Else operator 
* Switch operator
---
<br/>

## <p align=center><b>Variables in Java</b></p>
# 

A variable is a name given to a memory location. It is the basic unit of storage in a program.

Common features:
* The value stored in a variable can be changed during program execution.
* A variable is only a name given to a memory location, all the operations done on the variable effects that memory location.
* In Java, all the variables must be declared before use.

**The declaration of variables:**

![Variables](https://media.geeksforgeeks.org/wp-content/uploads/20191110223008/java-declare.jpeg)

From the image, it can be easily perceived that while declaring a variable we need to take care of two things  that while de



**The declaration:**

**Datatype:** Type of data that can be stored in this variable.<br/>
**Dataname:** Name given to the variable. 
In this way, a name can only be given to a memory location. It can be assigned values in two ways: 

* Variable Initialization
* Assigning value by taking input



**The initialization:**

* **datatype:** Type of data that can be stored in this variable. 
* **variable_name:** Name given to the variable. 
* **value:** It is the initial value stored in the variable.


![Declaration](https://media.geeksforgeeks.org/wp-content/uploads/Variables-in-Java.png)


Examples:
```java
// Declaring float variable
float simpleInterest;

// Declaring and Initializing integer variable
int   time = 10,
     speed = 20;

// Declaring and Initializing character variable
char   var = 'h'; 
```
## **Different types of variables:**
1. Local Variables
2. Instance Variables
3. Static Variables

### **Local** Variables
A variable defined within a block or method or constructor is called a local variable. 
* These variables are created when the block is entered or the function is called and destroyed after exiting from the block or when the call returns from the function.
* The scope of these variables exists only within the block in which the variable is declared. i.e. we can access these variables only within that block.
* Initialization of the local variable is mandatory before using it in the defined scope.

### **Instance** Variables
Instance variables are non-static variables and are declared in a class outside any method, constructor and etc. 
* As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
* Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier then the default access specifier will be used.
* Initialization of Instance Variable is not Mandatory. Its default value is 0
* Instance Variable can be accessed only by creating objects.

### **Static** Variables
Static variables are also known as Class variables. 
* These variables are declared similarly as instance variables, the difference is that static variables are declared using the static keyword within a class outside any method constructor or block.
* Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.
* Static variables are created at the start of program execution and destroyed automatically when execution ends.
* Initialization of Static Variable is not Mandatory. Its default value is 0
* If we access the static variable like the Instance variable (through an object), the compiler will show the warning message and it won’t halt the program. The compiler will replace the object name with the class name automatically.
* If we access the static variable without the class name, the compiler will automatically append the class name.

### Differences between the *Instance* and the *Static* variables
* Each object will have its own copy of the instance variable whereas We can only have one copy of a static variable per class irrespective of how many objects we create.
* Changes made in an instance variable using one object will not be reflected in other objects as each object has its own copy of the instance variable. In the case of static, changes will be reflected in other objects as static variables are common to all objects of a class.
* We can access instance variables through object references and Static Variables can be accessed directly using class name.


**Syntax:** Static and instance variables:
```java
 // Static variable
static int a;

// Instance variable
       int b; 
```
<br/>


---
## <p align=center>DataTypes</p>
#

Java is a **statically and strongly typed language** because these functions are inherited from C and C++.

Data Types in Java:
![Data types in Java](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191105111644/Data-types-in-Java.jpg)
---
<br/>

# Java has two categories of data: 
 
1. **Primitive Data Type**: such as *boolean, char, int, short, byte, long, float, and double*<br/>
2. **Non-Primitive Data Type** or **Object Data type**: such as *String, Array and etc.*

![Data types in Java](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191105122725/Primitive-Data-Types-in-Java-4.jpg)
<br/>


## <p align=center><b>Primitive Data Types</b></p>
# 

Primitive data are only single values and have no special capabilities. 

1. **boolean:** The data type represents only one bit of information either *true* or *false*, but the size of the boolean data type is virtual machine-dependent.<br/>
**Default value:** *false*

Basic syntax for declaring a boolean
```java
boolean <boolVariableName>;
```
Example :
```java
// Declaring and assigning a value
boolean flag = false;
```

<br/>

1. **byte:** The data type is an 8-bit signed integer. Useful for saving memory in large arrays.<br/> 
**Default value:** *0*

Basic syntax for declaring a byte
```java
byte <byteVariableName>;
```
Example :
```java
// Declaring and assigning a value
byte bVar = -128;
```

<br/>

1. **short:** The data type is a 16-bit signed integer. Useful for saving memory in large arrays such as byte.<br/> 
**Default value:** *0*

Basic syntax for declaring a short
```java
short <shortVariableName>;
```
Example :
```java
// Declaring and assigning a value
short shortVar = -15562;
```

<br/>

4. **int:** It is a 32-bit (4 Bytes) signed integer.<br/>
**Default value:** *0* 

Basic syntax for declaring a int
```java
int <integerVariableName>;
```
Example :
```java
// Declaring and assigning a value
int intVar = 89;
```
*Note:* In Java SE 8 and later, we can use the int data type to represent an **unsigned** 32-bit integer, which has value in the range [0 ... 2<sup>32</sup> -1]. Use the **Integer class** to use int data type as an *unsigned integer*.

<br/>

5. **long:** The data type is a 64-bit (8 Bytes) signed integer.<br/>
**Default value:** *0* 

Basic syntax for declaring a long
```java
long <longVariableName>;
```
Example :
```java
// Declaring and assigning a value
long longVar = -504588810;
```
*Note:* In Java SE 8 and later, you can use the long data type to represent an **unsigned** 64-bit long, which has a minimum value of 0 and a maximum value of 2<sup>64</sup>-1. The **Long class** also contains methods like *comparing Unsigned*, *divide Unsigned* and etc. **to support arithmetic operations for unsigned long**.<br/>

<br/>

6.  **float:** The data type is a single-precision 32-bit (4 Bytes) [IEEE 754][1] floating-point. Useful for saving memory (instead of double) in large arrays of floating-point numbers.<br/>
**Default value:** *0.0* 


Basic syntax for declaring a float
```java
float <floatVariableName>;
```

<p align=center><b>:warning: BE CAREFULLY :warning:</b></p>

> By *DEFAULT* in Java, the value of **real data types** is *DOUBLE*   
> Everywhere for the FLOAT values you have to use **f** as a suffix

Example :
```java
// Declaring and assigning a value
float floatVar = 4.7333434f;
```
<br/>

7.  **double:** The data type is a double-precision 64-bit (8 Bytes) [IEEE 754][1] floating-point.<br/> For **decimal values**, this data type is generally use by  DEFAULT.<br/>
**Default value:** *0.0*

Basic syntax for declaring a double
```java
double <doubleVariableName>;
```
Example :
```java
// Declaring and assigning a value
double doubleVar = -2454.355453532;
```
*Note:* Both float and double data types were designed especially for scientific calculations, where approximation errors are acceptable.<br/> If precision is a top priority, it is *strongly recommended to use* the **[*BigDecimal*][2] class** instead of these primitive data type.<br/> Please see this for details: [*Rounding off errors in Java*][3]
<br/>

8.  **char:** The data type is a single 16-bit (2 Bytes) Unicode character (UNSIGNED). <br>
**Default value:** *\u0000*

Basic syntax for declaring a char
```java
char <charVariableName>;
```
>*Note:* The char data type may contain the escape consequences!

Example:
```java
// Declaring and assigning a value
char endLine = '\n';
```
**Why is the size of char is 2 byte in Java?** <br/>
In other languages like C/C++ uses only ASCII characters and to represent all ASCII characters 8-bits is enough, 
But java uses the Unicode system not the ASCII code system and to represent Unicode system 8 bit is not enough to represent all characters so Java uses 2 bytes for characters.<br/>
***Unicode** defines a fully international character set that can represent most of the world’s written languages. It is a unification of dozens of character sets, such as Latin, Greeks, Cyrillic, Katakana, Arabic, and many more.*

---
<br/>

[1]: https://en.wikipedia.org/wiki/IEEE_floating_point
[2]: http://docs.oracle.com/javase/1.5.0/docs/api/java/math/BigDecimal.html
[3]: https://www.geeksforgeeks.org/rounding-off-errors-java/

<br/>


## <p align=center><b>Non-Primitive</b> Data Type or <b>Reference</b> Data Types</p>
# 

The **Reference Data Types** will contain a memory address of variable value because the reference types won’t store the variable value directly in memory. They are [*arrays*][4], [*strings*][5], [*class*][10], [*objects*][6], [*interface*][13], etc.

[4]: https://github.com/yoricsv/002.1_JDVLAOIS_.git
[5]: https://github.com/yoricsv/002.3_JStringRegExp_.git
[6]: https://github.com/yoricsv/004.1_JCOIP_.git

* [**String:**][4] Strings are defined as an array of characters. The difference between a character array and a string in Java is, the string is designed to hold a sequence of characters in a single variable whereas, a character array is a collection of separate char type entities.
* Unlike C/C++, Java strings are not terminated with a null character.
Below is the basic syntax for declaring a string in Java programming language.

Basic syntax for declaring a string
```java
<StringType> <stringName> = “<stringSequence>”;
```

Example *(without memory allocation on the heap)*:
```java
// Declaring 
String str = "Hello, world!";
```

Example *(with memory allocation on the heap)*:
```java
// Declare String using new operator 
String str = new String("Hello, world!"); 
```
* [Class:][10] A class is a user-defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order: 
   1. **Modifiers:** A class can be public or has default access (Refer [*this*][11] for details).
   2. **Class name:** The name should begin with a initial letter (capitalized by convention).
   3. **Superclass (*if any*):** The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
   4. **Interfaces (*if any*):** A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
   5. **Body:** The class body surrounded by braces, *{ }*.

[10]: https://www.geeksforgeeks.org/classes-objects-java/
[11]: https://www.geeksforgeeks.org/access-specifiers-for-classes-or-interfaces-in-java/

* [**Object:**][12] It is a basic unit of Object-Oriented Programming and represents the real-life entities.  A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of : 
   1. **State:** It is represented by attributes of an object. It also reflects the properties of an object.
   2. **Behavior:** It is represented by methods of an object. It also reflects the response of an object with other objects.
   3. **Identity:** It gives a unique name to an object and enables one object to interact with other objects.

[12]: https://www.geeksforgeeks.org/classes-objects-java/

* [**Interface:**][13] Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, nobody).   
   * Interfaces specify what a class must do and not how. It is the blueprint of the class.
   * An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
   * If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.
   * A Java library example is, [*Comparator Interface*][14]. If a class implements this interface, then it can be used to sort a collection.

[13]: https://www.geeksforgeeks.org/interfaces-in-java/
[14]: https://www.geeksforgeeks.org/comparator-interface-java/
---
<br/>


## <p align=center><b>Arrays</b></p>
# 

* [**Array:**][4] An array is a group of like-typed variables that are referred to by a common name. Arrays in Java work differently than they do in C/C++. The following are some important points about Java arrays. 
   * In Java, all arrays are dynamically allocated. (discussed below) 
 
   * Since arrays are objects in Java, we can find their length using member length. This is different from C/C++ where we find length using size.
   * A Java array variable can also be declared like other variables with [] after the data type.
   * The variables in the array are ordered and each has an index beginning from 0.
   * Java array can be also be used as a static field, a local variable or a method parameter.
   * The size of an array must be specified by an int value and not long or short.
   * The direct superclass of an array type is [Object][7].
   
   * Every array type implements the interfaces [Cloneable][8] and [java.io.Serializable][9].

[7]: https://www.geeksforgeeks.org/object-class-in-java/
[8]: https://www.geeksforgeeks.org/serialization-in-java/
[9]: https://www.geeksforgeeks.org/marker-interface-java/

---
<br/>


## <p align=center><b>Loops</b></p>
# 

Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true. <br/>
Java provides three ways for executing the loops. While all the ways provide similar basic functionality, they differ in their syntax and condition checking time.
<br/>


## [WHILE loop][26]
A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. The while loop can be thought of as a repeating if statement.

[26]: https://www.geeksforgeeks.org/java-while-loop-with-examples/

Syntax:
```java
while (boolean condition)
{
   ... statement(s) ...
}
```

Flowchart:
![While Loop](https://media.geeksforgeeks.org/wp-content/uploads/Loop1.png)

* While loop starts with the checking of condition. If it evaluated to true, then the loop body statements are executed otherwise first statement following the loop is executed. For this reason it is also called **Entry control loop**
* Once the condition is evaluated to true, the statements in the loop body are executed. Normally the statements contain an update value for the variable being processed for the next iteration.
* When the condition becomes false, the loop terminates which marks the end of its life cycle.

Example:
```java
public class WhileLoop
{
    public static void main(String... args)
    {
        int i = 1;
          
        while (i < 4) // Exit when "i" becomes 4
        {
            System.out.println(
                "Value of I is: " + i // Output: 1, 2, 3
            );
              
            i++; // IMPORTANT!!! Without the loop can't finised!
        }
    }
}
```
<br/>


## [FOR Loop][27]

A for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping.

[27]: https://www.geeksforgeeks.org/java-for-loop-with-examples/

Syntax:
```java
for ( initialization condition;
      testing condition;
      increment/decrement)
{
   ... statement(s) ...
}
```

Flowchart:
![For Loop](https://media.geeksforgeeks.org/wp-content/uploads/loop2.png)

1. **Initialization condition:** Here, we initialize the variable in use. It marks the start of a for loop. An already declared variable can be used or a variable can be declared, local to loop only.
2. **Testing Condition:** It is used for testing the exit condition for a loop. It must return a boolean value. It is also an *Entry Control Loop* as the condition is checked prior to the execution of the loop statements.
3. **Statement execution:** Once the condition is evaluated to true, the statements in the loop body are executed.
4. **Increment / Decrement:** It is used for updating the variable for next iteration.
5. **Loop termination:** When the condition becomes false, the loop terminates marking the end of its life cycle.

Example:
```java
public class ForLoop
{
    public static void main(String... args)
    {
        // loop starts from 1 to 3
        for (int i = 1; i < 4; i++)
            System.out.println(
                "Value of I is: " + i // Output: 1, 2, 3
            );

    }
}
```

**Enhanced FOR loop**

Java also includes another version of FOR loop. Enhanced FOR loop provides a simpler way to **iterate through** *the elements of a **collection*** or ***array***. It is inflexible and should be used only when there is a need to iterate through the elements in sequential manner without knowing the index of currently processed element.<br/>
Also note that the *object/variable* **is immutable** when enhanced for loop is used i.e it ensures that the values in the array can not be modified, so it can be said as read only loop where you can’t update the values as opposite to other loops where values can be modified.<br/>
We recommend using this form of the for statement instead of the general form whenever possible.(as per JAVA doc.)

Syntax:
```java
for (T element:Collection obj/array)
{
   ... statement(s) ...
}
```

Lets take an example to demonstrate how enhanced for loop can be used to simpify the work. Suppose there is an array of names and we want to print all the names in that array. Let’s see the difference with these two examples.

Example:
```java
public class EnhancedForLoop
{
    public static void main(String... args)
    {
        String[] array = {
                    "Ron",
                    "Harry",
                    "Hermoine"
                };
  
        for (String i:array)
        {
            System.out.println(i);          // Output: Ron, Harry, Hermoine
        }
  
        // the same function
        for ( int i = 0;
                  i < array.length;
                  i++)
        {
            System.out.println(array[i]);   // Output: Ron, Harry, Hermoine
        }
    }
}
```


## [FOR-EACH Loop][28]

A For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5. 
 
* It starts with the keyword for like a normal for-loop.
* Instead of declaring and initializing a loop counter variable, you declare a variable that is the same type as the base type of the array, followed by a colon, which is then followed by the array name.
* In the loop body, you can use the loop variable you created rather than using an indexed array element. 
* It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)

[28]: https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/


Syntax:
```java
for (T var : array) 
{ 
    ... statement(s) using var;
}
```
Is equivalent to:
```java
for ( int i = 0; 
          i < arr.length;
          i++) 
{ 
    T var = arr[i];

    ... statement(s) using var;
}
```

Example:
```java
public class ForEachLoop    
{
    public static void main(String... arg)
    {
        {
            int[] marks = {
                    125,
                    132,
                    95,
                    116,
                    110
                };
             
            int highest_marks = maximum(marks);

            System.out.println(
                "The highest score is " + highest_marks // Output: 132
            );
        }
    }
    
    public static int maximum(int[] numbers)
    {
        int maxSoFar = numbers[0];
         
        // for each loop
        for (int num : numbers)
        {
            if (num > maxSoFar)
                maxSoFar = num;
        }

    return maxSoFar;
    }
}
```

## Limitations of FOR-EACH loop 

1. For-each loops **arn't appropriate when you want to modify the array**:
```java
for (int num : marks) 
{
    // only changes num, NOT THE ARRAY ELEMENT
    num = num * 2; 
}
```
2. For-each loops **don't keep track of index**. So we can not obtain array index using For-Each loop 
```java
for (int num : numbers) 
{ 
    if (num == target) 
    {
        return ???;   // DON'T KNOW THE INDEX of num
    }
}
```
3. For-each **only iterates forward over the array in single steps**
```java
// CAN'T BE CONVERTED TO A FOR-EACH loop
for ( int i = numbers.length - 1;
          i > 0;
          i--) 
{
      System.out.println(numbers[i]);
}
```
4. For-each **can't process two decision making statements** at once 
```java
// CAN'T BE EASILY CONVERTED TO A FOR-EACH loop
for ( int i = 0;
          i < numbers.length;
          i++) 
{
    if (numbers[i] == arr[i]) 
    {
        ... statement(s) ...
    } 
}
```
5.  For-each also has some **performance overhead** over simple iteration: 
```java
import java.io.*;
import java.util.*;
 
public class PerformanceOverhead
{
    public static void main (String... args)
    {
        List<Integer> list       = new ArrayList<>();
        long          startTime;
        long          endTime;

        for ( int i = 0;
                  i < 1000000;
                  i++) 
            list.add(i);


        // Type 1
        startTime = Calendar.getInstance().getTimeInMillis();

        for (int i : list)
            int a = i;

        endTime   = Calendar.getInstance().getTimeInMillis();

        System.out.println(
            "For each loop : " + (endTime - startTime) + " ms"
        );
         

        // Type 2
        startTime = Calendar.getInstance().getTimeInMillis();

        for ( int j = 0;
                  j < list.size();
                  j++)
            int a = list.get(j);

        endTime   = Calendar.getInstance().getTimeInMillis();

        System.out.println(
            "Using collection.size() : " + (endTime - startTime) + " ms"
        );


        // Type 3
        startTime = Calendar.getInstance().getTimeInMillis();

         int size = list.size();

        for ( int j = 0;
                  j < size;
                  j++)
            int a = list.get(j);

        endTime   = Calendar.getInstance().getTimeInMillis();

        System.out.println(
            "By calculating collection.size() first : " + (endTime - startTime) + " ms"
        );
     
        // Type 4
        startTime = Calendar.getInstance().getTimeInMillis();

        for( int j = list.size() - 1;
                 j >= 0;
                 j--)
            int a = list.get(j);

        endTime = Calendar.getInstance().getTimeInMillis();

        System.out.println(
            "Using [int j = list.size(); j > size ; j--] : " + (endTime - startTime) + " ms"
        );
    }
}
```
<br/>


## [DO-WHILE Loop][28]

A do while loop is similar to while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop.

[28]: https://www.geeksforgeeks.org/java-do-while-loop-with-examples/


Syntax:
```java
do
{
    ... statement(s) ...
}
while (boolean condition);
```

Flowchart:
![Do-While Loop](https://media.geeksforgeeks.org/wp-content/uploads/loop3.png)

1. do while loop starts with the execution of the statement(s). There is no checking of any condition for the first time.
2. After the execution of the statements, and update of the variable value, the condition is checked for true or false value. If it is evaluated to true, next iteration of loop starts.
3. When the condition becomes false, the loop terminates which marks the end of its life cycle.
4. It is important to note that the do-while loop will execute its statements atleast once before any condition is checked, and therefore is an example of exit control loop.

Example:
```java
public class DoWhileLoop
{
    public static void main(String... args)
    {
        int i = 32;

        do
        {
            System.out.println(
                "Value of I is: " + i // Output: 32
            );
              
            i++; // IMPORTANT!!! Without the loop can't finised!
        }
        while (i < 2);
    }
}
```
<br/>


**Pitfalls of Loops**

1. **Infinite loop:** One of the most common mistakes while implementing any sort of looping is that that it may not ever exit, that is the loop runs for infinite time. This happens when the condition fails for some reason.
   
Two examples of INFINITE LOOP:
```java
public class PitfallLoop
{
    public static void main(String... args)
    {

        for ( int i =  5;
                  i != 0;   // correct condition is: i > 0
                  i -= 2)
        {
            System.out.println(i);
        }


        int x = 5;
        while (x == 5)
        {
            System.out.println("In the loop");

            // Update statement ISN'T PROVIDED
            // correct statement is: i++;
        }
    }
}
```

2. **Another pitfall** is that you might be adding something into you collection object through loop and you can run out of memory. If you try and execute the below program, after some time, out of memory exception will be thrown.

Example:
```java
import java.util.ArrayList;

public class Integer1
{
    public static void main(String... args)
    {
        ArrayList<Integer> ar = new ArrayList<>();

        for ( int i = 0;
                  i < Integer.MAX_VALUE;
                  i++)
        {
            ar.add(i); // Output: ERROR: OUT OF MEMORY (CAN'T REACH THE MAXIMUM VALUE !!!)

            // Every time a NEW item is ADDED.
            
        }
    }
}
```
---
<br/>


## <p align=center><b>Operators</b></p>
# 

Java provides many types of operators which can be used according to the need. They are classified based on the functionality they provide.<br/>

Some of the types are:
1. [Arithmetic Operators][15]
2. [Unary Operators][16]
3. [Assignment Operator][17]
4. [Relational Operators][18]
5. [Logical Operators][19]
6. [Ternary Operator][20]
7. [Bitwise Operators][21]
8. [Shift Operators][22]
9. [instance of operator][23]
10. [Precedence and Associativity][24]
11. [Interesting Questions][25]

[15]: https://www.geeksforgeeks.org/java-arithmetic-operators-with-examples/
[16]: https://www.geeksforgeeks.org/java-unary-operator-with-examples/
[17]: https://www.geeksforgeeks.org/java-assignment-operator-with-examples/
[18]: https://www.geeksforgeeks.org/java-relational-operators-with-examples/
[19]: https://www.geeksforgeeks.org/java-logical-operators-with-examples/
[20]: https://www.geeksforgeeks.org/java-ternary-operator-with-examples/
[21]: https://www.geeksforgeeks.org/operators-in-java/?ref=lbp
[22]: https://www.geeksforgeeks.org/operators-in-java/?ref=lbp
[23]: https://www.geeksforgeeks.org/java-instanceof-and-its-applications/
[24]: https://www.geeksforgeeks.org/operators-in-java/?ref=lbp
[25]: https://www.geeksforgeeks.org/operators-in-java/?ref=lbp


**Arithmetic Operators:** They are used to perform simple arithmetic operations on primitive data types.

Symbol | Operator 
  ---: | :---
\*     | Multiplication
\/     | Division
%      | Modulo
\+     | Addition
–      | Subtraction
<br/>


**Unary Operators:** Unary operators need only one operand. They are used to increment, decrement or negate a value.

Symbol | Operator 
  ---: | :---
–      | **Unary minus**, used for negating the values.
\+     | **Unary plus**, indicates positive value (numbers are positive without this, however). It performs an automatic conversion to int when the type of its operand is byte, char, or short. This is called unary numeric promotion.
++     | **Increment operator**, used for incrementing the value by 1. There are two varieties of increment operator.<br/> *Post-Increment:* Value is first used for computing the result and then incremented.<br/> *Pre-Increment:* Value is incremented first and then result is computed.
--     | **Decrement operator**, used for decrementing the value by 1. There are two varieties of decrement operator.<br/> *Post-decrement:* Value is first used for computing the result and then decremented.<br/> *Pre-Decrement:* Value is decremented first and then result is computed.
!      | **Logical NOT operator**, used for inverting a boolean value.
<br/>


**Assignment Operator:** The operator is used to assign a value to any variable. It has a right to left associativity, i.e value given on right hand side of operator is assigned to the variable on the left and therefore right hand side value must be declared before using it or should be a constant.

Symbol | Operator 
  ---: | :---
=      | Assignment operator
<br/>

General format of assignment:
```java
variable = value;
```
In many cases assignment operator can be combined with other operators to build a shorter version of statement called Compound Statement.
<br/>

For example:
```java
// instead of
a = a + 5;
// we can use
a += 5;
```

Symbol | Operator 
  ---: | :---
+=     | **adding left operand** with right operand and then assigning it to variable on the left.
-=     | **subtracting left operand** with right operand and then assigning it to variable on the left.
*=     | **multiplying left operand** with right operand and then assigning it to variable on the left.
/=     | **dividing left operand** with right operand and then assigning it to variable on the left.
%=     | **assigning modulo of left operand** with right operand and then assigning it to variable on the left.
<br/>


**Relational Operators:** These operators are used to check for relations like equality, greater than, less than. They return boolean result after the comparison and are extensively used in looping statements as well as conditional if else statements.

General format is: 
```
variable relationOperator value
```

Some of the relational operators are:
Symbol | Operator 
  ---: | :--- 
==     | **Equal to:** returns true if left hand side is equal to right hand side.
!=     | **Not Equal to:** returns true if left hand side is not equal to right hand side.
<      | **less than:** returns true if left hand side is less than right hand side.
<=     | **less than or equal to:** returns true if left hand side is less than or equal to right hand side.
\>     | **Greater than:** returns true if left hand side is greater than right hand side.
\>=    | **Greater than or equal to:** returns true if left hand side is greater than or equal to right hand side.
<br/>


**Logical Operators:** These operators are used to perform “logical AND” and “logical OR” operation, i.e. the function similar to AND gate and OR gate in digital electronics. One thing to keep in mind is the second condition is not evaluated if the first one is false, i.e. it has a short-circuiting effect. Used extensively to test for several conditions for making a decision.

Conditional operators are:
Symbol | Operator 
  ---: | :--- 
&&     | **Logical AND:** returns true when both conditions are true.
\|\|   | **Logical OR:** returns true if at least one condition is true.
<br/>


**Ternary operator:** Ternary operator is a shorthand version of *IF-ELSE statement*. It has three operands and hence the name ternary. 

General format is: 
```
condition ? if true : if false
```

The above statement means that IF the condition evaluates to TRUE, then *execute* the statements *after* the **"?"** else *execute* the statements *after* the **":"**. 

Example:
```java
public class TernaryOperators
{
    public static void main(String... args)
    {
        int a = 20,
            b = 10,
            c = 30,
            result;
 
        result = (
            (a > b) ?
                (a > c) ? a : c
            :
                (b > c) ? b : c
        );
        
        System.out.println(
            "Max of three numbers is: " + result    // Output: 30
        );
    }
}
```
<br/>


**Bitwise Operators:** These operators are used to perform manipulation of individual bits of a number. They can be used with any of the integer types. They are used when performing update and query operations of Binary indexed tree.

Symbol | Operator 
  ---: | :--- 
&      | **Bitwise AND operator:** returns bit by bit AND of input values.
\|     | **Bitwise OR operator:** returns bit by bit OR of input values.
^      | **Bitwise XOR operator:** returns bit by bit XOR of input values.
~      | **Bitwise Complement Operator:** This is a unary operator which returns the one’s compliment representation of the input value, i.e. with all bits inversed.
<br/>


**Shift Operators:** These operators are used to shift the bits of a number left or right thereby multiplying or dividing the number by two respectively. They can be used when we have to multiply or divide a number by two. 

General format is: 
```
number shiftOperator numberOfPlacesToShift;
```
Example: 
```java
number << 1; // Each step multiply the value of 2 (the same as: number *= 2;)

number >> 4; // Each step divide the value of 2   (the same as: number := 8;)
```
Symbol | Operator 
  ---: | :--- 
<<     | **Left shift operator:** shifts the bits of the number to the left and fills 0 on voids left as a result. Similar effect as of multiplying the number with some power of two.
\>\>   | **Signed Right shift operator:** shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit depends on the sign of initial number. Similar effect as of dividing the number with some power of two.
\>\>\> | **Unsigned Right shift operator:** shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit is set to 0.
<br/>


**Instance of operator:** Instance of operator is used for type checking. It can be used to test if an object is an instance of a class, a subclass or an interface.

General format is: 
```java
object instanceof class/subclass/interface
```
Example:
```java
class InstanceOperators
{
    public static void main(String... args)
    {
        Person obj1 = new Person();
        Person obj2 = new Boy();
 
        // As obj is of type person, it is not an instance of Boy or interface
        System.out.println(
            "obj1 instanceof Person: "      + (obj1 instanceof Person)      // Output: true
        );
        System.out.println(
            "obj1 instanceof Boy: "         + (obj1 instanceof Boy)         // Output: false
        );
        System.out.println(
            "obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface) // Output: false
        );
 
        // Since obj2 is of type boy, whose parent class is person and it implements the 
        // interface Myinterface it is instance of all of these classes
        System.out.println(
            "obj2 instanceof Person: "      + (obj2 instanceof Person)      // Output: true
        );
        System.out.println(
            "obj2 instanceof Boy: "         + (obj2 instanceof Boy)         // Output: true
        );
        System.out.println(
            "obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface) // Output: true
        );
    }
}
 
class Person
{

}
 
class Boy extends Person implements MyInterface
{

}
 
interface MyInterface
{

}
```
<br/>


**Precedence and Associativity of Operators**

Precedence and associative rules are used when dealing with hybrid equations involving more than one type of operator. In such cases, these rules determine which part of the equation to consider first as there can be many different valuations for the same equation. The below table depicts the precedence of operators in decreasing order as magnitude with the top representing the highest precedence and bottom shows the lowest precedence.

![Associativity](https://media.geeksforgeeks.org/wp-content/uploads/operators.png)

<br/>


**Interesting Questions on Operators**

**Precedence and Associativity:** There is often a confusion when it comes to hybrid equations that is equations having multiple operators. The problem is which part to solve first. There is a golden rule to follow in these situations. If the operators have different precedence, solve the higher precedence first. If they have same precedence, solve according to associativity, that is either from right to left or from left to right. Explanation of below program is well written in comments withing the program itself.

Example:
```java
public class PrecAndAssociatRules
{
    public static void main(String... args)
    {
        int a = 20,
            b = 10,
            c = 0,
            d = 20,
            e = 40,
            f = 30;
 
    /*
        * PRECEDENCE RULES
        * (if work will be next:)
        * First  step: B / D = 10 / 20 = 0.5
        * Second step: result(B/D) + A = 0.5 + 20 = 20.5 -> (int) -> 20
    */
        System.out.println(
            "The result of A + B / D is: " + (a + b / d)                    // Output: 20
        );
 
    /*
        * If the same precedence is followed as the associativity rules:
        * First  step: B * D = 10 * 20 = 200
        * Second step: E / F = 40 / 30 = 1.3(3)
        * Third  step: A + result(B*D) = 20 + 200 = 220
        * Fourth step: result(A+result(B*D)) - result(E/F) = 220 - 1.3(3) = 218.6(7) -> (int) -> 219
    */ 
        System.out.println(
            "The result of A + B * D - E / F is: " + (a + b * d - e / f)    // Output: 219
        );
    }
}
```
<br/>


**Be a Compiler:** Compiler in our systems uses lex tool to match the greatest match when generating tokens. This creates a bit of a problem if overlooked.
<br/>
*For example*, consider the statement **A=B+++C;**, to many of the readers this might seem to create compiler error. But this statement is absolutely correct as the token created by lex are **A**, **=**, **B**, **++**, **+**, **C**.
<br/>
*Therefore* this statement has a similar effect of ***first assigning* B + C *to* A** and ***then incrementing* B**.
<br/>
*Similarly*, **A=B+++++C;** would generate error as tokens generated are **A**, **=**, **B**, **++**, **++**, **+**, **C** which IS actually AN ERROR as **there is no operand after second unary operand**. 

Example:
```java
public class operators
{
    public static void main(String... args)
    {
        int a = 20,
            b = 10,
            c = 0;
 
        // A=B+++C is compiled as B++ +C
        // First  step: B + C = 10 + 0 = 10
        // Second step: A = result(B+C) = 10
        // Third  step: B = B + 1 = 10 + 1 = 11

        System.out.println(
            "The result of:"   +     "\n\t" +
            "A = (B + C) is: " + a + "\n\t" +   // Output: 10
            "B = (B + 1) is: " + b + "\n\t" +   // Output: 11
            "C is: "           + c              // Output: 0
        );
 
        // A=B+++++C is compiled as  B++ ++ +C which GIVES ERROR!
        // Uncommente the line below to check this

        // System.out.println(b+++++c);
    }
}
```
<br/>


**Using + over ():** When *using **+** operator inside system.out.println()* make sure to do addition using parenthesis.
<br/>
If we write something before doing addition, then string addition takes place, that is associativity of addition is left to right and hence integers are added to a string first producing a string, and string objects concatenate when using +, therefore it can create unwanted results. 

Example:
```java
public class AdditionAndConcatenation
{
    public static void main(String... args)
    {
 
        int x = 5,
            y = 8;
 
        // A line will be printed, then added 5 and then 8 (no spaces),
        // which will be concatenated into the next line:
        // "Concatenation (X + Y) = 58"
        System.out.println(
            "Concatenation (X + Y) = "  + x + y
        );  // Output: 58
 
        System.out.println(
            "Addition (X + Y) = "       + (x + y)
        );   // Output: 13
    }
}
```
---
<br/>


## <p align=center><b>IF-ELSE operator (Decision maker)</b></p>
# 

Decision Making in programming is similar to decision making in real life. In programming also we face some situations where we want a certain block of code to be executed when some condition is fulfilled.
<br/>
A programming language uses control statements to control the flow of execution of program based on certain conditions. These  are used to cause the flow of execution to advance and branch based on changes to the state of a program.
<br/>

**Java’s Selection statements:**
* [if][30]
* [if-else][31]
* [nested-if][32]
* [if-else-if][33]
* [switch-case][34]
* [jump][35] – break, continue, return

[30]: https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/?ref=lbp#if
[31]: https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/?ref=lbp#if-else
[32]: https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/?ref=lbp#nested-if
[33]: https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/?ref=lbp#if-else-if
[34]: https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/?ref=lbp#switch-case
[35]: https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/?ref=lbp#jump

These statements allow you to control the flow of your program’s execution based upon conditions known only during run time.

[**if:**][36] The statement is the most simple decision making statement. It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.

[36]: https://www.geeksforgeeks.org/java-if-statement-with-examples/

Syntax:
```java
if(boolean condition) 
{
   // Execute statements when condition is TRUE
}
```
Here, **condition** after evaluation will be either TRUE or FALSE.
<br/>
if statement accepts boolean values – if the value is TRUE then it will execute the block of statements under it.
<br/>
If we don't provide the *curly braces* **"{"** and **"}"** after **if(***...condition...***)** then by default if statement will consider the immediate **one statement** to be inside its block.

Example,
```java
if(condition)
   statement1;  // Execute the statement1 ONLY when condition is TRUE
   statement2;
```
Flowchart:
![IF](https://media.geeksforgeeks.org/wp-content/uploads/if.png)

Example:
```java
public class IfDecisionMaker
{
    public static void main(String... args)
    {
        int i = 10;
  
        if (i > 15)
            System.out.println(
                "10 is less than 15" // Output: ...nothing...
            );
  
        System.out.println(
            "I am Not in if"  // Output: I am Not in if
        );
    }
}
```
<br/>


[**if-else:**][37] The if statement alone tells us that if a condition is true it will execute a block of statements and if the condition is false it won’t. But what if we want to do something else if the condition is false. Here comes the else statement. We can use the else statement with if statement to execute a block of code when the condition is false.

[37]: https://www.geeksforgeeks.org/java-if-else-statement-with-examples/

Syntax:
```java
if(boolean condition) 
{
   ... statement(s) ... // Execute when condition is TRUE
}
else
{
    ... statement(s) ... // Execute when condition is FALSE
}
}
```
Flowchart:
![IF-ELSE](https://media.geeksforgeeks.org/wp-content/uploads/if-else.png)

Example:
```java
class IfElse
{
    public static void main(String... args)
    {
        int num = 10;
  
        if (num < 15)
            System.out.println(
                "NUM is smaller than 15" // Output: NUM is smaller than 15
            );
        else
            System.out.println(
                "NUM is greater than 15" // Output: ... nothing ...
            );
    }
}
```
<br/>


[**nested-if:**][32] A nested if is an if statement that is the target of another if or else. Nested if statements means an if statement inside an if statement. Yes, java allows us to nest if statements within if statements. i.e, we can place an if statement inside another if statement.

Syntax:
```java
if(boolean condition) 
{
   ... statement(s) ... // Execute when condition is TRUE
   if (boolean condition2) 
   {
      ... statement(s) ... // Executes when condition2 is TRUE
   }
}
```
Flowchart:
![NESTED-IF](https://media.geeksforgeeks.org/wp-content/uploads/nested-if-modified-1.png)

Example:
```java
public class NestedIf
{
    public static void main(String... args)
    {
        int i = 10;
  
        if (i == 10)
        {
            if (i < 15)
                System.out.println(
                    "i is smaller than 15"
                );
  
            // Nested - if statement
            // Will only be executed if statement above
            // it is true
            if (i < 12)
                System.out.println(
                    "i is smaller than 12 too"
                );
            else
                System.out.println(
                    "i is greater than 15"
                );
        }
    }
}
```

---
<br/>


## <p align=center><b>Switch operator</b></p>
# 

