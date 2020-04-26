package easy.e1417reformatthestring;

import org.junit.jupiter.api.Test;

import common.VerifyUtil;

public class ReformatTheStringTest {
	@Test
	public void test1() {
		Solution s = new Solution();

		String input;
		String expect;
		String output;
		int seq = 1;

		input = "a0b1c2";
		expect = "0a1b2c";
		output = s.reformat(input);
		VerifyUtil.verify(expect, output, seq++);

		input = "leetcode";
		expect = "";
		output = s.reformat(input);
		VerifyUtil.verify(expect, output, seq++);

		input = "1229857369";
		expect = "";
		output = s.reformat(input);
		VerifyUtil.verify(expect, output, seq++);

		input = "covid2019";
		expect = "c2o0v1i9d";
		output = s.reformat(input);
		VerifyUtil.verify(expect, output, seq++);

		input = "ab123";
		expect = "1a2b3";
		output = s.reformat(input);
		VerifyUtil.verify(expect, output, seq++);
	}
}
