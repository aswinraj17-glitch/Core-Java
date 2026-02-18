import java.util.Scanner;
public class Healthcare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.nextLine();
        String smokingStatus =sc.nextLine();
        String preExistingConditions =sc.nextLine();
        String coverageTier =sc.nextLine();

        System.out.println("Age : "+age);
        System.out.println("Smoking status : "+smokingStatus);
        System.out.println("Pre-existing Conditions : "+preExistingConditions);
        System.out.println("Coverage Tier : "+coverageTier);

        String agegroup="";
        
        if(age>=18 && age<=30){
            agegroup="young";
            
        }
        else if(age>=31 && age<=50){
            agegroup="Middle";
        }
        else if(age>=51 && age<=65){
            agegroup="Senior";
        }
        else if(age>=66 && age<=100){
            agegroup="Elderly";
        }
        
        double amount=0.0;
        if(coverageTier.equals("Basic")){
            if(age>=18 && age<=30){
                amount=200;
            }
            else if(age>=18 && age<=30){
                amount=250;
            }
            else if(age>=51 && age<=65){
                amount=350;
            }
            else if(age>=66 && age<=100){
                amount=400;
            }

        }
        else if(coverageTier.equals("Standard")){
            if(age>=18 && age<=30){
                amount=300;
            }
            else if(age>=18 && age<=30){
                amount=350;
            }
            else if(age>=51 && age<=65){
                amount=450;
            }
            else if(age>=66 && age<=100){
                amount=550;
            }

        }
        else if(coverageTier.equals("Premium")){
            if(age>=18 && age<=30){
                amount=500;
            }
            else if(age>=18 && age<=30){
                amount=600;
            }
            else if(age>=51 && age<=65){
                amount=700;
            }
            else if(age>=66 && age<=100){
                amount=800;
            }

        }
        double riskSurchage=0.0;
         if (smokingStatus.equals("Smoker" ) && preExistingConditions.equals("Yes")) {
            riskSurchage = 0.70 * amount;
        }
        else if (smokingStatus.equals("Smoker")) {
            riskSurchage = 0.40 * amount;
        }
        else if (preExistingConditions.equals("Yes") ){
            riskSurchage = 0.30 * amount;
        }
        else {
            riskSurchage = 0.0;
        }
        
        double totalPremium=amount+riskSurchage;
    System.out.println("Base Premium : $"+amount);
    System.out.println("Risk Surcharge : $"+riskSurchage);
    System.out.println("Total Monthly Premium : $"+totalPremium);
    sc.close();
        
    }
}
