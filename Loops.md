# <p align=center><b>Loops</b></p>

Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true.
<br/>
Java provides three ways for executing the loops. While all the ways provide similar basic functionality, they differ in their syntax and condition checking time.

<br/>

## [WHILE loop][1]
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

## [FOR Loop][2]
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

## [FOR-EACH Loop][3]
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

## [DO-WHILE Loop][4]
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
<!--
* [WHILE loop][1]
* [FOR Loop][2]
* [FOR-EACH Loop][3]
* [DO-WHILE Loop][4]
-->

[1]: https://www.geeksforgeeks.org/java-while-loop-with-examples/
[2]: https://www.geeksforgeeks.org/java-for-loop-with-examples/
[3]: https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/
[4]: https://www.geeksforgeeks.org/java-do-while-loop-with-examples/
---
<br/>