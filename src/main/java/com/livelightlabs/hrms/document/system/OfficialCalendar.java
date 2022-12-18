package com.livelightlabs.hrms.document.system;

import com.livelightlabs.hrms.document.BaseDocument;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.DayOfWeek;
import java.util.List;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
public class OfficialCalendar extends BaseDocument {
  @DBRef private List<CalendarEvent> events;
  private DayOfWeek weekStart;
  private DayOfWeek weekEnd;
}
