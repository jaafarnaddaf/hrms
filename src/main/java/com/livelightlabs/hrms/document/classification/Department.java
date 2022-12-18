package com.livelightlabs.hrms.document.classification;

import com.livelightlabs.hrms.bean.Localization;
import com.livelightlabs.hrms.document.BaseDocument;
import com.livelightlabs.hrms.document.employee.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Department extends BaseDocument {
  private String code;
  private Localization name;
  @DBRef private Department department;
  @DBRef private Company company;
  @DBRef private Employee manager;
}
