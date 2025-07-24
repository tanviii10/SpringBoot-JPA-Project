package com.Spring.BankingApplication.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.BankingApplication.entities.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	Account findByAccno(int accno);
	Account findByAccnm(String accnm);
	List<Account> findByAcctype(String acctype);
	
}
