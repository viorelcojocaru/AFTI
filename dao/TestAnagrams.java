package test;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestAnagrams {

	// in this test method is testing if is not Anagram 
	@Test
	public void testNotAnagarm(){
		String word="notAnagram";
		assertFalse("This word is not Anagram", Anagrams.contains(word));
	}
	// in this test method is testing if is an Anagram 
	@Test
	public void testAreAnagarm(){
		String word="pat";
		assertTrue("This word is Anagram", Anagrams.contains(word));
	}

}
