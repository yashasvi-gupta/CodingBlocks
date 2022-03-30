package lecstack;

public class Queue {


     protected int []data;
    protected int front;
    protected int size;
    public Queue(){
        data=new int[5];
        front =0;
        size=0;
    }
    public Queue(int capacity){
        data = new int [capacity];
        front=0;
        size=0;
    }
    public void Enqueue  (int ele) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        int rear=(front+size)%data.length;
        data[rear]=ele;
        size++;
        return;
    }
    public int Dequeue()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is kull");
        }
        int temp= data[front];
        data[front]=0;
        front++;
        size--;
        return temp;


    }
    public int size(){
        return size;
    }
    public boolean isFull(){
        return size()==data.length;

    }
    public boolean isEmpty(){
        return size()==0;
    }
    public void disp(){
        for(int i=0;i<size;i++)
        {
            int idx=(front+i)%data.length;
            System.out.println(data[idx]+" ");
        }
        System.out.println(" +end");
        System.out.println("-------------- ");
    }

}
