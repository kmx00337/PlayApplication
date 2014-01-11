package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.*;

// Services
import services.ProductsApi.*;

import java.io.*;
import views.html.*;

//Utility
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


// JSON
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;


public class ProductsApi extends Controller
{
  public static Result getProduct(int user_id, int product_id, String fields)
  {
    return GetProductService.getProduct(product_id, user_id);
  }

  public static Result addProduct()
  {
    MultipartFormData partform_data = request().body().asMultipartFormData();
    FilePart filepart = partform_data.getFile("fileUpload");
    File file = filepart.getFile();
    return ok(Json.toJson("okokok"));
  }

}
