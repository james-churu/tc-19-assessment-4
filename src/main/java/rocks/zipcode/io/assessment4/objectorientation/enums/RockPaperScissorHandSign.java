package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,PAPER,SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        if( this.equals(PAPER)){
            return SCISSOR;
        }else if(this.equals(SCISSOR)){
            return ROCK;
        }else{
            return PAPER;
        }
    }

    public RockPaperScissorHandSign getLoser() {
        if(this.equals(PAPER)){
            return ROCK;
        }else if(this.equals(ROCK)){
            return SCISSOR;
        }else{
            return PAPER;
        }
    }
}
