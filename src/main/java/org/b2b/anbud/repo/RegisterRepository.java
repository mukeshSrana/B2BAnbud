package org.b2b.anbud.repo;

import org.b2b.anbud.domain.Bedrift;
import org.b2b.anbud.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Bedrift, Long> {

}
