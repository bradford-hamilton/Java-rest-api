package com.bradford;

import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * Created by bradford on 8/3/16.
 */
public interface ContactRepository extends MongoRepository<Contact, String> {}