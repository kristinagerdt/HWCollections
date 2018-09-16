import java.util.*;

public class Transform {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        Collections.addAll(names, "Ivan", "Maria", "Stephan", "Amalia", "John");

        List<String> newNames = transform(names);
        System.out.println(newNames);
    }

    public static List<String> transform(List<String> list) {
        List<String> result = new LinkedList<>();
        for (String item : list) {
            if (item.length() != 4) {
                result.add(item);
            }
        }
        return result;
    }
}