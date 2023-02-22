package ex01;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Integer> list = new ArrayList<>();
    private SearchStrategy strategy;

    public void add(Integer num) {
        list.add(num);
    }

    public void find(Integer key) {
        strategy.search(list, key);

    }

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }


}
