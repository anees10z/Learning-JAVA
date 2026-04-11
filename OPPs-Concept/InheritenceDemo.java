public class InheritenceDemo {
    public static void main(String[] args) {
        Shark s1 = new Shark(2);
        System.out.println(s1.name);
        s1.breathe();
        s1.eats();
        s1.getFin();
        Tuna t1 = new Tuna(3);
        System.out.println(t1.name);
        t1.breathe();
        t1.eats();
        t1.getFin();

        Peacock p1 = new Peacock();
        System.out.println(p1.name);
        p1.breathe();
        p1.eats();
        p1.fly();
    }
}

// base class
class Animal {
    void eats() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

// derived class -> single inheritence
class Fish extends Animal {
    int fin;

    Fish(int fin) {
        this.fin = fin;
    }

    void getFin() {
        System.out.println(fin);
    }
}

// hierarchical inheritence
class Shark extends Fish {
    Shark(int fin) {
        super(fin);
    }

    String name = "Shark";
}

class Tuna extends Fish {
    Tuna(int fin) {
        super(fin);
    }

    String name = "Tuna";
}

class Bird extends Animal {
    void fly() {
        System.out.println("can fly");
    }
}

// multilevel inheritence
class Peacock extends Bird {
    String name = "Peacock";
}
