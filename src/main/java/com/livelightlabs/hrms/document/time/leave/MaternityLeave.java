package com.livelightlabs.hrms.document.time.leave;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
public class MaternityLeave extends Leave {}
