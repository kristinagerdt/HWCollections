import java.util.*;

public class IsCircular {

    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        Collections.addAll(list1, "dd", "ee", "ff");
        List<String> list2 = new LinkedList<>();
        Collections.addAll(list2, "dd", "ff", "ee");

        boolean isCircular = isCircular(list1, list2);
        System.out.println(isCircular);

        LinkedList<String> list3 = new LinkedList<>();
        Collections.addAll(list3, "aa", "bb", "cc");
        LinkedList<String> list4 = new LinkedList<>();
        Collections.addAll(list4, "bb", "cc", "aa");

        boolean isCircular2 = isCircular2(list3, list4);
        System.out.println(isCircular2);
    }

    public static boolean isCircular(List<String> list1, List<String> list2) {
        String temp;
        for (int i = 0; i < list1.size(); i++) {
            temp = list1.get(0);
            list1.add(temp);
            list1.remove(0);
            if (list1.equals(list2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCircular2(LinkedList<String> list1, LinkedList<String> list2) {
        for (int i = 0; i < list1.size(); i++) {
            list1.addLast(list1.getFirst());
            list1.removeFirst();
            if (list1.equals(list2)) {
                return true;
            }
        }
        return false;
    }
}