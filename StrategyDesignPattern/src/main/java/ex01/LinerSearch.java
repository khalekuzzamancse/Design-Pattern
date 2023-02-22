package ex01;

import java.util.List;

public class LinerSearch implements SearchStrategy {
    @Override
    public void search(List<Integer> arr, int key) {
        System.out.println("Searching "+key+" using Linear Search");

    }
}
