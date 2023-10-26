package com.livelightlabs.hrms.controller;

import com.livelightlabs.hrms.document.employee.Employee;
import com.livelightlabs.hrms.document.time.TimeBalance;
import com.livelightlabs.hrms.service.employee.EmployeeService;
import com.livelightlabs.hrms.service.time.TimeBalanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class IndexController {
  private final EmployeeService employeeService;
  private final TimeBalanceService timeBalanceService;

  @GetMapping
  public Object index(@AuthenticationPrincipal Employee employee) {
    Mono<TimeBalance> timeBalance =
        timeBalanceService.findOneByEmployee(employee).defaultIfEmpty(new TimeBalance());
    Mono<Employee> e = employeeService.findById(employee.getId());
    return e.zipWith(timeBalance).block();
  }
}
