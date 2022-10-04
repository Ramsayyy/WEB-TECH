import java.util.*;
public class subsetofarray 
{
    public static int[] subset(int[] arr,int si,int ei)
    {
        int ar[]=new int[ei-si+1];
        int i=0,j=si;
        while(j<=ei)
        {
            ar[i]=arr[j];
            i+=1;
            j+=1;
        }
        return ar;
    }
    public static void main(String[] args) 
    {
        Scanner myobj=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=myobj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element At #"+(i)+" :");
            arr[i]=myobj.nextInt();
        }
        int si,ei;
        System.out.print("Enter Start Index to perform Array Slicing:");
        si=myobj.nextInt();
        System.out.print("Enter End Index to perform Array Slicing:");
        ei=myobj.nextInt();
        int[] ar=subset(arr,si,ei);
        System.out.println("The Original Array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The Sliced Array is:");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }

    }   
}
