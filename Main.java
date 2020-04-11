import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        NumSysConv nsc = new NumSysConv();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your original number --> ");
        String origNbr = in.nextLine();
        
        System.out.print("Enter your original base --> ");
        String origBase = in.nextLine();
        
        System.out.print("Enter your desired base --> ");
        String newBase = in.nextLine();
        
        String[] elements = {origNbr, origBase, newBase};
        String newNbr = nsc.BaseConverter(elements);
        
        System.out.println(origNbr + " base-" + origBase + " converted to base-" + newBase + " is " + newNbr);
    }//end main method
}//end main class
