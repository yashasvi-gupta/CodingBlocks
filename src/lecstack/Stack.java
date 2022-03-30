package lecstack;

public class Stack {
    protected int[] data;
     protected int tos;

    public Stack()
    {
     data = new int[5];
     tos=-1;
    }
    public Stack(int cap){
        data = new int[cap];
        tos=-1;

    }
    public void push(int ele)throws Exception{
        if (isFull()){
            throw new Exception("Stack is Full");
        }
        tos++;
        data[tos]=ele;
    }
    public int pop() throws Exception{
        if(isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int temp= data[tos];
        data[tos]=0;
        tos--;
        return temp;
    }
    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty!");
        }
        return data[tos];
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public boolean isFull(){
        return size()==data.length;
    }

    public int size(){
        return tos+1;
    }

 public void disp(){
        int temp=tos;
        while(temp>=0){
            System.out.print(data[temp]  + " ");
            temp--;
        }
     System.out.println(" +end");
 }
}
