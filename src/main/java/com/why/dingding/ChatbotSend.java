package com.why.dingding;


import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ChatbotSend {

    public static String WEBHOOK_TOKEN = "https://oapi.dingtalk.com/robot/send?access_token=a4d2028a288a82f27ca8b7a54ec808ea61d4665cc19bd8e6fd2748a467620b2d";

    public static void main(String args[]) throws Exception {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpPost httppost = new HttpPost(WEBHOOK_TOKEN);
        httppost.addHeader("Content-Type", "application/json; charset=utf-8");

        String textMsg = "{ \"msgtype\": \"text\", \"text\": {\"content\": \"我就是我, 是不一样的烟火\"}}";
        StringEntity se = new StringEntity(textMsg, "utf-8");
        httppost.setEntity(se);
        HttpResponse response = httpClient.execute(httppost);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
        }
        httpClient.close();
    }
}
