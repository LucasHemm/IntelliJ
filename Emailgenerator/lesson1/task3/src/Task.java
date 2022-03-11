public class Task {
String[] organisations = {"CPHBusiness", "SpaceX", "Brentford"};

    //Method for generating the second part of an email address
       public String getOrganisation(int i) {

        if(i >= 0 && i < 3){
            return organisations[i].toLowerCase();
        }
        else return null;
    }



}