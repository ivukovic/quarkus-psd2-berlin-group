package hr.igvu.psd2.srvc.impl.sandbox;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import hr.igvu.psd2.srvc.IPaymentSrvc;
import hr.igvu.psd2.srvc.ISigningBasketSrvc;
import hr.igvu.psd2.srvc.impl.AbstractPaymentSrvc;
import hr.igvu.psd2.srvc.impl.AbstractSigningBasketSrvc;

@Dependent
public class SigningBasketSrvcSandbox extends AbstractSigningBasketSrvc implements ISigningBasketSrvc, Serializable {

	private static final long serialVersionUID = 1L;

}
