package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SystemUSer;

public interface SystemUserDao extends JpaRepository<SystemUSer, Integer> {

}
