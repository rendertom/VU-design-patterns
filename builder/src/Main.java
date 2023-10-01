import builders.ComputerBuilder;
import director.Director;
import products.Computer;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    ComputerBuilder builder = new ComputerBuilder();

    director.buildLowClass(builder);
    Computer computer1 = builder.getResult();
    System.out.println("Low level comp specs: " + computer1.getSpecs());

    director.buildMidClass(builder);
    Computer computer2 = builder.getResult();
    System.out.println("Mid level comp specs: " + computer2.getSpecs());

    director.buildTopClass(builder);
    Computer computer3 = builder.getResult();
    System.out.println("Top level comp specs: " + computer3.getSpecs());
  }
}