package org.elevenfifty.shoppingapp.repository;

import org.elevenfifty.shoppingapp.beans.Items;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends CrudRepository<Items, Long> {

}
