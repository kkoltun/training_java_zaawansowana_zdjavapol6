package com.sda.concurrency.synchronization.nonsynch;

public class NonSynchApp {
  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();
    long repetitions = 10_000_000;

    Runnable incrementRunnable = () -> {
      for (int i = 0; i < repetitions; ++i) {
        counter.increment();
      }
    };

    Runnable decrementRunnable = () -> {
      for (int i = 0; i < repetitions; ++i) {
        counter.decrement();
      }
    };

    Thread incrementThread = new Thread(incrementRunnable);
    Thread decrementThread = new Thread(decrementRunnable);

    incrementThread.start();
    decrementThread.start();

    incrementThread.join();
    decrementThread.join();

    System.out.println("Final value: " + counter.getValue());
  }
}
