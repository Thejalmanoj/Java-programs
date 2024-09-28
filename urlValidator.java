import java.util.*;
import java.util.regex.*;
public class urlValidator
{
  static boolean validateUrl(String str)
  {
    String url="((http|https)://)(www.)"+ "[a-zA-Z0-9@:%._\\+~#?&//=]"+ "{2,256}\\.[a-z]"+ "{2,6}\\b([-a-zA-Z0-9@:%"+ "._\\+~#?&//=]*)";
    Pattern pn = Pattern.compile(url);
    if(pn==null)
    {
      return false;
    }
    else
    {
      Matcher m=pn.matcher(str);
      return m.matches();
    }
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the url:\n");
    String str=sc.nextLine();
    if(validateUrl(str)==true)
    {
        System.out.println("URL is valid");
    }
    else
    {
      System.out.println("URL is not valid");
    }
    sc.close();
  }
}
