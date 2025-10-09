public class practice {
    public static void main(String[] args) {
        String s="jai shree radhey jai shree radhey";
        String ans=Reverseword(s);
        System.out.println(ans);
    }

    public static String Reverseword(String s){
        String word[]=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            sb.append(word[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
