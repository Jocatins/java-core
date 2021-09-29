import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(609);
        values.add(206);
        values.add(701);
        values.add(198);
        values.add(808);
        values.add(1, 901);

        // pure sorting
//        Comparator comparator = new Comparator<Integer>() {
//
//            public int compare(Integer o1, Integer o2) {
//                return (o1 < o2)? -1 : ((o1 == o2) ? 0 : 1);
//            }
//        };
//        Collections.sort(values, comparator);



        Collections.sort(values, ( i, j) ->  i % 10 > j % 10 ? 1 : -1);


        for(Object op : values){
            System.out.println(op);
        }
    }
}
