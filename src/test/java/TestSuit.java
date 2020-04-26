
 
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import easy.TestSuitEasy;
import hard.TestSuitHard;
import medium.TestSuitMedium;

@RunWith(JUnitPlatform.class)
@Suite.SuiteClasses ({TestSuitEasy.class, TestSuitMedium.class, TestSuitHard.class})
public class TestSuit {
}
