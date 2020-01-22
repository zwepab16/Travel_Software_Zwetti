
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

    public synchronized static XMLDestinationsAccess getInstance() throws Exception {
        if (instance == null) {
            instance = new XMLDestinationsAccess();
        }
        return instance;
    }

    public int numDestinations() {
        Element root = doc.getRootElement();
        List<Element> destination = root.getChildren("destination");

        return destination.size();

    }

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

    public void addISBN() {
        Element root = doc.getRootElement();
        List<Element> books = root.getChildren("book");
        Element elemBook = null;
        for (Element book : books) {
            if (book.getChild("title").getText().equals("Harry Potter")) {
                elemBook = book;
            }
        }

        int i = root.indexOf(elemBook);
        root.removeContent(elemBook);
        elemBook.addContent(new Element("isbn").setText("" + "123456789"));
        root.setContent(i, elemBook);

        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
        try {
            xmlOutputter.output(doc, new FileOutputStream(new File("xml/bookstore.xml")));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XMLAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XMLAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        try {

            System.out.println(XMLDestinationsAccess.getInstance().numDestinations());
            for (String s : XMLDestinationsAccess.getInstance().getAllDestinations()) {
                System.out.println(s);
            }

        } catch (Exception ex) {
            Logger.getLogger(XMLDestinationsAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
