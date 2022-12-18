package com.livelightlabs.hrms.document.employee;

import com.livelightlabs.hrms.document.geography.Language;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class SpokenLanguage {
  @DBRef private Language language;
  private LanguageLevel level;
}
