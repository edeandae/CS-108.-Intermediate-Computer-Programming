import java.util.*;
public class HW6
{
public static Stack<String> mbin = new Stack<String>();
public static Stack<String>[] sbins = new Stack[10];
public static void main(String args[])
{
    Scanner scan = new Scanner(System.in);
    
    for (int i=0; i<=9; i++)
    {
        sbins[i] = new Stack<String>();
    }
    
    System.out.print("Please give a number between 0 and 9999 or press Enter to stop ");
    String s = scan.nextLine();
    while (! s.equals(""))
    {
        mbin.push(s);
        System.out.print("Please give a number between 0 and 9999 or press Enter to stop  ");
        s = scan.nextLine();
    }
    
    System.out.println();
    System.out.println("Your original mbin was:");
    System.out.println(mbin);
    
    for (int i=3; i>=0; i--) 
    {                       
        MtoS(i);           
        StoM();            
    }                       
    System.out.println("Your sorted mbin,is");
    System.out.println(mbin);
}


public static void MtoS(int p)
{
    while ( ! mbin.isEmpty() )
    {
        String x = mbin.pop();
        String s = x;
        while (s.length() < 4) { s = "0"+s; }
        
        char c = s.charAt(p);
        int k = (int)c - (int)'0';
        
        sbins[k].push(x);
    }
    
}


public static void StoM()
{
    for (int k=9; k>=0; k--)
    {
        while ( ! sbins[k].isEmpty() )
        {
            String s = sbins[k].pop();
            mbin.push(s);
        }
    }
}
}