package curs2.CodeChallenge.Challenge3;

public class TestAnimals {
  Fish d = new Fish();
  Cat c = new Cat("Fluffy");
  Animal a = new Fish();
  Animal e = new Spider();
  Pet p = new Cat();
  Animal cat = new Cat();

  public static void main(String[] args) {
    TestAnimals t = new TestAnimals();
    System.out.println(t.cat.legs);
    System.out.println(t.c.name);
  }
}
