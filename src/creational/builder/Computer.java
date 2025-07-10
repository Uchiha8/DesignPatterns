package creational.builder;

public class Computer {
    private final String cpu;
    private final int ram;

    private final int storage;
    private final boolean graphicsCard;
    private final boolean wifi;
    private final boolean bluetooth;


    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifi = builder.wifi;
        this.bluetooth = builder.bluetooth;

    }

    public static class Builder {
        private final String cpu;
        private final int ram;

        private int storage;
        private boolean graphicsCard = false;
        private boolean wifi = false;
        private boolean bluetooth = false;

        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard() {
            this.graphicsCard = true;
            return this;
        }

        public Builder setWifi() {
            this.wifi = true;
            return this;
        }

        public Builder setBluetooth() {
            this.bluetooth = true;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", graphicsCard=" + graphicsCard +
                ", wifi=" + wifi +
                ", bluetooth=" + bluetooth +
                '}';
    }

    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel i9", 32)
                .setStorage(1024)
                .setGraphicsCard()
                .build();
        Computer officePC = new Computer.Builder("Intel i5", 16)
                .setStorage(528)
                .build();

        System.out.println(gamingPC);
        System.out.println(officePC);
    }
}
