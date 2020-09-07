package com.gajava.multiplechoicequiz;

import java.util.Scanner;

public class I_MultipleChoiceQuiz_Main {
    public static void main(String[] args) {
        String question1 =
                "What color are apples?"
                        + "\n(a)red"
                        + "\n(b)blue"
                        + "\n(c)yellow"
                ;
        String question2 =
                "What color are bananas?"
                        + "\n(a)red"
                        + "\n(b)green"
                        + "\n(c)yellow"
                ;
        String question3 =
                "What color are grapes?"
                        + "\n(a)red"
                        + "\n(b)purple"
                        + "\n(c)yellow"
                ;

        Question[] listOfQuestions = {
                new Question(question1,"a"),
                new Question(question2, "c"),
                new Question(question3,"b")
        };

        takeTest(listOfQuestions);
    }


    public static void takeTest(Question[] listOfQuestions){
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for(int i=0; i < listOfQuestions.length; i++){
            System.out.println(listOfQuestions[i].question);
            System.out.print("Answer: ");
            String answer = keyboardInput.nextLine();

            if (answer.equals(listOfQuestions[i].answer)){
                score++;
            }
        }
        System.out.println("You got " + score + "/" + listOfQuestions.length);
    }
}
