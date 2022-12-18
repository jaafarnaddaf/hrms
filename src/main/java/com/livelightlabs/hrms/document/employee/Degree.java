package com.livelightlabs.hrms.document.employee;

import com.livelightlabs.hrms.document.media.Media;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDate;
import java.util.List;

@Data
public class Degree {
  private String institute;
  private DegreeType type;
  private String major;
  private double gpa;
  private LocalDate startDate;
  private LocalDate endDate;
  @DBRef private List<Media> documents;
}
