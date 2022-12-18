package com.livelightlabs.hrms.document.geography;

import com.livelightlabs.hrms.bean.Localization;
import com.livelightlabs.hrms.document.BaseDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Address extends BaseDocument {
  @DBRef private City city;
  private Localization area;
  private Localization neighborhood;
  private Localization street;
  private Localization building;
  private Integer floor;
  private Integer apartment;
  private Point location;
  private List<String> emailAddresses;
  private List<PhoneNumber> phoneNumbers;
}
