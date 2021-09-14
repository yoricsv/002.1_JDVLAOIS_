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

# <p align=center><b>Variables in Java</b></p>

A variable is a name given to a memory location. It is the basic unit of storage in a program.

### Common features:
* The value stored in a variable can be changed during program execution.
* A variable is only a name given to a memory location, all the operations done on the variable effects that memory location.
* In Java, all the variables must be declared before use.

### The declaration of variables:

![Variables](https://media.geeksforgeeks.org/wp-content/uploads/20191110223008/java-declare.jpeg)

From the image, it can be easily perceived that while declaring a variable we need to take care of two things  that while de

### **The declaration:**

***Datatype:*** Type of data that can be stored in this variable.<br/>
***Dataname:*** Name given to the variable. In this way, a name can only be given to a memory location. It can be assigned values in two ways:

* Variable Initialization
* Assigning value by taking input

### **The initialization:**

* **datatype:** Type of data that can be stored in this variable. 
* **variable_name:** Name given to the variable. 
* **value:** It is the initial value stored in the variable.

![Declaration](https://media.geeksforgeeks.org/wp-content/uploads/Variables-in-Java.png)

#### Examples:
```java
// Declaring
float simpleInterest;

// Declaring and Initializing
int   time = 10,
     speed = 20;

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

#### **Syntax:** Static and instance variables:
```java
static int a;   // Static variable
       int b;   // Instance variable
```
---
<br/>


# <p align=center><b>DataTypes</b></p>

Java is a **statically and strongly typed language** because these functions are inherited from C and C++.

### Data Types in Java:
![Data types in Java](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191105111644/Data-types-in-Java.jpg)

<br/>

### Java has two categories of data: 
 
1. **Primitive Data Type**: such as *boolean, char, int, short, byte, long, float, and double*
2. **Non-Primitive Data Type** or **Object Data type**: such as *String, Array and etc.*

![Data types in Java](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191105122725/Primitive-Data-Types-in-Java-4.jpg)

<br/>

# Primitive Data Types

Primitive data are only single values and have no special capabilities. 

1. **boolean:** The data type represents only one bit of information either *true* or *false*, but the size of the boolean data type is virtual machine-dependent.<br/>
**Default value:** *false*

#### Syntax:
```java
boolean <boolVariableName>;
```

#### Example:
```java
// Declaring and assigning a value
boolean flag = false;
```

1. **byte:** The data type is an 8-bit signed integer. Useful for saving memory in large arrays.<br/> 
**Default value:** *0*

#### Syntax:
```java
byte <byteVariableName>;
```

#### Example:
```java
// Declaring and assigning a value
byte bVar = -128;
```

1. **short:** The data type is a 16-bit signed integer. Useful for saving memory in large arrays such as byte.<br/> 
**Default value:** *0*

#### Syntax:
```java
short <shortVariableName>;
```
#### Example:
```java
// Declaring and assigning a value
short shortVar = -15562;
```

4. **int:** It is a 32-bit (4 Bytes) signed integer.<br/>
**Default value:** *0* 

#### Syntax:
```java
int <integerVariableName>;
```

#### Example:
```java
// Declaring and assigning a value
int intVar = 89;
```

> *Note:* In Java SE 8 and later, we can use the int data type to represent an **unsigned** 32-bit integer, which has value in the range [0 ... 2<sup>32</sup> -1]. Use the **Integer class** to use int data type as an *unsigned integer*.

5. **long:** The data type is a 64-bit (8 Bytes) signed integer.<br/>
**Default value:** *0* 

#### Syntax:
```java
long <longVariableName>;
```
#### Example:
```java
// Declaring and assigning a value
long longVar = -504588810;
```

> *Note:* In Java SE 8 and later, you can use the long data type to represent an **unsigned** 64-bit long, which has a minimum value of 0 and a maximum value of 2<sup>64</sup>-1. The **Long class** also contains methods like *comparing Unsigned*, *divide Unsigned* and etc. **to support arithmetic operations for unsigned long**.

6.  **float:** The data type is a single-precision 32-bit (4 Bytes) [IEEE 754][1] floating-point. Useful for saving memory (instead of double) in large arrays of floating-point numbers.<br/>
**Default value:** *0.0* 

#### Syntax:
```java
float <floatVariableName>;
```

> <p align=center>:warning: BE CAREFULLY :warning:</p>
> ---
> By *DEFAULT* in Java, the value of **real data types** is *DOUBLE* <br/>
> Everywhere for the FLOAT values you have to use **f** as a suffix

#### Example:
```java
// Declaring and assigning a value
float floatVar = 4.7333434f;
```

7.  **double:** The data type is a double-precision 64-bit (8 Bytes) [IEEE 754][1] floating-point.<br/> For **decimal values**, this data type is generally use by  DEFAULT.<br/>
**Default value:** *0.0*

#### Syntax:
```java
double <doubleVariableName>;
```
#### Example :
```java
// Declaring and assigning a value
double doubleVar = -2454.355453532;
```
> *Note:* Both float and double data types were designed especially for scientific calculations, where approximation errors are acceptable.<br/>
> If precision is a top priority, it is *strongly recommended to use* the **[*BigDecimal*][2] class** instead of these primitive data type.<br/>
> Please see this for details: [*Rounding off errors in Java*][3]

8.  **char:** The data type is a single 16-bit (2 Bytes) Unicode character (UNSIGNED). <br>
**Default value:** *\u0000*

#### Syntax:
```java
char <charVariableName>;
```
> *Note:* The char data type may contain the escape consequences!

#### Example:
```java
// Declaring and assigning a value
char endLine = '\n';
```

**Why is the size of char is 2 byte in Java?** <br/>
In other languages like C/C++ uses only ASCII characters and to represent all ASCII characters 8-bits is enough, 
But java uses the Unicode system not the ASCII code system and to represent Unicode system 8 bit is not enough to represent all characters so Java uses 2 bytes for characters.<br/>
***Unicode** defines a fully international character set that can represent most of the world’s written languages. It is a unification of dozens of character sets, such as Latin, Greeks, Cyrillic, Katakana, Arabic, and many more.*

<br/>

# **Non-Primitive** Data Type or **Reference** Data Types

The **Reference Data Types** will contain a memory address of variable value because the reference types won’t store the variable value directly in memory. They are [*arrays*][4], [*strings*][5], [*class*][10], [*objects*][6], [*interface*][13], etc.

* [**String:**][4] Strings are defined as an array of characters. The difference between a character array and a string in Java is, the string is designed to hold a sequence of characters in a single variable whereas, a character array is a collection of separate char type entities.
* Unlike C/C++, Java strings are not terminated with a *null* character.
Below is the basic syntax for declaring a string in Java programming language.

#### Syntax:
```java
<StringType> <stringName> = “<stringSequence>”;
```

#### Example *(without memory allocation on the heap)*:
```java
// Declaring 
String str = "Hello, world!";
```

#### Example *(with memory allocation on the heap)*:
```java
// Declare String using new operator 
String str = new String("Hello, world!"); 
```

* [**Class:**][10] A class is a user-defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order: 
   1. **Modifiers:** A class can be public or has default access (Refer [*this*][11] for details).
   2. **Class name:** The name should begin with a initial letter (capitalized by convention).
   3. **Superclass (*if any*):** The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
   4. **Interfaces (*if any*):** A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
   5. **Body:** The class body surrounded by braces, *{ }*.

* [**Object:**][12] It is a basic unit of Object-Oriented Programming and represents the real-life entities.  A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of : 
   1. **State:** It is represented by attributes of an object. It also reflects the properties of an object.
   2. **Behavior:** It is represented by methods of an object. It also reflects the response of an object with other objects.
   3. **Identity:** It gives a unique name to an object and enables one object to interact with other objects.

* [**Interface:**][13] Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, nobody).   
   * Interfaces specify what a class must do and not how. It is the blueprint of the class.
   * An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
   * If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.
   * A Java library example is, [*Comparator Interface*][14]. If a class implements this interface, then it can be used to sort a collection.

[1]: https://en.wikipedia.org/wiki/IEEE_floating_point
[2]: http://docs.oracle.com/javase/1.5.0/docs/api/java/math/BigDecimal.html
[3]: https://www.geeksforgeeks.org/rounding-off-errors-java/
[4]: https://github.com/yoricsv/002.1_JDVLAOIS_.git
[5]: https://github.com/yoricsv/002.3_JStringRegExp_.git
[6]: https://github.com/yoricsv/004.1_JCOIP_.git
[10]: https://www.geeksforgeeks.org/classes-objects-java/
[11]: https://www.geeksforgeeks.org/access-specifiers-for-classes-or-interfaces-in-java/
[12]: https://www.geeksforgeeks.org/classes-objects-java/
[13]: https://www.geeksforgeeks.org/interfaces-in-java/
[14]: https://www.geeksforgeeks.org/comparator-interface-java/

---
<br/>

# <p align=center><b>Arrays</b></p> 

* [**Array:**][4] An array is a group of like-typed variables that are referred to by a common name. Arrays in Java work differently than they do in C/C++. The following are some important points about Java arrays. 
   * In Java, all arrays are dynamically allocated.
   * Since arrays are objects in Java, we can find their length using member length. This is different from C/C++ where we find length using size.
   * A Java array variable can also be declared like other variables with [] after the data type.
   * The variables in the array are ordered and each has an index beginning from 0.
   * Java array can be also be used as a static field, a local variable or a method parameter.
   * The size of an array must be specified by an int value and not long or short.
   * The direct superclass of an array type is [Object][7].
   * Every array type implements the interfaces [Cloneable][8] and [java.io.Serializable][9].

Array can contain primitives (*int*, *char* and etc.) as well as object (or non-primitive) references of a *class* depending on the definition of the array.
<br/>In case of **primitive** data types, the actual values are stored **in contiguous memory** locations. 
<br/>In case of objects of a **class**, the actual [objects are stored **in heap**][42] segment.

![Array in memory](https://media.geeksforgeeks.org/wp-content/uploads/Arrays1.png)

<br/>

## Creating, Initializing, and Accessing an Array
#

### **One-Dimensional Arrays:**
The general form of a one-dimensional array declaration is:

#### Syntax (both are valid declarations):
```java
Type varName[]; // C-Style
```

#### or:
```java
Type[] varName; // Java-Style
```

An array declaration has two components: the **type** and the **name**. *Type* declares *the element type* of the array. The element type determines the **data type of each element** that comprises the array. Like an array of integers, we can also create an array of other primitive data types like char, float, double, etc. or user-defined data types (objects of a class). Thus, the **element type** for the array determines **what type of data the array will hold**.

#### Example:
```java
// ARRAYS OF PRIMITIVE DATA TYPES
// numbers
      byte[] byteArray;
     short[] shortsArray;
       int[] intArray;
      long[] longArray;
// floating point
     float[] floatArray;
    double[] doubleArray;
// symbolic
      char[] charArray;
// boolean
   boolean[] booleanArray;

// ARRAYS OF NON-PRIMITIVE DATA TYPES (create by user)
// classes (objects)
   MyClass[] myClassArray;
    Object[] objectArray;
// collections (unknown type)
Collection[] collectionArray;
```

Although the first declaration above establishes the fact that intArray is an array variable, **no actual array exists**. It merely tells the compiler that this variable (intArray) will hold an array of the integer type. To link intArray with an actual, physical array of integers, you must allocate one using **new** and assign it to intArray.

<br/>

## Instantiating an Array in Java
#

When an array is declared, only a reference of array is created. To actually create or give memory to array, you create an array like this:
<br/>
The general form of *new* as it applies to one-dimensional arrays appears as follows:

#### Syntax:
```java
varName = new type [size];
```

Here is:
* *"type"* specifies the type of data being allocated, 
* *"size"* specifies the number of elements in the array,
* *"varName"* is the name of array variable that is linked to the array, 
* *"new"* to allocate an array, **you must specify** the **type** and **number of elements** to allocate**.

#### Example:
```java
int[] intArray;                 // declaring array
intArray = new int[20];         // allocating memory to array
```

#### or:
```java
int[] intArray = new int[20];   // combining both statements in one
```

> *Note:*
>1. The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types).<br/>
Refer [Default array values in Java][43]
>2. Obtaining an array is a two-step process. First, you must declare a variable of the desired array type. Second, you must allocate the memory that will hold the array, using new, and assign it to the array variable. Thus, in Java **all arrays are dynamically allocated**.

<br/>

## Array Literal
#

In a situation, where the size of the array and variables of array are already known, array literals can be used.

#### Example:
```java
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; // Declaring array literal
```

* The length of this array determines the length of the created array.
* There is no need to write the new int[] part in the latest versions of Java

<br/>

## Accessing Java Array Elements using for Loop
#

Each element in the array is accessed via its index. The index *begins* with **"0"** and *ends* at **"(total array size) - 1"**. All the elements of array can be accessed using Java for Loop.

#### Example:
```java
// accessing the elements of the specified array
for ( int i = 0; i < arr.length; i++)
    System.out.println(
        "Element at index " + i + 
                      " : " + arr[i]
    );
```

#### Implementation:
```java
public class Array 
{
    public static void main (String[] args) 
    {         
      
        int[] arr;          // declaring
      
        arr = new int[5];   // allocating memory

        // initialization of array elements
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 12;
        arr[4] = 2;
          
        // accessing the elements of the specified array
        for ( int i = 0;
                  i < arr.length;
                  i++)
            System.out.println(
                "Element at index " + i + 
                              " : " + arr[i]    // Output: 3, 5, 3, 12, 2
            );          
    }
}
```

You can also access java arrays using [foreach loops][28]

![One-Dimensional Array](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Blank-Diagram-Page-1-10.jpeg)

<br>

## Arrays of Objects
#

An array of objects is created just like an array of primitive type data items in the following way.

#### Example:
```java
Student[] arr = new Student[7]; //student is a user-defined class
```

The studentArray contains seven memory spaces each of size of student class in which the address of seven Student objects can be stored. The *Student* objects have *to be instantiated using the constructor* of the Student class and their *references* should be *assigned* to the array elements in the following way.

#### Example:
```java
Student[] arr = new Student[5];
```

#### Example:
```java
public class Student
{
    public int    roll_no;
    public String name;

    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name    = name;
    }
}
  
// Elements of the array are objects of a class Student.
public class Classmates
{
    public static void main (String... args)
    {
        Student[] arr;          // declarating
  
        arr = new Student[5];   // allocating memory
  
        // initialization of array elements
        arr[0] = new Student(1,"John");
        arr[1] = new Student(2,"Silvia");
        arr[2] = new Student(3,"Frank");
        arr[3] = new Student(4,"Domenik");
        arr[4] = new Student(5,"Ann");
  
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println(                     // Output: Element at 0 : 1 John
                "Element at " + i               +   // Output: Element at 1 : 2 Silvia
                " : "         + arr[i].roll_no  +   // Output: Element at 2 : 3 Frank
                " "           + arr[i].name         // Output: Element at 3 : 4 Domenik
            );                                      // Output: Element at 4 : 5 Ann
    }
}
```
<br/>

## Access to the element outside the array size
#

JVM throws **ArrayIndexOutOfBoundsException** to indicate that array has been accessed with an illegal index. The index is either negative or greater than or equal to size of array.

#### Example:
```java
public class ArrayIndexOut
{
    public static void main (String... args)
    {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
  
        for ( int i = 0;
                  i <= arr.length;      // Here is a mistake (maxIndex = maxLength - 1)
                  i++)
            System.out.println(arr[i]); // Output: 10, 20, ERROR -> OUT OF INDEX!!!
    }
}
```
Runtime error
```bash
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2 at ArrayIndexOut.main(File.java:12)
```

<br/>

## Multi-Dimensional Arrays
#

Multi-dimensional **arrays are arrays** of arrays with each element of the array holding the reference of other array. These are also known as [Jagged Arrays][44]. A multidimensional array is created by appending one set of square brackets (**[]**) per dimension. 

#### Examples:
```java
int[][]   intArray = new int[10][20];       //a 2D array or matrix
int[][][] intArray = new int[10][20][10];   //a 3D array
```

#### Examples:
```java
public class MultiDimensionalArray
{
    public static void main(String... args)
    {
        int arr[][] = {             // Declaring and initializing 2D array
                {2, 7, 9},
                {3, 6, 1},
                {7, 4, 2}
            };
  
        
        for ( int i = 0;            // Display 2D array
                  i < 3;
                  i++)
        {
            for ( int j = 0;
                      j < 3;
                      j++)
                System.out.print(
                    arr[i][j] + " " // output: 2 7 9 , 3 6 1 , 7 4 2
                );
  
            System.out.println();
        }
    }
}
```

Schema:

![Multi-Dimensional Array](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Blank-Diagram-Page-1-13.jpeg)

<br/>

## Passing Arrays to Methods
#

Like variables, we can also pass arrays to methods.

#### Example:
```java
public class PassArrayToMethod
{    
    public static void main(String... args) 
    {
        int arr[] = {7, 3, 10, 71, 25};
 
        sum(arr);                               // passing syntax
    }
  
    public static void sum(int[] arr)           // getting syntax
    {
        int accum = 0;
          
        for ( int i = 0;
                  i < arr.length;
                  i++)
            accum += arr[i];
          
        System.out.println(
            "sum of array values : " + accum    // Output: 116
        );
    }
}
```

<br/>

## Returning Arrays from Methods
#

As usual, a method can also return an array. 

#### Example:
```java
public class ReturnArrayFromMethod
{    
    public static void main(String... args) 
    {
        int arr[] = getArray();     // getting syntax
 
        for ( int i = 0;
                  i < arr.length;
                  i++)
            System.out.print(
                arr[i] + " "        // Output: 7, 3, 10, 71, 25
            );
    }

        
    public static int[] getArray()  // return syntax              
    {
        return new int[]{7, 3, 10, 71, 25};
    }
}
```

<br/>

## [Class][45] Objects for Arrays
#

Every array has an associated [Class][45] object, shared with all other arrays with the same component type.

#### Example:
```java
public class Test
{ 
    public static void main(String... args) 
    {
           int[] intArray    = new int[3];
          byte[] byteArray   = new byte[3];
         short[] shortsArray = new short[3];
        String[] strArray    = new String[3];
          
        System.out.println(
            intArray.getClass()     // Output: class [I 
        );

        System.out.println(
            intArray
                .getClass()
                .getSuperclass()    // Output: class java.lang.Object
        );

        System.out.println(
            byteArray.getClass()    // Output: class [B
        );

        System.out.println(
            shortsArray.getClass()  // Output: class [S
        );

        System.out.println(
            strArray.getClass()     // Output: class [L java.lang.String;
        );
    }
}
```
### *The result clarification:*
Output: | Explanation of the runtime type signature:
  ---: | :---
*class [I* | signature for the class object **array with component type int**
*class java.lang.Object* | The only direct superclass of any array type is [java.lang.Object][46] <- is the Class name. 
*class [B* | signature for the class object **array with component type byte**
*class [S* | signature for the class object **array with component type short**
*class [L java.lang.String* | signature for the class object **array with component type of a Class**. Next is the Class name.

<br/>

## Array Members
#

Now as you know that arrays are object of a class and direct superclass of arrays is class [Object][47]. The members of an array type are all of the following:

* The public final field length, which contains the number of components of the array. length may be positive or zero.
* All the members inherited from class [Object][47]; the only method of Object that is not inherited is its [clone][48] method.
* The public method **clone()**, which overrides clone method in class Object and throws no [checked exceptions][49].

<br/>

## Cloning of arrays
#

When you clone a single dimensional array, such as **Object[]**, a *"deep copy"* is performed with the new array containing copies of the original array’s elements as opposed to references.

#### Example:
```java
public class ArrayClone
{    
    public static void main(String... args) 
    {
        int   intArray[] = { 1, 2, 3 };
    /*
        *********************************************
        *             !!! IMPORTANT !!!             *
        *                                           *
        * The following statement doesn't create    *
        * an exact copy ("Deep copy").              *
        * It only copies items, but NOT REFERENCES! *
        *                                           *
        * If we try to compare the arrays,          *
        * the result will be FALSE.                 *
        *********************************************
    */
        int cloneArray[] = intArray.clone(); 
          
        System.out.println(
            intArray == cloneArray  // Output: false
        );
          
        for ( int i = 0;
                  i < cloneArray.length;
                  i++)
            System.out.print(
                cloneArray[i] + " " // Output: 1 2 3
            );
    }
}
```

### Clarification:
![Deep copy](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Blank-Diagram-Page-1-11.jpeg)

A clone of a multi-dimensional array (like Object[][]) is a “shallow copy” however, which is to say that it creates only a single new array with each element array a reference to an original element array, but subarrays are shared.

#### Example:
```java
public class ArrayShallowCopy
{    
    public static void main(String... args) 
    {
        int   intArray[][] = {
                    {1,2,3},
                    {4,5}
                };
          
        int cloneArray[][] = intArray.clone();
    /*
        *********************************************
        *             !!! IMPORTANT !!!             *
        *                                           *
        * The following statement doesn't create    *
        * an exact copy ("Deep copy").              *
        * It only copies items, but NOT REFERENCES! *
        *                                           *
        
        // will print true as shallow copy is created i.e. sub-arrays are shared

        * If we try to compare the arrays,          *
        * the result will be FALSE.                 *
        *********************************************
    */      
        System.out.println(
            intArray == cloneArray  // Output: false
        );
          
        
        System.out.println(
            intArray[0] == cloneArray[0]  // Output: true
        );
        System.out.println(
            intArray[1] == cloneArray[1]  // Output: true
        );
          
    }
}
```

### Clarification:
![Shallow copy](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Blank-Diagram-Page-1-12.jpeg)

[7]: https://www.geeksforgeeks.org/object-class-in-java/
[8]: https://www.geeksforgeeks.org/serialization-in-java/
[9]: https://www.geeksforgeeks.org/marker-interface-java/
[42]: https://www.geeksforgeeks.org/g-fact-46/
[43]: https://www.geeksforgeeks.org/default-array-values-in-java/
[44]: https://www.geeksforgeeks.org/jagged-array-in-java/
[45]: https://www.geeksforgeeks.org/java-lang-class-class-java-set-1/
[46]: https://www.geeksforgeeks.org/object-class-in-java/
[47]: https://www.geeksforgeeks.org/object-class-in-java/
[48]: https://www.geeksforgeeks.org/clone-method-in-java-2/
[49]: https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/

---
<br/>

# Multidimensional Arrays in Java

Multidimensional Arrays can be defined in simple words as array of arrays. Data in multidimensional arrays are stored in tabular form (in row major order).

#### Syntax:
```java
dataType[dimension_1st][dimension_2st]...[dimension_Nth] arrayName = new dataType[size_1][size_2]...[size_N];
```

Here is:
* **dataType:** Type of data to be stored in the array. For example: int, char, etc.
* **dimension:** The dimension of the array created.<br/>
*For example:* 1D, 2D, etc.
* **arrayName:** Name of the array
* **size_1, size_2, ..., size_N:** Sizes of the dimensions respectively.

#### Example:
```java
// Two-Dimensional array:
int[][]     twoD_arr = new int[10][20];

// Three-Dimensional array:
int[][][] threeD_arr = new int[10][20][30];
```

**Size of multidimensional arrays:** The total number of elements that can be stored in a multidimensional array can be calculated by multiplying the size of all the dimensions.

#### Example:
```java
// The Next array can store a total
// of (10 * 20) = 200 elements.
int[][] x = new int[10][20];

// Similarly, the Next array can store
// a total of (5 * 10 * 20) = 1000 elements.
array int[][][] x = new int[5][10][20];
```

<br/>

# Two–Dimensional Array *(2D-Array)*

Two–Dimensional array is the simplest form of a multidimensional array. A two–dimensional array can be seen as an array of one – dimensional array for easier understanding.

### Indirect Method of Declaration:

#### Declaration – Syntax:
```java
// dataType[][] arrayName = new dataType[x][y];
int[][] arr = new int[10][20];
```

#### Initialization – Syntax:
```java
// arrayName[indexRow][indexColumn] = value;
arr[0][0] = 1;
```

#### Example:
```java
public class MultiDimensionalArrays
{
    public static void main(String... args)
    {
        int[][] arr = new int[10][20];
        arr[0][0] = 1;
  
        System.out.println(
            "arr[0][0] = " + arr[0][0]  // Output: 1
        );
    }
}
```

Direct Method of Declaration:

#### Syntax:
```java
/*
    *********************************************************
    * dataType[][] arrayName =                              *
    *   {                                                   *
    *       {value_R1_C1, value_R1_C2, ..., value_R1_CN},   *
    *       {value_R2_C1, value_R2_C2, ..., value_R2_CN},   *
    *                           ...                         *
    *       {value_RN_C1, value_RN_C2, ..., value_RN_CN}    *
    *   };                                                  *
    *********************************************************
*/

int[][] arr =
    {
        {34, 5,   64, 122, 45},
        {49, 62,  80, 3,   41},
        {6,  254, 78, 22,  18}
    };
```

#### Example:
```java
public class MultiDimensionalArrays
{
    public static void main(String[] args)
    {
  
        int[][] arr =
            {
                { 1, 2 },
                { 3, 4 }
            };
  
        for ( int i = 0;
                  i < 2;
                  i++)
            for ( int j = 0;
                      j < 2;
                      j++)
                System.out.println(     // Output: arr[0][0] = 1
                    "arr[" + i +        // Output: arr[0][1] = 2
                    "]["   + j +        // Output: arr[1][0] = 3
                    "] = " + arr[i][j]  // Output: arr[1][1] = 4
                );
    }
}
```

<br/>

## Accessing Elements of Two-Dimensional Arrays
#

Elements in two-dimensional arrays are commonly referred by **x\[i]\[j]** where **"i"** is the row number and **"j"** is the column number.

#### Syntax:
```java
x[indexRow][indexColumn]
```

#### Example:
```java
int[][] arr = new int[10][20];
arr[0][0] = 1;
```

The above example represents the element present in first row and first column.

> *Note:* In arrays if size of array is N. It's index will be from **0** to **N-1**.<br/>
> Therefore, for indexRow_2, actual row number is **2 + 1 = 3**.

#### Example:
```java
public class AccessinTwoDimencionArray
{
    public static void main(String... args)
    {
  
        int[][] arr =
            {
                { 1, 2 },
                { 3, 4 }
            };
  
        System.out.println(
            "arr[0][0] = " + arr[0][0]  // Output: arr[0][0] = 1
        );
    }
}
```

**Representation of 2D array in Tabular Format**: A two–dimensional array can be seen as a table with **"x"** *rows* and **"y"** *columns* where the row number ranges from **0** to **(x - 1)** and column number ranges from **0** to **(y - 1)**. A two–dimensional array **"x"** with 3 rows and 3 columns is shown below:

### Clarification:
![Two-Dimencion Array](https://media.geeksforgeeks.org/wp-content/uploads/two-d.png)

<br/>

## Print 2D array in tabular format:
#

To output all the elements of a Two-Dimensional array, use nested for loops. For this two for loops are required, One to traverse the rows and another to traverse columns.

#### Example:
```java
public class AccessinTwoDimencionArray
{
    public static void main(String... args)
    {
  
        int[][] arr =
            {
                { 1, 2 },
                { 3, 4 }
            };
  
        for ( int i = 0;
                  i < 2;
                  i++)
        {
            for ( int j = 0;
                      j < 2;
                      j++)
            {
                System.out.print(
                    arr[i][j] + " "  // Output: 1, 2, 3, 4
                );
            }
  
            System.out.println();   // Output: \n
        }
    }
}
```

<br/>

# Three–Dimensional Array *(3D-Array)*

Three–dimensional array is a complex form of a multidimensional array. A three–dimensional array can be seen as an array of two–dimensional array for easier understanding.

### Indirect Method of Declaration:

#### Declaration – Syntax:
```java
// dataType[][][] arrayName = new dataType[x][y][z];
int[][][] arr = new int[10][20][30];
```

#### Initialization – Syntax:
```java
// arrayName[indexArray][indexRow][indexColumn] = value;
arr[0][0][0] = 1;
```

#### Example:
```java
public class MultiDimensionalArrays
{
    public static void main(String... args)
    {
        int[][][] arr = new int[10][20][30];
        arr[0][0][0] = 1;
  
        System.out.println(
            "arr[0][0][0] = " + arr[0][0][0]  // Output: 1
        );
    }
}
```

Direct Method of Declaration:

#### Syntax:
```java
/*
    *********************************************************************
    * dataType[][][] arrayName =                                        *
    *   {                                                               *
    *       {                                                           *
    *           {value_A1_R1_C1, value_A1_R1_C2, ..., value_A1_R1_CN},  *
    *           {value_A1_R2_C1, value_A1_R2_C2, ..., value_A1_R2_CN},  *
    *                                   ...                             *
    *           {value_A1_RN_C1, value_A1_RN_C2, ..., value_A1_RN_CN},  *
    *       },                                                          *
    *       {                                                           *
    *           {value_A2_R1_C1, value_A2_R1_C2, ..., value_A2_R1_CN},  *
    *           {value_A2_R2_C1, value_A2_R2_C2, ..., value_A2_R2_CN},  *
    *                                   ...                             *
    *           {value_A2_RN_C1, value_A2_RN_C2, ..., value_A2_RN_CN},  *
    *       },                                                          *
    *                                                                   *
    *                                   ...                             *
    *                                                                   *
    *       {                                                           *
    *           {value_AN_R1_C1, value_AN_R1_C2, ..., value_AN_R1_CN},  *
    *           {value_AN_R2_C1, value_AN_R2_C2, ..., value_AN_R2_CN},  *
    *                                   ...                             *
    *           {value_AN_RN_C1, value_AN_RN_C2, ..., value_AN_RN_CN},  *
    *       }                                                           *
    *   };                                                              *
    *********************************************************************
*/

int[][][] arr =
    {
        {
            {34,  5,   64,  122, 45},
            {49,  62,  80,  3,   41},
            {6,   254, 78,  22,  18}
        },
        {
            {5,   10,  32,  7,   12},
            {70,  6,   830, 9,   81},
            {423, 64,  98,  3,   15}
        }
    };
```

#### Example:
```java
public class MultiDimensionalArrays
{
    public static void main(String[] args)
    {
  
        int[][][] arr =
            {
                { 1, 2 },
                { 3, 4 }
            },
            {
                { 5, 6 },
                { 7, 8 }
            };
  
        for ( int i = 0;
                  i < 2;
                  i++)
            for ( int j = 0;
                      j < 2;
                      j++)
                for ( int k = 0;
                          k < 2;
                          k++)
                System.out.println(         // Output: arr[0][0][0] = 1
                    "arr[" + i +            // Output: arr[0][0][1] = 2
                    "]["   + j +            // Output: arr[0][1][0] = 3
                    "]["   + k +            // Output: arr[0][1][1] = 4
                    "] = " + arr[i][j][z]   // Output: arr[1][0][0] = 5
                                            // Output: arr[1][0][1] = 6
                                            // Output: arr[1][1][0] = 7
                                            // Output: arr[1][1][1] = 8
                );
    }
}
```

<br/>

## Accessing Elements of Three-Dimensional Arrays
#

Elements in Three-dimensional arrays are commonly referred by **x\[i]\[j]\[k]** where **"i"** is the array number, **"j"** is the row number and **"k"** is the column number.

#### Syntax:
```java
x[indexArray][indexRow][indexColumn]
```

#### Example:
```java
int[][][] arr = new int[10][20][30];
arr[0][0][0] = 1;
```

The above example represents the element present in the first row and first column of the first array in the declared 3D array.

> *Note:* In arrays if size of array is N. It's index will be from **0** to **N-1**.<br/>
> Therefore, for indexRow_2, actual row number is **2 + 1 = 3**.

#### Example:
```java
public class AccessingThreeDimencionArray
{
    public static void main(String... args)
    {
  
        int[][][] arr =
            {
                { 1, 2 },
                { 3, 4 }
            },
            {
                { 5, 6 },
                { 7, 8 }
            };
  
        System.out.println(
            "arr[0][0][0] = " + arr[0][0][0]  // Output: arr[0][0][0] = 1
        );
    }
}
```

**Representation of 3D array in Tabular Format**: A three–dimensional array can be seen as a table of array with **"x"** *rows* and **"y"** *columns* where the row number ranges from **0** to **(x - 1)** and column number ranges from **0** to **(y - 1)**. A three–dimensional array **"x"** with 3 rows and 3 columns is shown below:

### Clarification:
![Three-Dimencion Array](https://media.geeksforgeeks.org/wp-content/uploads/3D-array.jpg)

<br/>

## Print 3D array in tabular format:
#

To output all the elements of a Three-Dimensional array, use nested for loops. For this three for loops are required, One to traverse the arrays, second to traverse the rows and another to traverse columns.

#### Example:
```java
public class AccessingThreeDimencionArray
{
    public static void main(String... args)
    {
  
        int[][][] arr =
            {
                { 1, 2 },
                { 3, 4 }
            },
            {
                { 5, 6 },
                { 7, 8 }
            };
  
        for ( int i = 0;
                  i < 2;
                  i++)
        {
            for ( int j = 0;
                      j < 2;
                      j++)
            {
                for ( int k = 0;
                          k < 2;
                          k++)
                {
                    System.out.print(
                        arr[i][j][k] + " "  // Output: 1, 2,
                                            //         \n,
                                            // Output: 3, 4
                                            //         \n
                                            //         \n
                                            // Output: 5, 6,
                                            //         \n
                                            // Output: 7, 8
                    );
                }
                System.out.println();       // Output: \n
            }
            System.out.println();           // Output: \n
        }
    }
}
```

<br/>

## Inserting a Multi-dimensional Array during Runtime:
#

This topic is forced n taking user-defined input into a multidimensional array during runtime. It is focused on the user first giving all the input to the program during runtime and after all entered input, the program will give output with respect to each input accordingly. It is useful when the user wishes to make input for multiple Test-Cases with multiple different values first and after all those things done, program will start providing output.

As an example, let’s find the total number of even and odd numbers in an input array. Here, we will use the concept of a 2-dimensional array. Here are a few points that explain the use of the various elements in the upcoming code:

* Row integer number is considered as the number of *Test-Cases* and *Column* values are considered as values in each Test-Case.
* One **for()** loop is *used for updating Test-Case number* and **another for()** loop is *used for taking respective array values*.
* As all input entry is done, again **two for()** loops are used in *the same manner to execute the program* according to the condition specified.
* **The first line** of input is the *total number of TestCases*.
* **The second line** shows the *total number of first array values*.
* **The third line** gives *array values and so on*.

#### Implementation:
```java
import java.util.Scanner;
  
public class MultiDimensionArrayTestCase
{
    public static void main(String... args)
    {
        Scanner scanner = new Scanner(System.in);       // To take values from console

        int totalTestCases,                             // is a total number of TestCases
            eachTestCaseValues;                         // is a values in each TestCase
        
        totalTestCases = scanner.nextInt();             // To takes total number of TestCases
                                                        // INPUT: 2
  
        int[][] arrayMain = new int[totalTestCases][];  // is formed as row values for total testCases
  
        for ( int i = 0;
                  i < arrayMain.length;
                  i++)
        {
            eachTestCaseValues = scanner.nextInt();     // To take input of values in each TestCase
/*
    *****************************************************
    * NOTE: define The NEXT ITERATION as symbol ("->")  *
    *                                                   *
    * INPUT: 2 -> 3                                     *
    *****************************************************
*/
            arrayMain[i] = new int[eachTestCaseValues];
            
            for ( int j = 0;
                      j < arrayMain[i].length;
                      j++)

                arrayMain[i][j] = scanner.nextInt();
/*
    *****************************************************
    * INPUT: 1 -> 2                       (first loop)  *
    * INPUT: 1 -> 2 -> 3                  (second loop) *
    *****************************************************
*/
        }                                               // All input entry is done.


        // START EXECUTING BY PROVIDED CONDITIONS
        for ( int i = 0;
                  i < arrayMain.length;
                  i++)
        {

            int nEvenNumbers = 0,                       // Initialize of EVEN numbers to ZERO
                nOddNumbers  = 0;                       // Initialize of ODD numbers to ZERO
  
            System.out.println(
                "TestCase " + i +
                " with "    + arrayMain[i].length +
                " values:"
            );
/*
    *****************************************************
    * OUTPUT: TestCase 0 with 2 values:   (first loop)  *
    * OUTPUT: TestCase 1 with 3 values:   (second loop) *
    *****************************************************
*/

            for ( int j = 0;
                      j < arrayMain[i].length;
                      j++)
            {
                System.out.print(
                    arrayMain[i][j] + " "
                );
/*
    *****************************************************
    * OUTPUT: 1 -> 2                      (first loop)  *
    * OUTPUT: 1 -> 2 -> 3                 (second loop) *
    *****************************************************
*/
                if (arrayMain[i][j] % 2 == 0)           // EVEN & ODD numbers counter
                    nEvenNumbers++;
                else
                    nOddNumbers++;
            }
            System.out.println();
/*
    *****************************************************
    * OUTPUT: \n                          (first loop)  *
    * OUTPUT: \n                          (second loop) *
    *****************************************************
*/
            System.out.println(
                "Total Even numbers: \n" + nEvenNumbers +
                "Total Odd numbers: "    + nOddNumbers
            );
/*
    *****************************************************
    * OUTPUT: Total Even numbers: 1       (first loop)  *
    * OUTPUT: Total Odd numbers: 1        (first loop)  *
    * OUTPUT: Total Even numbers: 1       (second loop) *
    * OUTPUT: Total Odd numbers: 2        (second loop) *
    *****************************************************
*/
        }
    }
}
```

---
<br/>

# <p align=center><b>Loops</b></p>

Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true.
<br/>
Java provides three ways for executing the loops. While all the ways provide similar basic functionality, they differ in their syntax and condition checking time.

<br/>

## [WHILE loop][26]
#

A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. The while loop can be thought of as a repeating if statement.

#### Syntax:
```java
while (boolean condition)
{
   ... statement(s) ...
}
```

### Flowchart:
![While Loop](https://media.geeksforgeeks.org/wp-content/uploads/Loop1.png)

* While loop starts with the checking of condition. If it evaluated to true, then the loop body statements are executed otherwise first statement following the loop is executed. For this reason it is also called **Entry control loop**
* Once the condition is evaluated to true, the statements in the loop body are executed. Normally the statements contain an update value for the variable being processed for the next iteration.
* When the condition becomes false, the loop terminates which marks the end of its life cycle.

#### Example:
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
#

A for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping.

#### Syntax:
```java
for ( initialization condition;
      testing condition;
      increment/decrement)
{
   ... statement(s) ...
}
```

### Flowchart:
![For Loop](https://media.geeksforgeeks.org/wp-content/uploads/loop2.png)

1. **Initialization condition:** Here, we initialize the variable in use. It marks the start of a for loop. An already declared variable can be used or a variable can be declared, local to loop only.
2. **Testing Condition:** It is used for testing the exit condition for a loop. It must return a boolean value. It is also an *Entry Control Loop* as the condition is checked prior to the execution of the loop statements.
3. **Statement execution:** Once the condition is evaluated to true, the statements in the loop body are executed.
4. **Increment / Decrement:** It is used for updating the variable for next iteration.
5. **Loop termination:** When the condition becomes false, the loop terminates marking the end of its life cycle.

#### Example:
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
<br/>

## Enhanced FOR loop
#

Java also includes another version of FOR loop. Enhanced FOR loop provides a simpler way to **iterate through** *the elements of a **collection*** or ***array***. It is inflexible and should be used only when there is a need to iterate through the elements in sequential manner without knowing the index of currently processed element.<br/>
Also note that the *object/variable* **is immutable** when enhanced for loop is used i.e it ensures that the values in the array can not be modified, so it can be said as read only loop where you can’t update the values as opposite to other loops where values can be modified.<br/>
We recommend using this form of the for statement instead of the general form whenever possible.(as per JAVA doc.)

#### Syntax:
```java
for (T element : Collection obj/array)
{
   ... statement(s) ...
}
```

Lets take an example to demonstrate how enhanced for loop can be used to simpify the work. Suppose there is an array of names and we want to print all the names in that array. Let’s see the difference with these two examples.

#### Example:
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
<br>

## [FOR-EACH Loop][28]
#

A For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5. 
 
* It starts with the keyword for like a normal for-loop.
* Instead of declaring and initializing a loop counter variable, you declare a variable that is the same type as the base type of the array, followed by a colon, which is then followed by the array name.
* In the loop body, you can use the loop variable you created rather than using an indexed array element. 
* It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)

#### Syntax:
```java
for (T var : array) 
{ 
    ... statement(s) using var;
}
```

#### Is equivalent to:
```java
for ( int i = 0; 
          i < arr.length;
          i++) 
{ 
    T var = arr[i];

    ... statement(s) using var;
}
```

#### Example:
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
<br/>

## Limitations of FOR-EACH loop
#

1. For-each loops **arn't appropriate when you want to modify the array**:
```java
for (int num : marks) 
{
    num = num * 2; // only changes num, NOT THE ELEMENTS!
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
#

A do while loop is similar to while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop.

#### Syntax:
```java
do
{
    ... statement(s) ...
}
while (boolean condition);
```

#### Flowchart:
![Do-While Loop](https://media.geeksforgeeks.org/wp-content/uploads/loop3.png)

1. do while loop starts with the execution of the statement(s). There is no checking of any condition for the first time.
2. After the execution of the statements, and update of the variable value, the condition is checked for true or false value. If it is evaluated to true, next iteration of loop starts.
3. When the condition becomes false, the loop terminates which marks the end of its life cycle.
4. It is important to note that the do-while loop will execute its statements atleast once before any condition is checked, and therefore is an example of exit control loop.

#### Example:
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

## Pitfalls of Loops
#

1. **Infinite loop:** One of the most common mistakes while implementing any sort of looping is that that it may not ever exit, that is the loop runs for infinite time. This happens when the condition fails for some reason.
   
#### Two examples of INFINITE LOOP:
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

#### Example:
```java
import java.util.ArrayList;

public class MyInteger
{
    public static void main(String... args)
    {
        List<Integer> list = new ArrayList<>();

        for ( int i = 0;
                  i < Integer.MAX_VALUE;
                  i++)
        {
            list.add(i); // Output: ERROR: OUT OF MEMORY (CAN'T REACH THE MAXIMUM VALUE !!!)

            // Every time a NEW item is ADDED.
            
        }
    }
}
```
[26]: https://www.geeksforgeeks.org/java-while-loop-with-examples/
[27]: https://www.geeksforgeeks.org/java-for-loop-with-examples/
[28]: https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/
[28]: https://www.geeksforgeeks.org/java-do-while-loop-with-examples/
---
<br/>


# <p align=center><b>Operators</b></p>

Java provides many types of operators which can be used according to the need. They are classified based on the functionality they provide.<br/>

Some of the types are:
1. [Arithmetic Operators][15]
2. [Unary Operators][16]
3. [Assignment Operator][17]
4. [Relational Operators][18]
5. [Logical Operators][19]
6. [Ternary Operator][20]
7. [Bitwise Operators][21]
8. [Shift Operators][21]
9. [Instance of operators][23]
10. [Precedence and Associativity][21]

<br/>

## Arithmetic Operators
#

They are used to perform simple arithmetic operations on primitive data types.

Symbol | Operator 
  ---: | :---
\*     | Multiplication
\/     | Division
%      | Modulo
\+     | Addition
–      | Subtraction
<br/>

## Unary Operators
#

Unary operators need only one operand. They are used to increment, decrement or negate a value.

Symbol | Operator 
  ---: | :---
–      | **Unary minus**, used for negating the values.
\+     | **Unary plus**, indicates positive value (numbers are positive without this, however). It performs an automatic conversion to int when the type of its operand is byte, char, or short. This is called unary numeric promotion.
++     | **Increment operator**, used for incrementing the value by 1. There are two varieties of increment operator.<br/> *Post-Increment:* Value is first used for computing the result and then incremented.<br/> *Pre-Increment:* Value is incremented first and then result is computed.
--     | **Decrement operator**, used for decrementing the value by 1. There are two varieties of decrement operator.<br/> *Post-decrement:* Value is first used for computing the result and then decremented.<br/> *Pre-Decrement:* Value is decremented first and then result is computed.
!      | **Logical NOT operator**, used for inverting a boolean value.
<br/>

## Assignment Operator
#

The operator is used to assign a value to any variable. It has a right to left associativity, i.e value given on right hand side of operator is assigned to the variable on the left and therefore right hand side value must be declared before using it or should be a constant.

Symbol | Operator 
  ---: | :---
=      | Assignment operator

#### Syntax:
```java
variable = value;
```

In many cases assignment operator can be combined with other operators to build a shorter version of statement called Compound Statement.
<br/>

#### Example:
```java
a = a + 5;
```

#### or:
```java
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

## Relational Operators
#

These operators are used to check for relations like equality, greater than, less than. They return boolean result after the comparison and are extensively used in looping statements as well as conditional if else statements.

#### Syntax: 
```java
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

## Logical Operators
#

These operators are used to perform *"logical AND"* and *"logical OR"* operation, i.e. the function similar to AND gate and OR gate in digital electronics. One thing to keep in mind is the second condition is not evaluated if the first one is false, i.e. it has a short-circuiting effect. Used extensively to test for several conditions for making a decision.

Conditional operators are:

Symbol | Operator 
  ---: | :--- 
&&     | **Logical AND:** returns true when both conditions are true.
\|\|   | **Logical OR:** returns true if at least one condition is true.
<br/>

## Ternary operator
#

Ternary operator is a shorthand version of *IF-ELSE statement*. It has three operands and hence the name ternary. 

#### Syntax: 
```java
condition ? if true : if false
```

The above statement means that IF the condition evaluates to TRUE, then *execute* the statements *after* the **"?"** else *execute* the statements *after* the **":"**. 

#### Example:
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
            "Max of three numbers is: " +result    // Output: 30
        );
    }
}
```
<br/>

## Bitwise Operators
#

These operators are used to perform manipulation of individual bits of a number. They can be used with any of the integer types. They are used when performing update and query operations of Binary indexed tree.

Symbol | Operator 
  ---: | :--- 
&      | **Bitwise AND operator:** returns bit by bit AND of input values.
\|     | **Bitwise OR operator:** returns bit by bit OR of input values.
^      | **Bitwise XOR operator:** returns bit by bit XOR of input values.
~      | **Bitwise Complement Operator:** This is a unary operator which returns the one’s compliment representation of the input value, i.e. with all bits inversed.
<br/>

## Shift Operators
#

These operators are used to shift the bits of a number left or right thereby multiplying or dividing the number by two respectively. They can be used when we have to multiply or divide a number by two. 

#### Syntax: 
```java
number shiftOperator numberOfPlacesToShift;
```

#### Example: 
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

## Instance of operator
#

Instance of operator is used for type checking. It can be used to test if an object is an instance of a class, a subclass or an interface.

#### Syntax: 
```java
object instanceof class/subclass/interface
```

#### Example:
```java
public class InstanceOperators
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

