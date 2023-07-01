/*
 *  Description: This program is a grade calculator where the user inputs their scores to determine their grades and gpa.
 *  Name: James Giatpaiboon
 */

import java.util.Scanner;   // Imported scanner for users input

public class Grade_Calculator {

    public static void main (String[] args) {

        double num1;    // first exam score
        double num2;    // second exam score
        double num3;    // third exam score
        double scoretotals; // added all three exam scores together
        double avgexamscore;    // all three exam scores divided by 3 (number of tests)
        String lettergrade; // letter grade depending on average exam score earned
        double gpa = 0.0;   // determines gpa depending on letter grade received


        Scanner input = new Scanner(System.in); // created for user input


        System.out.println("Enter your score for Exam #1:");    // tells user to input first exam score
        num1 = input.nextInt(); // stores input for exam #1

        System.out.println("Enter your score for Exam #2"); // informs user to input second exam score
        num2 = input.nextInt(); // stores input for exam #2

        System.out.println("Enter your score for Exam #3"); // informs user to input third exam score
        num3 = input.nextInt(); // stores input for exam #3

        scoretotals = num1 + num2 + num3;   // adds all exam scores together
        avgexamscore = scoretotals / 3; // calculates the average exam scores

        /* if else statements to decide letter grade by your average score; if any of the three exam scores are less
        than 30, the letter grade is an automatic F
         */
        if (num1 < 30 || num2 < 30 || num3 < 30) {
            lettergrade = "F";
        } else {
            if (avgexamscore >= 97.0) {
                lettergrade = "A+";
            } else {
                if (avgexamscore >= 93.0) {
                    lettergrade = "A";
                } else {
                    if (avgexamscore >= 90.0) {
                        lettergrade = "A-";
                    } else {
                        if (avgexamscore >= 87.0) {
                            lettergrade = "B+";
                        } else {
                            if (avgexamscore >= 83.0) {
                                lettergrade = "B";
                            } else {
                                if (avgexamscore >= 80.0) {
                                    lettergrade = "B-";
                                } else {
                                    if (avgexamscore >= 77.0) {
                                        lettergrade = "C+";
                                    } else {
                                        if (avgexamscore >= 70.0) {
                                            lettergrade = "C";
                                        } else {
                                            if (avgexamscore >= 67.0) {
                                                lettergrade = "D+";
                                            } else {
                                                if (avgexamscore >= 60.0) {
                                                    lettergrade = "D";
                                                } else {
                                                    lettergrade = "F";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // If else statements to decide gpa depending on the letter grade received
        if (lettergrade == "A+") {
            gpa = 4.0;
        } else {
            if (lettergrade == "A") {
                gpa = 4.0;
            } else {
                if (lettergrade == "A-") {
                    gpa = 3.7;
                } else {
                    if (lettergrade == "B+") {
                        gpa = 3.3;
                    } else {
                        if (lettergrade == "B-") {
                            gpa = 3.0;
                        } else {
                            if (lettergrade == "C+") {
                                gpa = 2.7;
                            } else {
                                if (lettergrade == "C") {
                                    gpa = 2.0;
                                } else {
                                    if (lettergrade == "D+") {
                                        gpa = 1.7;
                                    } else {
                                        if (lettergrade == "D") {
                                            gpa = 1.0;
                                        } else {
                                            if (lettergrade == "F") {
                                                gpa = 0.0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // Prints out the three exam scores, average score, letter grade, and gpa for user.
        System.out.println("Your three exams score are:");
        System.out.println("Exam #1:" + num1);
        System.out.println("Exam #2:" + num2);
        System.out.println("Exam #3:" + num3);
        System.out.println("Your average exam scores is: " + avgexamscore);
        System.out.println("Your letter grade is: " + lettergrade);
        System.out.println("Your GPA is: " + gpa);

    }

}


