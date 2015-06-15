package test.com;

import static org.junit.Assert.*;

import org.junit.Test;

import com.abee.logic.ProcessSomething;

public class TestCase_ProcessSomething {
	
	ProcessSomething processSomething = new ProcessSomething();
	@Test
	public void test() {
		String test = "test";
		assertEquals(test, processSomething.testable(test));
	}

}
