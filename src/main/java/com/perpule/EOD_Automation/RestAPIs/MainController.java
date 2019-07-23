package com.perpule.EOD_Automation.RestAPIs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/EODAutomation")
 public class MainController {

	@Autowired
	public CompanyRepository companyrepo;
	
	@GetMapping (path="/companylist")
	public @ResponseBody Iterable<Company> getCompanyList() {
		return companyrepo.findAll();
	}
	
	@GetMapping(path ="/addCompany")
	public @ResponseBody String addNewCompany(@RequestParam int companyID,@RequestParam String companyName, 
			@RequestParam int subCompanyID ,@RequestParam String subCompanyName) {
		
		Company company = new Company();
		company.setCompanyID(companyID);
		company.setCompanyName(companyName);
		company.setSubCompanyID(subCompanyID);
		company.setSubCompanyName(subCompanyName);
		companyrepo.save(company);
		
		return "Saved";
	}
	
}
