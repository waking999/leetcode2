package easy.e1408stringmatchinginanarray;

import java.util.List;

import org.junit.jupiter.api.Test;

import common.VerifyUtil;

public class StringMatchinginanArrayTest {
	@Test
	public void test1() {
		Solution s = new Solution();

		String[] words;
		String[] expect;
		List<String> output;
		int seq = 1;

		words = new String[] { "mass", "as", "hero", "superhero" };
		expect = new String[] { "as", "hero" };
		output = s.stringMatching(words);
		VerifyUtil.verifySort(expect, output, seq++);

		words = new String[] { "leetcode", "et", "code" };
		expect = new String[] { "et", "code" };
		output = s.stringMatching(words);
		VerifyUtil.verifySort(expect, output, seq++);

		words = new String[] { "blue", "green", "bu" };
		expect = new String[] {};
		output = s.stringMatching(words);
		VerifyUtil.verifySort(expect, output, seq++);
	}
}
