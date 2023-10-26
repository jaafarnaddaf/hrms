package com.livelightlabs.hrms.service;

import com.livelightlabs.hrms.document.BaseDocument;
import com.livelightlabs.hrms.repository.BaseDocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public abstract class BaseDocumentService<T extends BaseDocument> {
  private final BaseDocumentRepository<T> repository;

  public Mono<Long> count() {
    return repository.count();
  }

  public Mono<Long> count(Example<T> example) {
    return repository.count(example);
  }

  public Mono<Void> delete(T entity) {
    return repository.delete(entity);
  }

  public Mono<Void> deleteAll() {
    return repository.deleteAll();
  }

  public Mono<Void> deleteAll(Iterable<? extends T> entities) {
    return repository.deleteAll(entities);
  }

  public Mono<Void> deleteAllById(Iterable<? extends String> ids) {
    return repository.deleteAllById(ids);
  }

  public Mono<Void> deleteById(String id) {
    return repository.deleteById(id);
  }

  public Mono<Boolean> exists(Example<T> example) {
    return repository.exists(example);
  }

  public Mono<Boolean> existsById(String id) {
    return repository.existsById(id);
  }

  public Flux<T> findAll() {
    return repository.findAll();
  }

  public Flux<T> findAll(Sort sort) {
    return repository.findAll(sort);
  }

  public Flux<T> findAll(Example<T> example) {
    return repository.findAll(example);
  }

  public Flux<T> findAll(Example<T> example, Sort sort) {
    return repository.findAll(example, sort);
  }

  public Mono<T> findById(String id) {
    return repository.findById(id);
  }

  public Flux<T> findAllById(Iterable<String> ids) {
    return repository.findAllById(ids);
  }

  public Mono<T> findOne(Example<T> example) {
    return repository.findOne(example);
  }

  public Mono<T> insert(T entity) {
    return repository.insert(entity);
  }

  public Flux<? extends T> insert(Iterable<? extends T> entities) {
    return repository.insert(entities);
  }

  public Mono<T> save(T entity) {
    return repository.save(entity);
  }

  public Flux<? extends T> saveAll(Iterable<? extends T> entities) {
    return repository.saveAll(entities);
  }
}
