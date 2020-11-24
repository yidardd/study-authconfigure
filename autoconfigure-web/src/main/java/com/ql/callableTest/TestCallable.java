package com.ql.callableTest;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestCallable @Description TestCallable @Author stack @Version 1.0
 *
 * @since 2019/6/29 19:30
 */
public class TestCallable implements Callable {

  @Override
  public Object call() throws Exception {

    System.out.println(Thread.currentThread().getName());
    TimeUnit.SECONDS.sleep(6);
    return null;
  }
}
