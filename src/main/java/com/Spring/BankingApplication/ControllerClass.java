package com.Spring.BankingApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Spring.BankingApplication.entities.Account;
import com.Spring.BankingApplication.services.AccountService;


@Controller
public class ControllerClass {
	
	@Autowired
	private AccountService accServ;
	
	@GetMapping("/")
	public String homePage()
	{
		return "index.jsp";
	}
	
	@GetMapping("/add")
	public String add()
	{
		return "addAccountForm.html";
	}
	
	@PostMapping("/addacc")
	public String addAccount(Account obj,Model m)
	{
		String status=accServ.addNewAccount(obj);
		m.addAttribute("status",status);
		return "ActivityStatus.jsp";
	}
	
	@GetMapping("/close")
	public String close()
	{
		return "CloseAccountForm.html";
	}
	
	@PostMapping("/closeacc")
	public String closeAcc(int accno,Model m)
	{
		String status;
		status=accServ.deleteAccount(accno);
		m.addAttribute("status", status);
		return "ActivityStatus.jsp";
	}

	@GetMapping("/deposit")
	public String deposit()
	{
		return "DepositForm.html";
	}
	
	@PostMapping("/depoamt")
	public String depositAmount(int accno,float amount,Model m)
	{
		String stat=accServ.depoAmount(accno, amount);
		m.addAttribute("status", stat);
		m.addAttribute("msg", "Deposit amount...");
		return "ActivityStatus.jsp";
	}
	
	@GetMapping("/search")
	public String search()
	{
		return "Search.html";
	}
	
	@PostMapping("/searchno")
	public String searchNumber(int accno,Model m)
	{
		Account obj=accServ.searchOnNumber(accno);
		m.addAttribute("data", obj);
		return "SearchNumberResult.jsp";
	}
	
	@GetMapping("/withdraw")
	public String withdraw()
	{
		return "withdrawForm.html";
	}
	
	@PostMapping("/withdrawamt")
	public String withdrawAmount(int accno,float amount,Model m)
	{
		String stat=accServ.withdrawAmount(accno, amount);
		m.addAttribute("status", stat);
		m.addAttribute("msg", "Withdraw amount...");
		return "ActivityStatus.jsp";
	}
	
	@GetMapping("/transfer")
	public String transfer() {
		
		return "transferForm.html";
	}
	
	@PostMapping("/transferamt")
	public String transferAmount(int fromAcc, int toAcc, float amount, Model m) {
	    String result = accServ.transferAmount(fromAcc, toAcc, amount);
	    m.addAttribute("status", result);
	    m.addAttribute("msg", "Transfer status:");
	    return "ActivityStatus.jsp";
	}

}
