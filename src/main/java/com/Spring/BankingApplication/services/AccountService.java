package com.Spring.BankingApplication.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.BankingApplication.entities.Account;
import com.Spring.BankingApplication.repositories.AccountRepository;


@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accRepo;
	
	public String addNewAccount(Account obj)
	{
		accRepo.save(obj);
		return "success";
	}
	
	public String deleteAccount(int accno)
	{
		String status="";
		Account obj=accRepo.findByAccno(accno);
		if(obj!=null)
		{
		System.out.println(obj.getAccnm());
		System.out.println(obj.getBalance());
		accRepo.delete(obj);
		status="success";
		}
		else
		{
			System.out.println("not found");
			status="failed";
		}

		return status;
	}
	
	public String depoAmount(int no,float amt)
	{
		Account obj=accRepo.findByAccno(no);
		String status;
		
		if(obj!=null)
		{
			System.out.println(obj.getBalance());
			obj.setBalance(obj.getBalance()+amt);
			System.out.println(obj.getBalance());
			accRepo.save(obj);
			status="success";
		}
		else
		{
			status="failed";
		}
		return status;
	}
	
	public Account searchOnNumber(int accno)
	{
		Account obj=accRepo.findByAccno(accno);
		if(obj==null)
		{
			obj=new Account();
			obj.setAccno(accno);
			obj.setAccnm("Not found");
			obj.setAcctype("NA");
			obj.setBalance(0);
		}
		return obj;
	}
	
	public String withdrawAmount(int no,float amt)
	{
		Account obj=accRepo.findByAccno(no);
		String status;
		
		if(obj!=null)
		{
			System.out.println(obj.getBalance());
			obj.setBalance(obj.getBalance()-amt);
			System.out.println(obj.getBalance());
			accRepo.save(obj);
			status="success";
		}
		else
		{
			status="failed";
		}
		return status;
	}
	
	public String transferAmount(int fromAcc, int toAcc, float amount) {
	    Optional<Account> fromAccountOpt = accRepo.findById(fromAcc);
	    Optional<Account> toAccountOpt = accRepo.findById(toAcc);

	    if (!fromAccountOpt.isPresent() || !toAccountOpt.isPresent()) {
	        return "One or both accounts do not exist.";
	    }

	    Account fromAccount = fromAccountOpt.get();
	    Account toAccount = toAccountOpt.get();

	    if (fromAccount.getBalance() < amount) {
	        return "Insufficient balance in source account.";
	    }

	    // Perform the transfer
	    fromAccount.setBalance(fromAccount.getBalance() - amount);
	    toAccount.setBalance(toAccount.getBalance() + amount);

	    accRepo.save(fromAccount);
	    accRepo.save(toAccount);

	    return "Amount of ₹" + amount + " transferred from A/C " + fromAcc + " to A/C " + toAcc;
	}


}
