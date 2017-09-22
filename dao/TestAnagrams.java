package test;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestAnagrams {

	// in this test method is testing if is not Anagram all character are
	// lowerCase
	@Test
	public void testNotAnagarmWithLowerCase() {
		String word = "notanagram";
		assertFalse("This word is not Anagram", Anagrams.contains(word));
	}

	// in this test method is testing if is not Anagram all character are
	// lowerCase
	@Test
	public void testNotAnagarmWithAllUpperCase() {
		String word = "NOTANAGRAM";
		assertFalse("This word is not Anagram", Anagrams.contains(word));
	}

	// in this test method is testing if is not Anagram all character are
	// lowerCase
	@Test
	public void testNotAnagarmWithUpperCaseLowerCase() {
		String word = "notAnagrAm";
		assertFalse("This word is not Anagram", Anagrams.contains(word));
	}

	// in this test method is testing if is an Anagram all characters are
	// lowerCase
	@Test
	public void testAreAnagarmWithLowerCase() {
		String word = "pat";
		assertTrue("This word is Anagram", Anagrams.contains(word));
	}

	// in this test method is testing if is an Anagram all characters are
	// upperCase
	@Test
	public void testAreAnagarmWithAllUpperCase() {
		String word = "PAT";
		assertTrue("This word is Anagram", Anagrams.contains(word));
	}

	// in this test method is testing if is an Anagram characters are upperCase
	// and lowerCase
	@Test
	public void testAreAnagarmWithUpperCaseLowerCase() {
		String word = "PaT";
		assertTrue("This word is Anagram", Anagrams.contains(word));
	}

}
