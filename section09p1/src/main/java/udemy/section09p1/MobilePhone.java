package udemy.section09p1;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if ((phoneNumber == this.myNumber) && isOn) {
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            isRinging = false;
            System.out.println("Phone is switched off or number different");
        }
        return isRinging;
    }

    @Override
    public void dial(int phoneNumber) {
        if (this.isOn) {
            System.out.println("Now ringing " + phoneNumber + "on deskphone");
        } else {
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("Mobilephone turning on");
        this.isOn = true;
    }
}
