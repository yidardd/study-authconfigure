package com.ql.callableTest;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.*;

/**
 * @ClassName TestExcutor
 * @Description TestExcutor
 * @Author stack
 * @Version 1.0
 * @since 2019/6/29 19:34
 */
@Component
public class TestExcutor {

    private ExecutorService executor;

    private final int THREAD_SIZE = 8;

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
