package com.livelightlabs.hrms.repository.emergency;

import com.livelightlabs.hrms.document.employee.EmergencyContact;
import com.livelightlabs.hrms.repository.BaseDocumentRepository;

public interface EmergencyRepository extends BaseDocumentRepository<EmergencyContact> {

    EmergencyContact findEmergencyContactByEmployeeId(String id);
}
