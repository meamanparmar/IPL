
// package com.wecp.progressive.config;

// import java.io.IOException;
// import java.io.InputStream;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.util.Properties;

// import javax.management.RuntimeErrorException;

// public class DatabaseConnectionManager {

//     private static final Properties properties = new Properties();
//     static{
//         loadProperties();
//     }
//     private static void loadProperties(){
//         try (InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")){
//             if(input == null){
//                 throw new IllegalStateException("resource.properties not found in classpath");

//             }
//             properties.load(input);
//         }
//         catch(IOException e){
//             throw new RuntimeException("Error loading properties file", e);
//         }
//     }

//     public static Connection getConnection() throws SQLException{
//         String url=properties.getProperty("spring.datasource.url");
//         String user=properties.getProperty("spring.datasource.username");
//         String password=properties.getProperty("spring.datasource.password");
//         return DriverManager.getConnection(url, user,password);
//     }




// }

package com.wecp.progressive.config;
 
import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.SQLException;
import java.util.Properties;
 
public class DatabaseConnectionManager {
    private static Connection connection;
 
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties properties = new Properties();
properties.load(DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties"));
 
                String url = properties.getProperty("db.url");
                String username = properties.getProperty("db.username");
                String password = properties.getProperty("db.password");
 
                connection = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}