abstract public class AFuelCar extends ACar{

    int kmPrLitre;



    public String getFuelType(){
        return "Hej";
    }

    public int getKmPrLitre(){
        return 1;
    }

    @Override
    public String toString() {
        return "Dette er en tostring inde i AFuelCar";
    }

}
