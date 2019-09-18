package AbstractEx;

public class ComputerTest {
    public static void main(String[] args) {

        Computer computer = new Desktop();
        computer.display();
        computer.turnOff();
        computer.turnOn();
        NoteBook computer1 = new MyNoteBook();
        computer1.display();
    }
}
