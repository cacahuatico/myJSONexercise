import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import java.net.URL;

public class Battleground {


    public static void main(String[] args){

        ObjectMapper mapper = new ObjectMapper();

        try {
            MyJSON myJSON = mapper.readValue(new URL("http://ipinfo.io/json"), MyJSON.class);
            System.out.println(myJSON);

        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Look mom, I'm on TV.");
        }


    }





}
