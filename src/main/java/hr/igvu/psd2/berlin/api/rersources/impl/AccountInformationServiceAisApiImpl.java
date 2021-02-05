package hr.igvu.psd2.berlin.api.rersources.impl;

import java.time.LocalDate;
import java.util.UUID;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import hr.igvu.psd2.berlin.api.model.AccountList;
import hr.igvu.psd2.berlin.api.model.Authorisations;
import hr.igvu.psd2.berlin.api.model.Body;
import hr.igvu.psd2.berlin.api.model.CardAccountList;
import hr.igvu.psd2.berlin.api.model.CardAccountsTransactionsResponse200;
import hr.igvu.psd2.berlin.api.model.ConsentInformationResponse200Json;
import hr.igvu.psd2.berlin.api.model.ConsentStatusResponse200;
import hr.igvu.psd2.berlin.api.model.Consents;
import hr.igvu.psd2.berlin.api.model.ConsentsResponse201;
import hr.igvu.psd2.berlin.api.model.InlineResponse2002;
import hr.igvu.psd2.berlin.api.model.InlineResponse2003;
import hr.igvu.psd2.berlin.api.model.InlineResponse2006;
import hr.igvu.psd2.berlin.api.model.InlineResponse2007;
import hr.igvu.psd2.berlin.api.model.ReadAccountBalanceResponse200;
import hr.igvu.psd2.berlin.api.model.ReadCardAccountBalanceResponse200;
import hr.igvu.psd2.berlin.api.model.ScaStatusResponse;
import hr.igvu.psd2.berlin.api.model.StartScaprocessResponse;
import hr.igvu.psd2.berlin.api.model.TransactionsResponse200Json;
import hr.igvu.psd2.berlin.api.rersources.AccountInformationServiceAisApi;
import hr.igvu.psd2.srvc.IAisSrvc;

public class AccountInformationServiceAisApiImpl implements AccountInformationServiceAisApi{

	@Inject
	IAisSrvc srvc;
	
	@Override
	public ConsentsResponse201 createConsent(UUID xRequestID, String psUIPAddress, @Valid Consents body, String digest, String signature, byte[] tpPSignatureCertificate, String PSU_ID, String psUIDType, String psUCorporateID, String psUCorporateIDType, Boolean tpPRedirectPreferred, String tpPRedirectURI, String tpPNokRedirectURI, Boolean tpPExplicitAuthorisationPreferred,
			String tpPBrandLoggingInformation, String tpPNotificationURI, String tpPNotificationContentPreferred, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteConsent(String consentId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AccountList getAccountList(UUID xRequestID, String consentID, Boolean withBalance, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadAccountBalanceResponse200 getBalances(String accountId, UUID xRequestID, String consentID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardAccountList getCardAccount(UUID xRequestID, String consentID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReadCardAccountBalanceResponse200 getCardAccountBalances(String accountId, UUID xRequestID, String consentID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID,
			String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardAccountsTransactionsResponse200 getCardAccountTransactionList(String accountId, @NotNull String bookingStatus, UUID xRequestID, String consentID, LocalDate dateFrom, LocalDate dateTo, String entryReferenceFrom, Boolean deltaList, Boolean withBalance, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept,
			String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Authorisations getConsentAuthorisation(String consentId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsentInformationResponse200Json getConsentInformation(String consentId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScaStatusResponse getConsentScaStatus(String consentId, String authorisationId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsentStatusResponse200 getConsentStatus(String consentId, UUID xRequestID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InlineResponse2006 getTransactionDetails(String accountId, String transactionId, UUID xRequestID, String consentID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID,
			String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionsResponse200Json getTransactionList(String accountId, @NotNull String bookingStatus, UUID xRequestID, String consentID, LocalDate dateFrom, LocalDate dateTo, String entryReferenceFrom, Boolean deltaList, Boolean withBalance, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset,
			String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InlineResponse2003 readAccountDetails(String accountId, UUID xRequestID, String consentID, Boolean withBalance, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID,
			String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InlineResponse2007 readCardAccount(String accountId, UUID xRequestID, String consentID, String digest, String signature, byte[] tpPSignatureCertificate, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StartScaprocessResponse startConsentAuthorisation(UUID xRequestID, String consentId, @Valid Body body, String digest, String signature, byte[] tpPSignatureCertificate, String PSU_ID, String psUIDType, String psUCorporateID, String psUCorporateIDType, Boolean tpPRedirectPreferred, String tpPRedirectURI, String tpPNokRedirectURI, String tpPNotificationURI,
			String tpPNotificationContentPreferred, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding, String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InlineResponse2002 updateConsentsPsuData(UUID xRequestID, String consentId, String authorisationId, @Valid Body body, String digest, String signature, byte[] tpPSignatureCertificate, String PSU_ID, String psUIDType, String psUCorporateID, String psUCorporateIDType, String psUIPAddress, String psUIPPort, String psUAccept, String psUAcceptCharset, String psUAcceptEncoding,
			String psUAcceptLanguage, String psUUserAgent, String psUHttpMethod, UUID psUDeviceID, String psUGeoLocation) {
		// TODO Auto-generated method stub
		return null;
	}

}
