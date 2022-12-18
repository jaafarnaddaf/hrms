package com.livelightlabs.hrms.document.benefit;

import com.livelightlabs.hrms.bean.FullName;
import com.livelightlabs.hrms.document.employee.Gender;
import com.livelightlabs.hrms.document.employee.RelationType;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Dependent {
  private FullName name;
  private RelationType relationType;
  private Gender gender;
  private String nationalId;
  private LocalDate birthDate;
}
