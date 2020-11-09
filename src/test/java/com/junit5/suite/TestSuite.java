package com.junit5.suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * @author fyh
 * @date 2020/11/9
 * @desc
 */
@RunWith(JUnitPlatform.class)
@SelectPackages({
		"com.junit5.example"
})
public class TestSuite {
}
