//package com.livelightlabs.hrms.data;
//
//import com.livelightlabs.hrms.document.employee.Employee;
//import com.livelightlabs.hrms.service.employee.EmployeeService;
//import jakarta.annotation.PostConstruct;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//@Component
//public record InitialDataLoader(EmployeeService employeeService, PasswordEncoder passwordEncoder) {
//  @PostConstruct
//  public void initialize() {
//    Employee employee = new Employee();
//    employee.setActive(true);
//    employee.setUsername("test");
//    employee.setPassword(passwordEncoder.encode("test"));
//    employeeService.save(employee).block();
//  }
//}
