import java.util.Scanner;
public class Corporatetax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double annualRevenue =sc.nextDouble();
        sc.nextLine();
        String businessType =sc.nextLine();
        double deductibleExpenses =sc.nextDouble();
        double taxCredits=sc.nextDouble();

        double taxableIncome=annualRevenue-deductibleExpenses;
        System.out.println("Annual Revenue : $"+annualRevenue);
        System.out.println("Business Type : "+businessType);
        System.out.println("Deductible Expenses : $"+deductibleExpenses);
        System.out.println("Tax Credits : $"+taxCredits);
        System.out.println("Taxable Income : $"+taxableIncome);
        int taxRate=1;
        if(businessType.equals("C-Corp")){
            if(taxableIncome<500000){
                taxRate=taxRate*21;
            }
            else if(taxableIncome>=500000 && taxableIncome<=1000000){
                taxRate=taxRate*24;
            }
            else if(taxableIncome>=1000000 && taxableIncome<=2000000){
                taxRate=taxRate*28;
            }
            else if(taxableIncome>2000000){
                taxRate=taxRate*30;
            }
        }
        else if(businessType.equals("S-Corp")){
            if(taxableIncome<500000){
                taxRate=taxRate*20;
            }
            else if(taxableIncome>=500000 && taxableIncome<=1000000){
                taxRate=taxRate*25;
            }
            else if(taxableIncome>=1000000 ){
                taxRate=taxRate*28;
            }
            
        }
        else if(businessType.equals("LLC")){
            if(taxableIncome<200000){
                taxRate=taxRate*15;
            }
            else if(taxableIncome>=200000 && taxableIncome<=500000){
                taxRate=taxRate*18;
            }
            else if(taxableIncome>=500000 ){
                taxRate=taxRate*22;
            }
            
        }
        else if(businessType.equals("Partnership")){
            if(taxableIncome<300000){
                taxRate=taxRate*18;
            }
            else if(taxableIncome>=300000 && taxableIncome<=800000){
                taxRate=taxRate*22;
            }
            else if(taxableIncome>=800000 ){
                taxRate=taxRate*26;
            }
            
        }
        double grossTax=taxableIncome*((double)taxRate/100);
        double NetTax=grossTax-taxCredits;
        double Effectiverate=(NetTax/annualRevenue)*100;
        System.out.println(("Tax Rate : "+taxRate+"%"));
        System.out.println(("Gross Tax : $"+grossTax));
        System.out.println(("Net Tax After Credits $: "+NetTax));
        System.out.printf("Effective Tax Rate : %.1f",Effectiverate,"%");





    }
}
