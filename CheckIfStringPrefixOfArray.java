public class CheckIfStringPrefixOfArray {
    public static void main(String[] args) {
      String   s = "iloveleetcode";
      String[] words = {"i","love","leetcode","apples"};
      boolean result=CheckIfStringPrefixOfArrayFun(s, words);
      System.out.println(result);
    }

    public static boolean CheckIfStringPrefixOfArrayFun(String s,String words[]){
        StringBuilder prefix=new StringBuilder();
        for(int i=0;i<words.length;i++){
            prefix.append(words[i]);
            if(prefix.toString().equals(s)) return true;
            if(prefix.length()>s.length()) return false;
        }
        return false;
    }
}
