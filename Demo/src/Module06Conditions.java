public class Module06Conditions {

  public static void do6() {
    int testscore = 85;
    char grade;
    if (testscore >= 90) {
      grade = 'A';
    } else if (testscore >= 80) {
      grade = 'B';
    } else if (testscore >= 70) {
      grade = 'C';
    } else if (testscore >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println("Grade = " + grade);

    int value1 = 1;
    int value2 = 2;
    if ((value1 == 1) && (value2 == 2))
      System.out.println("value1 is 1 AND value2 is 2");
    if ((value1 == 1) || (value2 == 1))
      System.out.println("value1 is 1 OR value2 is 1");

    String day = "Tuesday";
    String activity = "";
    switch (day) {
      case "Sunday":
        activity = "Rest";
        break;
      case "Monday":
        activity = "Journal";
        break;
      case "Tuesday":
        activity = "Class";
        break;
      case "Wednesday":
        activity = "Exercises";
        break;
      case "Thursday":
        activity = "Quiz";
        break;
      case "Friday":
        activity = "Project";
        break;
      case "Saturday":
        activity = "iLearning";
        break;
      default:
        activity = "Invalid day";
        break;
    }
    System.out.println(activity);


    String model = "60";
    String features = "";
    switch (model) {
      case "P100D":
        features += "Performance Mode \n";
        // no break, fall through
      case "100D":
        features += "All Wheel Drive \n";
        // no break, fall through
      case "100":
        features += "Extended Range \n";
        // no break, fall through
      case "75":
        features += "Free Supercharging \n";
        // no break, fall through;
      case "60":
        features += "All Electric";
        break;
      default:
        features = "Invalid model number";
        break;
    }
    System.out.println(features);

  }

}
