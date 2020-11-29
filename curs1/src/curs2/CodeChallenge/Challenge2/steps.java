package curs2.CodeChallenge.Challenge2;

public class steps {
  public static void main(String[] args) {
    Premiu oscar1990 = new Premiu("oscar", 1990);
    Premiu oscar2000 = new Premiu("oscar", 2000);
    Premiu oscar2010 = new Premiu("oscar", 2010);
    Premiu oscar2018 = new Premiu("oscar", 2018);

    Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
    Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
    Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
    Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
    Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
    Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new Premiu[]{});

    Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
    Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
    Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

    Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
    Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

    Studio[] studioDatabase = new Studio[]{studio1, studio2};

// getting all studio names that have published more than 2 movies
    String studios1="";
    for (Studio s : studioDatabase) {
      if (s.filme.length > 2) {
        if (studios1.isEmpty())
          studios1 += s.nume;
        else
          studios1 =studios1+", " + s.nume;
      }
    }
    System.out.println("Studiourile care au mai mult de 2 filme publicate sunt: " + studios1+".");

//Getting the studio names in witch plays the actor with name “actor cu 2 oscaruri”
    String studios2="";
    for (Studio s : studioDatabase) {
      for (Film f : s.filme) {
        for (Actor a : f.actori) {
          if (a.nume == "actor cu 2 oscaruri") {
            if (studios2.isEmpty())
              studios2 += s.nume;
            else
              studios2 += ", " + s.nume;
          }
        }
      }
    }
    System.out.println("Numele studiourilor in care a jucat actorul cu numele “actor cu 2 oscaruri” sunt: " + studios2+".");

//Getting movie names in witch plays at least an actor with age above 50
    String filme1="";
    for (Studio s : studioDatabase) {
      for (Film f : s.filme) {
        for (Actor a : f.actori) {
          if (a.varsta > 50) {
            if (filme1.isEmpty())
              filme1 += f.nume;
            else
              filme1 += ", " + f.nume;
            break;
          }
        }
      }
    }
    System.out.println("Numele filmelor in care a jucat cel putin un actor cu varsta peste 50 de ani sunt: "+ filme1+".");
  }
}