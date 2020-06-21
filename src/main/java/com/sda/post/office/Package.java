package com.sda.post.office;

import java.util.UUID;

class Package {
  private final String description;
  private final String id;

  private PackageStatus status;

  Package(String description) {
    this.description = description;
    this.id = UUID.randomUUID().toString();
    this.status = PackageStatus.SENT;
  }

  void changeStatus(PackageStatus newStatus) {
    this.status = newStatus;
  }

  public String getDescription() {
    return description;
  }

  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Package{" +
        "description='" + description + '\'' +
        ", id='" + id + '\'' +
        ", status=" + status +
        '}';
  }
}
