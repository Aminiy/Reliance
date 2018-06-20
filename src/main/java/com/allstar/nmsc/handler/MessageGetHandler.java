
package com.allstar.nmsc.handler;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;

public class MessageGetHandler implements HttpHandler {

	@Override
	public void handleRequest(HttpServerExchange exchange) throws Exception {

		exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
		exchange.getResponseSender()
				.send("[{\"id\":1,\"name\":\"catten\",\"tag\":\"cat\"},{\"id\":2,\"name\":\"doggy\",\"tag\":\"dog\"}]");

		// get request headers
		String userId = exchange.getRequestHeaders().getFirst("userId");
		System.out.println("----->> userId from request:" + userId);
	}
}
