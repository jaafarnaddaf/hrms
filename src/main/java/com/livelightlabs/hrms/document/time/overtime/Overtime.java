package com.livelightlabs.hrms.document.time.overtime;

import com.livelightlabs.hrms.document.approval.Approval;
import com.livelightlabs.hrms.document.approval.ApprovalStatus;
import com.livelightlabs.hrms.document.employee.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public abstract class Overtime {
  private Instant startDate;
  private Instant endDate;
  private ApprovalStatus status;
  private String description;
  @DBRef private Employee employee;
  @DBRef private Approval approval;
}
