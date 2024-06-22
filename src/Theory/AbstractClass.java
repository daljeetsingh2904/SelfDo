package Theory;

/**
 * ->A class declared with abstract keyword is called abstarct class ->It can
 * have abstract and non abstract method ->Abstraction is process of hiding the
 * implementation details and showing only functionality to user
 */
abstract class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Implementation of abstract method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }
}

class Cat extends Animal {

    // Constructor
    public Cat(String name) {
        super(name);
    }

    // Implementation of abstract method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.makeSound();  // Buddy says: Woof Woof
        dog.eat();        // Buddy is eating.

        cat.makeSound();  // Whiskers says: Meow
        cat.eat();        // Whiskers is eating.
    }
}


