package com.bridgelabz.RestApi_CQA107;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SpotifyApis {

	// USER PROFILE

	@Test

	public void GetCurrentUsersProfile() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.header("Authorization",
				" Bearer BQCCvnZmT70RHAOmGAu4jZdPacUKhwfYPEEW7C2tLjgVf_aZpi-7qhkKmFoaD3WbHsxSJKj8mVGWxfe2nLlCVnrCjB9fd5McozG07_OUbwM4SnTty5fSBovHE2iGEEB349AhrB3gAHxA8nMTEMWa4ehekEyaPZL-ULoMm7dad6mG7S9mJF2SFJWIPeu9bGMKMrHCRj-Z4F1IwZZDQ5igwCJ9CuRHqwTf4Sds-A2VnQvv8gPRbfc");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET, " 	https://api.spotify.com/v1/me");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void GetUsersProfile() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.header("Authorization",
				" Bearer BQA2ahoUoR1_JTlXGwQPrQOCPVP-Ua4yMOleWSh0PmOoTnPcCO9dVhIOBJuAJzAGgNxNkg9TvPaBC7kysePS3imx031EbXSWlsG-gC26R4s1Uw0Pwq-1gAitS92ixs_NG7PY5Byg3OFdD92LTeMaWjBu2CXspeGLv2uGz_06qFKikdnSI3y4jGaJUgQLtgEbo44");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET,
				"https://api.spotify.com/v1/users/313a3yru6abb5w6gxqvaqzffybfu");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	// SEARCH

	@Test

	public void SearchforItem() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.header("Authorization",
				" Bearer BQAr8j435yHsioOLhir84BTL8ZnxQM5x9S398ovnaJWRfPLXGj2YbGegpYa2BBMrtNk-EbF2JvZxtL3iby8qMc6bhXsMRj283tSIaLRP8oBUkCPIR4wvScawrWX3unRS9Dx7cMwJ5SQSMX2UlwYsIKbgMFrl6G1WMqsKibDr1zmBjt81XHt-wsGvZanfUrX0Pvk");
		requestSpecification.queryParam("q", "music");
		requestSpecification.queryParam("type", "track");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET, "https://api.spotify.com/v1/search");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	// PLAYLIST

	@Test

	public void CreatePlaylist() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.header("Authorization",
				"Bearer BQDvmJGjxvphB-l3QSIqHvZ3J4KMItThArg_iEj-CXC8TmGKsnlZAQmlYUJxcSPZCyuRqvgnlCmuaIcpbhXbh3qPAf3fXMy52dipa4yYyQEF7-hxx8prAoPFFeYhu1ryeajAHTMfUqXZ2xVxDf3C6tnEWDWIkZAqqcp8G5D_DGiVrTb_QG6g4nr7RC5BjSL4MfHU1nb2EN4Wq-w7knBB0Jhsm4avz5RS78jeJbaADJNmZT4q6KHkzsiBdo5w0sO0");
		requestSpecification.body("{\r\n" + "  \"name\": \"DJ SONGS\",\r\n"
				+ "  \"description\": \"MARATHI SONGS\",\r\n" + "  \"public\": false\r\n" + "}");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.POST,
				"	https://api.spotify.com/v1/users/313a3yru6abb5w6gxqvaqzffybfu/playlists");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 201);
	}

	@Test

	public void GetCurrentUsersPlaylists() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.header("Authorization",
				" Bearer BQDx4fDsp6NGIAZjSvud6unLRXDXI6CtP_MRmEhJPOXeVp9ojBbdW15xz8yvCc9vTqsrrCcLwqQOc2L_92hkBRJyKl-eOh8BjxLh5IkBC1O2ZdxoSquCAvqnib_C7ZQwh_PFpZQKltij0xcaRStb8jsDZz1izulEQKXM8E67B6dElJcp78GFGjR9n8IRHhBNocB5pHp3hLz_5S_O");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET, "https://api.spotify.com/v1/me/playlists");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void GetPlaylistCoverImage() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.header("Authorization",
				"  Bearer BQA5HH514mcIayIfPYxNrz52Ivp0OQMF8xwKoH8bRM0koih_2r0O82RCNxyQUzKWSyRVxynoIHEkt4XM9FWPsIpWYF5-en9-J7dHEmZ7ZwHAHYUxjvydweWVxcvRxiHYO9oizBr5xhuhptRQGzX8NbGuu0ZMZtbR1Sf8c3iO0EV7LHijmv9GdPD7c_B8MUBK-Xo");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET,
				"	https://api.spotify.com/v1/playlists/7uAIYEhguf7q24Dv2IGgeH/images");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void GetPlaylistItems() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.header("Authorization",
				"Bearer BQA5HH514mcIayIfPYxNrz52Ivp0OQMF8xwKoH8bRM0koih_2r0O82RCNxyQUzKWSyRVxynoIHEkt4XM9FWPsIpWYF5-en9-J7dHEmZ7ZwHAHYUxjvydweWVxcvRxiHYO9oizBr5xhuhptRQGzX8NbGuu0ZMZtbR1Sf8c3iO0EV7LHijmv9GdPD7c_B8MUBK-Xo");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET,
				"	https://api.spotify.com/v1/playlists/7uAIYEhguf7q24Dv2IGgeH/tracks");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void GetPlaylist() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.header("Authorization",
				"Bearer BQCgNJrccKFEQ3A49AXD4CNP0riCowDKVbjNPqQWOtRtzevhtxXnE0FeCEa_cZSRVGxDBpUKoMwZH5Nqeatjtj96xRUn-HgYN6EgIBtQhIMyxYyEJL7pZXIVMQ1ygK82mbUll7VR5CmiOg9tcP_biHXXLEpDrZOOGS_LAejN_uYnLF0ZXptr4M5joUR79CwDb6M");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET,
				"https://api.spotify.com/v1/playlists/7uAIYEhguf7q24Dv2IGgeH");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void GetUsersPlaylists() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.header("Authorization",
				"Bearer BQDJpWSW9EzOwngTRrIDdZN-kGwFO_JY4zCsK-MIUR6Yj8nC8yWObsjF5h4WfRW_44NPN7TSLH2dpBUdImyxaEedXRby89twJnjpDkcup9nzruWOor1TGrqP9leeCLJpTdVhWNQ3RtzLF8ifzJGYQVdZ8xiC6s1dkVoChQV_fUp_XC0l4fLgb8Hc4wkBGMAWhWTAvri-O8_Vpmr7DqQ");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET,
				"	https://api.spotify.com/v1/users/313a3yru6abb5w6gxqvaqzffybfu/playlists");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void ChangePlaylistDetails() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.header("Authorization",
				"Bearer BQDUJ5sWB5QopOiA5zigSqe2lyIo6je4VKMgvq9N-08EwwiFlXdaXmEzsG8POqAPCO5aPUpXZQkLLFUVYy5UO52TCaMrop_5fYGNNGctjsV32gY7JP6CFJ8mTgGOtcbhRJkwGi5ts3BYVT8i9a3eCqWsIN100OJOaoF2JUJtKAVuTW_dchAuXd2INvdWjP-pdznlyqC8Bs42Tw5srKbsAy4NzOHvsXIyF6f3EHEL-IhPYwvPzE5EKLGq6ut7_5Wm");
		requestSpecification.body("{\r\n" + "  \"name\": \"DJJJ\",\r\n"
				+ "  \"description\": \"Updated playlist description\",\r\n" + "  \"public\": false\r\n" + "}");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.PUT,
				"	https://api.spotify.com/v1/playlists/7uAIYEhguf7q24Dv2IGgeH");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void AddItemstoPlaylist() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.header("Authorization",
				"Bearer BQAWJ_PYKMyFXMMg1oRSROvpWthIDt0CE6ti0ndC0g9S1Coyxr4uz__Ap9_4QFJ3F47k-PZRg7RJHU3yhNawDZmcwLQZyvAgY74L96zfehAD0Pv_AxxxBC7SlQzxifsK7Nmz6GoW5Dn81ARd0NWI12zWO2AWU0DuWmx9Oq588coSG1SGPjazOIqbfFTiVIg40K-fQzCY7qB1_e8BNMIXPrIRvIa_xIMxdjWotmWZEJbv9aUp7Pe1drY4EQfHgswv");
		requestSpecification.queryParam("uris", "spotify:track:0bYg9bo50gSsH3LtXe2SQn");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.POST,
				"	https://api.spotify.com/v1/playlists/7uAIYEhguf7q24Dv2IGgeH/tracks");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 201);
	}
}
