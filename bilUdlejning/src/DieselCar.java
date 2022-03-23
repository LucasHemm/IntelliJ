public class DieselCar extends AFuelCar{

    boolean particleFilter;


    public boolean hasParticleFilter(){
        return true;
    }


    @Override
    public int getRegistrationFee() {
        return 0;
    }
    @Override
    public String toString() {
        return "Dette er en tostring inde i DieselCar";
    }

}
