package com.livelightlabs.hrms.service.time;

import com.livelightlabs.hrms.document.employee.Employee;
import com.livelightlabs.hrms.document.time.TimeBalance;
import com.livelightlabs.hrms.repository.time.TimeBalanceRepository;
import com.livelightlabs.hrms.service.BaseDocumentService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TimeBalanceService extends BaseDocumentService<TimeBalance> {
  private final TimeBalanceRepository repository;

  public TimeBalanceService(TimeBalanceRepository repository) {
    super(repository);
    this.repository = repository;
  }

  public Mono<TimeBalance> findOneByEmployee(Employee employee) {
    return repository.findOneByEmployee(employee);
  }
}
