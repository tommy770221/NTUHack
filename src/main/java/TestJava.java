import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import com.ntuhackathon.ubike.model.api.TextResponse;

import java.io.File;
import java.io.IOException;

public class TestJava {

    public static void main(String args[]) throws IOException {

        String base64Png=Base64.encodeBase64String(FileUtils.readFileToByteArray(new File("/Users/tommy/Downloads/imgBike.jpg")));
       // System.out.println(base64Png);
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n  " +
                                                                       "\"requests\": [\n    " +
                                                                                         "{\n      \"image\": {\n        \"content\": \""+base64Png+"\"     },\n     " +
                                                                                                 " \"features\": [\n        {\n         " +
                                                                                                                                 " \"type\": \"DOCUMENT_TEXT_DETECTION\"\n        " +
                                                                                                                               "}\n     " +
                                                                                                               " ]\n   " +
                                                                                             " }\n  " +
                                                                                     "]\n}");
        Request request = new Request.Builder()
                .url("https://vision.googleapis.com/v1/images:annotate?key=AIzaSyCF0oh0dPvdTbgCs-Nrlc0J8cKqCC72cA4")
                .post(body)
                .addHeader("content-type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "2987f722-ce7e-d33e-1769-db6219e968a6")
                .build();

        Response response = client.newCall(request).execute();
        ObjectMapper mapper = new ObjectMapper();
        TextResponse textResponse= mapper.readValue(response.body().string(), TextResponse.class);

        System.out.println(textResponse.getResponses().get(0).getTextAnnotations().get(0).getDescription());


    }

}
