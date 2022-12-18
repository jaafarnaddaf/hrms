package com.livelightlabs.hrms.document.system;

import com.livelightlabs.hrms.document.BaseDocument;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
public class CalendarEvent extends BaseDocument {
  private Instant start;
  private Instant end;
  private String description;
  private boolean holiday;
  private boolean official;
}
