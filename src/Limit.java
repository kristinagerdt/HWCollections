import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Limit {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Collections.addAll(list, 1, 2, 3, 7, 2, 9, 0, 5);

        List<Integer> limitedList = limit(list, 4);
        System.out.println(limitedList);
    }

    public static List<Integer> limit(List<Integer> list, int lim) {
        List<Integer> result = new LinkedList<>(list);
        Iterator<Integer> iterator = result.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            if (item > lim) {
                iterator.remove();
            }
        }
        return result;
    }
}
