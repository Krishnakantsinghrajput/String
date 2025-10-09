public class Largest_odd_number {
    public static void main(String args[]){
        String s="42456789";
        String ans=Largest_odd_number_fun(s);
        System.out.println(ans);
    }

    public static String Largest_odd_number_fun(String s ){
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if((ch-'0')%2==1){
                return s.substring(0, i+1);
            }
        }
        return "";
    }
}
