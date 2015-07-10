package com.springapp.mvc;

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
				return "hello world";
			}
		}, new ResponseTransformer() {
			@Override
			public String render(Object model) throws Exception {
				return null;
			}
		});
	}
}