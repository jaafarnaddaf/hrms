package com.livelightlabs.hrms.document.time.leave;

import com.livelightlabs.hrms.document.media.Media;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class SickLeave extends Leave {
  private String description;
  @DBRef private List<Media> attachments;
}
