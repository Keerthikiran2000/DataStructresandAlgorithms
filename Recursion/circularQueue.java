public class circularQueue {
    private int size;
    private int[] data;
    int front=-1;
    int rear=-1;
    circularQueue(int size)
    {
        this.size=size;
        data=new int[size];
    }
    circularQueue()
    {
        this.size=10;
        data=new int[10];
    }
    void enqueue(int element)
    {
        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
            data[rear]=element;
        }
        else if((rear+1)%size==front)
        {
            System.out.println("QUEUE IS FULL");
        }
        else
        {
         rear=(rear+1)%size;
         data[rear]=element;
        }
    }
    public int dequeue()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        else if(front==rear)
        {
            int f=front;
           front=rear=-1;
           return data[f];
        }
        else
        {
            int f=front;
            front=(front+1)%size;
            return data[f];
        }
    }
    public static void main(String[] args) {
        circularQueue cq=new circularQueue(10);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
    }

    
}
