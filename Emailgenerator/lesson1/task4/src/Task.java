public class Task {

String[] organisations = {"CPHBusiness", "SpaceX", "Brentford"};


    //Method for generating the first part of an email address
     public String getInitials(String s){
        return "initials";
    }

    //Method for generating the second part of an email address
       public String getOrganisation(int i) {
        if(i >= 0 && i < 3){
            return organisations[i].toLowerCase();
        }
        else return null;}
    //Method for generating the last part of an email address
       public String getCountryCode(String s){
        return "country code";
    }

}