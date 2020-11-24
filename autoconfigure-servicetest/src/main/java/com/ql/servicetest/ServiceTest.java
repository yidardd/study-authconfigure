package com.ql.servicetest;

import lombok.Data;

/**
 * @ClassName ServiceTest @Description ServiceTest @Author stack @Version 1.0
 *
 * @since 2019/6/26 22:21
 */
@Data
public class ServiceTest {

  public String whoami() {
    return "我是你永远得不到的爸爸..";
  }
}
