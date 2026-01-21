import java.util.*;
class stack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int a){  //TC = O(n)
        q2.add(a);
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public boolean iSEmpty(){ //TC = O(1)
        return q1.isEmpty();
    }
    public int stSize(){ //TC = O(1)
        return q1.size();
    }


    public void stPop(){ //TC = O(1)
        if(q1.isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        q1.poll();
    }
   
    public int stTop(){ //TC = O(1)
        if(q1.isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return q1.peek();
    }


}
public class twoqueuestack2 {


    public static void main(String[] args) {
            stack st = new stack();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            st.stPop();
            System.out.println(st.stTop());
        }
    }