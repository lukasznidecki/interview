package task2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//Write the program using Java 8 features like streams to check if the word can be palindrome. Characters in words can be swapped. Examples
public class IsPossiblePalindromeTest {

  @Test
  public void isPalindromePossible() throws Exception {
    assertTrue(IsPossiblePalindrome.check("oonn"));
    assertFalse(IsPossiblePalindrome.check("abc"));
    assertTrue(IsPossiblePalindrome.check("abcab"));
  }

}