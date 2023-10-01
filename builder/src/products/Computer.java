package products;

import components.ClassType;

public class Computer {
  private ClassType classType;
  private String cpu;
  private String gpu;
  private String memory;
  private String storage;

  public Computer(ClassType classType, String cpu, String memory, String storage, String graphicsCard) {
    this.classType = classType;
    this.cpu = cpu;
    this.gpu = graphicsCard;
    this.memory = memory;
    this.storage = storage;
  }

  public String getSpecs() {
    return
      "Class: " + classType + ", " +
      "CPU: " + this.cpu + ", " +
      "GPU: " + gpu + ", " +
      "Memory: " + memory + ", " +
      "Storage: " + storage;
  }
}