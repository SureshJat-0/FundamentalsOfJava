package OOPS;

abstract class phoneModel {

    public phoneModel() {
        System.out.println("I am a basic templete of phoneModel ");
    }

    abstract public void switchOn();

    abstract public void ringTone();
}

// This class compulsory cointains abstract methods of abstract class
// Other wise this class should be abstract class

class samsung extends phoneModel {
    public samsung() {
        System.out.println("I am samsung phone");
    }

    public void switchOn() {
        System.out.println("Switching off samsung phone");
    }

    public void ringTone() {
        System.out.println("Ringing samsung phone");
    }
}

class onePlus extends phoneModel {
    public onePlus() {
        System.out.println("I am One Plus phone");
    }

    public void switchOn() {
        System.out.println("Switching off One Plus phone");
    }

    public void ringTone() {
        System.out.println("Ringing One Plus phone");
    }
}

// If you want to extends abstract class but dont want to impliment method then
// you have to declate this class to abstract class

abstract class anotherPhone extends phoneModel {
    public anotherPhone() {
        System.out.println("I am another phone model");
    }
}

public class abstractLearn {
    public static void main(String[] args) {

        // We can't make object of abstract class
        // phoneModel pm = new phoneModel(); --> error <--

        samsung s = new samsung();
        s.switchOn();
        s.ringTone();

        // onePlus op = new onePlus();
        // op.switchOn();
        // op.ringTone();

    }
}