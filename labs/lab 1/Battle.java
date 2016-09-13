import java.lang.Math;

public class Battle {
	public static void main(String args[]) {
		
		//stats
		double kroggAttack = 38.5;
		double kroggDefense = 20.0;
		double kroggHP = 200;
		
		double bossAttack = 25;
		double bossDefense = 12.5;
		double bossHP = 200;
		
		int round = 1;
		
		while(bossHP > 0 && kroggHP > 0) {
			
			//dmg var
			double attackDmg;
			
			System.out.println("\nRound " + round);
			
			//krogg turn
			attackDmg = attack(kroggAttack, bossDefense);
			bossHP -= attackDmg;
			System.out.println("Krogg does " + attackDmg + " points of damage to Boss");
			
			//boss turn
			attackDmg = attack(bossAttack, kroggDefense);
			kroggHP -= attackDmg;
			System.out.println("Boss does " + attackDmg + " points of damage to Krogg");
			
			//hp output
			System.out.println("Krogg: " + kroggHP);
			System.out.println("Boss:  " + bossHP);
			
		}
		
		if(kroggHP > 0) {
			System.out.println("\nKrogg has won");
		} else {
			System.out.println("\nBoss has won");
		}
		
	}
	
	public static double attack(double attack, double defense) {
		
		//roll a d20
		double roll = 1 + (int)(Math.random() * 20);
		
		//attack dmg is 1d20 + attack strength
		roll += Math.floor(attack);
		
		//Dmg dealt is attack - defense
		return roll - defense;
		
	}
}
