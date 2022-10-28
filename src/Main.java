import _07102022.hero.Elf4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void getIterate() {
        int count = 0;

        for (int i = 0; i < 164;) {
            i = i + (5-1);
            count++;
        }

        System.out.println(count);
    }

    public static void bus() {
        double distance = 15;
        double speed = 42;
        int busDrivingTime = 0;
        //todo написать как вычислить расстояние
        double every30secDistanceKm = 0;

        for (double i = 0; i <= distance;) {
            every30secDistanceKm += 0.3501d;
            i = every30secDistanceKm;
            busDrivingTime += 30;

            System.out.println("Время движения автобуса = " + busDrivingTime + " секунд.");
            System.out.println("Пройденное расстояние = " + every30secDistanceKm + " км.");
        }
        System.out.println("Общее время движения автобуса = " + distance / speed + " часов.");
    }

    public static void getNewArray() {
        int count = 0;
        int[] array = {12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21};
        for (int k : array) {
            if (k % 2 != 0) {
                count++;
            }
        }

        int[] newArray = new int[count];

        int index = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                newArray[index] = j;
                index++;
            }
        }
        int max = Arrays.stream(newArray).max().getAsInt();

        System.out.println("Max value (lazy)= " + getMaxLazy(newArray));
        System.out.println("Max value (right)= " + getMaxRight(newArray));
        System.out.println("Max value (stream)= " + max);
        System.out.println(Arrays.toString(newArray));
    }

    public static void getNewArrayList() {
        List<Integer> list  = new ArrayList<>();
        int[] array = {12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21};
        for (int j : array) {
            if (j % 2 != 0) {
                list.add(j);
            }
        }

        System.out.println("Max value (lazy)= " + getMaxLazyList(list));
        System.out.println(list);
    }

    private static int getMaxLazy(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    private static int getMaxLazyList(List<Integer> list) {
        Collections.sort(list);
        return list.get(list.size()-1);
    }

    private static int getMaxRight(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
      // getIterate();
       //bus();

        getNewArray();
    }
}