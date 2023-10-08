import observable.Boss;
import observable.Secretary;
import observer.Designer;
import observer.Developer;

public class Main {
  public static void main(String[] args) {
    Boss boss = new Boss();
    Secretary secretary = new Secretary();

    Developer alice = new Developer("Alice");
    alice.subscribeTo(boss);
    alice.subscribeTo(secretary);

    Developer bob = new Developer("Bob");
    bob.subscribeTo(boss);
    bob.subscribeTo(secretary);

    Designer carol = new Designer("Carol");
    carol.subscribeTo(secretary);

    Designer dave = new Designer("Dave");
    dave.subscribeTo(secretary);


    boss.announceImportantNews();
    secretary.sendMeetingReminder();
  }
}