package day26_abstractClassProg;

abstract class Base
{
    abstract int calculate(int a);
    void display()
    {
        System.out.println("Base");
    }
}
class Square extends Base
{
    int calculate(int a)
    {
        return a*a;
    }
}
class Cube extends Base
{
    int calculate(int a)
    {
        return a*a*a;
    }
}
class Demo
{
    public static void main(String...s)
    {
        Base b1=new Square();
        Base b2=new Cube();
        System.out.println(b1.calculate(2));        //will call calculate() of Square class
        System.out.println(b2.calculate(2));        //will call calculate() of Cube class
        b1.display();       //will call method of Base class

    }

}
