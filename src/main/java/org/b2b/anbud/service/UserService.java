package org.b2b.anbud.service;

import org.b2b.anbud.model.User;
import org.b2b.anbud.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
