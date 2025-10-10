public class RotateString {
    public static void main(String[] args) {
       String s = "abcde", goal = "cdeab";
       boolean result=fun(s, goal);
       System.out.println(result);
    }

    public static boolean fun(String s,String goal){
        String new1=s+s;
        return new1.contains(goal);
    }
}
