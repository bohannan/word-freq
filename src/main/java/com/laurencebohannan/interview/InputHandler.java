package com.laurencebohannan.interview;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;

/**
 * Created by bohannan on 6/7/15.
 */
public class InputHandler {

    public static final String UTF_8 = "UTF-8";

    public String open(String fileName) {
        URL inputStream = getClass().getResource(fileName);
        StringBuilder out = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(inputStream.openStream(), UTF_8));
            String line;


            while ((line = reader.readLine()) != null) {
                out.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }

        return out.toString();
    }

    public String openFile(String file) {
        StringBuilder output = new StringBuilder();
        String line = null;

        System.out.println("Opening file: "+file);

        try {
            // FileInputStream reads text files in the default encoding.
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, UTF_8));

            while((line = bufferedReader.readLine()) != null) {
                output.append(line);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.err.println("Unable to open file '" + file + "'");
        }
        catch(IOException ex) {
            System.err.println("Error reading file '" + file + "'");
        }
        return output.toString();
    }
}
