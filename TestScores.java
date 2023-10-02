
    import java.util.Scanner; //the scanner class
    public class TestScores { //the class
        public static void main(String[] args) { //main method
            //scanner class was being generated to capture the input of all five grades
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter first score: ");
            double firstScore = input.nextDouble();
            System.out.println("Grade: " + determineGrade(firstScore));
            System.out.print("Please enter second score: ");
            double secondScore = input.nextDouble();
            System.out.println("Grade: " + determineGrade(secondScore));
            System.out.print("Please enter third score: ");
            double thirdScore = input.nextDouble();
            System.out.println("Grade: " + determineGrade(thirdScore));
            System.out.print("Please enter fourth score: ");
            double fourthScore = input.nextDouble();
            System.out.println("Grade: " + determineGrade(fourthScore));
            System.out.print("Please enter fifth score: ");
            double fifthScore = input.nextDouble();
            System.out.println("Grade: " + determineGrade(fifthScore));
            System.out.println("Average score: " + mainGrade(calcAverage(firstScore, secondScore, thirdScore, fourthScore, fifthScore))); //calculating the average score
        }
        public static double calcAverage(double score1, double score2, double score3, double score4, double score5){ // created a new method to calculate the average because its convenient
            double average = (score1 + score2 + score3 + score4 + score5) / 5; //where the calculations were done
            return average;


        }
        public static String determineGrade(double score) { // created another method to get the grade for each score with if else statements
            if (score >= 90) {
                return "A";
            } else if (score >= 80) {
                return "B";
            } else if (score >= 70) {
                return "C";
            } else if (score >= 60) {
                return "D";
            } else {
                return "F";
            }
        }
            public static String mainGrade(double average){ // created another method to get the main grade for the overall score with if else statements
                if(average >= 90){
                    return "A";
                }
                else if(average >= 80 ){
                    return "B";
                }
                else if(average >=70){
                    return "C";
                }
                else if(average >=60){
                    return "D";
                }
                else{
                    return "F";
                }
        }
    }

