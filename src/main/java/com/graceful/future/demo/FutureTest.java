package com.graceful.future.demo;

import com.graceful.future.task.MyTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author chenkun
 * @version 1.0
 * @description Future测试类
 * @date 2022/1/6 9:47
 */
public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(new MyTask());
        System.out.println(future.get());
    }
}
