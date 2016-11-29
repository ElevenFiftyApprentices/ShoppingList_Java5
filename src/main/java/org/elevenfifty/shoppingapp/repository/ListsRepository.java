package org.elevenfifty.shoppingapp.repository;

import org.elevenfifty.shoppingapp.beans.Lists;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListsRepository extends CrudRepository<Lists, Long> {

}
