package sangamonecourse.com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
	@Table(name  =  "student") 
	public class Studentdetails {
	// define filed 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name  =   "id")
	private int id;
	
	@Column (name   =  "student_first_name")
	private String  firstName;
	
	@Column (name  = "student_last_name")
	private String lastName;
	
	@Column (name  = "student_email")
	private String email;
	
	@Column (name  = "student_dob")
    private String dob;
	
	@Column (name = "student_mobile")
    private   int  mobileNumber;
    
   
	// define no argument constructor 
	
	public Studentdetails()
	{
		
	}

	// generated constructor 
	
	public Studentdetails(String firstName, String lastName, String email, String dob, int mobileNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dob = dob;
		this.mobileNumber = mobileNumber;
	}
	
	// define getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
	// define tostring 
	
	@Override
	public String toString() {
		return "Studentdetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", dob=" + dob + ", mobileNumber=" + mobileNumber + "]";
	}
	
}
