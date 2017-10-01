package org.boyalla.setng.demo.newtours.sets;

import org.boyalla.setng.demo.newtours.tests.EnterPassangerDetailsTest;
import org.boyalla.setng.demo.newtours.tests.HomePageTest;
import org.boyalla.setng.demo.newtours.tests.LoginTest;
import org.boyalla.setng.demo.newtours.tests.ReserverFlightsTest;
import org.boyalla.setng.fw.api.suites.BaseFactorySet;
import org.boyalla.setng.fw.api.suites.TestClassTestConfigException;
import org.boyalla.setng.fw.api.suites.TestSet;
import org.boyalla.setng.fw.api.tests.QuitBrowserTest;

public class RegSet2 extends BaseFactorySet {

	@Override
	protected TestSet testsToRun()
			throws TestClassTestConfigException, IllegalArgumentException, IllegalAccessException {

		TestSet set = new TestSet();
		set.startDependency();
		set.add(HomePageTest.class);
		set.add(LoginTest.class);
		set.add(EnterPassangerDetailsTest.class);
		set.add(ReserverFlightsTest.class);

		set.endDependency();

		set.add(QuitBrowserTest.class);

		return set;
	}
}
