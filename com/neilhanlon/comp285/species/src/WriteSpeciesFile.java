import javax.swing.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Neil on 11/20/2014.
 */
public class WriteSpeciesFile extends JFileChooser {
    public WriteSpeciesFile()
    {
        JFileChooser chooser = new JFileChooser("f:/development/comp285/com/neilhanlon/comp285/species/src");

        if(chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            List<String> fileText = openFile(file);
            Species[] species = parseFile(fileText);
            writeFile(species);
        }
    }
    public void writeFile(Species[] species)
    {
        JFileChooser chooser = new JFileChooser("f:/development/comp285/com/neilhanlon/comp285/species/src");

        if(chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();

            FileOutputStream fos = null;
            ObjectOutputStream out = null;
            try{
                fos = new FileOutputStream(file);
                out = new ObjectOutputStream(fos);
                out.writeObject(species);
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public List<String> openFile(File file)
    {
        Charset charset = Charset.forName("UTF-8");
        List<String> fileText = new ArrayList<String>();

        try (BufferedReader reader = Files.newBufferedReader(file.toPath(), charset)) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileText.add(line);
            }
        } catch (IOException x) {
        }
        return fileText;
    }
    public Species[] parseFile(List<String> fileText)
    {
        Species[] speciesArray = new Species[fileText.size()];
        int i = 0;
        for(String s : fileText)
        {
            String[] data = s.split(",");
            speciesArray[i] = new Species(data[0],Integer.parseInt(data[1]),Double.parseDouble(data[2]));
            i++;
        }

        return speciesArray;

    }
    public static void main(String[] args)
    {
        new WriteSpeciesFile();
    }
}