## Precedence and Associativity of Operators
#

Precedence and associative rules are used when dealing with hybrid equations involving more than one type of operator. In such cases, these rules determine which part of the equation to consider first as there can be many different valuations for the same equation. The below table depicts the precedence of operators in decreasing order as magnitude with the top representing the highest precedence and bottom shows the lowest precedence.

![Associativity](https://media.geeksforgeeks.org/wp-content/uploads/operators.png)

<br/>

## Precedence and Associativity
#

There is often a confusion when it comes to hybrid equations that is equations having multiple operators. The problem is which part to solve first. There is a golden rule to follow in these situations. If the operators have different precedence, solve the higher precedence first. If they have same precedence, solve according to associativity, that is either from right to left or from left to right. Explanation of below program is well written in comments withing the program itself.

#### Example:
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

## Be a Compiler
#

Compiler in our systems uses lex tool to match the greatest match when generating tokens. This creates a bit of a problem if overlooked.

* *For example*, consider the statement **A=B+++C;**, to many of the readers this might seem to create compiler error. But this statement is absolutely correct as the token created by lex are **A**, **=**, **B**, **++**, **+**, **C**.
* *Therefore* this statement has a similar effect of ***first assigning* B + C *to* A** and ***then incrementing* B**.
* *Similarly*, **A=B+++++C;** would generate error as tokens generated are **A**, **=**, **B**, **++**, **++**, **+**, **C** which IS actually AN ERROR as **there is no operand after second unary operand**. 

#### Example:
```java
public class operators
{
    public static void main(String... args)
    {
        int a = 20,
            b = 10,
            c = 0;
    
    /*
        *********************************************
        *       A=B+++C is compiled as B++ +C       *
        *                                           *
        * First  step:  B + C = 10 + 0 = 10         *
        * Second step:  A = result(B+C) = 10        *
        * Third  step:  B = B + 1 = 10 + 1 = 11     *
        *********************************************
    */

        System.out.println(
            "The result of:"   +     "\n\t" +
            "A = (B + C) is: " + a + "\n\t" +   // Output: 10
            "B = (B + 1) is: " + b + "\n\t" +   // Output: 11
            "C is: "           + c              // Output: 0
        );

    /*
        *********************************************
        * A=B+++++C is compiled as  B++ ++ +C       *
        *           which GIVES ERROR!              *
        *                                           *
        * Uncommente the line below to check this   *
        *********************************************
    */

        // System.out.println(b+++++c);

    }
}
```
<br/>

## *Using* **"+"** *over the* **"( )"**
#

When *using **+** operator inside system.out.println()* make sure to do addition using parenthesis.
<br/>
If we write something before doing addition, then string addition takes place, that is associativity of addition is left to right and hence integers are added to a string first producing a string, and string objects concatenate when using +, therefore it can create unwanted results. 

#### Example:
```java
public class AdditionAndConcatenation
{
    public static void main(String... args)
    {
 
        int x = 5,
            y = 8;
    
    /*
        *****************************************************
        * A line will be printed, then added 5 and then 8   *
        * (without spaces), which will be concatenated      *
        * into the next line:                               *
        *                                                   *
        *       "Concatenation (X + Y) = 58"                *
        *****************************************************
    */

        System.out.println(
            "Concatenation (X + Y) = "  + x + y     // Output: 58
        );
 
        System.out.println(
            "Addition (X + Y) = "       + (x + y)   // Output: 13
        );
    }
}
```

[15]: https://www.geeksforgeeks.org/java-arithmetic-operators-with-examples/
[16]: https://www.geeksforgeeks.org/java-unary-operator-with-examples/
[17]: https://www.geeksforgeeks.org/java-assignment-operator-with-examples/
[18]: https://www.geeksforgeeks.org/java-relational-operators-with-examples/
[19]: https://www.geeksforgeeks.org/java-logical-operators-with-examples/
[20]: https://www.geeksforgeeks.org/java-ternary-operator-with-examples/
[21]: https://www.geeksforgeeks.org/operators-in-java/?ref=lbp
[23]: https://www.geeksforgeeks.org/java-instanceof-and-its-applications/
---
<br/>


# <p align=center><b>IF-ELSE</b> (Decision maker)</p>

Decision Making in programming is similar to decision making in real life. In programming also we face some situations where we want a certain block of code to be executed when some condition is fulfilled.
<br/>
A programming language uses control statements to control the flow of execution of program based on certain conditions. These  are used to cause the flow of execution to advance and branch based on changes to the state of a program.
<br/>

### Java’s Selection statements:
* [if][30]
* [if-else][31]
* [nested-if][32]
* [if-else-if][33]
* [switch-case][34]
* [jump][35] – break, continue, return

These statements allow you to control the flow of your program’s execution based upon conditions known only during run time.
<br/>

## [**IF**][30]
#

The statement is the most simple decision making statement. It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.

#### Syntax:
```java
if (boolean condition) 
{
   // Execute statements when condition is TRUE
}
```

Here, **condition** after evaluation will be either TRUE or FALSE.
<br/>
if statement accepts boolean values – if the value is TRUE then it will execute the block of statements under it.
<br/>
If we don't provide the *curly braces* **"{"** and **"}"** after **if(***...condition...***)** then by default if statement will consider the immediate **one statement** to be inside its block.

#### Example,
```java
if(condition)
   statement1;  // Execute the statement1 ONLY when condition is TRUE
   statement2;
```

#### Flowchart:
![IF](https://media.geeksforgeeks.org/wp-content/uploads/if.png)

#### Example:
```java
public class IfDecisionMaker
{
    public static void main(String... args)
    {
        int i = 10;
  
        if (i > 15)
            System.out.println(
                "10 is less than 15"    // Output: ...nothing...
            );
  
        System.out.println(
            "I am Not in if"            // Output: I am Not in if
        );
    }
}
```
<br/>

## [IF-ELSE][37]
#

The if statement alone tells us that if a condition is true it will execute a block of statements and if the condition is false it won’t. But what if we want to do something else if the condition is false. Here comes the else statement. We can use the else statement with if statement to execute a block of code when the condition is false.

#### Syntax:
```java
if (boolean condition) 
{
   ... statement(s) ... // Execute when condition is TRUE
}
else
{
    ... statement(s) ... // Execute when condition is FALSE
}
}
```

### Flowchart:
![IF-ELSE](https://media.geeksforgeeks.org/wp-content/uploads/if-else.png)

#### Example:
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

## [NESTED-IF][32]
#

A nested if is an if statement that is the target of another if or else. Nested if statements means an if statement inside an if statement. Yes, java allows us to nest if statements within if statements. i.e, we can place an if statement inside another if statement.

#### Syntax:
```java
if(boolean condition) 
{
   ... statement(s) ...     // Execute when condition is TRUE
   if (boolean condition2) 
   {
      ... statement(s) ...  // Executes when condition2 is TRUE
   }
}
```

### Flowchart:
![NESTED-IF](https://media.geeksforgeeks.org/wp-content/uploads/nested-if-modified-1.png)

#### Example:
```java
public class NestedIf
{
    public static void main(String... args)
    {
        int num = 10;
  
        if (num == 10)
        {
            // Will ONLY BE EXECUTED if statement ABOVE it is TRUE
            if (num < 15)
                System.out.println(
                    "NUM is smaller than 15"            // Output: NUM is smaller than 15
                );
  
            if (num < 12)
                System.out.println(
                    "NUM is smaller than 12"            // Output: NUM is smaller than 12
                );
            else
                System.out.println(
                    "NUM is greater than 12 or Equal"   // Output: ... nothing ... 
                );
        }
    }
}
```
<br/>

## [IF-ELSE-IF Ladder][38]
#

Here, a user can decide among multiple options.The if statements are executed from the top down. As soon as one of the conditions controlling the if is true, the statement associated with that if is executed, and the rest of the ladder is bypassed. If none of the conditions is true, then the final else statement will be executed.

#### Syntax:
```java
if(boolean condition) 
{
   ... statement(s) ...
}
else
   if (boolean condition2) 
   {
      ... statement(s) ...
   }

else
   if (boolean condition3) 
   {
      ... statement(s) ... 
   }

// ... several else-if blocks ...

else
{
    ... statement(s) ...
}
```

### Flowchart:
![IF-ELSE-IF Ladder](https://media.geeksforgeeks.org/wp-content/uploads/if-elseif.png)

#### Example:
```java
public class IfElseIf
{
    public static void main(String... args)
    {
        int num = 20;
  
        if (num == 10)
            System.out.println(
                "Num is 10"             // Output: ... noting ...
            );
        else if (num == 15)
            System.out.println(
                "Num is 15"             // Output: ... noting ...
            );
        else if (num == 20)
            System.out.println(
                "Num is 20"             // Output: Num is 20
            );
        else
            System.out.println(
                "Num is not present"    // Output: ... noting ...
            );
    }
}
```
<br/>

## [JUMPERS][39]
#

Java supports three jump statement: **break**, **continue** and **return**. These three statements transfer control to other part of the program.
1. [Break:][40] In Java, break is majorly used for:
* Terminate a sequence in a switch statement (discussed above).
* To exit a loop.
* Used as a “civilized” form of goto.

<br/>

## Using break to exit a Loop
#

Using break, we can force immediate termination of a loop, bypassing the conditional expression and any remaining code in the body of the loop.
<br/>
*Note:* Break, when used inside a set of nested loops, will only break out of the innermost

### Flowchart:
![BREAK](https://media.geeksforgeeks.org/wp-content/uploads/exit.png)

#### Example:
```java
public class BreakLoop
{
    public static void main(String... args)
    {
        for ( int i = 0;
                  i < 10;
                  i++)
        {
            if (i == 5)
                break;                  // terminate loop when i is 5.
  
            System.out.println(
                "Value of I is: " + i   // Output: 0, 1, 2, 3, 4
            );
        }

        System.out.println(
            "Loop complete."            // Output: Loop complete.
        );
    }
}
```
<br/>

## Using **break as** a Form of **Goto**
#

Java **doesn't have a goto** statement because *it provides a way to branch in an arbitrary and unstructured manner*. Java uses label. A **Label** is use to **identifies a block of code**.

#### Syntax:
```java
label:
{
    ... statement(s)_1... ;
    ... statement(s)_2... ;
        
    // ... several statement blocks ...

    ... statement(s)_N... ;
}
```

Now, **break** statement *can be use to jump out of target block*.
<br/>
> *Note:* You can't break to any label which is not defined for an enclosing block.

#### Syntax:
```java
break label;
```

#### Example:
```java
public class BreakLabe
{
    public static void main(String... args)
    {
        boolean terminate = true;
         
        first:
        {
            second: // ILLEGAL: The label SECOND ISN'T INTRODUCED YET;
            {
                third:
                {
                    System.out.println(
                        "Before the break statement"    // Output: Before the break statement
                    );

                    if (terminate)
                        break second; // BREAK will take the control out of SECOND label
                    
                    System.out.println(
                        "This will never be executed."  // Output: ... never be ...
                    );
                }

                System.out.println(
                    "This will never be executed."      // Output:  ... never be ...
                );
            }
  
            // IMPORTANT!!! HERE IS THE FIRST BLOCK
            System.out.println(
                "This is after second block."           // Output: This is after second block
            );
        }
    }
}
```
<br/>


2. **Continue:** Sometimes it is useful to force an early iteration of a loop. That is, you might want to continue running the loop but stop processing the remainder of the code in its body for this particular iteration. This is, in effect, a goto just past the body of the loop, to the loop’s end. The continue statement performs such an action.
<br/>

### Flowchart:
![CONTINUE](https://media.geeksforgeeks.org/wp-content/uploads/continue-1.png)

#### Example:
```java
public class Continue
{
    public static void main(String... args)
    {
        for ( int i = 0;
                  i < 10;
                  i++)
        {
            
            if (i % 2 == 0)
                continue; // All EVEN numbers are skipped
  
            // All ODD numbers will be printed
            System.out.print(
                i + " "     // Output: 1, 3, 5, 7, 9
            );
        }
    }
}
```
<br/>


3. [**Return:**][41] The return statement is used to explicitly return from a method. That is, it causes a program control to transfer back to the caller of the method.
<br/>

#### Example:
```java
public class Return
{
    public static void main(String... args)
    {
        boolean terminator = true;

        System.out.println(
            "Before the return."    // Output: Before the return
        );
      
        if (terminator) // If TRUE, bypass every statement  
            return;     // after, until the end of the block 

        System.out.println(
            "This won't execute."   // Output: ... nothing ...
        );
    }
}
```

[37]: https://www.geeksforgeeks.org/java-if-else-statement-with-examples/
[32]: https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/?ref=lbp#nested-if
[30]: https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/?ref=lbp#if
[38]: https://www.geeksforgeeks.org/java-if-else-if-ladder-with-examples/
[39]: https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/?ref=lbp#jump
[40]: https://www.geeksforgeeks.org/break-statement-in-java/
[41]: https://www.geeksforgeeks.org/return-keyword-java/

---
<br/>


# <p align=center><b>Switch operator</b></p>

## [SWITCH-CASE][39]
#

The switch statement is a multiway branch statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression.

#### Syntax:
```java
switch (expression)
{
    case value_1:
        ... statement(s)_1... ;
        break;
    case value_2:
        ... statement(s)_2... ;
        break;

    // ... several case blocks ...

    case value_N:
        ... statement(s)_N... ;
        break;
    default:
        ... statement(s)_by_Default... ;
}
```

* **Expression** can be of **type:** *byte*, *short*, *int*, *char* or an *enumeration*. *Beginning with JDK7*, **expression** can also be of **type** *String*.
* **Dulplicate case** values are **NOT ALLOWED**.
* The **default** statement **is optional**.
* The **break** statement is used inside the switch to terminate a statement sequence.
* The **break** statement **is optional**. If omitted, execution will continue on into the next case.

### Flowchart:
![SWITCH-CASE](https://media.geeksforgeeks.org/wp-content/uploads/switch-case.png)

#### Example:
```java
public class SwitchCase
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
```

[39]: https://www.geeksforgeeks.org/switch-statement-in-java/