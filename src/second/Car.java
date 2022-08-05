package second;

public class Car {
    private StearingWheel stearingWheel;
    private Engine engine;

    private int HorsePower;
    private int Year;

    public StearingWheel getStearingWheel() {
        return stearingWheel;
    }

    public Car() {
        stearingWheel = new StearingWheel(2, "Alkantara");
        engine = new Engine(4);
        HorsePower = 150;
        Year = 2016;
    }

    public Car(StearingWheel stearingWheel, Engine engine, int horsePower, int year) {
        this.stearingWheel = stearingWheel;
        this.engine = engine;
        HorsePower = horsePower;
        Year = year;
    }

    public void setStearingWheel(StearingWheel stearingWheel) {
        this.stearingWheel = stearingWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "stearingWheel=" + stearingWheel.toString() +
                ", engine=" + engine.toString() +
                ", HorsePower=" + HorsePower +
                ", Year=" + Year +
                '}';
    }
}
