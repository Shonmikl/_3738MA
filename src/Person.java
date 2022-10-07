public class Person {
    String name;
    int age;
    Ball ball;

    /**  Тип данных   имя(ссылка на объект)  = создание объекта    конструктор
     *     Person     person                 =      new            Person();
     */

    public Person(String name, int age, Ball ball) {
        this.name = name;
        this.age = age;
        this.ball = ball;
    }
}
