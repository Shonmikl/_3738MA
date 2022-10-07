public class Person1 {
    String name;
    int age;
    Ball ball;

    /**  Тип данных   имя(ссылка на объект)  = создание объекта    конструктор
     *     Person     person                 =      new            Person();
     */

    public Person1(String name, int age, Ball ball) {
        this.name = name;
        this.age = age;
        this.ball = ball;
    }

    public Person1(int age, Ball ball) {
        this.age = age;
        this.ball = ball;
    }

    public Person1() {
    }

    void getSmth() {
        System.out.println("!!!!!");
    }
}
