package day11.task1;

public class Courier implements Worker {
    private int salary;
    private static final int SALARY_JOB = 100;
    private static final int BONUS_JOB = 50000;
    private boolean isPlayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += SALARY_JOB;
        warehouse.addCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
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
        return "Courier{" +
                "salary=" + salary +
                ", isPlayed=" + isPlayed +
                '}';
    }
}
