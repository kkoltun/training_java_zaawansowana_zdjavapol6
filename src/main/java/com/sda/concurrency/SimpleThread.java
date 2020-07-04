package com.sda.concurrency;

public class SimpleThread implements Runnable {
  private final String name;
  private final long interval;

  public SimpleThread(String name, long interval) {
    this.name = name;
    this.interval = interval;
  }

  public void run() {
    for (int i = 0; i < 10; ++i) {
      System.out.println("Thread #" + i + ": " + name);

      try {
        Thread.sleep(interval);
      } catch (InterruptedException exception) {
        System.out.println("Thread " + name + " was interrupted.");
      }
    }
  }
}
