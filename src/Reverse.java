import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reverse {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Collections.addAll(list, 1, 2, 3, 4, 7);

        List<Integer> reverseList = reverse(list);
        System.out.println(reverseList);
    }

    public static List<Integer> reverse(List<Integer> list) {
        List<Integer> result = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }
}
