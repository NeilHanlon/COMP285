import javax.swing.*;

/**
 * Created by Neil on 11/20/2014.
 */
public class FindSpeciesRecords extends JOptionPane {
    public FindSpeciesRecords() {
        Species[] species;
        do {
            species = new DisplaySpeciesFile(false).getSpecies();
        } while (species == null);
        String target = JOptionPane.showInputDialog(this, "Enter the species name to search for", "Search for Species", JOptionPane.QUESTION_MESSAGE);
        do {
            Species s = search(species,target);
            if(s != null)
            {
                JOptionPane.showMessageDialog(this,s.getOutput(),"Species Found",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,"Could not locate that species.","Could not find species.",JOptionPane.ERROR_MESSAGE);
            }
            target = JOptionPane.showInputDialog(this, "Enter the species name to search for", "Search for Species", JOptionPane.QUESTION_MESSAGE);
        } while (target != null);

    }
    private Species search(Species[] species,String target)
    {
        for(Species s : species)
        {
            if(s.getName().equals(target)){
                return s;
            }
        }
        return null;
    }
    public static void main(String[] args){ new FindSpeciesRecords(); }
}
