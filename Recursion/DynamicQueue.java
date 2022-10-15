public class DynamicQueue {
    private int size;
    private int front=-1;
    private int rear=-1;
    private int[] data;
    DynamicQueue(int size)
    {
        this.size=size;
       this.data=new int[this.size];
    }
    DynamicQueue()
    {
        this.data=new int[10];
    }
    public void enqueue(int element)
    {
        int curr_size=this.size();
        if(curr_size>=size)
        {
            System.out.println("Queue is full");
        }
        else if(front==-1 && rear==-1)
        {
          front++;
          rear++;
          data[rear]=element;
        }
        else
        {
        ++rear;
        data[rear]=element;
        }
    }
    public int dequeue()
    {
        if(this.size()==0)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        return data[front++];
    }
    public int size()
    {
        if(rear==-1 && front==-1)
        {
            return 0;
        }
        else if(front==rear)
        {
           return 1;
        }
        else
        return rear-front+1;
    }  
    public void print()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.println(data[i]);
        }
    }
public static void main(String[] args) {
    DynamicQueue dq=new DynamicQueue(10);
    dq.enqueue(10);
    dq.enqueue(20);
    dq.dequeue();
    dq.enqueue(30);
    System.out.println(dq.size());
    dq.print();
}
}
