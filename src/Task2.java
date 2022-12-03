//        Пусть дан произвольный список целых чисел, удалить из него четные числа


import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(1000);
        System.out.println(size);
        ArrayList<Integer> myList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) { //Генерирую список
            myList.add(rand.nextInt(10000));
        }
        System.out.println(myList);

        int current = 0;
        int last = size - 1;
        int temp = 0;

        while (last > current) {
            if (myList.get(current) % 2 == 0) {
                temp = myList.get(current);
                myList.set(current, myList.get(last));
                myList.set(last, temp);
                last--;
            }
            else {
                current++;
            }
        }
        System.out.println(current);
        System.out.println(myList);

        System.out.println(myList.subList(0, current + 1)); // сокращаю список
    }
}
