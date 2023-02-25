import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * A DAO is a class that mediates the transformation of data between the format of objects in Java to rows in a
 * database. The methods here are mostly filled out, you will just need to add a SQL statement.
 *
 * We may assume that the database has already created a table named 'groceries'.
 * It contains a single column, named 'grocery_name' of type varchar(255).
 * The table will be automatically created by the databaseSetup() method in GroceryMain.java.
 */
public class GroceryDAO {


   
   public List<String> getAllGroceries(){
       Connection connection = ConnectionUtil.getConnection();
       List<String> groceries = new ArrayList<>();
       try {
           //Write SQL logic here
           String sql = "Select * from grocery";
           PreparedStatement ps = connection.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               groceries.add(rs.getString("grocery_name"));
           }
       }catch(SQLException e){
           e.printStackTrace();
       }
       return groceries;
   }
   
   
   public void addGrocery(String groceryName){
       Connection connection = ConnectionUtil.getConnection();
       try {
           //Write SQL logic here
           String sql = "insert into grocery (grocery_name) values ('"+ groceryName +"');";
           PreparedStatement ps = connection.prepareStatement(sql);
           ps.executeUpdate();
       }catch(SQLException e){
           e.printStackTrace();
       }
   }

}