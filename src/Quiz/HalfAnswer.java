package Quiz;

import java.util.Random;

public class HalfAnswer extends LifeLine{
    private boolean used;
    
    public HalfAnswer(){
        used = false;
    }
    
    //This override method comes from LifeLine class.
    @Override
    public String LifeLine(RandomQuestions question){
        //If the LifeLine has already been used, this if statement will stop them from accessing it.
        if (used == true){
           return "This Life-Line has already been used!"; 
        }
        //Created a StringBuilder in order to build the required variables for the lifeline.
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        int randomNum = rand.nextInt(3);
        
        sb.append("50/50 Life Line: Used\n");
        sb.append(question.getAnswerOptions(randomNum));
        sb.append(" or ");
        sb.append(question.getCorrectAnswer());
        
        //This stops them from accessing the method again
        used = true;
        
        //Returns the completed lifeline sentence.
        return sb.toString();
    }     
    
    /**
     * @return the used
     */
    @Override
    public boolean isUsed() {
        return used;
    }
}
