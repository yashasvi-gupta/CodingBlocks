package lec_40;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        //CASE 1
        Parent obj1= new Parent();
        System.out.println(obj1.data);
        System.out.println(obj1.data1);
        obj1.fun();
        obj1.fun1();
        System.out.println("********************");
        //CASE2 (DATA MEMBERS COLLOSION)
        Parent obj2 = new Child();
        System.out.println(obj2.data1);
       // System.out.println(obj2.data2);
        System.out.println(((Child)obj2).data2);
        System.out.println(obj2.data);
        System.out.println(((Child)obj2).data);
        // (FUNCTION COLLOSION)
        obj2.fun1();
        //obj2.fun2(){nhi hoga tow type casting}
        ((Child) obj2).fun2();
        obj2.fun();//{iska child se aaiga kyuki fn rhs se leta h};

        ((Parent)obj2).fun();//{yaha Type casting krne se bhi change nhi kar sakte ;}


        //Case3
        //Child obj3 = new Parent();   (not allowed)
        //CASE4

        Child obj4 = new Child();
        System.out.println(obj4.data);
        //obj4.fun();
        System.out.println(((Parent)obj4).data);
        ((Parent)obj4).fun();
        obj4.fun();
        System.out.println(obj4);
        Object x= new Child();
        ArrayList<Integer> al= new ArrayList<Integer>();
        System.out.println(al);
    }
}
