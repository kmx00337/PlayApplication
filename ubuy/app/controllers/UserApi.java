package controllers;

//ここは適したやつだけにあとで変える。
import java.util.*;
import play.*;
import play.mvc.*;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import models.Products;
import play.db.ebean.Model.*;


public class UserApi extends Controller
{

	public static Result getProductsByGps(int id)
	{

		System.out.println(id);
		Products products = new Products();
		return ok("ok");

	}

//	public static Result getProductsByAddress()
//	{
//
//	}

}
