package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
// This is conventional naming--"Job" is the class whose information is being stored in a more accessible manner.  The Job class is Java specific, and includes hard-to-translate data storage like HashMaps.  Also, it is an Interface.  It extends CrudRepository because CrudRepository is specifically designed to interact w/ SQL.  Job has some specific reasons for existing (I think), but gets most of its general functionality (I think) from CrudRepository.
@Repository
//This means that Spring Boot will recognize this as a repository for objects for the database.

public interface JobRepository extends CrudRepository<Job, Integer> {
}
