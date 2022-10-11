public class Road {
    public static void main() {
        BMW bmw = new BMW();
        Mercedes mercedes = new Mercedes();
        CarRepoImpl carRepoImpl = new CarRepoImpl();
        bmw.setDriveSound("vrrrm");
        mercedes.setDriveSound("vrymmm");
        bmw.drive();
        mercedes.drive();
        bmw.setNewSound("bip bip");
        mercedes.setNewSound("bip bip");
        carRepoImpl.newSound(mercedes);
    }
    public static void polimorf() {
        Car bmw = new BMW();
        Car mercedes = new Mercedes();
        bmw.drive();
        mercedes.drive();
    }
}



