package com.livelightlabs.hrms.document.performance;

import com.livelightlabs.hrms.document.BaseDocument;
import com.livelightlabs.hrms.document.employee.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Performance extends BaseDocument {
  @DBRef private Employee employee;
  @DBRef private Employee manager;
  private LocalDate startDate;
  private LocalDate endDate;
  private Assessment selfAssessment;
  private Assessment managerAssessment;
  private double result;
}
