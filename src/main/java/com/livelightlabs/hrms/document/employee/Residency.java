package com.livelightlabs.hrms.document.employee;

import com.livelightlabs.hrms.document.geography.Country;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class Residency extends Nationality {
  @DBRef private Country country;
  private String residencyId;
  private boolean permanent;
  private LocalDate startDate;
  private LocalDate endDate;

  public Residency() {
    this.setType(CitizenshipType.RESIDENT);
  }
}
