public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String s="tree";
        String  ans=SortCharacterByFrequencyFun(s);
        System.out.println(ans);
    }

    public static String SortCharacterByFrequencyFun(String s){
        int freq[]=new int[256];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }

        StringBuilder result=new StringBuilder();
        for(int count=s.length();count>0;count--){
            for(int i=0;i<256;i++){
                if(freq[i]==count){
 for(int k=0;k<count;k++){
result.append((char)i);
                }
                }
               
            }
        }
        return result.toString();
    }
}
