import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActorDAO {
    private int id;
    private String firstName;
    private String lastName;
    private ConnectionSakila connection;

    @Override
    public String toString() {
        return "ActorDAO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", connection=" + connection +
                '}';
    }

    public ActorDAO() throws SQLException {
        this.connection = new ConnectionSakila();
    }

    public ActorDAO(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public List<ActorDAO> allActors(){
        List<ActorDAO> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.getConnection().prepareStatement("select * from actor");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                list.add(new ActorDAO(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3)));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public void printActors(){
        try {
            PreparedStatement preparedStatement = connection.getConnection().prepareStatement("select * from actor");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void closeConnection() throws SQLException {
        connection.getConnection().close();
    }

    public void addActor(String firstName, String lastName) throws SQLException {
        PreparedStatement statement = connection.getConnection().prepareStatement("insert into actor(first_name, last_name) values (?,?) ");
        statement.setString(1,firstName);
        statement.setString(2,lastName);
        statement.executeUpdate();
    }

    public void deleteById(int id) throws SQLException {
        String query = "delete from actor where actor_id = " + id;

        System.out.println(query);
        PreparedStatement preparedStatement = connection.getConnection().prepareStatement(query);
        preparedStatement.executeUpdate();
    }

    public void update(int id, String newName) throws SQLException {
        String query = "update actor set first_name =" +"/""+ newName +"+" where actor_id = "+ id;

        PreparedStatement preparedStatement = connection.getConnection().prepareStatement(query);
        preparedStatement.executeUpdate();
    }







}
