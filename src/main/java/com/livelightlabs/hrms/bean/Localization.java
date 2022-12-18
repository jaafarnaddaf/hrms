package com.livelightlabs.hrms.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Localization {
  private String arabic;
  private String english;

  public Localization(String english) {
    this.english = english;
  }

  public Localization(String english, boolean duplicate) {
    this.english = english;
    if (duplicate) {
      this.arabic = english;
    }
  }
}
