package sorting;

import java.util.List;

public class BubbleSortDemo {

    public static <E extends Comparable> List<E> sort(List<E> data)  {

        for (int i = data.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data.get(j).compareTo(data.get(j + 1)) == 1) {
                    E temp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }

        return data;
    }
}
