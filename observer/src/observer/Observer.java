package observer;

import observable.Observable;

public abstract class Observer {
  private final String name;

  public Observer(String name){
    this.name = name;
  }

  public void update(String message) {
    System.out.println(name + ": Received message - " + message);
  }

  public void subscribeTo(Observable observable) {
    observable.addObserver(this);
  }
}
