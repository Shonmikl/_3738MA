package _07102022.hero;

/**
 * Class
 * Fields
 * Constructors
 * Methods
 */
public class Elf4 {
    private int id;
    private String nickName;

    public Elf4() {
    }

    public Elf4(int id) {
        this.id = id;
    }

    public Elf4(String nickName) {
        this.nickName = nickName;
    }

    public Elf4(int id, String nickName) {
        this.id = id;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Elf4{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}