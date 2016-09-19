import java.util.Scanner;

public class Player {

    Monster playerMonster;

    public boolean hasLost() {
        return playerMonster.getHP() < 0;
    }

    public Monster getMonster() {
        return playerMonster;
    }

    public int chooseMove() {
        if(this instanceof HumanPlayer) {
            System.out.printf("\nChoose move:\n\t1) %s\n\t2) %s\n\t3) %s" +
                            "\n\t4) %s\n>", getMonster().getMove1().getName(),
                                            getMonster().getMove2().getName(),
                                            getMonster().getMove3().getName(),
                                            getMonster().getMove4().getName());
            Scanner in = new Scanner(System.in);
            return in.nextInt();
        } else {
            return (int)(1+(Math.random()*4));
        }
    }

    public boolean isFasterThan(Player target) {
        return getMonster().getSpeed() > target.getMonster().getSpeed();
    }

    public void attack(Player target, int moveChoice) {
        Move move;
        switch(moveChoice) {
            case 1:
                move = getMonster().getMove1();
                break;
            case 2:
                move = getMonster().getMove2();
                break;
            case 3:
                move = getMonster().getMove3();
                break;
            case 4:
                move = getMonster().getMove4();
                break;
            default:
                move = getMonster().getMove1();
        }
        float hitChance = (float)(Math.random());
        int damageDealt;
        if(hitChance < move.getAccuracy()) {
            damageDealt = getMonster().getAttack() + move.getPower() -
                          target.getMonster().getDefense();
        } else {
            damageDealt = 0;
        }
        target.getMonster().monHP -= damageDealt;
    }

}
