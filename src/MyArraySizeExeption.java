class MyArraySizeExeption extends Exception {
    public MyArraySizeExeption(String message) {
        super(message);
    }

    public MyArraySizeExeption(String message, int cheсkSize) {
        super(message + cheсkSize);
    }

    public MyArraySizeExeption(int rowNumber, int cheсkSize) {
        super("в строке " + rowNumber + " количество столбцов != " + cheсkSize);
    }

}
