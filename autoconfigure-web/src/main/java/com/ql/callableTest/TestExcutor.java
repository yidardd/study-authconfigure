package com.ql.callableTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import com.google.common.util.concurrent.ThreadFactoryBuilder;

/**
 * @ClassName TestExcutor @Description TestExcutor @Author stack @Version 1.0
 *
 * @since 2019/6/29 19:34
 */
@Component
public class TestExcutor {

  private final int THREAD_SIZE = 8;
  private ExecutorService executor;

  @PostConstruct
  public void init() {
    ThreadFactory threadFactory = new ThreadFactoryBuilder().setDaemon(true).build();
    executor = Executors.newSingleThreadExecutor(threadFactory);
    //        ThreadPoolExecutor
  }

  // 线程池是否关闭
  public boolean isShutdown() {
    return executor.isShutdown();
  }

  // 提交任务
  public Future<?> submitTask(Callable<?> callable) {
    return executor.submit(callable);
  }
}
