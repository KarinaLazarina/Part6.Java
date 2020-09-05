import java.io.*;

public class FileClass {
    private String fileName;

    public FileClass(String fileName) {
        this.fileName = fileName;
    }

    public void writeToFile(String s){
        File file = new File(this.fileName);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(){
        File file = new File(this.fileName);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String s;
            while ((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
