package weedem.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@Path("/teste")
public class TesteApi {
	
	@GET
	@Path("/servidor")
	@Produces(MediaType.TEXT_PLAIN + "; charset=UTF-8")
	@ApiOperation(
			value = "Serviço para ser utilizado pela monitoração. Verifica se as API Rest estão respondendo corretamente")
	public String checaServidor() {
		return "ok";
	}


}
