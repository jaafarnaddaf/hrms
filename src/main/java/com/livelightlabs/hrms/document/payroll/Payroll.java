package com.livelightlabs.hrms.document.payroll;

import com.livelightlabs.hrms.document.BaseDocument;
import com.livelightlabs.hrms.document.employee.Employee;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
public class Payroll extends BaseDocument {
  @DBRef private Employee employee;
  private List<Compensation> compensations;
}
