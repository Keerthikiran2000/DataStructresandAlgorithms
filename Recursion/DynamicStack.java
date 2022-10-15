public class DynamicStack {
    private int size;
    private int[] data;
    public int top=-1;
    DynamicStack(int size)
    {
        this.size=size;
        data=new int[size];
    }
    DynamicStack()
    {
        data=new int[10];
    }
    public void push(int element)
    {
        if(top<size)
        {
        ++top;
        data[top]=element;
        }
        else
        System.out.println("Capacity is full");
    }
    public int pop()
    {
        if(top==-1)
        {
        System.out.println("Stack is Empty");
        return -1;
        }

      return data[top--];
    }
    public int size()
    {
        return top+1;
    }
    public int peek()
    {
        return data[top];
    }
    public void print()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(data[i]);
        }
    }
    public static void main(String[] args) {
        DynamicStack ds=new DynamicStack(10);
        ds.push(10);
        ds.push(20);
        ds.push(39);
        ds.pop();
        System.out.println(ds.peek());
        ds.print();
    }
    
}
