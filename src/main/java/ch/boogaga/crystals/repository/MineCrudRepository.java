package ch.boogaga.crystals.repository;

import ch.boogaga.crystals.model.Mine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface MineCrudRepository extends JpaRepository<Mine, Integer> {
}
