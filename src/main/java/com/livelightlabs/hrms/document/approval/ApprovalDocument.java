package com.livelightlabs.hrms.document.approval;

import com.livelightlabs.hrms.document.BaseDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class ApprovalDocument<T extends BaseDocument> {
  @DBRef private Approval approval;
  @DBRef private T document;
}
