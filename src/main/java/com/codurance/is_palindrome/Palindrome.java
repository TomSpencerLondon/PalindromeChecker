//no need of packages
public class Palindrome {
    public boolean check(String phrase){
      String myString = phrase;
      StringBuffer buffer = new StringBuffer(myString);
      buffer.reverse();
      String data = buffer.toString();
      if(myString.equals(data)){
         return true;
      } else {
        return false;
      }
   }
}
