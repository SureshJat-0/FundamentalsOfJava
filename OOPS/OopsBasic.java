package OOPS;

class Student {
    Student() {
        System.out.println("I am a constructer");
    }
    String name;
    int age;

    public void printName() {
        System.out.println(this.name);
    }
    public void printAge() {
        System.out.println(this.age);
    }
}

class Pen {
    String type;
    int price;

    Pen (String type, int price) {
        this.type = type;
        this.price = price;
    }
    public void printInfo() {
        System.out.println(this.type);
        System.out.println(this.price);
    }
}

public class OopsBasic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Suresh";
        s1.age = 19;
        System.out.println(s1.name);
        System.out.println(s1.age);

        Pen pen = new Pen("Gel", 10);
        pen.printInfo();
    }
}
