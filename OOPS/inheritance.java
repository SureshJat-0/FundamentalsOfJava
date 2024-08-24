package OOPS;

class Base {
    int x;

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return this.x;
    }
}

// 1. Single inheritance (if we only consider Base and Derived class )
class Derived extends Base{
    int y;
    
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return this.y;
    }
}

// 2. Multi-level inheritence (considering Base, Derived and child1 classes )
class Child1 extends Derived {

    public void printMe() {
        System.out.println("This is a Child class");
    }
}

// 3. Hierarchical inheritance (condidering Derived, child1 and child2 )
class Child2 extends Derived {

    public void printme() {
        System.out.println("This is another child of Derived class");
    }
}


public class inheritance {
    public static void main(String[] args) {

        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        Derived d = new Derived();
        // We can use methods and variable of Base class in Derived class (Acces modifier)
        d.setX(10);
        System.out.println(d.getX());

        d.setY(27);
        System.out.println(d.getY());
        
    }
}
