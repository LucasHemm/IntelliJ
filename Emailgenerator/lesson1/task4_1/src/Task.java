import java.util.Scanner;

public class Task {

String[] organisations = {"CPHBusiness", "SpaceX", "Brentford"};
    //test data
    public String test_fullName="Christian Eriksen";
    public int test_organisation=2;
    public String test_country= "Great Britain";


    public String generateEmail(){

/* TODO: initialiser tre variable 'initials', 'organisation' og 'countryCode' så de fanger returværdien fra kald til de tre metoder */
        String initials = getInitials(test_fullName);
        String organisation = getOrganisation(test_organisation);
        String countryCode = getCountryCode(test_country);

        //Anvendelse af de tre variable
        String email = initials+"@"+organisation+"."+countryCode;
        return email.toLowerCase();
    }

    //Method for generating the first part of an email address
      public String getInitials(String s) {
        return "initials";
    }

    //Method for generating the second part of an email adress
       public String getOrganisation(int i){
        if(i >= 0 && i < 3){
            return organisations[i].toLowerCase();
        }
        else return null;}

    //Method for generating the last part of an email adress
       public String getCountryCode(String s){

        return "country code";
    }

}