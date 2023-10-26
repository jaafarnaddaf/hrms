package com.livelightlabs.hrms.service.employee;

import com.livelightlabs.hrms.document.employee.Employee;
import com.livelightlabs.hrms.repository.employee.EmployeeRepository;
import com.livelightlabs.hrms.service.BaseDocumentService;
import com.livelightlabs.hrms.service.time.TimeBalanceService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService extends BaseDocumentService<Employee> implements UserDetailsService {
  private final EmployeeRepository repository;
  private final TimeBalanceService timeBalanceService;

  public EmployeeService(EmployeeRepository repository, TimeBalanceService timeBalanceService) {
    super(repository);
    this.repository = repository;
    this.timeBalanceService = timeBalanceService;
  }

  @Override
  public Employee loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<Employee> employee = repository.getOneByUsername(username).blockOptional();
    if (employee.isEmpty()) {
      throw new UsernameNotFoundException("User not found with username: " + username);
    }
    return employee.get();
  }
}
