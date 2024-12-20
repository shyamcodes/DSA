
public class Super {
  public static void main(String[] args) {
    Horse h = new Horse();
    System.out.println(h.color);
  }
}

class Animal {
  String color;

  Animal() {
    System.out.println("Animal constructor called...");
  }
}

class Horse extends Animal {
  Horse() {
    super.color = "white";
    System.out.println("Horse constructor called...");
  }
}

// // Parent class
// class Animal {
// String name;

// // Constructor
// Animal(String name) {
// this.name = name;
// }

// // Method
// void sound() {
// System.out.println("Animals make sounds.");
// }
// }

// // Child class
// class Dog extends Animal {

// // Constructor
// Dog(String name) {
// super(name); // Call the parent class constructor
// }

// // Overriding method
// @Override
// void sound() {
// super.sound(); // Call the parent class method
// System.out.println(name + " barks.");
// }
// }

// // Main class
// public class Main {
// public static void main(String[] args) {
// Dog dog = new Dog("Buddy");
// dog.sound();
// }
// }
