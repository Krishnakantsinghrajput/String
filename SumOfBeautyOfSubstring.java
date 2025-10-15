public class SumOfBeautyOfSubstring {
    public static void main(String args[]){
      String  s = "aabcbaa";
      int ans=SumOfBeautyOfSubstringFun(s);
      System.out.println(ans);
    }

    public static int SumOfBeautyOfSubstringFun(String s){
        int n=s.length();
        int totalbeauty=0;
        for(int i=0;i<n;i++){
            int freq[]=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                int maxfreq=0;
                int minfreq=Integer.MAX_VALUE;

                for(int f=0;f<26;f++){
                    if(freq[f]>0){
                        maxfreq=Math.max(maxfreq, freq[f]);
                        minfreq=Math.min(minfreq, freq[f]);
                    }

                }
                totalbeauty+=(maxfreq-minfreq);
            }
        }
        return totalbeauty;
    }
}
