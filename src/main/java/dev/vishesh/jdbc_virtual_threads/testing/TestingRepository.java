package dev.vishesh.jdbc_virtual_threads.testing;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TestingRepository extends CrudRepository<TestingModel, UUID> {

}
