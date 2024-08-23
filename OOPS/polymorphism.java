package OOPS;

class Employee {
    String name;
    String age;

    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.printInfo("Suresh");
        e1.printInfo(19);
        e1.printInfo("Suresh", 19);
    }
    
}