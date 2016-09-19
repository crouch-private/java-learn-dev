public class Monster {

    String monName, monType;
    int monHP, monSpeed, monAttack, monDefense;
    Move monMove1, monMove2, monMove3, monMove4;

    public Monster(String name, String type, int hp, int speed, int attack,
                    int defense, Move move1, Move move2, Move move3,
                    Move move4) {
        monName = name; monType = type; monHP = hp; monSpeed = speed;
        monAttack = attack; monDefense = defense; monMove1 = move1;
        monMove2 = move2; monMove3 = move3; monMove4 = move4;
    }

    public String getName() {
        return monName;
    }

    public String getType() {
        return monType;
    }

    public int getHP() {
        return monHP;
    }

    public int getSpeed() {
        return monSpeed;
    }

    public int getAttack() {
        return monAttack;
    }

    public int getDefense() {
        return monDefense;
    }

    public Move getMove1() {
        return monMove1;
    }

    public Move getMove2() {
        return monMove2;
    }

    public Move getMove3() {
        return monMove3;
    }

    public Move getMove4() {
        return monMove4;
    }

}
