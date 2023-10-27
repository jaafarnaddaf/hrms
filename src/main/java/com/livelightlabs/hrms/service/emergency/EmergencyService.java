package com.livelightlabs.hrms.service.emergency;

import com.livelightlabs.hrms.document.employee.EmergencyContact;
import com.livelightlabs.hrms.repository.BaseDocumentRepository;
import com.livelightlabs.hrms.repository.emergency.EmergencyRepository;
import com.livelightlabs.hrms.service.BaseDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmergencyService extends BaseDocumentService<EmergencyContact>  {

    @Autowired
    private EmergencyRepository emergencyRepository;

    public EmergencyService(EmergencyRepository repository) {
        super(repository);
        this.emergencyRepository = repository;
    }

    public EmergencyContact findEmergencyContactByEmployeeId(String employeeId) {
        return emergencyRepository.findEmergencyContactByEmployeeId(employeeId);
    }
}
