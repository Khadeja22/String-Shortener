import java.util.*;
public class stringShortenerFinal{

    public static void main(String args[]) {

Scanner scan = new Scanner(System.in);
    System.out.println("Type the message to be shortened:");
    String input = scan.nextLine();
    String vowelRemoved = "";
    input = input.toLowerCase();
    int i = 1;
    int vowelCounter = 0;
    int repeatCounter = 0;
    while (i < (input.length() - 1)) 
    {
      if (((input.substring(i, i + 1)).equals("a") || (input.substring(i, i + 1)).equals("e")
          || (input.substring(i, i + 1)).equals("i") || (input.substring(i, i + 1)).equals("o")
          || (input.substring(i, i + 1)).equals("u"))
          && !(i > 1 && (input.substring(i - 1, i + 1)).equals(" e") || (input.substring(i - 1, i + 1)).equals(" a")
              || (input.substring(i - 1, i + 1)).equals(" i") || (input.substring(i - 1, i + 1)).equals(" o"))) 
      {
        vowelCounter++;
      } 
      else if ((input.substring(i, i + 1)).equals(input.substring(i + 1, i + 2)))       {
        repeatCounter++;
       }
      else {
        vowelRemoved = vowelRemoved + input.substring(i, i + 1);
           }
      i++;
    }

    if (!(vowelRemoved.substring(((vowelRemoved.length() - 1)), (vowelRemoved.length())).equals(input.substring(input.length() - 1, input.length())) && 
      !((input.substring(i, i + 1)).equals("a") || 
        (input.substring(i, i + 1)).equals("e") || 
        (input.substring(i, i + 1)).equals("i") || 
        (input.substring(i, i + 1)).equals("o") || 
        (input.substring(i, i + 1)).equals("u"))
        && !(input.substring(i, i + 1)).equals(input.substring(i + 1, i + 2)))) 
    {
      vowelRemoved = vowelRemoved + input.substring(input.length() - 1, input.length());
    }
    if (!(vowelRemoved.substring(0, 1)).equals(input.substring(0, 1))) 
    {
      vowelRemoved = input.substring(0, 1) + vowelRemoved;
    }
    System.out.println("\nAlgorithim");
    System.out.println("vowelCounter removed: " + (vowelCounter));
    System.out.println("repeatCounter removed: " + repeatCounter);
    System.out.println("Algorithm 1 message: " + vowelRemoved);
    System.out.println("Algorithm 1 characters saved: " + (vowelCounter + repeatCounter));

    }

}