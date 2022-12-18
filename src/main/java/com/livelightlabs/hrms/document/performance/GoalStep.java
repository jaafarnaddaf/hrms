package com.livelightlabs.hrms.document.performance;

import com.livelightlabs.hrms.document.approval.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoalStep {
  private Instant creationDate;
  private Instant modificationDate;
  private ApprovalStatus approvalStatus;
  private GoalStatus status;
  private String description;
}
