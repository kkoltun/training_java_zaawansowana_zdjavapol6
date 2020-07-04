package com.sda.concurrency.synchronization.synch;

public class Counter {
  private int value = 0;

  synchronized void increment() {
    int incremented = value + 1;
    value = incremented;
  }

  synchronized void decrement() {
    int decremented = value - 1;
    value = decremented;
  }

  int getValue() {
    return value;
  }
}
