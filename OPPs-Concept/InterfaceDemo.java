public class InterfaceDemo {
    public static void main(String[] args) {
        Dog bob = new Dog();
        bob.makeSound();

        Cat tom = new Cat();
        tom.makeSound();
    }
}

interface Animals{
    void makeSound();
}

class Dog implements Animals {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animals {
    public void makeSound() {
        System.out.println("Cat Meow..");
    }
}
