package hr.igvu.psd2.berlin.api.rersources.impl;

import java.util.UUID;

import javax.validation.Valid;

import hr.igvu.psd2.berlin.api.model.ConfirmationOfFunds;
import hr.igvu.psd2.berlin.api.model.InlineResponse2008;
import hr.igvu.psd2.berlin.api.rersources.ConfirmationOfFundsServicePiisApi;

public class ConfirmationOfFundsServicePiisApiImpl implements ConfirmationOfFundsServicePiisApi{

	@Override
	public InlineResponse2008 checkAvailabilityOfFunds(@Valid ConfirmationOfFunds body, UUID xRequestID, String authorization, String digest, String signature, byte[] tpPSignatureCertificate) {
		// TODO Auto-generated method stub
		return null;
	}

}
