import java.util.*;
import static java.lang.Character.*;
public class wordcounter
{
    public static void main(String args[])
    {
        System.out.println("enter the text:");
        Scanner s = new Scanner(System.in);
        
        String str = s.nextLine();
        String[] arr = str.split(" ");
        String str1 = str.replace(" ","");
        System.out.println("\n\nWord Counter");
        System.out.println("===================");
        System.out.println("Number of words:"+arr.length);
        System.out.println("Totaln Frequency:"+str1.length());
        int count[] = new int[256];
        for(int i=0;i<256;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<str1.length();i++)
        {
            if(isLetter(str1.charAt(i)))
            {
                count[str1.charAt(i)]++;
            }
        }
        for(int i=0;i<256;i++)
        {
            if(count[i]>0)
            {
            
            System.out.println(Character.toString((char)i)+": "+count[i]);
            }
        }
    System.out.println("===============================================");
    }
}
