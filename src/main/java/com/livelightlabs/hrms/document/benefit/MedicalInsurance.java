package com.livelightlabs.hrms.document.benefit;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
public class MedicalInsurance extends Benefit {
  @DBRef private List<Dependent> dependents;
}
