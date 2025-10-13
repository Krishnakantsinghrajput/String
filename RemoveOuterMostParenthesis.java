public class RemoveOuterMostParenthesis {
    public static void main(String args[]){
       String   s =  "(()())(())(()(()))";
       String ans=RemoveOuterMostParenthesisFun(s);
       System.out.println(ans);
    }

    public static String RemoveOuterMostParenthesisFun(String s){
        StringBuilder result=new StringBuilder();
        int depth=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(depth>0){
                    result.append(c);
                }
                depth++;
            }
            else{
                depth--;
                if(depth>0){
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
