package com.livelightlabs.hrms.document.employee;

import com.livelightlabs.hrms.bean.FullName;
import com.livelightlabs.hrms.document.geography.Address;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class BasicInformation {
  private String number;
  private Title title;
  private FullName name;
  private LocalDate birthDate;
  private LocalDate hiringDate;
  private Gender gender;
  private MaritalStatus maritalStatus;
  private List<Citizenship> citizenships;
  private List<Residency> residencies;
  private Address address;
}
