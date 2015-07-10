package com.springapp.mvc;

import com.alibaba.fastjson.JSON;
import spark.Request;
import spark.Response;
import spark.ResponseTransformer;
import spark.Route;
import spark.servlet.SparkApplication;

import static spark.Spark.*;

public class HelloController implements SparkApplication{


	@Override
	public void init() {
		get("/hello", new Route() {
			public Object handle(Request request, Response response) throws Exception {
				User user = new User();
				user.username = "sssssssssssssss";
				user.password = "sdfasdf";
				return user;
			}
		}, new ResponseTransformer() {
			@Override
			public String render(Object model) throws Exception {

				return JSON.toJSONString(model);
			}
		});
	}
}