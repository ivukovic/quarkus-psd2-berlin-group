package hr.igvu.psd2.inf.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import hr.igvu.psd2.inf.exception.Psd2Exception;

public class Psd2ExceptionMapper implements ExceptionMapper<Psd2Exception> {

	@Override
	public Response toResponse(Psd2Exception ex) {
		return Response.ok()
				.build();
	}
}