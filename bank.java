import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class bank 
{
    double balance;
    final double minbal=1000;
    public bank(double b)
    {
        this.balance=b;
    }
    public void credit(double n)
    {
        this.balance=this.balance+n;
    }  
    public void debit(double n)
    {
        if((this.balance-n)>=minbal)
        {   
            this.balance=this.balance-n;
            System.out.println("Transaction Success");
            
        }
        else
        {
            System.out.println("Transaction Not Possible ");
        }
    }
    public void show()
    {
        System.out.println("Your Accout Balance is :"+this.balance);
    }
    public static void main(String[] args)
    {
        Scanner myobj=new Scanner(System.in);
        System.out.print("Enter Amount (Greater than or equal to 1000) :");
        double n=myobj.nextDouble();
        if(n<1000)
            System.out.println("Minimum 1000 rs must be deposited at the time of account creation");
        else 
        {
            bank obj=new bank(n);
            System.out.println("Enter Amount to be credited:");
            n=myobj.nextDouble();
            obj.credit(n);
            obj.show();
            System.out.println("Enter Amount to be Debited:");
            n=myobj.nextDouble();
            obj.debit(n);
            obj.show();

        }   
    }
}
