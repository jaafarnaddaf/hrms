package com.livelightlabs.hrms.document.time;

import com.livelightlabs.hrms.document.BaseDocument;
import com.livelightlabs.hrms.document.employee.Employee;
import com.livelightlabs.hrms.document.time.leave.Leave;
import com.livelightlabs.hrms.document.time.overtime.Overtime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Duration;
import java.util.List;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class TimeBalance extends BaseDocument {
  @DBRef private Employee employee;
  private Duration annualTotal;
  private Duration sickTotal;
  private Duration annualLeft;
  private Duration sickLeft;
  @DBRef private List<Leave> leaves;
  @DBRef private List<Overtime> overtimes;
}
