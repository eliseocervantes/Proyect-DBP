package org.Login.Infrastructure;

import org.Login.Domain.LoginService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Login_Repository extends JpaRepository<LoginService,Long> {
}
