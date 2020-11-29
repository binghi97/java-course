package curs2.CodeChallenge.Challenge3;

public class Fish extends Animal implements Pet{
  String name;

  public Fish(String name) {
    super(0);
    this.name = name;
  }

  public Fish() {
    super(0);
  }

  @Override
  public void walk() {
    System.out.println("The fish cannot walk.");
  }

  @Override
  public void eat() {
    System.out.println("Bloap Bloap");
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void play() {
    System.out.println("The fish" + this.name + " is playing ...");
  }
}
