package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        String answer = "";

        for(int x = 0; x<= str.length() -1; x++){
            if(x == indexToCapitalize){
                Character uppy = str.charAt(indexToCapitalize);
                String temp = "";
                temp += uppy;
                answer += temp.toUpperCase();
            }else{
                answer += str.charAt(x);
            }

        }
        return answer;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {

        ArrayList<String> answer1 = new ArrayList<>();

        for(int x =0; x<= string.length() ; x++){

            for(int z = x+1 ; z <= string.length() ; z++){
                String holder = string.substring(x,z);
                answer1.add(holder);
            }
        }

        Set<String> set = new HashSet<>();
        for(String elem : answer1){
            set.add(elem);
        }
        ArrayList<String> answer2 = new ArrayList<>();
        for(String element : set){
            answer2.add(element);
        }


        String[] newArr = new String[answer2.size()];
        int index =0;
        for(String element : answer2){
            if(index != 0 && element.equals(newArr[index -1])){

            }else{
                newArr[index] = element;
                index++;
            }
        }
        return newArr;
    }

    public static Integer getNumberOfSubStrings(String input){

        return getAllSubStrings(input).length;
    }
}
