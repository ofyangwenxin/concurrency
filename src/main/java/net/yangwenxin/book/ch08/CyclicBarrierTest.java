package net.yangwenxin.book.ch08;

import lombok.SneakyThrows;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    static CyclicBarrier c = new CyclicBarrier(2, new A());

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(3000);
                c.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(1);
        }).start();

        try {
            Thread.sleep(3000);
            c.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(2);
    }

    static class A implements Runnable {

        @SneakyThrows
        @Override
        public void run() {
            System.out.println(3);
            Thread.sleep(3000);
        }
    }
}
