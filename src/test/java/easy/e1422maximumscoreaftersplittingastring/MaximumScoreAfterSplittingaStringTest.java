package easy.e1422maximumscoreaftersplittingastring;

import org.junit.jupiter.api.Test;

import common.VerifyUtil;

public class MaximumScoreAfterSplittingaStringTest {
	@Test
	public void test1() {
		Solution s = new Solution();

		String input;
		int expect;
		int output;
		int seq = 1;

		input = "011101";
		expect = 5;
		output = s.maxScore(input);
		VerifyUtil.verify(expect, output, seq++);

		input = "00111";
		expect = 5;
		output = s.maxScore(input);
		VerifyUtil.verify(expect, output, seq++);

		input = "1111";
		expect = 3;
		output = s.maxScore(input);
		VerifyUtil.verify(expect, output, seq++);
		
		input = "00";
		expect = 1;
		output = s.maxScore(input);
		VerifyUtil.verify(expect, output, seq++);
		
		input = "11";
		expect = 1;
		output = s.maxScore(input);
		VerifyUtil.verify(expect, output, seq++);
	}
}
