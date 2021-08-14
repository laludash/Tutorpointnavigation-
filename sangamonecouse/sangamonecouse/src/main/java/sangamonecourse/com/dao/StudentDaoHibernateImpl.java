package sangamonecourse.com.dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sangamonecourse.com.domain.Studentdetails;

@Repository
public class StudentDaoHibernateImpl implements StudentDao {

	private  EntityManager  entityManager;
	
	private Studentdetails Studentdetails; 
	
	
	@Autowired
	public StudentDaoHibernateImpl (EntityManager  theEntityManager)
	{
		entityManager  = theEntityManager;
	}
	
	@Override
	public List<Studentdetails> findAll()
	{
		
		return null;
	}

	
	
	// for insert into DataBase.
	
	@Override
	public Studentdetails addStudentDetails(String firstName, String lastName, String email, String dob,
			String mobileNumber)
	{
		// TODO Auto-generated method stub
		if(Studentdetails   ==  null)
		{
																
					
			
		}

				return null;
	}

}
