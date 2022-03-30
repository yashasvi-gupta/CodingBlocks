package lecstack;

public class client_queue{
    public static void main(String[] args) throws Exception {
        Queue Q = new Queue();
        Q.Enqueue(10);
        Q.Enqueue(20);
        Q.Enqueue(30);
        Q.Enqueue(40);
        Q.Enqueue(50);
        Q.disp();
        Q.Dequeue();
        Q.disp();
        Q.Dequeue();
        Q.disp();
        Q.Dequeue();
        Q.disp();
        Q.Enqueue(60);
        Q.disp();
        Q.Enqueue(70);
        Q.disp();
        Q.Enqueue(80);

        Q.disp();
        Q.Enqueue(90);
        Q.disp();
        Q.Enqueue(90);
        Q.disp();
        Q.Enqueue(90);
        Q.disp();
        Q.Enqueue(90);
        Q.disp();
        Q.Enqueue(90);
        Q.disp();





    }
}
