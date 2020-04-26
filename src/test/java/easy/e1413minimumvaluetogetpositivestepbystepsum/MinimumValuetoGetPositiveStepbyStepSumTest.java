package easy.e1413minimumvaluetogetpositivestepbystepsum;

import org.junit.jupiter.api.Test;

import common.VerifyUtil;

public class MinimumValuetoGetPositiveStepbyStepSumTest {

	@Test
	public void test1() {
		Solution s = new Solution();

		int[] nums;
		int expect;
		int output;
		int seq = 1;

		nums = new int[] { -3, 2, -3, 4, 2 };
		expect = 5;
		output = s.minStartValue(nums);
		VerifyUtil.verify(expect, output, seq++);

		nums = new int[] { 1, 2 };
		expect = 1;
		output = s.minStartValue(nums);
		VerifyUtil.verify(expect, output, seq++);

		nums = new int[] { 1, -2, -3 };
		expect = 5;
		output = s.minStartValue(nums);
		VerifyUtil.verify(expect, output, seq++);
	}
}
