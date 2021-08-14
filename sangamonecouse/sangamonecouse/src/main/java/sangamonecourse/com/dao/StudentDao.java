package sangamonecourse.com.dao;

import java.util.List;

import sangamonecourse.com.domain.Studentdetails;

public interface StudentDao {
	
		public List<Studentdetails> findAll();
		
			Studentdetails addStudentDetails(String  firstName,String lastName, String email,String dob, String  mobileNumber);
		
		
		
		
	
	
	
	
	
	
}
