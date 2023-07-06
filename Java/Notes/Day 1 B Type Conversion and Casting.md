

[Coding Ninja](https://www.codingninjas.com/studio/library/type-conversion-and-type-casting-in-java)


## Type Conversion

**Type conversion** is a process in which the data type is automatically converted into another data type. The compiler does this automatic conversion at compile time. The data type to which the conversion happens is called the destination data type, and the data type from which the conversion happens is called the source data type. If the source and destination data types are compatible, then automatic type conversion takes place.

For type conversion to take place, the destination data type must be larger than the source type. In short, the below flow chart has to be followed.

![Flow chart for Type Conversion](https://files.codingninjas.in/article_images/type-conversion-and-type-casting-in-java-1-1671648746.jpg)

**Flow chart for Type Conversion**

This type of type conversion is also called
		**Widening Type Conversion/ Implicit Conversion/ Casting Down.**  
In this case, as the lower data types with smaller sizes are converted into higher ones with a larger size, there is no chance of data loss. This makes it safe for usage.


## Type Casting

**Type casting** is a process in which the programmer manually converts one data type into another data type. For this the casting operator (), the parenthesis is used. Unlike type conversion, the source data type must be larger than the destination type in type casting. The below flow chart has to be followed for successful type casting.

![Flow chart for Type Casting](https://files.codingninjas.in/article_images/type-conversion-and-type-casting-in-java-4-1671648747.jpg)

**Flow chart for Type Casting**

Type casting is also called
		**Narrowing Type Casting/ Explicit Conversion/ Casting Up**.

In this case, as the higher data types with a larger size are converted into lower ones with a smaller size, there is a chance of data loss. This is the reason that this type of conversion does not happen automatically.

## Type Promotion


## Class Demo

```java
class Calculator{

    int add(int num1, int num2){

        return num1 + num2;

    }

}

  

public class DemoClass {

    public static void main(String args[]){

        int num1 = 10, num2 = 20;

        Calculator calc = new Calculator();

        System.out.println(calc.add(num1, num2));

    }

}
```


![[Pasted image 20230706100620.png]]

## Method Overloading

[Javapoint](https://www.javatpoint.com/method-overloading-in-java)


## Method Overriding

[Javapoint](https://www.javatpoint.com/method-overriding-in-java)



![[Pasted image 20230706103620.png]]


3:48