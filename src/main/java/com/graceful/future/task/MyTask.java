package com.graceful.future.task;

import java.util.concurrent.Callable;

/**
 * @author chenkun
 * @version 1.0
 * @description 自定义任务类
 * @date 2022/1/6 9:49
 */
public class MyTask implements Callable<String> {
    public String call() {
        return getClass().getSimpleName();
    }
}
