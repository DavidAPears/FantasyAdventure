public interface ITroll extends IRoom {

    void doAction(PlayerCharacter player);
    int getHealthPoints();
    void takeDamage(int damage);
}
