package com.livelightlabs.hrms.document.approval;

import com.livelightlabs.hrms.document.employee.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApprovalStep {
  private Instant creationDate;
  private Instant modificationDate;
  private ApprovalStatus status;
  @DBRef private Employee approver;
}
