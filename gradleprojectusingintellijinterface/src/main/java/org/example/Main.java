package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
//       OkHttpClient client=new OkHttpClient();//it is library used to make http calls easily
//
//        String url="https://jsonplaceholder.typicode.com/todos/1";
//        Request request=new Request.Builder()
//                .url(url)
//                .build();
//        try (Response response=client.newCall(request).execute()){// client.newcall(request).execute() makes tcp connection between server and user
//            if(!response.isSuccessful()){
//                System.out.println("Something went wrong!! ");
//            }
//            System.out.println(response.body().string());
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
          Retrofit retrofit=new Retrofit.Builder()
                  .baseUrl("https://jsonplaceholder.typicode.com")
                  .addConverterFactory(GsonConverterFactory.create())
                  .build();

          TodoService todoService = retrofit.create(TodoService.class);
          Todo t=todoService.getTodoById("5").execute().body();
        System.out.println("Todo object downloaded is " + t.toString());

    }
}