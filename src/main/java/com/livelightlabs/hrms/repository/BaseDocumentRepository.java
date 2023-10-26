package com.livelightlabs.hrms.repository;

import com.livelightlabs.hrms.document.BaseDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BaseDocumentRepository<T extends BaseDocument>
    extends ReactiveMongoRepository<T, String> {}
