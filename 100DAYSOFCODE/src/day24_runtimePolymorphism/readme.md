# Polymorphism in Java

Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.

If you overload a static method in Java, it is the example of compile time polymorphism. Here, we will focus on runtime polymorphism in java.

### Runtime Polymorphism in Java
Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.

Let's first understand the upcasting before Runtime Polymorphism.

### Upcasting
If the reference variable of Parent class refers to the object of Child class, it is known as upcasting. For example:

#### class A{}
#### class B extends A{}
#### A a=new B();//upcasting

For upcasting, we can use the reference variable of class type or an interface type. For Example:

#### interface I{}
#### class A{}
#### class B extends A implements I{}

Here, the relationship of B class would be:

#### B IS-A A
#### B IS-A I
#### B IS-A Object

Since Object is the root class of all classes in Java, so we can write B IS-A Object.

## Example of Java Runtime Polymorphism

In this example, we are creating two classes Bike and Splendor. Splendor class extends Bike class and overrides its run() method. We are calling the run method by the reference variable of Parent class. Since it refers to the subclass object and subclass method overrides the Parent class method, the subclass method is invoked at runtime.

Since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism.

class Bike{

void run(){System.out.println("running");

}

}

class Splendor extends Bike{

void run(){
System.out.println("running safely with 60km");

}    
public static void main(String args[]){  
Bike b = new Splendor();//upcasting  
b.run();  
}

}


#### Output:

running safely with 60km.
## Feedback

If you have any feedback, please reach out to me at duttanurag0005@gmail.com


## 🚀 About Me
I am a student of VIT Bhopal, pursuing master's degree in Computer Applications.
I've learned and implemented the concept of Cloud and DEVOPS. currently developing my skills in the field of software development.

A zest for learning and an eagerness to apply that dedication to everything keeps moving forward with my interest.

