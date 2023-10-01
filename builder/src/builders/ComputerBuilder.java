package builders;

import components.ClassType;
import products.Computer;

public class ComputerBuilder implements Builder {
  private ClassType classType;
  private String cpu;
  private String gpu;
  private String memory;
  private String storage;

  @Override
  public void setClass(ClassType classType) {
    this.classType = classType;
  }

  @Override
  public void setCPU(String cpu) {
    this.cpu = cpu;
  }

  @Override
  public void setGPU(String graphicsCard) {
    this.gpu = graphicsCard;
  }

  @Override
  public void setMemory(String memory) {
    this.memory = memory;
  }

  @Override
  public void setStorage(String storage) {
    this.storage = storage;
  }

  public Computer getResult() {
    return new Computer(classType, cpu, memory, storage, gpu);
  }
}
