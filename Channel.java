import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Channel")
public class Channel {
   
  private String name;

  public Channel(){
  }
  
  public Channel(String nm){
    this.setName(nm);
  }

  @XmlElement(name="name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
