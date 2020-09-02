import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Set;

public class ConnectionSakila {
    private String login = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC";
    private Connection connection;


    public ConnectionSakila() throws SQLException {

        this.connection = DriverManager.getConnection(this.url, this.login, this.password);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
