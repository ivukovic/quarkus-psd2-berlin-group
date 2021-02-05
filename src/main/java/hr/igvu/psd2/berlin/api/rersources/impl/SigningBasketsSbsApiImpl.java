package hr.igvu.psd2.berlin.api.rersources.impl;

import java.util.UUID;

import javax.validation.Valid;

import hr.igvu.psd2.berlin.api.model.Authorisations;
import hr.igvu.psd2.berlin.api.model.Body;
import hr.igvu.psd2.berlin.api.model.InlineResponse2002;
import hr.igvu.psd2.berlin.api.model.ScaStatusResponse;
import hr.igvu.psd2.berlin.api.model.SigningBasket;
import hr.igvu.psd2.berlin.api.model.SigningBasketResponse200;
import hr.igvu.psd2.berlin.api.model.SigningBasketResponse201;
import hr.igvu.psd2.berlin.api.model.SigningBasketStatusResponse200;
import hr.igvu.psd2.berlin.api.model.StartScaprocessResponse;
import hr.igvu.psd2.berlin.api.rersources.SigningBasketsSbsApi;

public class SigningBasketsSbsApiImpl implements SigningBasketsSbsApi{

	@Override
	public SigningBasketResponse201 createSigningBasket(UUID xRequestID, String psUIPAddress, @Valid SigningBasket body, String digest, String signature, byte[] tpPSignatureCertificate, String PSU_ID, String psUIDType, String psUCorporateID, String psUCorporateIDType, String consentID, Boolean tpPRedirectPreferred, String tpPRedirectURI, String tpPNokRedirectURI,
			Boolean tpPExplicitAuthorisationPreferred, String tpPNotificationURI, String tpPNotificationContentPreferred, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSigningBasket(String basketId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SigningBasketResponse200 getSigningBasket(String basketId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Authorisations getSigningBasketAuthorisation(String basketId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScaStatusResponse getSigningBasketScaStatus(String basketId, String authorisationId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SigningBasketStatusResponse200 getSigningBasketStatus(String basketId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String PSU_ID, String psUIDType, String psUCorporateID, String psUCorporateIDType, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage,
			String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StartScaprocessResponse startSigningBasketAuthorisation(UUID xRequestID, String basketId, @Valid Body body, String digest, String signature, byte[] tpPSignatureCertificate, String PSU_ID, String psUIDType, String psUCorporateID, String psUCorporateIDType, Boolean tpPRedirectPreferred, String tpPRedirectURI, String tpPNokRedirectURI, String tpPNotificationURI,
			String tpPNotificationContentPreferred, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InlineResponse2002 updateSigningBasketPsuData(UUID xRequestID, String basketId, String authorisationId, @Valid Body body, String digest, String signature, byte[] tpPSignatureCertificate, String PSU_ID, String psUIDType, String psUCorporateID, String psUCorporateIDType, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding,
			String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

}
