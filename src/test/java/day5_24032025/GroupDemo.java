package day5_24032025;

import org.testng.annotations.Test;

public class GroupDemo {
	@Test(groups = {"windows.Smoke"})
	public void test1() {
		System.out.println("Test 1 {\"Smoke\"})");
	}
	@Test(groups = {"mac.Sanity"})
	public void test2() {
		System.out.println("Test 2 {\"Sanity\"})");
	}
	@Test(groups = {"Smoke","Sanity"})
	public void test3() {
		System.out.println("Test 3 {\"Smoke\",\"Sanity\"})");
	}
	@Test(groups = {"linux.Regression"})
	public void test4() {
		System.out.println("Test 4 {\"Regression\"})");
	}
	@Test(groups = {"Regression","Smoke"})
	public void test5() {
		System.out.println("Test 5 {\"Regression\",\"Smoke\"})");
	}
	@Test(groups = {"Regression","Sanity"})
	public void test6() {
		System.out.println("Test 6 {\"Regression\",\"Sanity\"})");
	}
	@Test(groups = {"Smoke","Regression","Sanity"})
	public void test7() {
		System.out.println("Test 7 {\"Smoke\",\"Regression\",\"Sanity\"})");
	}
	@Test(groups = {"windows.Smoke"})
	public void test8() {
		System.out.println("Test 8  {\"Smoke\"})");
	}
	@Test(groups = {"mac.Sanity"})
	public void test9() {
		System.out.println("Test 9 {\"Sanity\"})");
	}

}
