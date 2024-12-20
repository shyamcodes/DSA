
public class AbstractClass {
  public static void main(String[] args) {
    // Horse h = new Horse();
    // h.eat();
    // h.walk();
    // System.out.println(h.color);

    Chicken c = new Chicken();
    // c.eat();
    // c.walk();

  }
}

abstract class Animal {
  String color;

  // Animal() {
  // color = "brown";
  // }

  Animal() {
    System.out.println("animal consructor called...");
  }

  // func with implementation.
  void eat() {
    System.out.println("animal eats...");
  }

  // func with non-implementation. it's a idea only
  abstract void walk();
}

class Horse extends Animal {

  Horse() {
    System.out.println("Horse consructor called...");
  }

  // void changeColor() {
  // color = "dark brown";
  // }

  // Class Horse use this idea given by abstract class.
  void walk() {
    System.out.println("walks on 4 legs...");
  }
}

class Chicken extends Horse {

  Chicken() {
    System.out.println("Chicken consructor called...");
  }

  // void changeColor() {
  // color = "yellow";
  // }

  // Class Chicken use this idea given by abstract class.
  void walk() {
    System.out.println("walks on 2 legs...");
  }
}
