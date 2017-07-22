package com.ntuhackathon.ubike;

import java.io.*;

public class ParseCSV {


    public static void main(String args[]) throws IOException {



        BufferedReader br = new BufferedReader(new FileReader("/Users/tommy/Downloads/bus" +
                ".csv"));
        File file=new File("/Users/tommy/Downloads/busClean.csv");
        if(!file.exists()){
            file.createNewFile();
        }
        PrintWriter fw = new PrintWriter(new FileOutputStream("/Users/tommy/Downloads/busClean.csv",true)); //the true will append the new data
        String os = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        System.out.println(osVersion);
        System.out.println(os);



        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();


            while (line != null) {
                line = br.readLine();
                if(line !=null && !"".equals(line)){
                    if(line.startsWith("A2")){
                     //   line=line+"\r\n";
                        fw.write(line);//appends the string to the file
                        fw.write(System.lineSeparator());
                    }
                }

               // System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
            fw.close();
        }

    }


}
