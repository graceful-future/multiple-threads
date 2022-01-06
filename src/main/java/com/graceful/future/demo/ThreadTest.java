package com.graceful.future.demo;

/**
 * @author chenkun
 * @version 1.0
 * @description 线程测试类
 * @date 2022/1/6 10:10
 */
public class ThreadTest {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("========Thread========");
            }
        }.start();
        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("=======Runnable=======");
        }).start();
        System.out.println("---------------");
    }
}
