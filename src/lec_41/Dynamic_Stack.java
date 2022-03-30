package lec_41;

import lecstack.Stack;

public class Dynamic_Stack extends Stack{
@Override
    public void push(int ele)throws Exception{
    if(isFull()){
        int[]new_arr = new int[2*data.length];
        //content copy
        for(int i=0;i<=tos;i++){
            new_arr[i] = data[i];
        }
        data=new_arr;

    }
    super.push(ele);
}
}
