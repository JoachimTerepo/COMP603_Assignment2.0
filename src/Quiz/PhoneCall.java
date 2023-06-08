package Quiz;

public class PhoneCall extends LifeLine{
    
    private boolean used;
    
    public PhoneCall(){
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
        sb.append("Phone Call Life Line: Used\n");
        sb.append("Personally, I think the answer for this question will be ");
        sb.append(question.getCorrectAnswer());
        
        //This stops them from accessing the method again.
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
