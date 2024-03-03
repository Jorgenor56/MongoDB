package dam2.MongoDB;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App {
    public static void main(String[] args) {
        //URI de conexión a tu cluster remoto MongoDB
        String connectionString = "mongodb+srv://jorgenor561:1234@tu-cluster.mongodb.net/Cluster?retryWrites=true&w=majority";
        
        //Establecer conexión con el servidor MongoDB
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            
            //Obtener la base de datos
            MongoDatabase database = mongoClient.getDatabase("mi_base_de_datos");
            
            //Obtener la colección
            MongoCollection<Document> collection = database.getCollection("mi_coleccion");
            
            //Aquí puedes realizar operaciones en la colección, como insertar, buscar, etc.
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}