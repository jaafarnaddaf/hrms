package com.livelightlabs.hrms.document.benefit;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
public class LifeInsurance extends Benefit {}
