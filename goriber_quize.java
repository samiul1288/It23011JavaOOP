package samiuljava;

import java.util.Scanner;

public class goriber_quize {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int score=0;
        String [] questions ={
            "1.What is zia sir fevorite food?",
                "2.what is the square of 66?",
                "3.what is the capital of Bangladesh?",
                "4.give me the solution of 3*8+(1-3)?",
                "5.What is the capital of Germany?"
        };
        in.nextLine();
        String[][] options = {
                {"1. Mango", "2. Apple", "3. Jackfruit", "4. Banana" },
                {"1. 4356", "2. 2222", "3. 5656", "4. 9088"},
                {"1. Moscov", "2. Dehli", "3. Dhaka", "4. Paris"},
                {"1. 33", "2. 22", "3. 44", "4. 75"},
                {"1. Berlin", "2. Paris", "3. Rome", "4. Madrid"}
        };
        int []ans={1,1,3,2,1};
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

        System.out.println("ANSWER :");
       int a= in.nextInt();
if(a==ans[i])
{
    System.out.println("CORRECT😁");
    score++;
}
 else {
    System.out.println("Wrong!😢");
    System.out.println("Correct Answer is :" +ans[i]);
    score -= 1;
}
}
        System.out.println("Quiz finished! Your final score is: " + score);
    }
}
