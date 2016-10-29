/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidWordsLogic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chiriac
 */
public class ValidWordsTest {

    ValidWords sut;

    public ValidWordsTest() {
    }

    @Before
    public void setUp() {
        List<String> strings = Arrays.asList("aa", "ava", "java", "test");
        sut = new ValidWords(strings);
    }

    /**
     * Test of generateWords method, of class ValidWords.
     */
    @Test
    public void testResultContainsConcatenationOfOnly2CharactersIfWordIsDefined() {
        char[] chars = new char[]{'a', 'a', 'j', 'v'};
        List<String> result = sut.generateWords(chars);

        assertTrue(result.contains("aa"));
    }

    @Test
    public void testResultContainsCombinationOfAllCharacters() {
        char[] chars = new char[]{'a', 'a', 'j', 'v'};
        List<String> result = sut.generateWords(chars);

        assertTrue(result.contains("java"));
    }
    
    @Test
    public void testResultShouldNotContainsCombinationOfAllCharactersIfWordIsNotDefined() {
        char[] chars = new char[]{'a', 'a', 'j', 'v'};
        List<String> result = sut.generateWords(chars);

        assertTrue(!result.contains("aajv"));
    }

    @Test
    public void testResultShouldNotContainsConcatenationOfCharactersIfWordIsNotDefined() {
        char[] chars = new char[]{'a', 'a', 'j', 'v'};
        List<String> result = sut.generateWords(chars);

        assertTrue(!result.contains("aj"));
    }

    @Test
    public void testPermute() {
        char[] chars = new char[]{'a', 'a', 'j', 'v'};
        //Permute permute = new Permute(chars);

        for (Iterator i = new Permute(chars); i.hasNext();) {
            Object next = i.next();
            ////System.out.println(next);
            final char[] a = (char[]) next;
            
            for (char r: a){
                System.out.print(r);
            }
            ////System.out.println(i);
        }
    }

}
