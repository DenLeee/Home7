public abstract class GoByRail implements Moveable {   //возможность ехать по железной дороге
    private int wheelset;   // колесная пара в количестве на вагон

    public void SetWheel (int wheelset) {
        this.wheelset = wheelset;
    }

}
