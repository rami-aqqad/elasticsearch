package com.example.elasticSearch.repository;

import com.example.elasticSearch.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository  extends ElasticsearchRepository<Person, String> {
}
