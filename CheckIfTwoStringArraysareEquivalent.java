public class CheckIfTwoStringArraysareEquivalent {
    public static void main(String[] args) {
       String[] word1 = {"ab", "c"};
       String[] word2 = {"a", "bc"};
       boolean result=fun(word1, word2);
       System.out.println(result);
    }

    public static boolean fun(String word1[],String word2[]){
        String s1=String.join("", word1);
        String s2=String.join("", word2);
        return s1.equals(s2);
    }
}
