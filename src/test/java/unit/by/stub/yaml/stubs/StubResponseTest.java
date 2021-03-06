package unit.by.stub.yaml.stubs;

import org.junit.Assert;
import org.junit.Test;
import by.stub.yaml.stubs.StubResponse;

/**
 * @author Alexander Zagniotov
 * @since 10/24/12, 10:49 AM
 */
public class StubResponseTest {

   @Test
   public void getResponseBody_ShouldReturnFile_WhenFileIsSet() throws Exception {

      final StubResponse stubResponse = new StubResponse();
      stubResponse.setFile("/path/to/file");
      stubResponse.setBody("this is some body");

      Assert.assertEquals("/path/to/file", stubResponse.getResponseBody());
   }

   @Test
   public void getResponseBody_ShouldReturnBody_WhenFileIsNull() throws Exception {

      final StubResponse stubResponse = new StubResponse();
      stubResponse.setFile(null);
      stubResponse.setBody("this is some body");

      Assert.assertEquals("this is some body", stubResponse.getResponseBody());
   }

   @Test
   public void getResponseBody_ShouldReturnBody_WhenFileIsEmpty() throws Exception {

      final StubResponse stubResponse = new StubResponse();
      stubResponse.setFile("");
      stubResponse.setBody("this is some body");

      Assert.assertEquals("this is some body", stubResponse.getResponseBody());
   }

   @Test
   public void getResponseBody_ShouldReturnEmptyBody_WhenFileAndBodyAreNull() throws Exception {

      final StubResponse stubResponse = new StubResponse();
      stubResponse.setFile(null);
      stubResponse.setBody(null);

      Assert.assertEquals("", stubResponse.getResponseBody());
   }

   @Test
   public void getResponseBody_ShouldReturnEmptyBody_WhenBodyIsEmpty() throws Exception {

      final StubResponse stubResponse = new StubResponse();
      stubResponse.setFile(null);
      stubResponse.setBody("");

      Assert.assertEquals("", stubResponse.getResponseBody());
   }
}
