package com.livelightlabs.hrms.document.employee;

import com.livelightlabs.hrms.bean.FullName;
import com.livelightlabs.hrms.document.BaseDocument;
import com.livelightlabs.hrms.document.geography.PhoneNumber;
import lombok.Data;

@Data
public class EmergencyContact extends BaseDocument {
  private Title title;
  private FullName name;
  private PhoneNumber phoneNumber;
  private RelationType relationType;
  private String employeeId;
}
