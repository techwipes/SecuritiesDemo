package net.techwipes.securities.repository;

import net.techwipes.securities.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityRepository extends JpaRepository<Security, Integer> {

}
