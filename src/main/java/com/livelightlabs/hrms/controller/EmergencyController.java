package com.livelightlabs.hrms.controller;

import com.livelightlabs.hrms.document.employee.EmergencyContact;
import com.livelightlabs.hrms.service.emergency.EmergencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/emergency")
public class EmergencyController {

    private EmergencyService emergencyService;

    @GetMapping
    public EmergencyContact getEmergencyContact(@RequestParam String employeeId) {
        return emergencyService.findEmergencyContactByEmployeeId(employeeId);
    }




}
