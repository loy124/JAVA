package gameLevel;

public class MainBoardPlay {

    public static void main(String[] args) {
      Player player = new Player();
      player.play(1);

      PlayerLevel playerLevel = new AdvancedLevel();
      player.updateLevel(playerLevel);
      player.play(2);

      PlayerLevel playerLevel1 = new SuperLevel();
      player.updateLevel(playerLevel1);
      player.play(3);
    }

}
