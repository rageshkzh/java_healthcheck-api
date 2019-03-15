package com.anz.technicaltest.healthcheck;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.anz.technicaltest.healthcheck.model.ApplicationData;

@RestController
public class HealthCheckController {

	@RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
	@ResponseBody
	public ApplicationData retrieveHealthCheck() {

		//To-Do - integrate with Github API to retrive updated application status
		//Hardcoding the response as of now.
	    //http.Get("https://api.github.com/repos/rageshk/health_check_api/statuses/53c7d37603b5125c701a384e34ac75b2856427cb")
		ApplicationData data = new ApplicationData("pre-interview technical test", "1.0",
				"53c7d37603b5125c701a384e34ac75b2856427cb");

		return data;

	}

}
