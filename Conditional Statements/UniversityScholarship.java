import java.util.Scanner;
public class UniversityScholarship {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double gpa=sc.nextDouble();
        double familyIncome=sc.nextDouble();
        int extracurricularScore =sc.nextInt();
        sc.nextLine();
        String scholarshipType =sc.nextLine();

        System.out.println("GPA : "+gpa);
        System.out.println("Family Income : $"+familyIncome);
        System.out.println("Extracular Score : "+extracurricularScore);
        System.out.println("Scholarship Type : "+scholarshipType);
        String awardCategory="";
        int awardamount=0;

        if(gpa>=2.5){
            System.out.println("Eligibility : Eligible");
        }
        else{
            System.out.println("Eligibility : Not Eligible");
        }
        if(scholarshipType.equals("Merit")){
            if(gpa>=3.8 && extracurricularScore>=80){
                awardCategory="Full";
                awardamount=25000;

        }
           else if(gpa>=3.5 && extracurricularScore>=70){
                awardCategory="Partial";
                awardamount=15000;

        }
            else if(gpa>=3.0 && extracurricularScore>=60){
                awardCategory="Minimal";
                awardamount=8000;

        }
    }
    else if(scholarshipType.equals("Need-Based")){
        if(gpa>=3.5 && familyIncome<=30000){
            awardCategory="Full";
            awardamount=30000;
            
        }
        else if(gpa>=3.0 && familyIncome<=50000){
            awardCategory="Partial";
            awardamount=18000;
            
        }
        else if(gpa>=2.8 && familyIncome<=70000){
            awardCategory="Minimal";
            awardamount=10000;
            
        }
    }
    else if(scholarshipType.equals("Sports")){
        if(gpa>=3.0 && extracurricularScore>=85){
            awardCategory="Full";
            awardamount=22000;

    }
       else if(gpa>=2.8 && extracurricularScore>=75){
            awardCategory="Partial";
            awardamount=20000;

    }
        else if(gpa>=2.5 && extracurricularScore>=65){
            awardCategory="Minimal";
            awardamount=12000;

    }
}

System.out.println("Award Amount : $"+awardamount);
System.out.println("Award Category : "+awardCategory);

    }
}
