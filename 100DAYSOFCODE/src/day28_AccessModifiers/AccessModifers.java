package day28_AccessModifiers;

class A
{
    private int data=10;
    void show()
    {
        System.out.println(data);
    }
    public void display()
    {
        System.out.println("Hello java");
    }
    protected int num=12;
}
class B extends A
{
    void msg()
    {
        System.out.println(num);
    }
}
class Test{
    public static void main(String args[]){
        B b=new B();
        b.show();
        b.display();
        b.msg();
    }
}

