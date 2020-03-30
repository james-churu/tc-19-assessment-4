package rocks.zipcode.io.assessment4.generics;

import javax.xml.stream.StreamFilter;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {

    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {

        for(SomeType element : array){
            Integer occurrences = getNumberOfOccurrences(element);
            if(occurrences % 2 > 0){
                return element;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType element : array){
            Integer occurrences = getNumberOfOccurrences(element);
            if(occurrences % 2 == 0){
                return element;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {

        Integer occurences = 0;
        for(int x = 0; x <= array.length - 1; x++){
            if(array[x].equals(valueToEvaluate)){
                occurences++;
            }
        }
        return occurences;
    }


    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        ArrayList<SomeType> newArr = new ArrayList<>();
        for ( SomeType element : array ){
            if( predicate.apply(element)){
                newArr.add(element);
            }
        }

        SomeType[] finalArr;

        if(newArr.size() > 0){
            finalArr = (SomeType[]) java.lang.reflect.Array.newInstance(newArr.get(0).getClass() , newArr.size());
            int x = 0;
            for(SomeType elem : newArr){
                finalArr[x] = elem;
                x++;
            }
            return finalArr;
        }else{
            finalArr = (SomeType[]) java.lang.reflect.Array.newInstance(Integer.class, newArr.size());
            return finalArr;
        }
    }
}
