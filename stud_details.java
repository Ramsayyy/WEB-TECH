import java.util.*;
public class stud_details 
{
    String rollno;
    String name;
    String Dept;
    int age;
    double cutoff;
    float cgpa;
    public stud_details(String r,String n,String d,int a,double c,float cg)
    {
        this.rollno=r;
        this.name=n;
        this.Dept=d;
        this.age=a;
        this.cutoff=c;
        this.cgpa=cg;
    }
    public void show()
    {
        System.out.println("The Student Details are as follows:");
        System.out.println("Name is:"+(this.name));
        System.out.println("Roll Number is:"+(this.rollno));
        System.out.println("Department is:"+(this.Dept));
        System.out.println("Age is:"+(this.age));
        System.out.println("Cutoff is:"+(this.cutoff));
        System.out.println("CGPA is:"+(this.cgpa));
    }
    public static void main(String[] args)
    {
        Scanner myobj=new Scanner(System.in);
        System.out.print("Enter Number of Student's Data to be added:");
        int n=myobj.nextInt();
        stud_details Students[]=new stud_details[n];
        String r,na,d;
        int a;
        double c;
        float cg;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Student Details:");
            System.out.print("Enter Name :");
            myobj.nextLine();
            na=myobj.nextLine();
            System.out.print("Enter Roll Number :");
            r=myobj.nextLine();
            System.out.print("Enter Department Name :");
            d=myobj.nextLine();
            System.out.print("Enter Age :");
            a=myobj.nextInt();
            System.out.print("Enter Cutoff :");
            c=myobj.nextDouble();
            System.out.print("Enter CGPA :");
            cg=myobj.nextFloat();
            Students[i]=new stud_details(r,na,d,a,c,cg);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("\t\t\t--Student --"+(i+1));
            Students[i].show();
        }
    }
}
