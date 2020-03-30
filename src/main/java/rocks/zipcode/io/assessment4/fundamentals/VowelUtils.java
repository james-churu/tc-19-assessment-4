package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {

        Character[] vowels = {'A','a','E','e','I','i','O','o','U','u'};
        int count = 0;

        for(int x = 0; x<= word.length() -1; x++){

            for(int z =0; z<= vowels.length -1; z++){
                if(word.charAt(x) == vowels[z]){
                    count++;
                }
            }
        }

        if(count >0){
            return true;
        }else{
            return false;
        }
    }

    public static Integer getIndexOfFirstVowel(String word) {

        char[] vowels = {'A','a','E','e','I','i','O','o','U','u'};

        Integer index = -1;
        for(int x = 0; x<= word.length() -1; x++){

            for(int z =0; z<= vowels.length -1; z++){
                if(word.charAt(x) == vowels[z]){
                    index = x;
                    break;
                }
            }

            if (index > -1) {
                break;
            }
        }

        return index;
    }


    public static Boolean startsWithVowel(String word) {
        int index = getIndexOfFirstVowel(word);
        if(index == 0){
            return true;
        }else{
            return false;
        }
    }

    public static Boolean isVowel(Character character) {
        String answer = "";
        answer += character;
        return hasVowels(answer);
    }
}
