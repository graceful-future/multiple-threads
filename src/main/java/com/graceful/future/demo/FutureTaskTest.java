package com.graceful.future.demo;

import com.graceful.future.task.MyTask;

import java.util.concurrent.*;

/**
 * @author chenkun
 * @version 1.0
 * @description FutureTask测试类
 * @date 2022/1/6 10:02
 */
public class FutureTaskTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Callable<String> task = new MyTask();
        FutureTask<String> futureTask = new FutureTask<>(task);
        executorService.submit(futureTask);
        System.out.println(futureTask.get());
    }
}
