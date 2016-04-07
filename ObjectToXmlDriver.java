import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXmlDriver {
  public static final String FILE_NAME ="channel.xml";
  public static void main(String[] args) throws JAXBException{
    try {
      Marshaller marshaller = (JAXBContext.newInstance(Channel.class)).createMarshaller();
      marshaller.marshal(new Channel("ComputerAcademy"), new File(FILE_NAME));
    } catch (JAXBException e) {
      throw new JAXBException(e.getMessage());
    }
  }
}
