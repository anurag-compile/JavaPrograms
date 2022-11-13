# Exception Handling in Java
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.

In this tutorial, we will learn about Java exceptions, it's types, and the difference between checked and unchecked exceptions.

## What is Exception in Java?
Dictionary Meaning: Exception is an abnormal condition.

In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

## What is Exception Handling?
Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

### Advantage of Exception Handling
The core advantage of exception handling is to maintain the normal flow of the application. An exception normally disrupts the normal flow of the application; that is why we need to handle exceptions. Let's consider a scenario:

statement 1;  
statement 2;  
statement 3;  
statement 4;  
statement 5;//exception occurs  
statement 6;  
statement 7;  
statement 8;  
statement 9;  
statement 10;

## Types of Java Exceptions
There are mainly two types of exceptions: checked and unchecked. An error is considered as the unchecked exception. However, according to Oracle, there are three types of exceptions namely:

1. Checked Exception
2. Unchecked Exception
3. Error

## Difference between Checked and Unchecked Exceptions
1. Checked Exception
   The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

2. Unchecked Exception
   The classes that inherit the RuntimeException are known as unchecked exceptions. For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

3. Error
   Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.

## Java Exception Handling Example
Let's see an example of Java Exception Handling in which we are using a try-catch statement to handle the exception.

#### JavaExceptionExample.java

public class JavaExceptionExample{  
public static void main(String args[]){  
try{  
//code that may raise exception  
int data=100/0;  
}catch(ArithmeticException e){System.out.println(e);}  
//rest code of the program   
System.out.println("rest of the code...");  
}  
}
## Feedback

If you have any feedback, please reach out to me at duttanurag0005@gmail.com


## 🚀 About Me
I am a student of VIT Bhopal, pursuing master's degree in Computer Applications.
I've learned and implemented the concept of Cloud and DEVOPS. currently developing my skills in the field of software development.

A zest for learning and an eagerness to apply that dedication to everything keeps moving forward with my interest.

