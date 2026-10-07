package TestBHF;

import org.testng.Assert;
import org.testng.annotations.Test;

import BHFPages.Ourcampaginpage;
import Base.BaseTest;

public class CampaginTest extends BaseTest {
	
	@Test
	public void verifyCampaignPage() {
	
	Ourcampaginpage camp =new Ourcampaginpage(driver);
	camp.campaginpage();
	
	
	
	
	

	

	}
}
