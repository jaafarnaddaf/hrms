package com.livelightlabs.hrms.document.employee;

import com.livelightlabs.hrms.document.classification.Branch;
import com.livelightlabs.hrms.document.classification.Department;
import com.livelightlabs.hrms.document.classification.Position;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employment {
  private LocalDate startDate;
  private LocalDate endDate;
  private boolean active;
  private EmploymentStatus status;
  @DBRef private Department department;
  @DBRef private Position position;
  @DBRef private Branch branch;
}
