import java.util.ArrayList;
import java.util.Arrays;
public class Subsequence {
    public static void Subsequence(int[] arr,int ind,ArrayList<Integer> al){
        if(ind>=arr.length)
        {
            System.out.println(al);
            if(al.size()==0)
            System.out.println("{}");
            return ;
        }
     al.add(arr[ind]);
     Subsequence(arr, ind+1, al);
     al.remove(al.size()-1);
     Subsequence(arr, ind+1, al);
    }
    //print any 1
    public static boolean SubsequenceSum1(int[] arr,int ind,ArrayList<Integer> al,int sum,int k){
        if(ind>=arr.length)
        {
            if(sum==k)
            {
            if(al.size()==0)
            System.out.println("{}");
            else
            System.out.println(al);
            return true;
            }
            return false ;
        }
     al.add(arr[ind]);
     sum+=arr[ind];
     if(SubsequenceSum1(arr, ind+1, al,sum,k)==true) return true;
     al.remove(al.size()-1);
     sum-=arr[ind];
     if(SubsequenceSum1(arr, ind+1, al,sum,k)==true)return true;
     return false;
    }
    public static void SubsequenceSum(int[] arr,int ind,ArrayList<Integer> al,int sum,int k){
        if(ind>=arr.length)
        {
            if(sum==k)
            {
            if(al.size()==0)
            System.out.println("{}");
            else
            System.out.println(al);
            }
            return ;
        }
     al.add(arr[ind]);
     sum+=arr[ind];
     SubsequenceSum(arr, ind+1, al,sum,k);
     al.remove(al.size()-1);
     sum-=arr[ind];
     SubsequenceSum(arr, ind+1, al,sum,k);
    }
    public static int SubsequenceSum2(int[] arr,int ind,ArrayList<Integer> al,int sum,int k){
        if(sum>k)
        return 0;
        if(ind>=arr.length)
        {
            if(sum==k)
            {
            System.out.println(al);
            return 1;
            }
            return 0;
        }
     al.add(arr[ind]);
     sum+=arr[ind];
    int l= SubsequenceSum2(arr, ind+1, al,sum,k);
     al.remove(al.size()-1);
     sum-=arr[ind];
     int y=SubsequenceSum2(arr, ind+1, al,sum,k);
     return l+y;
    }
    public static void combinationSum(int[] arr,int idx,ArrayList<Integer> al,int target)
    {
        
        if(target<0)
        return; 
        if(target==0)
        {
            System.out.println(al);
            return ;
        }
        if(idx>=arr.length)
        return ;
        al.add(arr[idx]);
        combinationSum(arr, idx, al, target-arr[idx]);
        al.remove(al.size()-1);
        combinationSum(arr, idx+1, al,target);
        return ;
    }
    public static void combinationSum2(int[] arr,int ind,ArrayList<Integer> al,int target)
    {
        if(target==0)
        {
           System.out.println(al);
           return ;
        }
        if(ind>=arr.length)
        {
            return ;
        }
        if(target<0)
        return ;
        for(int i=ind;i<arr.length;i++)
        {
            if(i>ind && arr[i]==arr[i-1])
            {
                continue;
            }
            al.add(arr[i]);
            combinationSum2(arr, i+1, al, target-arr[i]);
            al.remove(al.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,5,2,1,2};
        Arrays.sort(arr);
        ArrayList<Integer> al=new ArrayList<>();
        //Subsequence(arr,0,al);
        int k=5;
        int sum=0;
        //SubsequenceSum(arr,0,al,sum,k);
        //SubsequenceSum1(arr,0,al,sum,k);
        //int r=SubsequenceSum2(arr, 0, al, sum,k);
        //combinationSum(arr,0,al,k);
        combinationSum2(arr,0,al,k);

        //System.out.println(r);;

    }
    
}
