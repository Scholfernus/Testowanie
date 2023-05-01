package pl.sdacademy.storage;

public class Connection {
    //true połączenie otwarte
    //false połączenie zamknięte
    private boolean state;

    void open() throws InterruptedException {
        Thread.sleep(500);
        state = true;
    }

    void close() throws InterruptedException {
        Thread.sleep(500);
        state = false;
    }

    boolean isOpened() {
        return state;
    }

    boolean isClosed() {
        //true jeżeli jest zamknięte
        return !isOpened();
    }

    void refresh() {
        //todo
        System.out.println("Refreshing connection...");
    }
}
