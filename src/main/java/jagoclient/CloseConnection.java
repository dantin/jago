package jagoclient;

import java.io.BufferedReader;
import java.net.Socket;

public class CloseConnection extends Thread {
    Socket S;
    BufferedReader In;

    public CloseConnection(Socket s, BufferedReader in) {
        S = s;
        In = in;
        start();
    }

    public void run() {
        try {
            if (S != null) S.close();
            if (In != null) In.close();
        } catch (Exception e) {
        }
    }
}