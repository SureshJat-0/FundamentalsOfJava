package OOPS;

class MyBase {
    MyBase() {
        System.out.println("I am constructor of Base class");
    }
    MyBase(int x) {
        System.out.println("I am contructor of Base with value of x as :" + x);
    }
}

class MyDerived extends MyBase{
    MyDerived() {
        System.out.println("I am constuctor of Derived class");
    }
    MyDerived(int x, int y) {
        super(x);  // super will call the parant class constructor which have 1 atributs
        System.out.println("I am Derived class constuctor with value of y as :" + y);
    }
}

class MyChild extends MyDerived {
    MyChild() {
        System.out.println("I am Child class constructor");
    }
    MyChild(int x, int y, int z) {
        super(x, y); // super will call the parant class constructor which have 2 atributs
        System.out.println("I am MyChild constuctor with value of z as :" + z);
    }
}

public class constructorInheritance {
    public static void main(String[] args) {
        // MyBase class constuctor

        // MyBase b = new MyBase();
        // MyBase b2 = new MyBase(15);


        // MyDerived class constuctor

        // MyDerived d = new MyDerived();
        // MyDerived d2 = new MyDerived(10, 16);

        // MyChild class constuctor
        // MyChild c = new MyChild();
        MyChild c2 = new MyChild(14, 15, 17);


    }
}
