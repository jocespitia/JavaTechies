package com.example.diego.a343quiz;

public class Question {



        public String nQuestions[] = {
                "What are legal entry point methods that can be run from the command line?", //q 1
                "What Java operators can be used with boolean variables?", // q 2
                "What array declarations is not legal?", // q 3
                "What is true about encapsulation?", // q 4
                "What modifiers are implicitly applied to all interface methods?", // q 5
                "When are you required to use a finally block in a regular try statement (not a try-with-resources)?", // q 6
        };

        private String nChoices[][] = {
                {"private static void main(String[] args)", "public static void main(String[] args)",
                        "public static main(String[] args)", "None of the above"}, // options for q 1
                {"+ and --", "== and ++", "! and <=", "== and !"}, // options for q 2
                {"int[][] scores = new int[5][]", "java.util.Date[] dates[] = new java.util.Date[2][];",
                        "String beans = new beans[6]", "Object[][][] cubbies = new Object[3][0][5]"}, // options for q 3
                {"Encapsulation uses private instance variables and allows setters",
                        "Encapsulation uses package private instance variables and uses private instance variables",
                        "Encapsulation uses private instance variables and uses package private instance variables ",
                        "None of the above"}, // options for q 4
                {"protected", "public", "abstract", "default"}, // options for q 5
                {"When the program code doesn't terminate on its own",
                        "When there are two or more catch blocks in a try statement",
                        "When there are no catch blocks in a try statement",
                        "Never"}, // option for q 6
        };

        private String nCorrectAnswers[] = {
                " public static void main(String[] args)", // ans for q 1 base on code
                "== and !", // ans for q 2 base on code
                "String beans = new beans[6]", // ans for q 3 base on code
                "Encapsulation uses private instance variables and allows setters", // ans for q 4 base on code
                "public", // ans for q 5 base on code
                "When there are no catch blocks in a try statement", // ans for q 6 base on code
        };


        // setters and getter for the question class.

        public int getSizeOfQuestions(){
            return nQuestions.length;

        }

        public String getQuestion(int a) {
            String question = nQuestions[a];
            return question;
        }

        public String getChoice1(int a) {
            String choice = nChoices[a][0];
            return choice;
        }
        public String getChoice2(int a) {
            String choice = nChoices[a][1];
            return choice;
        }
        public String getChoice3(int a) {
            String choice = nChoices[a][2];
            return choice;
        }
        public String getChoice4(int a) {
            String choice = nChoices[a][3];
            return choice;
        }

        public String getAnswer(int a) {
            String answer = nCorrectAnswers[a];
            return answer;
        }


}
