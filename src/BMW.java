public  class  BMW extends Car {
    private String newSound;
    public String getDriveSound() {
        return driveSound;
    }
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
