package Retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    // static 정적 메소드는 클래스가 메모리에 올라갈 때 정적 메소드가 자동적으로 생성.
    // 따라서 인스턴스를 따로 생성하지 않아도 호출이 가능. https://coding-factory.tistory.com/524
    private static final String BASE_URL = "https://reqres.in/";
    public static RetrofitService getApi() {
        return getInstance().create(RetrofitService.class);
    };

    private static Retrofit getInstance() {
        Gson gson = new GsonBuilder().setLenient().create();
        return new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
    }

}
