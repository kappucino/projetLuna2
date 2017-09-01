

import com.formation.dao.AdressseDAO;
import com.formation.domain.Adresse;
import com.formation.service.AdresseService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	
	private static ApplicationContext context;


	private static AdresseService adresseService;
	
	@BeforeClass
	public static void oneTimeSetUp(){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		adresseService  = (AdresseService) context.getBean("AdresseServiceImpl");
	}

	
	@Test
	public void testCreateData2(){
		int expected = 1;
		Adresse adresse2 = new Adresse("rue","codePostal","ville");
		adresseService.createAdresse(adresse2);
		Assert.assertEquals(expected, adresseService.getListAdresse().size());
	}
	
}
