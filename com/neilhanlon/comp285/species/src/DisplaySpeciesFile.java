import org.omg.CORBA.DynAnyPackage.Invalid;

import javax.swing.*;
import java.io.*;

/**
 * Created by Neil on 11/20/2014.
 */
public class DisplaySpeciesFile extends JFileChooser {
    private static Species[] species;
    private boolean display;
    public Species[] getSpecies(){ return species; }
    public DisplaySpeciesFile() { this(true); }
    public DisplaySpeciesFile(boolean display){
        this.display = display;
        species = openFile();
        if(display) {
            for (Species s : species) {
                s.writeOutput();
            }
        }

    }
    public Species[] openFile(){
        JFileChooser chooser = new JFileChooser("f:/development/comp285/com/neilhanlon/comp285/species/src");

        if(chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            Species[] species = null;
            try{
                fis = new FileInputStream(chooser.getSelectedFile());
                ois = new ObjectInputStream(fis);
                species = (Species[]) ois.readObject();
            } catch (FileNotFoundException e) {
                System.err.println("[FATAL]\tCould not find file.... Retrying");
                return null;
            } catch (InvalidClassException | StreamCorruptedException | ClassNotFoundException e) {
                System.err.println("[FATAL]\tCorrupted Species File.... Retrying");
                return null;
            } catch (IOException e) {
                System.err.println("[FATAL]\tI/O Error.... Aborting");
                System.exit( 1 );
            } finally {
                return species;
            }
        } else {
            System.out.println("[NOTICE]\tCancel Selected. Exiting");
            System.exit(0);
            return null;
        }
    }
    public static void main(String[] args){ new DisplaySpeciesFile();}
}
