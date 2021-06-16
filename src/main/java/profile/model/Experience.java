package profile.model;

public class Experience {
	private String name;
	private Integer empId;
	private String companyName;
	private String profile;
	private String startDate;
	private String endDate;
	
	public Experience(){
		
	}

	public Experience(String name,int empId, String companyName, String profile, String startDate, String endDate) {
		super();
		this.name=name;
		this.empId = empId;
		this.companyName = companyName;
		this.profile = profile;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Experience [name=" + name + ", empId=" + empId + ", companyName=" + companyName + ", profile=" + profile
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	
}
