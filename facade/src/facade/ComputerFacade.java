package facade;

import subsystem.CPU;
import subsystem.HD;
import subsystem.RAM;

public class ComputerFacade {
  private CPU cpu;
  private RAM ram;
  private HD hd;

  public ComputerFacade() {
    this.cpu = new CPU();
    this.ram = new RAM();
    this.hd = new HD();
  }

  public void start() {
    System.out.println("Starting the computer...");
    cpu.freeze();
    ram.load(0, hd.read(0, 1024));
    cpu.jump(0);
    cpu.execute();
    System.out.println("Computer has started.");
  }
}
