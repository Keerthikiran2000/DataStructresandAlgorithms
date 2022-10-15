import java.util.*;
public class MarksofPCM
{
    int maths;
    int phy;
    int chem;
   public MarksofPCM(int maths,int phy,int chem)
    {
       this.maths=maths;
       this.phy=phy;
       this.chem=chem;
    } 
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int phy[]=new int[t];
        int math[]=new int[t];
        int chem[]=new int[t];
        MarksofPCM arr[]=new MarksofPCM[phy.length];
        for(int i=0;i<t;i++)
        {
           phy[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
           math[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
           chem[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            arr[i]=new MarksofPCM(math[i],phy[i],chem[i]);
        }
        Arrays.sort(arr,new Sample());
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].phy+" "+arr[i].maths+" "+arr[i].chem);
        }
}
}
class Sample implements Comparator<MarksofPCM>
{
   public int compare(MarksofPCM a,MarksofPCM b)
   {
       if(a.phy!=b.phy)
       return a.phy-b.phy;
       else if(a.chem!=b.chem)
       return b.chem-a.chem;
       else
       return a.maths-b.maths;

   }
    
}