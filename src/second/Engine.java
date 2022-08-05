package second;

public class Engine {
    private int CountOfСylinders;

    public Engine(int countOfСylinders) {
        CountOfСylinders = countOfСylinders;
    }

    public int getCountOfСylinders() {
        return CountOfСylinders;
    }

    public void setCountOfСylinders(int countOfСylinders) {
        CountOfСylinders = countOfСylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "CountOfСylinders=" + CountOfСylinders +
                '}';
    }
}
