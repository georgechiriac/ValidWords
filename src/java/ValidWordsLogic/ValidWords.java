/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidWordsLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Chiriac
 */
public class ValidWords {

    private final List<String> validWords;

    ValidWords(List<String> strings) {
        this.validWords = strings;
    }

    public List<String> generateWords(char[] chars) {
        ArrayList<String> result = new ArrayList<String>();
        
        for (Iterator i = new Permute(chars); i.hasNext();) {
            Object next = i.next();
            final String string = new String((char[])next);
            
            if (validWords.contains(string)){
                result.add(string);
            }
        }
        return result;
    }
}
