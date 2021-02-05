package hr.igvu.psd2.berlin.api.rersources.impl;

import java.util.UUID;

import javax.validation.Valid;

import hr.igvu.psd2.berlin.api.model.Authorisations;
import hr.igvu.psd2.berlin.api.model.Body;
import hr.igvu.psd2.berlin.api.model.InlineResponse200;
import hr.igvu.psd2.berlin.api.model.InlineResponse2002;
import hr.igvu.psd2.berlin.api.model.PaymentInitiationCancelResponse202;
import hr.igvu.psd2.berlin.api.model.PaymentInitiationStatusResponse200Json;
import hr.igvu.psd2.berlin.api.model.ScaStatusResponse;
import hr.igvu.psd2.berlin.api.model.StartScaprocessResponse;
import hr.igvu.psd2.berlin.api.rersources.PaymentInitiationServicePisApi;

public class PaymentInitiationServicePisApiImpl implements PaymentInitiationServicePisApi {

	@Override
	public PaymentInitiationCancelResponse202 cancelPayment(String paymentService, String paymentProduct, String paymentId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, Boolean tpPRedirectPreferred, String tpPNokRedirectURI, String tpPRedirectURI, Boolean tpPExplicitAuthorisationPreferred, String psUIPAddress, String psUIPPort, String psUAccept,
			String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScaStatusResponse getPaymentCancellationScaStatus(String paymentService, String paymentProduct, String paymentId, String authorisationId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent,
			String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InlineResponse200 getPaymentInformation(String paymentService, String paymentProduct, String paymentId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID,
			String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Authorisations getPaymentInitiationAuthorisation(String paymentService, String paymentProduct, String paymentId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID,
			String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Authorisations getPaymentInitiationCancellationAuthorisationInformation(String paymentService, String paymentProduct, String paymentId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent,
			String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScaStatusResponse getPaymentInitiationScaStatus(String paymentService, String paymentProduct, String paymentId, String authorisationId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent,
			String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentInitiationStatusResponse200Json getPaymentInitiationStatus(String paymentService, String paymentProduct, String paymentId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod,
			UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StartScaprocessResponse startPaymentAuthorisation(UUID xRequestID, String paymentService, String paymentProduct, String paymentId, @Valid Body body, String PSU_ID, String psUIDType, String psUCorporateID, String psUCorporateIDType, Boolean tpPRedirectPreferred, String tpPRedirectURI, String tpPNokRedirectURI, String tpPNotificationURI, String tpPNotificationContentPreferred,
			String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StartScaprocessResponse startPaymentInitiationCancellationAuthorisation(UUID xRequestID, String paymentService, String paymentProduct, String paymentId, @Valid Body body, String digest, String signature, byte[] tpPSignatureCertificate, String PSU_ID, String psUIDType, String psUCorporateID, String psUCorporateIDType, Boolean tpPRedirectPreferred, String tpPRedirectURI,
			String tpPNokRedirectURI, String tpPNotificationURI, String tpPNotificationContentPreferred, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InlineResponse2002 updatePaymentCancellationPsuData(UUID xRequestID, String paymentService, String paymentProduct, String paymentId, String authorisationId, @Valid Body body, String digest, String signature, byte[] tpPSignatureCertificate, String PSU_ID, String psUIDType, String psUCorporateID, String psUCorporateIDType, String psUIPAddress, String psUIPPort, String psUAccept,
			String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InlineResponse2002 updatePaymentPsuData(UUID xRequestID, String paymentService, String paymentProduct, String paymentId, String authorisationId, @Valid Body body, String digest, String signature, byte[] tpPSignatureCertificate, String PSU_ID, String psUIDType, String psUCorporateID, String psUCorporateIDType, String psUIPAddress, String psUIPPort, String psUAccept,
			String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

}
