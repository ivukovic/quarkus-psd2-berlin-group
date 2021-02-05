package hr.igvu.psd2.inf.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Psd2Exception extends Throwable {
	
	private static final long serialVersionUID = 1L;

}
