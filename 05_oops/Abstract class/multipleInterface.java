public class multipleInterface {
  public static void main(String[] args) {
    Beer b = new Beer();
    b.eatGrass();
    b.eatMeat();
  }

}

interface Herbivore {
  void eatGrass();
}

interface Carbivore {
  void eatMeat();
}

class Beer implements Herbivore, Carbivore {
  public void eatGrass() {
    System.out.println("Eat Grass...");
  }

  public void eatMeat() {
    System.out.println("Eat Meat...");
  }
}