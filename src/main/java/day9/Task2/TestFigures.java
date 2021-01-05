package day9.Task2;
//Первый метод, принимая на вход массив геометрических фигур, должен вернуть сумму
//        периметров красных фигур. Второй метод, принимая на вход массив геометрических фигур,
//        должен вернуть сумму площадей красных фигур.
//        Вызовите эти два метода на массиве figures и выведите результат в консоль.
public class TestFigures {
    public static void main(String[] args) {
        Circle circle = new Circle(11, "Red");
        Rectangle rectangle = new Rectangle(2, 3, "Green");
        Triangle triangle = new Triangle(3, 8, 4, "Black");
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("Red")) {
                sum += figures[i].perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("Red")) {
                sum += figures[i].area();
            }
        }
        return sum;
    }

}
