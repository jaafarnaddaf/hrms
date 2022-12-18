package com.livelightlabs.hrms.document.system;

import com.livelightlabs.hrms.document.BaseDocument;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
public class Variables extends BaseDocument {
  private Long personalHours = 112L;
  private Long sickHours = 112L;
  private Long seniorityHours = 56L;
}
