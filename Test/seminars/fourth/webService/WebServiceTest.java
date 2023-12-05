package seminars.fourth.webService;

import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WebServiceTest {
    @Test
    void httpRequestTest(){
        MyHttpClient myHttpClientMock = mock(MyHttpClient.class);
        MyWebService myWebService = new MyWebService(myHttpClientMock);
        when(myHttpClientMock.get("url")).thenReturn("Ok");

        String result = myWebService.sendRequest("url");

        assertThat(result).isEqualTo("Ok");
    }
}
