package company;

public class Main {
    static int val=100;

    public static void main(String[] args) {
        int a=100;
        int b=200;
        //System.out.println(a+" "+b);
        System.out.println(val);
      //  swap(a,b);
        int val=20;
        System.out.println(val);
        //System.out.println(b);
      //swap(100,200);
       // addition();
        //subtraction();


        //case2

        //additionParams(100,200);

        //case3
       // int d=additionReturn(100,200);
        //System.out.println(d);
       // System.out.println((additionReturn(100,200)));
        //System.out.println(a+" "+b);

    }
    public static void addition()
    {
        int a=10;
        int b=20;
        int sum=a+b;
        subtraction();
        System.out.println(sum);
    }

    public static void subtraction()
    {
        int a=100;
        int b =200;

        int diff=b-a;
        System.out.println(diff);
    }
    public static void additionParams(int a, int b)
    {
        int sum=a+b;
        System.out.println(sum);
    }

    public static int additionReturn(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void swap(int a,int b){
        val=1000;
       // System.out.println(a+" "+b);
    }
}
