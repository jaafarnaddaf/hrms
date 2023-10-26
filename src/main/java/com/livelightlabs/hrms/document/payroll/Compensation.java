package com.livelightlabs.hrms.document.payroll;

import com.livelightlabs.hrms.document.currency.Amount;
import com.livelightlabs.hrms.document.employee.Employment;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.Period;

@Data
public class Compensation {
  @DBRef private Employment employment;
  private Amount basic;
  private Amount benefits;
  private Period schedule;
  private Period paymentRate;
  private boolean overtime;
  private String description;
  private String comment;
  private PaymentType paymentType;
  private boolean commission;
}
