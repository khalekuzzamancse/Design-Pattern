package org.example;

public class FakeLiveData<T> {
    private T data;

    public void setData(T data) {
         {
            this.data = data;
            System.out.println("Data Changed " + data.toString());
        }
    }

    public T getData() {
        return data;
    }

    public void printData() {
        //  System.out.println(data.toString());
    }
}
