package Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomQuestions {

    private static final String USER_NAME = "quiz";
    private static final String PASSWORD = "quiz";
    private static final String URL = "jdbc:derby:QuizDatabase;create=true";
    private String question;
    private String firstAnswer;
    private String secondAnswer;
    private String thirdAnswer;
    private String correctAnswer;
    private List<String> answerOptions;

    public RandomQuestions(String question, String firstAnswer, String secondAnswer, String thirdAnswer, String correctAnswer) {
        this.question = question;
        answerOptions = new ArrayList<>();
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.correctAnswer = correctAnswer;
        answerOptions.add(firstAnswer);
        answerOptions.add(secondAnswer);
        answerOptions.add(thirdAnswer);
        answerOptions.add(correctAnswer);
    }

    public RandomQuestions() {

    }

    public List<RandomQuestions> getQuestionsFromDatabase() {
        List<RandomQuestions> questions = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM QUESTIONS");

            while (resultSet.next()) {
                String questionText = resultSet.getString("QUESTION");
                String answer1 = resultSet.getString("FIRSTANSWER");
                String answer2 = resultSet.getString("SECONDANSWER");
                String answer3 = resultSet.getString("THRIDANSWER");
                String correctAnswer = resultSet.getString("CORRECTANSWER");

                RandomQuestions question = new RandomQuestions(questionText, answer1, answer2, answer3, correctAnswer);
                questions.add(question);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Shuffle the questions randomly
        Collections.shuffle(questions);

        List<RandomQuestions> tenQuestions = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            tenQuestions.add(questions.get(i));
        }

        return tenQuestions;
    }

    public String getQuestion() {
        return question;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public String getThirdAnswer() {
        return thirdAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
    
    public List<String> getAnswerOptions(){
        return answerOptions;
    }
    
    public void shuffleAnswerOptions() {
        Collections.shuffle(answerOptions);
    }
    
    public String getAnswerOptions(int i) {
        return getAnswerOptions().get(i);
    }
    public String toString() {
        return this.question + " " + this.firstAnswer + ", " + this.secondAnswer + ", " + this.thirdAnswer + ", " + this.correctAnswer;
    } 
}
