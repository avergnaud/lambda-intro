package usage1;

import java.util.List;

import marvel.api.CharactersAPI;
import marvel.api.request.CharactersRequest;

public class _0GET {
	public static List<marvel.model.Character> PERSOS() {
		
		// conf MARVEL
		CharactersAPI api = CharactersAPI
				.configureKeys("ac627b5a9da2dd5127e9583595c671f9",
						"c2110625d1f04ad9cf37d57cd2e9e4e2bddc6fc1")
				/* .configureProxyHost("px-internet")optional */
				/*.configureProxyPort("80") optional */
				.init();

		CharactersRequest firstRequest = api.requestBuilder().limite(30)/* optional */
		.build();

		List<marvel.model.Character> persos = firstRequest.get();

		return persos;
	}
}
