package basketball.vogt;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import basketball.vogt.controller.HelloController;

@SpringBootTest
class WebsiteBackendApiApplicationTests {

	@Autowired
	private HelloController helloController;

	@Test
	public void contextLoads() {
		
		Assert.assertEquals("Hello World from Vogt Basketball",helloController.home() );
	}

}
