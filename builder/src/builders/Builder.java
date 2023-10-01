package builders;

import components.ClassType;

public interface Builder {
  void setClass(ClassType classType);
  void setCPU(String cpu);
  void setGPU(String graphicsCard);
  void setStorage(String storage);
  void setMemory(String memory);
}
