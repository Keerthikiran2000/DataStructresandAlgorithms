import java.util.Scanner;
public class SumOfSubarrays {
    public static int SumOfSubarraysBruteForce(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                max=Math.max(sum,max);
            }
        }
        return max;
    }
    public static int SubarraySumPrefix(int[] arr)
    {
        int[] prefixSumArray=new int[arr.length];
        prefixSumArray[0]=arr[0];
        for(int i=1;i<prefixSumArray.length;i++)
        {
            prefixSumArray[i]=arr[i]+prefixSumArray[i-1];
        }
        int sum=0,max=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                sum=i!=0?prefixSumArray[j]-prefixSumArray[i-1]:prefixSumArray[j];
                max=Math.max(sum,max);
            }
        }
        return max;
    }

   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Size Of Array");
     int n=sc.nextInt();
     System.out.println("Enter Array Elements");
     int[] arr=new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
     }
    int res= SubarraySumPrefix(arr);
    System.out.println(res);
    int res1= SumOfSubarraysBruteForce(arr);
    System.out.println(res1);
   } 
}
