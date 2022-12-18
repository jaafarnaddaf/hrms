package com.livelightlabs.hrms.document.employee;

import com.livelightlabs.hrms.document.benefit.Benefit;
import com.livelightlabs.hrms.document.extras.ExtraInformation;
import com.livelightlabs.hrms.document.socialmedia.SocialLinks;
import com.livelightlabs.hrms.document.time.TimeBalance;
import com.livelightlabs.hrms.document.user.User;
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
public class Employee extends User {
  private BasicInformation basicInformation;
  private List<Degree> degrees;
  private List<Experience> experiences;
  private List<Employment> employments;
  private List<SpokenLanguage> spokenLanguages;
  private List<EmergencyContact> emergencyContacts;
  @DBRef private List<Employee> managers;
  @DBRef private List<Employee> employees;
  @DBRef private TimeBalance timeBalance;
  @DBRef private List<Benefit> benefits;
  private Nationality citizenship;
  private ExtraInformation extraInformation;
  private SocialLinks socialLinks;
  private boolean active;
}
