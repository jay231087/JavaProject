import java.io.IOException;

import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;

public class CutomSchemaOutputResolver extends SchemaOutputResolver {

  @Override
  public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
    return null;
  }

}
