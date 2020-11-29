package curs2.CodeChallenge.Challenge1;

public class BoxingMatch {
  public Fighter f1;
  public Fighter f2;

  public BoxingMatch(Fighter f1, Fighter f2){
    this.f1 = f1;
    this.f2 = f2;
  }

  public String fight(){
    while (this.f1.health > 0 &&  this.f2.health > 0){
      this.f1.attack(this.f2);
      this.f2.attack(this.f1);
    }
    if (this.f1.health <= 0)
      return this.f2.name;
    else
      return  this.f1.name;
  }

  public static void main(String[] args) {
    Fighter fighter1 = new Fighter("George", 10, 2);
    Fighter fighter2 = new Fighter("Andrei", 10, 4);
    BoxingMatch match = new BoxingMatch(fighter1,fighter2);
    System.out.println(match.fight());
  }
}
