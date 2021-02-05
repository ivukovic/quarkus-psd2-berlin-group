package hr.igvu.psd2.berlin.api.rersources.impl;

import java.util.UUID;

import javax.inject.Inject;
import javax.validation.Valid;

import hr.igvu.psd2.berlin.api.model.ConfirmationOfFunds;
import hr.igvu.psd2.berlin.api.model.InlineResponse2008;
import hr.igvu.psd2.berlin.api.rersources.ConfirmationOfFundsServicePiisApi;
import hr.igvu.psd2.srvc.ICofSrvc;

public class ConfirmationOfFundsServicePiisApiImpl implements ConfirmationOfFundsServicePiisApi{

	@Inject
	ICofSrvc srvc;
	
	@Override
	public InlineResponse2008 checkAvailabilityOfFunds(@Valid ConfirmationOfFunds body, UUID xRequestID, String authorization, String digest, String signature, byte[] tpPSignatureCertificate) {
		// TODO Auto-generated method stub
		return null;
	}

}
