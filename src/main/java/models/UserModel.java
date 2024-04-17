package models;

public class UserModel {

//    instance variables
    private String name;
    private String email;

/*Constructor   Non parameterized ,parameterized*/

    public UserModel() {
        System.out.println("UserModel Here");
    }

    public UserModel(String name, String email) {
        this.name = name;
        this.email = email;
    }

//    /*getter  ----get data from private instance variable */
//    public String getName(){
//        return this.name;
//    }
//
//    /*setter ----- set the data to private instance variable*/
//    public void setName(String name){
//        this.name = name;
//    }


    /*methods --     getters setters   */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(name != null){
            System.out.println("We added your value to our name variable");
        }else{
            System.out.println("No value here");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
