class MyArraySizeExeption extends Exception {
    public MyArraySizeExeption(String message) {
        super(message);
    }
    public MyArraySizeExeption(String message, int cheсkSize) {
        super(message+cheсkSize);
    }
    public MyArraySizeExeption(String message1, int rowNumber, String message2, int cheсkSize) {
        super(message1+rowNumber+message2+cheсkSize);
    }

}