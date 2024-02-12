import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeStringDuplicates("RemoveDuplicates"));
    }
    /*
    * Time complexity: O(n)
    * Space complexity: O(n)
    */
    public String removeStringDuplicates(String value){
          Set<Character> set = new java.util.HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
