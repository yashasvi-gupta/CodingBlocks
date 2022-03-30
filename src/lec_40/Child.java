package lec_40;

public class Child extends Parent {
    int data=20;
    int data2 =22;
     @Override
    public void fun() //MEHOD

    {
        //fun();


        System.out.println("CHILD Fun");
//super.fun();
    }
    @Override
    public String toString(){
       return "Child data is =" +data;
    }
    public void fun2()
    {
        System.out.println("CHILD fun2");
    }
}



