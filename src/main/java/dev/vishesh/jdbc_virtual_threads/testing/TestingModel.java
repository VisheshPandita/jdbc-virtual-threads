package dev.vishesh.jdbc_virtual_threads.testing;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table("jdbc_virtual_threads")
public class TestingModel {
    @Id
    UUID id;
    String stringValue;
    Boolean boolValue;
    Integer intValue;
    Double floatValue;
}
