public class Cat {
    private String name;
    private char gender;
    private int age;
    private double weight;
    public Cat(String name, char gender, int age, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
}
