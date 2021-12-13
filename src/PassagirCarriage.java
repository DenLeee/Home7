public class PassagirCarriage extends Carriage {



    public PassagirCarriage(int wheelset) throws WheelException {
        if (wheelset < 4)
            throw new WheelException(wheelset);

        System.out.println("пассажирский вагон");
    }

}
