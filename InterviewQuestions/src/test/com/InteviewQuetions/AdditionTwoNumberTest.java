package test.com.InteviewQuetions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.InterviewQuestions.AdditionTwoNum;


public class AdditionTwoNumberTest {

	private AdditionTwoNum additionTwoNum;

	@Before
	public void beforeRun() {
		additionTwoNum = new AdditionTwoNum();
	}

	@Test
	public void testaddTwoNumber() {
		int actualValue = additionTwoNum.addTwoNumber(2, 2);
		Assert.assertEquals(4, actualValue);
	}
}
