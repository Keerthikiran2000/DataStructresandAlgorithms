import java.util.Scanner;
public class PrintingPairs {
    public static void PrintPairs(int[] arr)
    {
      for(int i=0;i<arr.length;i++)
      {
          int x=arr[i];
          for(int j=i+1;j<arr.length;j++)
          {
              System.out.println(x +" "+arr[j]);
          }
      }
    }
    public static void PrintSubarrays(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                //System.out.println(i +" "+j);
                 for(int k=i;k<=j;k++)
                 {
                     System.out.print(arr[k]+",");
                 }
                 System.out.println();
            }
            
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size Of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array Elements");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
       // PrintPairs(arr);
        PrintSubarrays(arr);
    }
}
