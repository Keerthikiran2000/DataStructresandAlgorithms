//Linear search
import java.util.Arrays;
import java.util.Scanner;
class BasicArrays
{
    public static int LinearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            return i;
        }
        return -1;
    }
    public static int BinarySearch(int[] arr,int key)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
             return mid;
            else if(arr[mid]>key)
             end=mid-1;
            else
             start=mid+1;
        }
        return -1;
    }
    public static int[] reverse(int[] arr)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
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
        System.out.println("Enter Key");
        int key=sc.nextInt();
        //int position=LinearSearch(arr, key);
        int position =BinarySearch(arr, key);
        if(position!=-1)
         System.out.println("Position of Element in Array is "+position);
        else
         System.out.println("Element not found");
        System.out.println("Reversing the given array");
        arr=reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}