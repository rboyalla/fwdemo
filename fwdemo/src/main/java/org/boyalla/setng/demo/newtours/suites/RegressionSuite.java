package org.boyalla.setng.demo.newtours.suites;

import org.boyalla.setng.demo.newtours.sets.RegSet;
import org.boyalla.setng.fw.api.suites.TestSuite;
/**
 * 
 * 
 * @author Raveendra Boyalla
 *  
 *
 */
public class RegressionSuite extends TestSuite {

	public RegressionSuite() {

		addSet(new RegSet());
		// addSet(new RegSet2());
		// addTestSet(new RegressionSet2());
	}
}
