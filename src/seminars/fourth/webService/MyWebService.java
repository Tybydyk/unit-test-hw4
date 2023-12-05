package seminars.fourth.webService;

public class MyWebService {
    MyHttpClient myHttpClient = new MyHttpClient();

        public MyWebService(MyHttpClient myHttpClient) {
            this.myHttpClient = myHttpClient;
        }

        public String sendRequest(String url){
            return myHttpClient.get(url);

        }
}
