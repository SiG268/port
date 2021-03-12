package server;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {

	public static void main(String[] args) throws URISyntaxException, IOException {

		String baseUrl = "http://localhost:8090/rest";
		final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(new URI(baseUrl),
				new ResourceConfig(Service.class), false);
		server.start();
		System.out.println("Server started with base-url=" + baseUrl + "...");
		System.out.println("url=" + baseUrl + "/service/{id}");

	}

}
