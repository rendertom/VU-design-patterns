package subsystem;

public class HD {
  public byte[] read(long lba, int size) {
    System.out.println("HD: reading data from Hard Drive at LBA " + lba + " with size " + size);
    return new byte[size];
  }
}
