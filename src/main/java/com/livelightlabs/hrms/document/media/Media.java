package com.livelightlabs.hrms.document.media;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Media {
  private String code;
  private String path;
}
