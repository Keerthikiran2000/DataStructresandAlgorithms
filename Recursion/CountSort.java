import java.util.Scanner;
public class CountSort {
    static void radixSort(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>max)
           max=arr[i];
        }
        int exp=1;
        while(max>0)
        {
            countSort(arr,exp);
            exp=exp*10;
            max=max/10;
        }
        
    }
    static void countSort(int[] arr,int exp)
    {
        int n=arr.length;
        int[] count=new int[10];
        for(int i=0;i<count.length;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]/exp%10]++;
        }
        int[] prefixsum=new int[count.length];
        prefixsum[0]=count[0]-1;
        for(int i=1;i<prefixsum.length;i++)
        {
            prefixsum[i]=prefixsum[i-1]+count[i];
        }
        int[] ans=new int[n];
        for(int i=arr.length-1;i>=0;i--)
        {
            int prefixIdx=arr[i]/exp%10;
            int ansIdx=prefixsum[prefixIdx];
            ans[ansIdx]=arr[i];
            prefixsum[prefixIdx]-=1;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=ans[i];
        }
        
    }
    static void countSort(int[] arr)
    {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        int[] count=new int[max-min+1];
        for(int i=0;i<count.length;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]-min]++;
        }
        for(int i=0;i<count.length;i++)
        {
            System.out.print(count[i]+" ");
            
        }
        System.out.println();
        int[] prefixsum=new int[count.length];
        prefixsum[0]=count[0]-1;
        for(int i=1;i<prefixsum.length;i++)
        {
            prefixsum[i]=prefixsum[i-1]+count[i];
        }
        int[] ans=new int[n];
        for(int i=arr.length-1;i>=0;i--)
        {
            int prefixIdx=arr[i]-min;
            int ansIdx=prefixsum[prefixIdx];
            ans[ansIdx]=arr[i];
            prefixsum[prefixIdx]-=1;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=ans[i];
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        radixSort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
