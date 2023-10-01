package subsystem;

public class RAM {
  public void load(long position, byte[] data) {
    System.out.println("RAM: loading data into memory at position " + position);
  }
}