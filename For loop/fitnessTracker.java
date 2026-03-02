import java.util.Scanner;

public class fitnessTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        int totalduration=0;
        int totalCaloriesBurned =0;
        int totalworkouts=0;
        String fitnessLevel="";
        for(int i=1;i<=N;i++){
            String exerciseType=sc.next();
            totalworkouts++;
            int durationMinutes=sc.nextInt();

            String intensityLevel="";
            int caloriesBurned=0;
            if(exerciseType.equals("Running")){
                caloriesBurned=10*durationMinutes;
                intensityLevel="High";
            }
            else if(exerciseType.equals("Swimming")){
                caloriesBurned=12*durationMinutes;
                intensityLevel="High";
            }
            else if(exerciseType.equals("Cycling")){
                caloriesBurned=8*durationMinutes;
                intensityLevel="Moderate";
            }
            else if(exerciseType.equals("Gym")){
                caloriesBurned=7*durationMinutes;
                intensityLevel="Moderate";
            }
            else if(exerciseType.equals("Walking")){
                caloriesBurned=4*durationMinutes;
                intensityLevel="Low";
            }

            totalduration+=durationMinutes;
            totalCaloriesBurned+=caloriesBurned;

            if(totalCaloriesBurned<300){
                fitnessLevel="Beginner";
            }
            else if(totalCaloriesBurned>=300 && totalCaloriesBurned<=1000){
                fitnessLevel="Intermediate";
            }
            else if(totalCaloriesBurned>=1000){
                fitnessLevel="Advanced";
            }
            System.out.println("Session "+ i+":"+exerciseType);
            System.out.println("Duration : "+durationMinutes+"minutes");
            System.out.println("Calories Burned : "+caloriesBurned);
            System.out.println("Intensity : "+intensityLevel);




        }
        double averageCalories=(double)totalCaloriesBurned/N;
        System.out.println("Total Workouts : "+totalworkouts);
        System.out.println("Total Duration : "+totalduration+"minutes");
        System.out.println("Total Calories Burned : "+totalCaloriesBurned);
        System.out.println("Average Calories per Session : "+String.format("%.2f",averageCalories));
        System.out.println("Fitness Level : "+fitnessLevel);
        

    }
}
