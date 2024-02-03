package school.Lesson1;

public class Task3 {
    public void printColor() {
        int value = 0;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }else {
            System.out.println("Зелёный");
        }
    }
}
