import java.util.*;
import java.util.regex.*;
public class urlComponentsRegex
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the url:\n");
        String str=sc.nextLine();
        String url="^(https?://)?(www\\.)?([a-zA-Z0-9.-]+)(:[0-9]+)?(/[^?#]*)?(\\?([^#]*))?(#(.*))?$";
        Pattern pn=Pattern.compile(url);
        Matcher match=pn.matcher(str);
        if(match.matches())
        {
            System.out.println("Protocol: "+(match.group(1)!=null?match.group(1):"Not available"));
            System.out.println("Sub domain: "+(match.group(2)!=null?match.group(2):"Not available"));
            System.out.println("Domain: "+match.group(3));
            System.out.println("Port: "+(match.group(4)!=null?match.group(4):"Not available"));
            System.out.println("Path: "+(match.group(5)!=null?match.group(5):"Not available"));
        }
        else
        {
            System.out.println("URL is not valid");
        }
    }
}
