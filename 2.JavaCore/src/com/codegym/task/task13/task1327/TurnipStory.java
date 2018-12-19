package com.codegym.task.task13.task1327;

import java.util.List;

public class TurnipStory {
    static void tell(List<Solution.Person> items) {
        Solution.Person first;
        Solution.Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i - 1);
            second = items.get(i);
            second.pull(first);
        }
    }
}
