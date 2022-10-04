import java.util.*;
public class palindrome 
{
    public static void main(String[] args)
    {
        Scanner inpt=new Scanner(System.in);
        System.out.print("Enter A Number:");
        int a=inpt.nextInt();
        int n=a;
        int s=0;
        int j;
        while(a!=0)
        {

            j=a%10;
            s=(s*10)+j;
            a=a/10;
        }
        if(n==s)
            System.out.println("The Given Number is A Palindrome..");
        else
            System.out.println("Not A Palindrome");
    }    
}
