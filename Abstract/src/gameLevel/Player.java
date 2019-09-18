package gameLevel;

public class Player {
    private PlayerLevel playerLevel;

    public Player(){
        playerLevel = new Beginner();
        playerLevel.showLevelMessage();
    }

    public PlayerLevel getPlayerLevel() {
        return playerLevel;
    }

    public void updateLevel( PlayerLevel playerLevel){
    this.playerLevel = playerLevel;
    playerLevel.showLevelMessage();
    }

    public void play(int count){
        playerLevel.go(count);
    }
}
