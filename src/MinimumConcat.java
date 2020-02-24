import java.util.HashSet;

public class MinimumConcat {
    public static int minimumConcat(String initial, String goal) {
        HashSet<Character> set = new HashSet<>();
        for (char c : initial.toCharArray()) set.add(c);
        for (char c : goal.toCharArray()) {
            if (!set.contains(c)) return -1;
        }
        int j = 0, result = 0;
        for (int i = 0; i < goal.length(); ) {
            char c = goal.charAt(i);
            while (j < initial.length() && initial.charAt(j) != c) j++;
            if (j == initial.length()) {
                j = 0;
                result++;
            } else {
                j++;
                i++;
            }
        }
        result++;
        return result;
    }
}
