public class SmartDevice {
    String brandName;
    boolean powerstatus;
    double energyUsage;

    public void turn_on_or_off(boolean powerstatus) {
        this.powerstatus = powerstatus;
        if (this.powerstatus == true) {
            System.out.println(" device on");
        } else {
            System.out.println("device off");
        }
    }

    public void display_status() {
        System.out.println("status device:" + this.powerstatus);
    }

    public static class SmartLight extends SmartDevice {
        int brightness_level;
        String colour;

        public void set_brigthness(int brightness_level) {
            System.out.println("Brigthness set");
        }

        public void colour(String colour) {
            System.out.println("colour set");
        }

        @Override
        public void display_status() {
            System.out.println("Brightness Level" + brightness_level);
            System.out.println("Colour of light" + colour);
        }
    }

    public static class SmartThremostat extends SmartLight {
        int targetTemperature;
        String mode;

        public void set_tempe(int targetTemperature) {
            System.out.println("Temperature setted");
        }

        public void set_mode(String mode) {
            System.out.println("Mode setted");
        }

        @Override
        public void display_status() {
            System.out.println("Current temperature" + targetTemperature);
            System.out.println("Current Mode" + mode);
        }
    }

    public static void main(String[] args) {
        SmartDevice sd = new SmartDevice();
        System.out.println("smart home devices");
        sd.turn_on_or_off(true);
        sd.display_status();

        SmartLight sl = new SmartLight();
        System.out.println("Smart home light statuus and attributes");
        sl.turn_on_or_off(true);
        sl.set_brigthness(55);
        sl.colour("red");
        sl.display_status();

        System.out.println("Smart thremo meter to adjust temperature");
        SmartThremostat st = new SmartThremostat();
        st.turn_on_or_off(false);
        st.set_tempe(56);
        st.set_mode("Comfort");
        st.display_status();
    }
}
