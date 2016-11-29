package org.elevenfifty.shoppingapp.repository;

import org.elevenfifty.shoppingapp.beans.Notes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends CrudRepository<Notes, Long> {

}
