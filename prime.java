import java.util.*;
public class prime 
{
    public static void main(String[] args)
    {
        int f=0,k=0;
        Scanner scanf=new Scanner(System.in);
        System.out.print("Enter Starting Number:");
        int str=scanf.nextInt();
        System.out.print("Enter Ending Number:");
        int stp=scanf.nextInt();
        int n=stp-str;
        int arr[]=new int[n];
        for(int i=str;i<=stp;i++)
        {
            f=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0 && i!=0 && i!=1)
            {
                arr[k]=i;
                k+=1;
            }
        }
        System.out.println("Number of Prime Numbers Between "+str+" "+stp+" is:"+(k));
        System.out.println("The Numbers are :");
        for(int i=0;i<k;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
