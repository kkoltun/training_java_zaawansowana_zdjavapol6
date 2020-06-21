package com.sda.post.office;

enum PackageStatus {
  SENT("Package has been sent!", 300),
  TRAVELLING("Package is travelling!", 301),
  COURIER("Package is handled by the courier!", 302),
  DELIVERED("Package has been delivered", 200),
  LOST("Package has been lost", 400),
  RETURNED("Package has been returned", 303);

  private final String message;
  private final int code;

  PackageStatus(String message, int code) {
    this.message = message;
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public int getCode() {
    return code;
  }

  @Override
  public String toString() {
    return "PackageStatus{" +
        "message='" + message + '\'' +
        ", code=" + code +
        '}';
  }
}
