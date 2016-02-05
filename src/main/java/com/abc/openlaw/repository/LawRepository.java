package com.abc.openlaw.repository;

import com.abc.openlaw.domain.Law;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by scamisay on 05/02/16.
 */
public interface LawRepository extends MongoRepository<Law, String> {
}
