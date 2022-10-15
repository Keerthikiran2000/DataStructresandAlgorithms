import java.util.Arrays;
class CyclicSort
{
    public static void CyclicSort1(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]!=arr[arr[i]-1])
            {
                int temp=arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
            }
            else
            {
                i++;
            }
        }
    }
    public static void main(String[] args)
    {
      int arr[]={2,1,4,3};
      CyclicSort1(arr);
      System.out.println(Arrays.toString(arr));
    }
}