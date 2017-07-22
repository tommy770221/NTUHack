import java.io.*;

public class ParseCSV2 {


    public static void main(String args[]) throws IOException {





        BufferedReader br = new BufferedReader(new FileReader("/Users/tommy/Downloads/busClean" +
                ".csv"));
          try {
            StringBuilder sb = new StringBuilder();
            String sCurrentLine="";
              while ((sCurrentLine = br.readLine()) != null) {
                  System.out.println(sCurrentLine);
              }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }

    }


}
