import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo
{
    public static void main(String[] args) {
        Set<Integer> values = new TreeSet<>();
        values.add(56);
        values.add(25);
        values.add(16);

        for (int i : values) {
            System.out.println(i);
        }
    }
}
