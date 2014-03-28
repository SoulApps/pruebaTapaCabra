package tapacabra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TapaFileManager {

    public static ArrayList<Tapa> getListaTapas() 
            throws FileNotFoundException, IOException {
        ArrayList<Tapa> alTapa = new ArrayList();
        BufferedReader br = new BufferedReader(new FileReader("TapaCabra.csv"));
        br.readLine();
        String linea = br.readLine();
        while(linea != null) {

            String[] atapa = linea.split(";");
            Tapa tapa = new Tapa(atapa[0], atapa[1], atapa[2], atapa[3], atapa[4]);
            alTapa.add(tapa);

            linea = br.readLine();
        }        
        br.close();
        return alTapa;
    }
    
    
}
