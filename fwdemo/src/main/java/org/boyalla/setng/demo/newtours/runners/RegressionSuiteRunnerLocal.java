package org.boyalla.setng.demo.newtours.runners;

import org.boyalla.setng.demo.newtours.suites.SuitesFolder;
import org.boyalla.setng.fw.api.runners.ParallelRunner;

/**
 * 
 * 
 * @author Raveendra Boyalla
 * 
 *
 */

public class RegressionSuiteRunnerLocal {
	public static void main(String[] args) throws Exception {

		final String USERNAME = "raveendraboyalla";
		final String ACCESS_KEY = "10d5bdec-0e8b-4179-8b80-338743b7e272";
		String SauceURL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

		// String nodes =
		// "http://192.168.0.30:5566/wd/hub,http://192.168.0.34:5588/wd/hub";
		// nodes = "http://192.168.0.30:5566/wd/hub";

		args = new String[] { "-TLD", "http://newtours.demoaut.com", "-TTR", "1", "-NT", "4", "-NST", "4", "-SPF",
				"Windows", "-suites", "RegressionSuite", "-B", "firefox" };

		// args = new String[] { "-help" };

		new ParallelRunner().run(SuitesFolder.class, args);
	}
}
