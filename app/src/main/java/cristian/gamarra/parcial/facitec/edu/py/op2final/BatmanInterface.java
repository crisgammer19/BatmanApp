package cristian.gamarra.parcial.facitec.edu.py.op2final;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by CRISTIAN GAMARRA on 19/10/2016.
 */
public interface BatmanInterface {
     @GET("/?s=Batman")
     void getMovies(Callback<Result> callback);


}
