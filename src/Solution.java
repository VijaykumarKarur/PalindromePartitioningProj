import java.util.ArrayList;
public class Solution {
    public boolean isPalindrome(String string, int start, int end){
        if(start == end - 1){
            return true;
        }
        while(start < end - 1){
            if(string.charAt(start) != string.charAt(end - 1)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public void partitionString(String string, int start, int end, ArrayList<String> list, ArrayList<ArrayList<String>> result){
        if(start == end){
            result.add(new ArrayList<String>(list));
            return;
        }
        for(int index = start + 1; index <= end; index++){
            if(isPalindrome(string, start, index)){
                list.add(string.substring(start, index));
                partitionString(string,index, end, list, result);
                list.remove(list.size() - 1);
            }
        }
    }

    public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        partitionString(a, 0, a.length(), new ArrayList<String>(), result);
        return result;
    }
}
