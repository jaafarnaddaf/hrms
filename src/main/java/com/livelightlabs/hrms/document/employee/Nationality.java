package com.livelightlabs.hrms.document.employee;

import com.livelightlabs.hrms.document.media.Media;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
public abstract class Nationality {
  private CitizenshipType type;
  private boolean active;
  private String ssn;
  private String taxNumber;
  @DBRef private List<Media> documents;
}
