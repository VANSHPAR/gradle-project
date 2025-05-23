package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {
    public static void main(String[] args) {
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
//Retrofit retrofit=new Retrofit.Builder()
//        .build(url)

    }
}