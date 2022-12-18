package com.livelightlabs.hrms.document.system;

import com.livelightlabs.hrms.document.BaseDocument;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
public class Rules extends BaseDocument {
  private List<TypeRule> typeRules;
  private ApprovalRules rules;
}