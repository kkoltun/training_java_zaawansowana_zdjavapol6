package com.sda.concurrency;

public class SimpleThreadApp {
  public static void main(String[] args) throws InterruptedException {
    SimpleThread simpleThread1 = new SimpleThread("one", 1000);
    SimpleThread simpleThread2 = new SimpleThread("two", 500);
    SimpleThread simpleThread3 = new SimpleThread("three", 1500);

    Thread thread1 = new Thread(simpleThread1);
    Thread thread2 = new Thread(simpleThread2);
    Thread thread3 = new Thread(simpleThread3);

    thread1.start();
    thread2.start();
    thread3.start();

    thread1.join();
    thread2.join();
    thread3.join();
  }
}
