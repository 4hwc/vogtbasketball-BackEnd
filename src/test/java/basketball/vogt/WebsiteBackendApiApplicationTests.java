package basketball.vogt;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;
import basketball.vogt.controller.HelloController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebsiteBackendApiApplicationTests {

	@Autowired
	private HelloController helloController;

	@Test
	public void contextLoads() {
		
		Assert.assertEquals("Hello World from Vogt Basketball",helloController.home() );
	}

}
