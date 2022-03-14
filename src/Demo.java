import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.sql.*;
import java.util.Scanner;

import static com.mongodb.client.model.Filters.eq;

public class    Demo {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Title");


        String title = scanner.nextLine();

        //facade
        Database.insertarPeliculaSQL(title);
        Database.insertarPeliculaMongo(title);

       // INSERT INTO movies(title) SET VALUES (?)



       /* testmysql();
        testmongo();*/
    }



   /* private static void testmysql() {
        String uri ="jdbc:mysql://localhost/mydatabase?user=myuser&password=mypass";
        try(Connection conn = DriverManager.getConnection(uri)){
            //INSERT
            PreparedStatement statement = conn.prepareStatement("INSERT INTO movies(title) VALUES(?)");
            statement.setString(1, "Batman");
            statement.executeUpdate();

            //QUERY
            ResultSet resultSet = conn.createStatement().executeQuery("SELECT * FROM movies");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("title"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void testmongo(){
        String uri = "mongodb://localhost";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("sampledb");
            MongoCollection<Document> collection = database.getCollection("movies");

            // INSERT
            Document doc = new Document();
            doc.append("title", "Batman");
            collection.insertOne(doc);

            //QUERY
            System.out.println(collection.find(eq("title", "Batman")).first().toJson());
        }*/
    }
