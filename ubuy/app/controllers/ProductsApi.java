package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

// JSON
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;


public class ProductsApi extends Controller 
{
    public static Result getProduct(String user_name, int product_id)
    {
	System.out.println(user_name);

	return ok(Json.toJson("ok!"));
    }

}
