package XMLAccess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class XMLDestinationsAccess {

    private static XMLDestinationsAccess instance;
    private Document doc;
    private static String xmlpath = "xml/destinations.xml";

    private XMLDestinationsAccess() throws Exception {
        File f = new File(xmlpath);
        SAXBuilder builder = new SAXBuilder();
        doc = builder.build(f);

    }

    /**
     *
     * @return instance
     * @throws Exception
     */
    public synchronized static XMLDestinationsAccess getInstance() throws Exception {
        if (instance == null) {
            instance = new XMLDestinationsAccess();
        }
        return instance;
    }

    /**
     *
     * @return numDestinations
     */
    public int numDestinations() {
        Element root = doc.getRootElement();
        List<Element> destination = root.getChildren("destination");

        return destination.size();

    }

    /**
     *
     * @return allDestinations
     */
    public ArrayList<String> getAllDestinations() {
        ArrayList<String> redestinations = new ArrayList<>();

        Element root = doc.getRootElement();
        List<Element> destinations = root.getChildren("destination");
        for (Element destination : destinations) {
            List<Element> names = destination.getChildren("name");
            for (Element name : names) {
                redestinations.add(name.getText());

            }

        }
        return redestinations;
    }

    /**
     *
     * @param name Adds Destination
     */
    public void addDestination(String name) {

        Element root = doc.getRootElement();

        Element newElement = new Element("destination");
        newElement.addContent(new Element("name").setText(name));
        root.addContent(newElement);

        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
        try {
            xmlOutputter.output(doc, new FileOutputStream(new File("xml/destinations.xml")));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XMLDestinationsAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XMLDestinationsAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @param name Removes Destination
     */
    public void deleteDestination(String name) {

        //nix working
        Element root = doc.getRootElement();
        List<Element> destinations = root.getChildren("destination");
        for (Element destination : destinations) {
            if (destination.getChild("name").getText().equals(name)) {
                destination.removeChild("name");
            }

        }

    }

    /**
     *
     * @param args Main to test the XML file
     */
//    public static void main(String[] args) {
//        try {
//
//            XMLDestinationsAccess.getInstance().addDestination("TEST");
//            System.out.println(XMLDestinationsAccess.getInstance().numDestinations());
//            for (String s : XMLDestinationsAccess.getInstance().getAllDestinations()) {
//                System.out.println(s);
//            }
//
//        } catch (Exception ex) {
//            Logger.getLogger(XMLDestinationsAccess.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
