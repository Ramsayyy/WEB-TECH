import java.util.*;
public class library 
{
    static ArrayList<String> bookname=new ArrayList<>();
    static int length;
    String membername;
    int memberid;
    public library(String mn,int i)
    {
        this.membername=mn;
        this.memberid=i;
    } 
    public static void disp()
    {
        for(int i=0;i<length;i++)
        {
            System.out.print(bookname.get(i)+" ");
        }
        System.out.println();
    }
    public static void del(String s)
    {
        int f=0;
        for(int i=0;i<length;i++)
        {
            if(bookname.get(i).equalsIgnoreCase(s))
            {
                f=1;
                bookname.remove(i);
            }
        }
        if(f==0)
            System.out.println("Not Found");
        else
        {
            length=bookname.size();
            System.out.println("Book Deleted..");
        }    
    }
    public static void search(String n)
    { 
        int f=0;
        for(int i=0;i<length;i++)
        {
            if(bookname.get(i).equalsIgnoreCase(n))
            {
                System.out.println("Book Found");
                f=1;
                break;
            }
        }
        if(f==0)
            System.out.println("Book Not Found.");
    }
    public static void main(String[] args)
    {
        Scanner myobj=new Scanner(System.in);
        int n,ch;
        String s;
        do
        {
            System.out.println("Menu ");
            System.out.println("1. Add Book");
            System.out.println("2. Display all Books ");
            System.out.println("3. Search for a book ");
            System.out.println("4. Remove a book");
            System.out.println("5. Exit");
            System.out.print("Enter Your choice:");
            ch=myobj.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter Bookname:");
                    myobj.nextLine();
                    s=myobj.nextLine();
                    bookname.add(s);
                    length=bookname.size();
                    break;
                case 2:
                    disp();
                    break;
                case 3:
                    System.out.print("Enter Bookname to be searched:");
                    myobj.nextLine();
                    s=myobj.nextLine();
                    search(s);
                    break;
                case 4:
                    System.out.print("Enter Bookname to be deleted:");
                    myobj.nextLine();
                    s=myobj.nextLine();
                    del(s);
                    break;

            }
        }while(ch!=5);
    }     
}
