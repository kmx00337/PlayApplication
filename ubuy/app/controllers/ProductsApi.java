package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


// JSON
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;


public class ProductsApi extends Controller 
{
    public static Result getProduct(String user_name, long product_id, String fields)
    {
	System.out.println(user_name);
	System.out.println(product_id);



//クエリにコンマ区切りでそのまま代入して大丈夫？
//	String[] params = fields.split(",");
//	for (int i = 0; i < params.length ; i++){
//		String column = params[i];	
//		System.out.println(column);
//	}	


	return ok(Json.toJson("ok!"));
    }

}
