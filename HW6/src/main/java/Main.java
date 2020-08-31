import models.Actor;
import models.Film;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?serverTimezone=UTC", "root", "root");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from actor");
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Actor> actorList = new ArrayList<>();

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String FName = resultSet.getString("first_name");
                String LName = resultSet.getString("last_name");
                actorList.add(new Actor(id,FName,LName));
            }
            System.out.println(actorList);

            List<Actor> list1 = actorList.stream()
                    .filter(actor -> actor.getLast_name().startsWith("T"))
                    .collect(Collectors.toList());
            System.out.println(list1);


            ResultSet resultSetFilms = connection.prepareStatement("select * from film").executeQuery();
            List<Film> filmList = new ArrayList<>();

            while (resultSetFilms.next()){
                Film film = new Film(resultSetFilms.getInt(1),
                        resultSetFilms.getString("title"),
                        resultSetFilms.getString("description"),
                        resultSetFilms.getDouble("rental_rate"),
                        resultSetFilms.getInt("length")
                        );

                filmList.add(film);
            }
            filmList.stream().forEach(F -> System.out.println(F));


//            DatabaseMetaData metaData = connection.getMetaData();
//            ResultSet tables = metaData.getTables(null, "sakila", "%", null);
//            while (tables.next()){
//                System.out.println(tables.getString("TABLE_NAME"));
//            }


            connection.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
