import okhttp3.*;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class petstoreapitest {

    @Test
    public void Createuser(){
        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody  =  RequestBody.create(new File("/Users/superaxis/Desktop/Ass-6/src/test/java/createpet.json"), MediaType.parse("application/json"));
        Request request  = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user")
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .post(requestBody)
                .build();

        try{
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();
            System.out.println("responseString : "+ responseString);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }


    @Test
    public void CreateArrayuserList(){

        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody  =  RequestBody.create(new File("/Users/superaxis/Desktop/Ass-6/src/test/java/arraypostlistpet.json"), MediaType.parse("application/json"));
        Request request  = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/createWithList")
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .post(requestBody)
                .build();


        try {
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();

            System.out.println("responseString : "+ responseString);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getCreateuser(){
        OkHttpClient client = new OkHttpClient();
        String username ="raju370446";
        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/"+username)
                .get()
                .build();

        try {
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();
            System.out.println("responseString : "+ responseString);
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    @Test
    public void updateuser(){
        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody  =  RequestBody.create(new File("/Users/superaxis/Desktop/Ass-6/src/test/java/updateuser.json"), MediaType.parse("application/json"));
        Request request  = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user")
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .post(requestBody)
                .build();
        try{
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();
            System.out.println("responseString : "+ responseString);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getCreateuser2(){
        OkHttpClient client = new OkHttpClient();
        String email ="raju@gmail.com";
        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/"+email)
                .get()
                .build();
        try {
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();
            System.out.println("responseString : "+ responseString);
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    @Test
    public void Deleteuser(){
        OkHttpClient client = new OkHttpClient();
        String username ="raju370446";
        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/"+username)
                .delete()
                .build();

        try{
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();
            System.out.println("responseString : "+ responseString);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void loginuserafter(){
        OkHttpClient client = new OkHttpClient();
        String username ="raju370446";
        String password="9528";
        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/"+username + password)
                .get()
                .build();

        try{
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();
            System.out.println("responseString : "+ responseString);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void logoutuser(){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/user/logout")
                .get()
                .build();

        try{
            Response response = client.newCall(request).execute();
            String responseString = response.body().string();
            System.out.println("responseString : "+ responseString);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
