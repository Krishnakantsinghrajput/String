public class LongestRepeatingSubstring {
    public static void main(String[] args) {
        String sequence="ababababc";
        String word="ab";
        int ans=maximumRepeatingSubstring(sequence,word);
        System.out.println(ans);
    }
    

    public static int maximumRepeatingSubstring(String sequence,String word){
        int count=0;
        String temp=word;
        while(sequence.contains(temp)){
            count++;
            temp+=word;
        }
        return count;
    }
}
