import java.util.ArrayList;
import java.util.Random;

//        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(1000);
        System.out.println(size);
        ArrayList <Integer> myList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) { //Генерирую список
            myList.add(rand.nextInt(10000));
        }
        System.out.println(myList);

        int min = myList.get(0);
        int max = myList.get(0);
        int sum = 0;

        for (int i = 0; i < myList.size(); i++) {
            int temp = myList.get(i);
            sum += temp;
            if (temp < min) {
                min = temp;
            } else if (temp > max) {
                max = temp;
            }
        }
        float average = (float) sum / (float) size;
        System.out.printf(String.format("Максимальное значение: %d\nМинимальное значение: %d\nСреднее значение: %f", min, max, average));


    }

}
