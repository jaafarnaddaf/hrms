package com.livelightlabs.hrms.document.benefit;

import com.livelightlabs.hrms.document.BaseDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public abstract class Benefit extends BaseDocument {
  private Instant startDate;
  private Instant endDate;
}
