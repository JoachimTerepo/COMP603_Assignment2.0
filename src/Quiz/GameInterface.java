package Quiz;

import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Joachim Terepo - Danny Eda
 */
public final class GameInterface extends javax.swing.JFrame {

    //Initialized Variables to access.
    private User currentUser;
    private List<RandomQuestions> rqList;
    private int currentQuestionIndex;
    private int j = 1;
    private int earned;
    private JRadioButton selectedRadioButton;
    private HallAssitance ha = new HallAssitance();
    private HalfAnswer hs = new HalfAnswer();
    private PhoneCall pc = new PhoneCall();
    private RandomQuestions currentQuestion;
    
    //This constructor saves the currentUser
    public GameInterface(User currentUser) {
        this.currentUser = currentUser;
        initComponents();
    }
    
    public GameInterface() {
        initComponents();
    }

        
    //Generated code from JFrame tool
    //This generates the game interface such as the questions, the radio buttons and different lifelines.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RandomQuestions rq = new RandomQuestions();
        this.rqList = rq.getQuestionsFromDatabase();
        int currentQuestionIndex = 0;
        answerGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        phoneCallButton = new javax.swing.JButton();
        halfHalfButton = new javax.swing.JButton();
        hallCallButton = new javax.swing.JButton();
        answerOption1 = new javax.swing.JRadioButton();
        answerOption2 = new javax.swing.JRadioButton();
        answerOption3 = new javax.swing.JRadioButton();
        answerOption4 = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        questionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Who Want's to be a Millionaire?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));

        exitButton.setBackground(new java.awt.Color(0, 102, 0));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/x icon.png"))); // NOI18N
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        returnButton.setBackground(new java.awt.Color(0, 102, 0));
        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/back logo.png"))); // NOI18N
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        phoneCallButton.setBackground(new java.awt.Color(0, 102, 0));
        phoneCallButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phoneCallButton.setForeground(new java.awt.Color(255, 255, 255));
        phoneCallButton.setText("Phone Call");
        phoneCallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneCallButtonActionPerformed(evt);
            }
        });

        halfHalfButton.setBackground(new java.awt.Color(0, 102, 0));
        halfHalfButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        halfHalfButton.setForeground(new java.awt.Color(255, 255, 255));
        halfHalfButton.setText("50/50");
        halfHalfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfHalfButtonActionPerformed(evt);
            }
        });

        hallCallButton.setBackground(new java.awt.Color(0, 102, 0));
        hallCallButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hallCallButton.setForeground(new java.awt.Color(255, 255, 255));
        hallCallButton.setText("Hall Call");
        hallCallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallCallButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(phoneCallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(halfHalfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(hallCallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(returnButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneCallButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(halfHalfButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hallCallButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        answerGroup.add(answerOption1);
        answerOption1.setText("answerOption1");

        answerGroup.add(answerOption2);
        answerOption2.setText("answerOption3");

        answerGroup.add(answerOption3);
        answerOption3.setText("answerOption2");

        answerGroup.add(answerOption4);
        answerOption4.setText("answerOption4");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        questionLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(0, 0, 153));
        questionLabel.setText("questionLabel");
        showQuestion();
        questionLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(answerOption3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answerOption1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerOption4)
                    .addComponent(answerOption2))
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerOption1)
                    .addComponent(answerOption2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerOption4)
                    .addComponent(answerOption3))
                .addGap(25, 25, 25)
                .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Exit Button to leave program.
    private JFrame frame;
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Do you want to end program?", "Who Wants to be a Millionaire?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    //Submit Button
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        submitButtonClicked();
    }//GEN-LAST:event_submitButtonActionPerformed

    //Return button which takes you back to the main menu.
    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        if (JOptionPane.showConfirmDialog(frame, "Do you want to go back to Menu?", "Who Wants to be a Millionaire?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            new QuizInterface(currentUser).setVisible(true);
            this.dispose();
        } 
    }//GEN-LAST:event_returnButtonActionPerformed

    //Lifeline: Hall Button.
    private void hallCallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallCallButtonActionPerformed
        RandomQuestions currentQuestion = rqList.get(currentQuestionIndex);
        JOptionPane.showMessageDialog(this, ha.LifeLine(currentQuestion));
    }//GEN-LAST:event_hallCallButtonActionPerformed

    //Lifeline: 50/50 Button.
    private void halfHalfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfHalfButtonActionPerformed
        RandomQuestions currentQuestion = rqList.get(currentQuestionIndex);
        JOptionPane.showMessageDialog(this, hs.LifeLine(currentQuestion));
    }//GEN-LAST:event_halfHalfButtonActionPerformed

    //Lifeline: Phone Call Button.
    private void phoneCallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneCallButtonActionPerformed
        RandomQuestions currentQuestion = rqList.get(currentQuestionIndex);
        JOptionPane.showMessageDialog(this, pc.LifeLine(currentQuestion));
    }//GEN-LAST:event_phoneCallButtonActionPerformed

    //Displays the text onto the interface.
    private void showQuestion() {
        RandomQuestions currentQuestion = rqList.get(currentQuestionIndex);
        questionLabel.setText("Q" + j + ") " + currentQuestion.getQuestion());
        j++;
        currentQuestion.shuffleAnswerOptions();
        answerOption1.setText(currentQuestion.getAnswerOptions().get(0));
        answerOption2.setText(currentQuestion.getAnswerOptions().get(1));
        answerOption3.setText(currentQuestion.getAnswerOptions().get(2));
        answerOption4.setText(currentQuestion.getAnswerOptions().get(3));
    }

    //This method checks if the user pressed the correct answer radio button.
    //If they did, the user will be prompted and taken to the next question.
    //If not, the user will be prompted and taken to results interface.
    //PARTS OF THE CODE WAS GENERATED FROM CHATGPT!!!
    private void submitButtonClicked() {
        //CHATGPT GENERATED.
        if (answerGroup.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Please select an answer.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            ButtonModel selectedModel = answerGroup.getSelection();
            // Find and store the selected radio button
            Enumeration<AbstractButton> buttons = answerGroup.getElements();
            while (buttons.hasMoreElements()) {
                AbstractButton button = buttons.nextElement();
                if (button.getModel() == selectedModel) {
                    selectedRadioButton = (JRadioButton) button;
                    break;
                }
            }
            String selectedAnswer = selectedRadioButton.getText();
            RandomQuestions currentQuestion = rqList.get(currentQuestionIndex);
            //NOT GENERATED.
            if (selectedAnswer.equals(currentQuestion.getCorrectAnswer())) {
                JOptionPane.showMessageDialog(this, "Correct answer!");
                earned = earned + 100000;
            } else {
                JOptionPane.showMessageDialog(this, "Wrong answer. The correct answer is: " + currentQuestion.getCorrectAnswer());
                new ResultsInterface(currentUser, earned).setVisible(true);;
                this.dispose();
                return;
            }
            // Move to the next question
            currentQuestionIndex++;
            if (currentQuestionIndex < rqList.size()) {
                showQuestion();
                answerGroup.clearSelection();
            } else {
                // No more questions, end the quiz or show a result
                JOptionPane.showMessageDialog(this, "Congrats! You have made it to the end!");
                new ResultsInterface(currentUser, earned).setVisible(true);;
                this.dispose();
            }
        }
    }
    
    //Runs the interface.
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup answerGroup;
    private javax.swing.JRadioButton answerOption1;
    private javax.swing.JRadioButton answerOption2;
    private javax.swing.JRadioButton answerOption3;
    private javax.swing.JRadioButton answerOption4;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton halfHalfButton;
    private javax.swing.JButton hallCallButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton phoneCallButton;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
