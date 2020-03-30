package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labs;

    public Student() {
        this.labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labs = new ArrayList<>();
        this.labs.addAll(labs);
    }

    public Lab getLab(String labName) {

        int pos = 0;
        for(Lab element : labs){

            if(element.getName().equals(labName)){
                break;
            }
        }
        return this.labs.get(pos);
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

        boolean contains = false;
        for(Lab elemento : labs){
            if(elemento.getName().equals(labName)){
                contains = true;
            }
        }
        if(!contains){
            throw new UnsupportedOperationException();
        }
        for(Lab element : labs){
            if(element.getName().equals(labName)){
                element.setStatus(labStatus);
            }
        }
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        for(Lab element  : labs){

            if(element.getName().equals(labName)){
                return element.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString(){

        ArrayList<String> nes = new ArrayList<>();

        int size = 0;
        for(Lab element : labs){
            String answer = "";
            answer += element.getName() + " > " + element.getStatus();
            nes.add(answer);
        }
        Collections.sort(nes);
        String finalAnswer = "";
        for( String elem : nes ){

            if(!finalAnswer.equals("")) {
                finalAnswer += "\n";
            }
            finalAnswer += elem;

        }
        return finalAnswer;
    }
}
