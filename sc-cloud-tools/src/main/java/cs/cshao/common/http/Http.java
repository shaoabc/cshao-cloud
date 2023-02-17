package cs.cshao.common.http;

import okhttp3.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * 网络请求
 */
public class Http {
    private static final Log log = LogFactory.getLog(Http.class);
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private static OkHttpClient client = new OkHttpClient();

    public static String post(String url, String json, Map<String, String> headers) throws IOException {

        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder().headers(Headers.of(headers)).url(url).post(body).build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String post(String url, Map<String, String> headers) throws IOException {
        return post(url, "{}", headers);
    }

    public static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String get(String url, Map<String, String> headers) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .headers(Headers.of(headers))
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String get(String url, Map<String, String> param, Map<String, String> headers) throws IOException {
        Request request = new Request.Builder()
                .url(setUrlParam(url, param))
                .headers(Headers.of(headers))
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    private static String setUrlParam(String url, Map<String, String> param) {
        StringBuffer newUrl = new StringBuffer(url);
        if (param != null && !param.isEmpty()) {
            newUrl.append("?");
            Set<Map.Entry<String, String>> entries = param.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                newUrl.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
            url = newUrl.substring(0, newUrl.length() - 1);
        }
        return url;
    }


}
