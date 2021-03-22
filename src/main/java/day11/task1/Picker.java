package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int SALARY_JOB = 80;
    private static final int BONUS_JOB = 70000;
    private boolean isPlayed;
    private final Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += SALARY_JOB;
        warehouse.addCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPlayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += BONUS_JOB;
        isPlayed = true;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPlayed=" + isPlayed +
                '}';
    }
}
