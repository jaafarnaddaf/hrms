package com.livelightlabs.hrms.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FullName {
  private Localization title;
  private Localization firstName;
  private Localization secondName;
  private Localization thirdName;
  private Localization lastName;
}
