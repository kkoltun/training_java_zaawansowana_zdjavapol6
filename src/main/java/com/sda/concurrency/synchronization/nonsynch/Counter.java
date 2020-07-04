package com.sda.concurrency.synchronization.nonsynch;

public class Counter {
  private int value = 0;

  void increment() {
    int incremented = value + 1;
    value = incremented;
  }

  void decrement() {
    int decremented = value - 1;
    value = decremented;
  }

  int getValue() {
    return value;
  }
}
