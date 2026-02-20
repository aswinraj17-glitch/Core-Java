import java.util.Scanner;
public class UniversityCourse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String studentStatus =sc.nextLine();
        int creditHours =sc.nextInt();
        sc.nextLine();
        String programType =sc.nextLine();
        String residency =sc.nextLine();
        System.out.println("Student Status : "+studentStatus);
        System.out.println("Credit Hours : "+creditHours);
        System.out.println("Program Type : "+programType);
        System.out.println("Resisdency : "+residency);
        double baseTution=0;
        if(programType.equals("Undergraduate")){
            baseTution=350;
        }
        else if(programType.equals("Graduate")){
            baseTution=550;
        }
        else if(programType.equals("Professional")){
            baseTution=800;
        }
        double residencyMultiplier=0;
        if(residency.equals("In-State")){
            residencyMultiplier=1.0;
        }
        else if(residency.equals("Out-of-State")){
            residencyMultiplier=2.5;
        }
        else if(residency.equals("International")){
            residencyMultiplier=3.0;
        }
        double programfee=0;
        if(studentStatus.equals("Full-Time") ){
            if(programType.equals("Undergraduate")){
                programfee=500;
            }
            else if(programType.equals("Graduate")){
                programfee=750;
            }
            else if(programType.equals("professional")){
                programfee=1200;
            }
        }
        else if(studentStatus.equals("Part-Time") ){
            if(programType.equals("Undergraduate")){
                programfee=300;
            }
            else if(programType.equals("Graduate")){
                programfee=750;
            }
            else if(programType.equals("professional")){
                programfee=900;
            }
        }
        else if(studentStatus.equals("Continuing-Education") ){
            if(programType.equals("Undergraduate")){
                programfee=150;
            }
            else if(programType.equals("Graduate")){
                programfee=150;
            }
            else if(programType.equals("professional")){
                programfee=150;
            }
        }
        double activityFee=0;
        if(studentStatus.equals("Full-Time")){
            activityFee=200;
        }
        
        else if(studentStatus.equals("Part-Time")){
            activityFee=100;
        }
        else if(studentStatus.equals("Continuing-Education")){
            activityFee=50;
        }
        double tutionFee=creditHours*baseTution*residencyMultiplier;
        double totalFee=tutionFee+programfee+activityFee;
        String feeCategory;
        if(residency.equals("In-state") && studentStatus.equals("Full-Time")){
            feeCategory="Standard";
        }
        else if(studentStatus.equals("Continuing-Education")){
            feeCategory="Reduced";
        }
        else if(residency.equals("Out-of-state" ) && studentStatus.equals("International")){
            feeCategory="Premium";
        }
        else{
            feeCategory="Standard";
        }
        System.out.println("Base Tuition Per Credit : $"+baseTution);
        System.out.println("Residency Multiplier : "+residencyMultiplier+"x");
        System.out.println("Progarm Fee : $"+programfee);
        System.out.println("Student Activity Fee $: "+activityFee);
        System.out.println("Total Registration Fee $: "+totalFee);
        System.out.println("Fee Category : "+feeCategory);


    }
    }

