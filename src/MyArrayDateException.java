public class MyArrayDateException extends Exception {
    public MyArrayDateException(String message) {
        super(message);
    }

    public MyArrayDateException(int i, int j, String message) {
        super("в ячейке [" + i + "]" + "[" + j + "] " + message);
    }
}
