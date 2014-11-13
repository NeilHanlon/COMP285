import java.io.BufferedReader;
import java.nio.charset.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

public class Gettysburg
{
    public static void main(String[] args)
    {
        String fileText = openFile("./address.txt");
        String newText = "";

        //This regex was written very slopily, and I apolgoize. IT /will/ probably break...
        //I wasn't sure if you'd frown upon using BreakIterator... so I just went with this.
        String[] sentances = fileText.split("(?<=[a-z])[\\.!?]\\s+");
        for(String s : sentances)
        {
            newText += s + "\n";
        }

        writeFile("./newAddress.txt",newText);
    }
    public static String openFile(String fileName)
    {
        Charset charset = Charset.forName("UTF-8");
        String fileText = "";
        Path filePath = Paths.get(fileName);
        try (BufferedReader reader = Files.newBufferedReader(filePath, charset)) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileText += line + " ";
            }
            //logger.write("read file " + file.getPath().toString() + " into FileInstance " + file.hashCode());
        } catch (IOException x) {
            //logger.write(x);
        }
        return fileText;
    }
    public static void writeFile(String fileName,String fileText)
    {
        Writer writer = null;
        try
        {
            writer = new BufferedWriter(new OutputStreamWriter(
                                        new FileOutputStream(fileName),
                                         "utf-8"));
            writer.write(fileText);
            writer.flush();
            writer.close();
        } catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
    }
}