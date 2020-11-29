package curs2.CodeChallenge.Challenge1;

public class Fighter {
  public String name;
  public int health;
  public int damagePerAttack;

  public Fighter(String name, int health, int damagePerAttack){
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }

  public void attack(Fighter f){
    f.health-=this.damagePerAttack;
  }
}
