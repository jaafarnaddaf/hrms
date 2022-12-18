package com.livelightlabs.hrms.document.performance;

import com.livelightlabs.hrms.document.BaseDocument;
import com.livelightlabs.hrms.document.approval.Approval;
import com.livelightlabs.hrms.document.employee.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Goal extends BaseDocument {
  @DBRef private Employee employee;
  @DBRef private Approval approval;
  private GoalStatus status;
  private List<GoalStep> steps;
  private double progress;
  private String description;
}
