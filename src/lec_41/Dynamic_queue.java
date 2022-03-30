package lec_41;

import lec_40.Parent;
import lecstack.Queue;

public class Dynamic_queue extends Queue {
    @Override
    public  void Enqueue(int ele)throws Exception{
        if(isFull()){
            int[] new_arr= new int[data.length*2];
            //Content pasta
            int idx=0;
            for (int i=front;i<(front+size)%data.length;i++){
                new_arr[idx]=data[i];
                idx++;

            }
            //Re Assign
            front=0;
            data = new_arr;

        }
        super.Enqueue(ele);
    }
}
