import java.util.*;

public class Combine {

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        Collections.addAll(list1, 1, 2, 3);
        List<Integer> list2 = new LinkedList<>();
        Collections.addAll(list2, 4, 7);

        List<Integer> combinedList = combine(list1, list2);
        System.out.println(combinedList);
    }

    public static List<Integer> combine(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new LinkedList<>(list1);
        result.addAll(list2);
        return result;
    }
}