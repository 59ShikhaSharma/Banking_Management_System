package BankingManagementSystem;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.math.BigInteger;
import java.util.Scanner;

public class CustomerDetails {
    private Scanner scanner;
    private MongoCollection mongoCollection;

    public CustomerDetails(Scanner scanner, MongoCollection mongoCollection) {
        this.scanner = scanner;
        this.mongoCollection = mongoCollection;
    }

    public void addDetails(long account_no){
        System.out.println("Enter Nominee Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Relation with Nominee : ");
        String relation = scanner.nextLine();
        System.out.println("Enter phone_no. : ");
        String phone = scanner.nextLine();
        Document doc = new Document("account_no", account_no).append("Nominee",name).append("relation", relation).append("phone",phone);
        mongoCollection.insertOne(doc);
        System.out.println("added!!!!!!!!!!!!");
    }
}
