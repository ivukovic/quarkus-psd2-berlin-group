package hr.igvu.psd2.srvc.impl.sandbox;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import hr.igvu.psd2.srvc.IPaymentSrvc;
import hr.igvu.psd2.srvc.impl.AbstractPaymentSrvc;

@Dependent
public class PaymentSrvcSandbox extends AbstractPaymentSrvc implements IPaymentSrvc, Serializable {

	private static final long serialVersionUID = 1L;

}
