package com.livelightlabs.hrms.document.employee;

import com.livelightlabs.hrms.document.geography.Country;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.DBRef;

@EqualsAndHashCode(callSuper = true)
@Data
public class Citizenship extends Nationality {
  @DBRef private Country country;
  private String idNumber;
  private String nationalNumber;

  public Citizenship() {
    this.setType(CitizenshipType.CITIZEN);
  }
}
