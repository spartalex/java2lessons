package lesson6;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;

public class OkHttpBookerExample {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();

        String requestBody = "{\n" +
                "        \"username\" : \"admin\",\n" +
                "                \"password\" : \"password123\"\n" +
                "    }";

        MediaType JSON = MediaType.parse("JSON");
        RequestBody requestBodyBooker = RequestBody.create(requestBody, JSON);

        Request request = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/auth")
                .post(requestBodyBooker)
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String responseBody = response.body().string();

        //{"token":"fb5c36a101af08e"}
        String token = responseBody.split(":")[1];
        System.out.println(token);
        String resultToken = token.replaceAll("[\"}]", "");
        System.out.println(resultToken);

        String bookingBody = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        RequestBody requestBodyBooking = RequestBody.create(bookingBody, JSON);

        Request requestBooking = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/booking")
                .post(requestBodyBooking)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .addHeader("Cookie", String.format("token=%s", resultToken))
                .build();

        Response responseBookingCreation = okHttpClient.newCall(requestBooking).execute();
        System.out.println(responseBookingCreation.body().string());
    }
}
