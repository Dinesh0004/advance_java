package advance_java1;

class Animal {// the parent  class created 
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal { //the child class created 
    void makeSound() //overridden class
    {
        System.out.println("The dog barks.");
    }
}

class Cat extends Dog {//the child class created 
    void makeSound() //overridden class 
    {
        System.out.println("The cat meows.");
    }
}
public class lab3_2 {
	public static void main(String[] args) {
        Animal a = new Animal();// the object created for the class
        Dog d = new Dog();
        Cat c = new Cat();

        a.makeSound();
        d.makeSound();
        c.makeSound();
    }
}
