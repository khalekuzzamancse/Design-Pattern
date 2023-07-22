package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FakeLiveData<List<String>> liveData = new FakeLiveData<>();
        liveData.setData(Arrays.asList("A", "B"));
        liveData.setData(Arrays.asList("A", "B","C"));
        liveData.setData(Arrays.asList("A", "B","C"));
        List<String> list=liveData.getData();





    }
}
