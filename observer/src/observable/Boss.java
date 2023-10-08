package observable;

public class Boss extends Observable {
  public void announceImportantNews() {
    notify("Important announcement from the boss!");
  }
}
