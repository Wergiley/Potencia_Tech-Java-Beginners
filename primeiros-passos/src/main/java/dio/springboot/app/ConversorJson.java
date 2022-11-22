package dio.springboot.app;

//import com.google.gson.Gson;
import org.springframework.stereotype.Component;



@Component
public class ConversorJson {
    private Gson gson = new Gson();
    public ViaCepResponse converter(String Json) {
        ViaCepResponse response = gson.fromJson(Json, ViaCepResponse.class);
        return response;
    } 
}
