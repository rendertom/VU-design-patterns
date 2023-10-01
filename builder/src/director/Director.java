package director;

import builders.Builder;
import components.ClassType;

public class Director {
  public void buildLowClass(Builder builder) {
    builder.setClass(ClassType.LOW);
    builder.setCPU("8-core");
    builder.setGPU("8-core");
    builder.setMemory("8 GB");
    builder.setStorage("256 GB");
  }

  public void buildMidClass(Builder builder) {
    builder.setClass(ClassType.MID);
    builder.setCPU("10-core");
    builder.setGPU("10-core");
    builder.setMemory("16 GB");
    builder.setStorage("500 GB");
  }

  public void buildTopClass(Builder builder) {
    builder.setClass(ClassType.TOP);
    builder.setCPU("12-core");
    builder.setGPU("24-core");
    builder.setMemory("32 GB");
    builder.setStorage("2 TB");
  }
}
