public class Move {

    String moveName, moveType;
    int movePower; float moveAccuracy;

    public Move(String name, String type, int power, float accuracy) {
        moveName = name; moveType = type;
        movePower = power; moveAccuracy = accuracy;
    }

    public String getName() {
        return moveName;
    }

    public String getType() {
        return moveType;
    }

    public int getPower() {
        return movePower;
    }

    public float getAccuracy() {
        return moveAccuracy;
    }

}
