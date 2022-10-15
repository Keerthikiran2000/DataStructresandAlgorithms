import java.util.Arrays;
class CountSort
{
    /*count is used when more numbers are present in limited range*/ 
    public static void CountSort(int[] arr)
    {
        /*finding maximum and minimum to find the range*/
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int[] output=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]<min)
           min=arr[i];
           if(arr[i]>max)
           max=arr[i]; 
        }
        System.out.println(max+" "+min);
        int count[]=new int[max-min+1];
        for(int i=0;i<count.length;i++)
        {
           count[i]=0;
        }
         /* count array is created for counting the occurances*/ 
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]-min]+=1;
        }
         /*adding all the elemnts prefix to find the last occurance of element in sorted Array*/
        for(int i=1;i<count.length;i++)
        {
            count[i]+=count[i-1];
        }
        //now subtract one from the sumas index starts from 0 and keep it new array
        for(int i=arr.length-1;i>=0;i--)
        {
            count[arr[i]-min]--;
            output[count[arr[i]-min]]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        arr[i]=output[i];

    }
    public static void RadixSort(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>max)
           max=arr[i];
        }
        for(int exp=1;exp/max>0;exp=exp*10)
        CountSort(arr,exp);
    }
    public static void CountSort(int[] arr,int exp)
    {
        int count[]=new int[10];
        int output[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]/exp%10]+=1;
        }
        for(int i=1;i<count.length;i++)
        {
            count[i]+=count[i-1];
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            count[(arr[i]/exp)%10]--;
            output[count[(arr[i]/exp)%10]]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        output[i]=arr[i];
    }
   public static void main(String[] args)
   {
       int[] arr={10,20,50,40,90,90};
       RadixSort(arr);
       System.out.println(Arrays.toString(arr));
   }
}