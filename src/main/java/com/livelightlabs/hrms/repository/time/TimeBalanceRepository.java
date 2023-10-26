package com.livelightlabs.hrms.repository.time;

import com.livelightlabs.hrms.document.employee.Employee;
import com.livelightlabs.hrms.document.time.TimeBalance;
import com.livelightlabs.hrms.repository.BaseDocumentRepository;
import reactor.core.publisher.Mono;

public interface TimeBalanceRepository extends BaseDocumentRepository<TimeBalance> {
  Mono<TimeBalance> findOneByEmployee(Employee employee);
}
