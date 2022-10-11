public class CarRepoImpl implements CarRepo{

    @Override
    public void newSound(Car car) {
        System.out.println(car.getNewSound());
    }
}