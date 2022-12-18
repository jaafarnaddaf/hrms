package com.livelightlabs.hrms.document.system;

import com.livelightlabs.hrms.document.approval.ApprovalPath;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class ApprovalRules {
  @DBRef private ApprovalPath benefits;
  @DBRef private ApprovalPath benefitDependents;
  @DBRef private ApprovalPath companyStructure;
  @DBRef private ApprovalPath employees;
  @DBRef private ApprovalPath assessments;
  @DBRef private ApprovalPath goals;
  @DBRef private ApprovalPath goalProgress;
  @DBRef private ApprovalPath performance;
  @DBRef private ApprovalPath leaves;
  @DBRef private ApprovalPath overtime;
}
