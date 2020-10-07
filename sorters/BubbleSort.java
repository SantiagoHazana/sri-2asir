package sorters;

import java.util.List;

public class BubbleSort {

    public void sort(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (list.get(j) > list.get(j + 1)) {
                    // swap arr[j+1] and arr[j]
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
    }
}
