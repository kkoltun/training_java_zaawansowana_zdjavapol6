package com.sda.post.office;

enum PackageStatus {
  SENT("Package has been sent!", 300) {
    @Override
    public PackageStatus[] getNextStatuses() {
      return new PackageStatus[] { TRAVELLING, LOST };
    }
  },
  TRAVELLING("Package is travelling!", 301) {
    @Override
    public PackageStatus[] getNextStatuses() {
      return new PackageStatus[] { COURIER, LOST };
    }
  },
  COURIER("Package is handled by the courier!", 302) {
    @Override
    public PackageStatus[] getNextStatuses() {
      return new PackageStatus[] { DELIVERED, LOST, RETURNED };
    }
  },
  DELIVERED("Package has been delivered", 200) {
    @Override
    public PackageStatus[] getNextStatuses() {
      return new PackageStatus[0];
    }
  },
  LOST("Package has been lost", 400) {
    @Override
    public PackageStatus[] getNextStatuses() {
      return new PackageStatus[0];
    }
  },
  RETURNED("Package has been returned", 303) {
    @Override
    public PackageStatus[] getNextStatuses() {
      return new PackageStatus[0];
    }
  };

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

  public abstract PackageStatus[] getNextStatuses();

  @Override
  public String toString() {
    return "PackageStatus{" +
        "message='" + message + '\'' +
        ", code=" + code +
        '}';
  }
}
