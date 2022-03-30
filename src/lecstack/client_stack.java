package lecstack;

public class client_stack {
    public static void main(String []args) throws Exception {
        Stack s = new Stack();
        System.out.println(s.tos);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        //s.disp();
        //System.out.println(s.peek());
        //System.out.println(s.pop());

      /* s.disp();*/
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.peek();
        /*System.out.println(s.pop());*/
        /*s.disp();
        s.push(10);
        s.disp();*/
    }
}
