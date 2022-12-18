package com.livelightlabs.hrms.document.system;

import com.livelightlabs.hrms.document.user.UserType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class AccessRight {
  @DBRef private UserType userType;
  private boolean read;
  private boolean write;
  private boolean delete;
  private boolean approvalRequired;
}
