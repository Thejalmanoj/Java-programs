import java.util.*;
import java.net.*;
public class urlComponents
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the url:");
    String str=sc.nextLine();
    try
    {
      URL url=new URL(str);
      System.out.println("Protocol: "+url.getProtocol());
      String host=url.getHost();
      System.out.println("Host: "+host);
      String[] arr=host.split("\\.");
      System.out.println("Subdomain: "+arr[0]);
      System.out.println("Domain: "+arr[1]);
      System.out.println("Top level domain: "+arr[2]);
      System.out.println("Port number:"+url.getDefaultPort());
      System.out.println("Path:"+url.getPath());
    }
    catch(MalformedURLException e)
    {
      System.out.println("Invalid url"+e.getMessage());
    }
    sc.close();
   }
}
