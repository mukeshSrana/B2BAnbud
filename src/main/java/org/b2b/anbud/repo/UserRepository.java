package org.b2b.anbud.repo;

import org.b2b.anbud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository <User, Long > {
    User findByEmail(String email);
}
