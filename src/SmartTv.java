public class SmartTv {

    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void powerOn() {
        on = true;
    }

    public void powerOff() {
        on = false;
    }

    public void incrementVolume() {
        volume++;
    }

    public void decrementVolume() {
        volume--;
    }

    public void upChannel() {
        channel++;
    }

    public void downChannel() {
        channel--;
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }
}
