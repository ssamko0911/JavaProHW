package homeworktocheck.hw001pro.task002;

public class Monitor {

    public String model;
    public int id;

    public Monitor(String model, int id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Модель монитора: " + model + ", идентификатор: " + id + ".";
    }
}
