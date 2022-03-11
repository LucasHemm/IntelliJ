public class Task {
    String [] organisations ={"CPHBusiness", "SpaceX", "Brentford"};
    //test data
    String test_fullName = "Christian Eriksen";
    int test_organisation = 2;
    String test_country = "Great Britain";


    public String generateEmail(){

                String initials = getInitials(test_fullName);
        String organisation = getOrganisation(test_organisation);
        String countryCode = getCountryCode(test_country);

        String email = initials+"@"+organisation+"."+countryCode;
        return email.toLowerCase();
    }

    //Method for generating the first part of an email address
     public String getInitials(String fullName) {

        /*TODO: Lav array''et med navnene her (se hint 1)*/
       
        /*TODO: Erklær en String variabel til at gemme alle forbogstaver*/
      
        /*TODO: Gennemløb array''et, find for-bogstavet i hvert navn, og føj det til String variablen som skal returneres (se hint 2)*/
        
        /*TODO: returner variablen*/

         String[] names = fullName.split(" ");
         String initials ="";
         for(String s : names){
             initials += s.charAt(0);
         }
        return initials ;
    }

    //Method for generating the second part of an email adress
       public String getOrganisation(int i) {
       if(i >= 0 && i < 3){
            return organisations[i].toLowerCase();
        }
        else return null; }

    //Method for generating the last part of an email adress
      public String getCountryCode(String s){
        /*TODO:
           1) Erlær en String variablen til landekoden,
           2) skriv switch - case,
           3) returner variablen */

          String code;
          switch(s){
              case "Denmark":
                  code = "dk";
                  break;
              case "Great Britain":
                  code = "co.uk";
                  break;
              case "USA":
                  code = "com";
                  break;
              default:
                  code = null;
          }
          return code;
    }

}







