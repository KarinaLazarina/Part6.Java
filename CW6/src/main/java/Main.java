import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        ActorDAO actorDAO = new ActorDAO();

        //actorDAO.allActors();

//        actorDAO.addActor("petya","petya");
//        actorDAO.allActors();

       // System.out.println("--------------------");

        //actorDAO.deleteById(202);
        List<ActorDAO> list = actorDAO.allActors();
        System.out.println(list);

        actorDAO.update(200, "Katya");
        actorDAO.printActors();

//        ConnectionSakila connectionSakila = new ConnectionSakila();
//        Connection connection = connectionSakila.getConnection();
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from actor ");
//        System.out.println(resultSet);
    }
}
