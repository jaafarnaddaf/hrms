package com.livelightlabs.hrms.document.approval;

import com.livelightlabs.hrms.document.employee.Employee;
import com.livelightlabs.hrms.document.user.UserType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
public class ApprovalNode {
  private ApprovalNode next;
  private List<ApprovalNode> and;
  private List<ApprovalNode> or;
  @DBRef private UserType userType;
  @DBRef private Employee employee;
}
