package mls.server_property.repositories;

import mls.server_property.domain.Freehold;
import mls.server_property.domain.Land;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LandRepo extends JpaRepository<Land, Long> {
}
