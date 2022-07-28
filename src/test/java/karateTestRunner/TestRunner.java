package karateTestRunner;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
// This test runner is for tiger-api-test project
	@Karate.Test
	Karate runMyTest() {
		return Karate
				.run("classpath:features")
				.tags("@Security");
	} 
}
