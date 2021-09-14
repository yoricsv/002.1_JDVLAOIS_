# <p align=center><b>SWITCH-CASE</b></p>

## [SWITCH-CASE][1]
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
<!--[SWITCH-CASE][1]-->

[1]: https://www.geeksforgeeks.org/switch-statement-in-java/
<br/>