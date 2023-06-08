package Quiz;

public class HallAssitance extends LifeLine{
    
    private boolean used;
    
    public HallAssitance(){
        this.used = false;
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
        
        sb.append("Hall Assitance Life Line:\n");
        for (int i = 0; i < 3; i++){
            int j = i + 1;
            sb.append(j);
            sb.append(" ");
            sb.append(question.getAnswerOptions(i));
            sb.append(" - 8.3% ");
        }
        
        sb.append(question.getCorrectAnswer());
        sb.append(" - 75%");
        
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
