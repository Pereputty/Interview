package com.mobility.palindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.mobility.EvilTest;

@EvilTest
public class PalindromeTest {

	private Palindrome palindrome;

	@Test
	public void palindromes() {
		assertTrue(palindrome.isPalindrome(null));
		assertTrue(palindrome.isPalindrome(""));
		assertTrue(palindrome.isPalindrome("a"));
		assertTrue(palindrome.isPalindrome("aba"));
		assertTrue(palindrome.isPalindrome("abba"));
		assertTrue(palindrome.isPalindrome("abbabba"));
		assertTrue(palindrome.isPalindrome("gézakékazég"));
		assertTrue(palindrome.isPalindrome("indulagörögaludni"));
	}

	@Test
	public void nonPalindromes() {
		assertFalse(palindrome.isPalindrome("Mama"));
		assertFalse(palindrome.isPalindrome("Beer"));
	}

}
