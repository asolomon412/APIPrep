package com.apidemo.controller;

import java.io.IOException;
import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.jobs.v3.CloudTalentSolution;
import com.google.api.services.jobs.v3.model.Company;
import com.google.api.services.jobs.v3.model.CreateCompanyRequest;
import com.google.api.services.jobs.v3.model.ListCompaniesResponse;

@Controller
public class GoogleTalentController {
	

	@RequestMapping("/talent")
	public ModelAndView talent() throws IOException {
		
		try {
	      ListCompaniesResponse listCompaniesResponse = talentSolutionClient.projects().companies()
	              .list(DEFAULT_PROJECT_ID)
	              .execute();
	      createCompany(new Company());
	      //listCompaniesResponse.set("Quicken", Company.class);
	          System.out.println("Request Id is " + listCompaniesResponse.getMetadata().getRequestId());
	          if (listCompaniesResponse.getCompanies() != null) {
	            for (Company company : listCompaniesResponse.getCompanies()) {
	              System.out.println(company.getName());
	            }
	          }
	        } catch (IOException e) {
	          System.out.println("Got exception while listing companies");
	          throw e;
	        }

		return new ModelAndView("index");
	}
	
	public static final com.google.api.client.json.JsonFactory JSON_FACTORY = new JacksonFactory();
	  public static final NetHttpTransport NET_HTTP_TRANSPORT = new NetHttpTransport();
	  public static final String SCOPES = "https://www.googleapis.com/auth/jobs";
	  // In your environment,
	  // export GOOGLE_CLOUD_PROJECT="your project id"
	  // Or set project id here directly.
	  public static final String DEFAULT_PROJECT_ID =
	      "projects/" + System.getenv("GOOGLE_CLOUD_PROJECT");

	  public static CloudTalentSolution talentSolutionClient = createTalentSolutionClient(
	      generateCredential());

	  public static CloudTalentSolution createTalentSolutionClient(GoogleCredential credential) {
	    String url = "https://jobs.googleapis.com";
	    return new CloudTalentSolution.Builder(
	        NET_HTTP_TRANSPORT, JSON_FACTORY, setHttpTimeout(credential))
	        .setApplicationName("JobServiceClientSamples")
	        .setRootUrl(url)
	        .build();
	  }

	  public static GoogleCredential generateCredential() {
	    try {
	      // Credentials could be downloaded after creating service account
	      // set the `GOOGLE_APPLICATION_CREDENTIALS` environment variable, for example:
	      // export GOOGLE_APPLICATION_CREDENTIALS=/path/to/your/key.json
	      return GoogleCredential
	          .getApplicationDefault(NET_HTTP_TRANSPORT, JSON_FACTORY)
	          .createScoped(Collections.singleton(SCOPES));
	    } catch (Exception e) {
	      System.out.print("Error in generating credential");
	      throw new RuntimeException(e);
	    }
	  }

	  public static HttpRequestInitializer setHttpTimeout(
	      final HttpRequestInitializer requestInitializer) {
	    return request -> {
	      requestInitializer.initialize(request);
	      request.setHeaders(new HttpHeaders().set("X-GFE-SSL", "yes"));
	      request.setConnectTimeout(1 * 60000); // 1 minute connect timeout
	      request.setReadTimeout(1 * 60000); // 1 minute read timeout
	    };
	  }

	  public static CloudTalentSolution getTalentSolutionClient() {
	    return talentSolutionClient;
	  }
	  
	  public static Company createCompany(Company companyToBeCreated) throws IOException {
//		  companyToBeCreated.setExternalId("Java Test");
//		  companyToBeCreated.setDisplayName("Java Test");
//		  companyToBeCreated.set("Request_ID", id);
		  //companyToBeCreated.set
		  try {
		    CreateCompanyRequest createCompanyRequest =
		        new CreateCompanyRequest().setCompany(companyToBeCreated);
		    Company companyCreated =
		        talentSolutionClient.projects()
		            .companies()
		            .create(DEFAULT_PROJECT_ID, createCompanyRequest)
		            .execute();
		    System.out.println("Company created: " + companyCreated);
		    return companyCreated;
		  } catch (IOException e) {
		    System.out.println("Got exception while creating company");
		    throw e;
		  }
		}
}
