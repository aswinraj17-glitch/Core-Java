import java.util.Scanner;

public class Creditcard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cardTier=sc.nextLine();
        String purchaseCategory =sc.nextLine();
        double transactionAmount =sc.nextDouble();
        sc.nextLine();
        String promotionalStatus =sc.nextLine();

        System.out.println("Card Tier : "+cardTier);
        System.out.println("Purchase Category : "+purchaseCategory);
        System.out.println("Transaction Amount : $"+transactionAmount);
        System.out.println("Promotional Status : "+promotionalStatus);
        double basepoints=0;
        if(cardTier.equals("Basic")){
            basepoints=1.0;
        }
        else if(cardTier.equals("Gold")){
            basepoints=1.0;
        }
        else if(cardTier.equals("Platinum")){
            basepoints=1.0;
        }
        else if(cardTier.equals("Black")){
            basepoints=1.0;
        }
        double categoryBonus=0;
        if(purchaseCategory.equals("Groceries")){
            categoryBonus=2.0;
        }
        else if(purchaseCategory.equals("Dining")){
            categoryBonus=2.5;
        }
        else if(purchaseCategory.equals("Travel")){
            categoryBonus=3.0;
        }
        else if(purchaseCategory.equals("Gas")){
            categoryBonus=2.0;
        }
        else if(purchaseCategory.equals("Other")){
            categoryBonus=1.0;
        }
        double tiermultiplier=0;
        if(cardTier.equals("Basic")){
            tiermultiplier=1.0;
        }
        else if(cardTier.equals("Gold")){
            tiermultiplier=1.25;
        }
        else if(cardTier.equals("Platinum")){
            tiermultiplier=1.5;
        }
        else if(cardTier.equals("Black")){
            tiermultiplier=2.0;
        }
        double promotional=0;
        if(promotionalStatus.equals("None")){
            promotional=1.0;
        }
        else if(promotionalStatus.equals("Double-Points")){
            promotional=2.0;
        }
        else if(promotionalStatus.equals("Triple-points")){
            promotional=3.0;
        }
        double pointsEarned=transactionAmount*basepoints*categoryBonus*tiermultiplier*promotional;
        double cashValue=pointsEarned*0.01;
        String rewardTier="";
        if(cardTier.equals("Basic")){
            rewardTier="Standard";
        }
        else if(cardTier.equals("Gold")){
            rewardTier="Enhanced";
        }
        else if(cardTier.equals("Black")){
            rewardTier="Elite";
        }
        else if(cardTier.equals("Platinum")){
            rewardTier="Premium";
        }
        System.out.println("Base points Rate : "+basepoints+"points per dollar");
        System.out.println("Category Bonus : "+categoryBonus+"x");
        System.out.println("Tier Multiplier : "+tiermultiplier+"x");
        System.out.println("Promotional Multiplier : "+promotional+"x");
        System.out.println("Points Earned : "+pointsEarned);
        System.out.println("Equivalent Cash Value : $"+cashValue);
        System.out.println("Reward Tier : "+rewardTier);






        sc.close();
    }
    
}
