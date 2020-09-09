package com.forgyan.myapp.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CommonUtilTest {

	@Test
	void validIdTest() {
		assertEquals(true, CommonUtil.validId(1));
		assertEquals(false, CommonUtil.validId(0));
		assertEquals(false, CommonUtil.validId(-1));
	}

}
