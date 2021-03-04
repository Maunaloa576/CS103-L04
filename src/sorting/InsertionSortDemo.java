package sorting;

import java.util.List;

public class InsertionSortDemo {

    public static <E extends Comparable> List<E> sort(List<E> data) {

        for (int i = 1; i < data.size(); i++) {
            E key = data.get(i);
            int j = i - 1;

            while (j >= 0 && data.get(j).compareTo(key) == 1) {
                data.set(j + 1, data.get(j));
                j = j - 1;
            }

            data.set(j + 1, key);
        }

        return data;
    }


}
