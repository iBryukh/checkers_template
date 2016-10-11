import checkers.server.Server;

/**
 * Created by oleh_kurpiak on 11.10.2016.
 */
public class Main {

    public static void main(String[] args){
        Server server = new Server(3000);
        server.run();
    }

}
