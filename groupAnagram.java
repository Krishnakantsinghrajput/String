import java.util.*;
public class groupAnagram {
    public static void main(String args[]){
       String[] strs = {"eat","tea","tan","ate","nat","bat"};
       System.out.println(groupAnagramfun(strs));
    }

    public static List<List<String>> groupAnagramfun(String strs[]){

        List<List<String>> result=new ArrayList<>();
        boolean visited[]=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i]){
                continue;
            }
            List<String> group=new ArrayList<>();
            group.add(strs[i]);
            visited[i]=true;
            for(int j=i+1;j<strs.length;j++){
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    group.add(strs[j]);
                    visited[j]=true;
                }
            }
            result.add(group);

        }
        return result;

    }

    public static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);


    }
}
