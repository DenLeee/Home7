public class CargoCarriage extends Carriage {

    public CargoCarriage(int wheelset) throws WheelException {
        if (wheelset < 6)
            throw new WheelException(wheelset);
        System.out.println("Грузовой вагон");
    }


}
