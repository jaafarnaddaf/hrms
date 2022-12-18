package com.livelightlabs.hrms.document;

import com.livelightlabs.hrms.document.approval.ApprovalStatus;
import com.livelightlabs.hrms.document.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.*;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseDocument {
  @Id private String id;
  @CreatedDate private Instant createdTime;
  @LastModifiedDate private Instant modifiedTime;
  @CreatedBy private User createdBy;
  @LastModifiedBy private User modifiedBy;
  private ApprovalStatus approvalStatus;
}
