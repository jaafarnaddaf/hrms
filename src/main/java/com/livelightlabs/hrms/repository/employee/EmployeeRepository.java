package com.livelightlabs.hrms.repository.employee;

import com.livelightlabs.hrms.document.employee.Employee;
import com.livelightlabs.hrms.repository.BaseDocumentRepository;
import org.springframework.data.mongodb.repository.Query;
import reactor.core.publisher.Mono;

public interface EmployeeRepository extends BaseDocumentRepository<Employee> {
  Mono<Employee> findOneByUsername(String username);

  @Query(
      fields =
          "{username: 1, password: 1, accountNonExpired: 1, accountNonLocked: 1, credentialsNonExpired: 1, enabled: 1}")
  Mono<Employee> getOneByUsername(String username);
}
