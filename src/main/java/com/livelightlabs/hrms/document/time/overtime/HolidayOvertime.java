package com.livelightlabs.hrms.document.time.overtime;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
public class HolidayOvertime extends Overtime {}
