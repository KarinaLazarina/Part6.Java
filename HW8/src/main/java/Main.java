public class Main {
    public static void main(String[] args) {

        FileClass fileClass = new FileClass("file.txt");
        APIClass users = new APIClass("https://jsonplaceholder.typicode.com/users");
        APIClass users2 = new APIClass("https://reqres.in/api/users");
        APIClass users3 = new APIClass("https://api.mocki.io/v1/b043df5a");


        String s = users.read();
        //System.out.println(s);
        fileClass.writeToFile(s);

        String s2 = users2.read();
        fileClass.writeToFile(s2);

        String s3 = users3.read();
        fileClass.writeToFile(s3);

        fileClass.readFile();



    }
}
