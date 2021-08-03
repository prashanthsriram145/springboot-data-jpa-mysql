package com.springbootthree.datajpamysql.data;

import com.springbootthree.datajpamysql.model.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
