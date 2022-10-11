public class Mercedes extends Car{
    private String newSound;
    public void setNewSound(String newSound) {
        this.newSound = newSound;
    }
    private String driveSound;
    public void setDriveSound(String driveSound) {
        this.driveSound = driveSound;
    }
    @Override
    public void drive() {
    }
    @Override
    public String getNewSound() {
        return newSound;
    }
}
