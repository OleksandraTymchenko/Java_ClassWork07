package alex.com.work07;

public class Main {
    public static void main(String[] args) {
//	    Device device = new Device();
//        System.out.println(device);
//        device = new Device("AAAP01", "LG", 1100.0);
//        System.out.println(device);
        Monitor monitor = new Monitor("MP_A9", "HP",
                8500.0, 102, 84);
//        System.out.println(monitor);
//        Adapter adapter = new Adapter("PP005", "AD",
//                            4562.0, 100, "823_a");
//        System.out.println(adapter);

        Device[] devices = {
                new Device("AAAP01", "LG", 1100.0),
                new Monitor("MP_A9", "HPA",8500.0, 1024, 848),
                new Device("AAAP01", "LG", 1100.0),
                new Adapter("PP006", "AD",4562.0, 100, "823_a"),
                new Adapter("PP006", "AD",4562.0, 100, "823_a")
        };

        for (Device obj : devices) {
            System.out.println(obj);
        }

        System.out.println("Equals -> " + devices[0].equals(devices[2]) );
        System.out.println("Equals monitors -> " +
                devices[1].equals(monitor));
        System.out.println("Equals adapters -> " + devices[3].equals(devices[4]));
        System.out.println(devices[3].hashCode());
        System.out.println(devices[4].hashCode());
        System.out.println(monitor.hashCode());
        System.out.println(devices[1].hashCode());
    }
}