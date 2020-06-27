package com.sda.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
  @Test
  public void shouldGetValidArea() {
    // Given
    double x = 5;
    double y = 7;
    double expectedArea = 35;

    Rectangle rectangle = new Rectangle(x, y);

    // When
    double actualArea = rectangle.getArea();

    // Then
    assertEquals(expectedArea, actualArea);
  }
}