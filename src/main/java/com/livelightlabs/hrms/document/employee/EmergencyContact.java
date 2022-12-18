package com.livelightlabs.hrms.document.employee;

import com.livelightlabs.hrms.bean.FullName;
import com.livelightlabs.hrms.document.geography.PhoneNumber;
import lombok.Data;

@Data
public class EmergencyContact {
  private Title title;
  private FullName name;
  private PhoneNumber phoneNumber;
  private RelationType relationType;
}
