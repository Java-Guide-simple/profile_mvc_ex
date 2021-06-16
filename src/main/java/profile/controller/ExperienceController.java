package profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import profile.model.Experience;


@Controller
public class ExperienceController {
	
	@GetMapping("/")
	public String homePage() {
		return "index";
	}
	
	@GetMapping("/exp1")
	public String marticExam(Model model) {
		Experience exp=new Experience();
		exp.setName("Gautam Kumar");
		exp.setEmpId(101);
		exp.setCompanyName("T.Model Inter School Gaya");
		exp.setProfile("10TH Subjects(Hindi,English,Chemistry,Physics,Maths)");
		exp.setStartDate("10-5-2010");
		exp.setEndDate("10-3-2011");
		model.addAttribute("exp1",exp);
		return "experience1";
	}
	@GetMapping("/exp2")
	public String inter(Model model) {
		Experience exp=new Experience();
		exp.setName("Gautam Kumar");
		exp.setEmpId(17631);
		exp.setCompanyName("Gaya College , Gaya");
		exp.setProfile("12TH Subjects(Hindi,English,Chemistry,Physics,Maths)");
		exp.setStartDate("10-5-2011");
		exp.setEndDate("10-3-2013");
		model.addAttribute("exp2",exp);
		return "experience2";
	}
	@GetMapping("/exp3")
	public String engg(Model model) {
		Experience exp=new Experience();
		exp.setName("Gautam Kumar");
		exp.setEmpId(115);
		exp.setCompanyName("RGPV Bhopal");
		exp.setProfile("Electronics and Communication Engineering");
		exp.setStartDate("10-5-2014");
		exp.setEndDate("10-3-2018");
		model.addAttribute("exp3",exp);
		return "experience3";
	}
	@GetMapping("/exp4")
	public String company(Model model) {
		Experience exp=new Experience();
		exp.setName("Gautam Kumar");
		exp.setEmpId(12982);
		exp.setCompanyName("Palladium Staffing Solutions");
		exp.setProfile("Back end Java Developer");
		exp.setStartDate("2-2-2020");
		exp.setEndDate("3-3-2021");
		model.addAttribute("exp4",exp);
		return "experience4";
	}
}
