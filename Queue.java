// import java.util.*;



public class Queue{
    int queue[]=new int[5];
    int rear;
    int front;
    int size;
    public void enqueue(int data){
        queue[rear]=data;
        rear++;
        size++;

    }
    public int sratch() {
        int a=queue[rear]-queue[front];

        return a; 
    }
    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(queue[front+i]+" ");
        }
      

        System.out.println();
    }
    public int dequeue(){
        int data=queue[rear];
        front++;
        
        size--;
        return data;
    }
    public boolean isEmpty(){
        return size==0;
    }


    public static void main(String[] args) {
       
        Queue q=new Queue();
        
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();

        q.show();
        System.out.println(q.isEmpty());
        System.out.println(q.sratch());
    
        
    }
}
