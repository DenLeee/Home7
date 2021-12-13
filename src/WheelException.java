public class WheelException extends RuntimeException {

    public WheelException(int wheel) {
        super("Для данного вагона должна быть больше колесных пар чем " + wheel);
    }

    public WheelException() {
        super("Для данного вагона должна быть больше колесных пар");
    }
}
