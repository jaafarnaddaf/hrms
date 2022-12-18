package com.livelightlabs.hrms.document.system;

import com.livelightlabs.hrms.document.BaseDocument;
import lombok.Data;

import java.util.List;

@Data
public class TypeRule<T extends BaseDocument> {
  private T type;
  private List<AccessRight> accessRights;
}