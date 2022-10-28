import _07102022.hero.Elf4;

public class Main {
    public static void getIterate(int floorNumber) {
        int count = 0;
        int floor = 0;

        for (int i = floor; i < floorNumber;) {
            floor = floor + 4;
            count++;
        }

        if(floorNumber %4 !=0) {
            count++;
        }

        System.out.println(count);
    }
    public static void main(String[] args) {
       getIterate(163);
    }
}