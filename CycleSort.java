class CycleSort
{
    public static void cycle_sort(int[] arr)
    {
        for(int cycle_start=0;cycle_start<arr.length;i++)
        {
           int pos=cycle_start;
           int item=arr[cycle_start];
           for(int i=cycle_start+1;i<arr.length;i++)
           {
             if(arr[i]<item)
              pos++;
           }
           int temp=arr[pos];
           arr[pos]=item;
           item=temp;
           while(pos!=cycle_start){
                pos=cycle_start;
                for(int i=cycle_start+1;i<n;i++)
                    if(arr[i]<item)
                        pos++;
                        
                //swap(item,arr[pos])
                temp=item;
                item=arr[pos];
                arr[pos]=temp;
            }

        }
    }
}