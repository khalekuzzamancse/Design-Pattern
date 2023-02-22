package ex01;

public class Output {
    public static void main(String[] args) {
        Database database = new Database();
        database.add(10);
        database.add(20);
        database.add(30);
        database.setStrategy(new LinerSearch());
        database.find(20);
        database.setStrategy(new BinarySearch());
        database.find(20);
    }
}