/**
 * 
 */
package com.gc.temple.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gc.temple.db.dao.TampleEventsDao;
import com.gc.temple.db.dto.Events;
import com.google.gson.Gson;




/**
 * @author Maurice Tedder
 * Temple app Web service
 */
@Path("/templews") // service call mapping 
public class TempleRestService {

	/*
	 * Return list of events in events table in JSON format.
	 * Use this url to call this web service:
	 * http://localhost:8080/TempleEventsWS/templews/listevents
	 */
	@GET // Http verb 
	@Path("/listevents")
//	@Produces(MediaType.APPLICATION_JSON)// JSON media type
	@Produces(MediaType.TEXT_PLAIN)// XML media type
	public String listEvents(){
		TampleEventsDao dao = new TampleEventsDao();
		Gson json = new Gson();		
		return json.toJson(dao.listEvents());
	}
}
