package dao;

import models.UserModel;

public class UserDao {

    public UserDao(){
        /*create object for database connection*/
    }

//    use connection and create our query for add data to db
    public String addUser(UserModel user){
        
        String userName = null;
        try{
            /*final String INSERT_QUERY = "INSERT INTO tableName(username,email) VALUES (?,?);"*/
//            System.out.println(user.getName());
//            System.out.println(user.getEmail());
            
            userName = user.getName();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
        return userName;

    }

}
