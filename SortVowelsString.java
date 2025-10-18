
import java.util.*;
class SortVowelsString{
    public static void main(String[] args) {
     String   s = "lEetcOde";
String ans=SortVowels(s);
System.out.println(ans);

    }

    public static  String SortVowels(String s){
        List<Character> vowels=new ArrayList<>();
        for( char c:s.toCharArray()){
            if(isVowel(c)){
                vowels.add(c);
            }
        }
        Collections.sort(vowels);

        StringBuilder sb=new StringBuilder();
        int index=0;
        for(char c:s.toCharArray()){
            if(isVowel(c)){
                sb.append(vowels.get(index++));
            }
            else{
                 sb.append(c);

            }
        }
  return  sb.toString();
       
        
    }
    static  boolean   isVowel(char c){
            return "AEIOUaeiou".indexOf(c)!=-1;
        } 
       
}