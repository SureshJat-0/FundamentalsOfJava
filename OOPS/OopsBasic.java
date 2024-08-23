package OOPS;

class Student {
    Student() {
        System.out.println("This is a constructer");
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

public class OopsBasic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Suresh";
        s1.age = 19;
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
