package hr.igvu.psd2.srvc.impl.sandbox;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

import hr.igvu.psd2.srvc.IAisSrvc;
import hr.igvu.psd2.srvc.ICofSrvc;
import hr.igvu.psd2.srvc.IPaymentSrvc;
import hr.igvu.psd2.srvc.impl.AbstractAisSrvc;
import hr.igvu.psd2.srvc.impl.AbstractCofSrvc;
import hr.igvu.psd2.srvc.impl.AbstractPaymentSrvc;

@Dependent
public class CofSrvcSandbox extends AbstractCofSrvc implements ICofSrvc, Serializable {

	private static final long serialVersionUID = 1L;

}
