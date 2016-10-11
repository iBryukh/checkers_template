import checkers.client.CheckersBot;
import checkers.client.Client;
import checkers.pojo.board.Board;
import checkers.pojo.checker.CheckerColor;
import checkers.pojo.step.Step;

/**
 * Created by oleh_kurpiak on 11.10.2016.
 */
public class Main {

    public static void main(String[] args){
        int port = 3000;
        String ip = "localhost";

        Client client = new Client(ip, port, new CheckersBot() {
            public void onGameStart(CheckerColor checkerColor) {
                System.out.println(checkerColor);
            }

            public Step next(Board board) {
                return new Step();
            }

            public void onGameEnd(String s) {
                System.out.println(s);
            }

            public String clientBotName() {
                return "my_bot_name";
            }
        });
        client.run();
    }

}
