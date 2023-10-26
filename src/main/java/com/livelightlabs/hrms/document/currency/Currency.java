package com.livelightlabs.hrms.document.currency;

import com.livelightlabs.hrms.bean.Localization;
import com.livelightlabs.hrms.document.BaseDocument;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
public class Currency extends BaseDocument {
  private String code;
  private double rate;
  private Localization title;
  private boolean base;
}
