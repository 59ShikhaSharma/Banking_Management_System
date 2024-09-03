package mongoConnector;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.Scanner;
public class MongoDBConfiguration {
    private Scanner scanner;

    public MongoDBConfiguration(Scanner scanner) {
        this.scanner = scanner;
    }

    // Replace the placeholder with your MongoDB deployment's connection string
        private String url;
        public MongoCollection getConnection(){
            System.out.print("Enter MongoDB url : ");
            url = scanner.nextLine();

            MongoClient mongoClient = MongoClients.create(url);
            MongoDatabase database = mongoClient.getDatabase("employees");
            MongoCollection<Document> collection = database.getCollection("manager");
            return collection;
        }

}
