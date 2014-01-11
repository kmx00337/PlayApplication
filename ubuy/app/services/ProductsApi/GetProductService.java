package services.ProductsApi;

import com.avaje.ebean.*;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import java.util.List;

import play.mvc.*;
import models.Products;
import models.Sample;

public class GetProductService
{
    public static Result getProduct(int product_id, int user_id)
    {
//        List<Products> PList = Products.finder.where().eq("user_id", user_id).eq("product_id", product_id).findList();
//        List<Products> PList = Products.finder.where().eq("user_id", user_id).eq("product_id", product_id).select("product_id").findList();
        String oql =
        " find sample(id)"
        +" limit 50 ";
        Query<Sample> query = Ebean.createQuery(Sample.class, oql);

        List<Sample> PList = query.findList();
        return Results.ok(Json.toJson(PList));

//        String sql = "SELECT :fields FROM Products where user_id = :user_id and product_id = :product_id";
//        List<SqlRow> ProList = Ebean.createSqlQuery(sql).setParameter("user_id", user_id).setParameter("product_id", product_id).findList();
 
    }

}
