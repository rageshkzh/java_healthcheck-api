package com.anz.technicaltest.healthcheck;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.anz.technicaltest.healthcheck.model.ApplicationData;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthCheckControllerTest {

	@Test
	public void testhealthCheckUrl() {
		HealthCheckController controller = new HealthCheckController();
		ApplicationData data = controller.retrieveHealthCheck();

		Assert.assertEquals("pre-interview technical test", data.getDescription());
		Assert.assertEquals("1.0", data.getVersion());
		Assert.assertEquals("53c7d37603b5125c701a384e34ac75b2856427cb", data.getLastCommitSha());

	}

}
