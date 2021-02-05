package hr.igvu.psd2.berlin.api;

import java.time.LocalDate;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.eclipse.microprofile.openapi.annotations.Operation;
//import org.eclipse.microprofile.openapi.annotations.media.ArraySchema;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.openapi.annotations.tags.Tags;

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
import hr.igvu.psd2.berlin.api.model.error.Error400NGAIS;
import hr.igvu.psd2.berlin.api.model.error.Error401NGAIS;
import hr.igvu.psd2.berlin.api.model.error.Error403NGAIS;
import hr.igvu.psd2.berlin.api.model.error.Error404NGAIS;
import hr.igvu.psd2.berlin.api.model.error.Error405NGAIS;
import hr.igvu.psd2.berlin.api.model.error.Error406NGAIS;
import hr.igvu.psd2.berlin.api.model.error.Error409NGAIS;
import hr.igvu.psd2.berlin.api.model.error.Error429NGAIS;

/**
 * NextGenPSD2 XS2A Framework
 *
 * <p>
 * # Summary The **NextGenPSD2** *Framework Version 1.3.8* (with several errata)
 * offers a modern, open, harmonised and interoperable set of Application
 * Programming Interfaces (APIs) as the safest and most efficient way to provide
 * data securely. The NextGenPSD2 Framework reduces XS2A complexity and costs,
 * addresses the problem of multiple competing standards in Europe and, aligned
 * with the goals of the Euro Retail Payments Board, enables European banking
 * customers to benefit from innovative products and services ('Banking as a
 * Service') by granting TPPs safe and secure (authenticated and authorised)
 * access to their bank accounts and financial data. The possible Approaches
 * are: * Redirect SCA Approach * OAuth SCA Approach * Decoupled SCA Approach *
 * Embedded SCA Approach without SCA method * Embedded SCA Approach with only
 * one SCA method available * Embedded SCA Approach with Selection of a SCA
 * method Not every message defined in this API definition is necessary for all
 * approaches. Furthermore this API definition does not differ between methods
 * which are mandatory, conditional, or optional. Therefore for a particular
 * implementation of a Berlin Group PSD2 compliant API it is only necessary to
 * support a certain subset of the methods defined in this API definition.
 * **Please have a look at the implementation guidelines if you are not sure
 * which message has to be used for the approach you are going to use.** ## Some
 * General Remarks Related to this version of the OpenAPI Specification: *
 * **This API definition is based on the Implementation Guidelines of the Berlin
 * Group PSD2 API.** It is not a replacement in any sense. The main
 * specification is (at the moment) always the Implementation Guidelines of the
 * Berlin Group PSD2 API. * **This API definition contains the REST-API for
 * requests from the PISP to the ASPSP.** * **This API definition contains the
 * messages for all different approaches defined in the Implementation
 * Guidelines.** * According to the OpenAPI-Specification
 * [https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.1.md]
 * \"If in is \"header\" and the name field is \"Accept\", \"Content-Type\" or
 * \"Authorization\", the parameter definition SHALL be ignored.\" The element
 * \"Accept\" will not be defined in this file at any place. The elements
 * \"Content-Type\" and \"Authorization\" are implicitly defined by the OpenApi
 * tags \"content\" and \"security\". * There are several predefined types which
 * might occur in payment initiation messages, but are not used in the standard
 * JSON messages in the Implementation Guidelines. Therefore they are not used
 * in the corresponding messages in this file either. We added them for the
 * convenience of the user. If there is a payment product, which needs these
 * fields, one can easily use the predefined types. But the ASPSP need not to
 * accept them in general. * **We omit the definition of all standard HTTP
 * header elements (mandatory/optional/conditional) except they are mentioned in
 * the Implementation Guidelines.** Therefore the implementer might add these in
 * his own realisation of a PSD2 comlient API in addition to the elements
 * defined in this file. ## General Remarks on Data Types The Berlin Group
 * definition of UTF-8 strings in context of the PSD2 API has to support at
 * least the following characters a b c d e f g h i j k l m n o p q r s t u v w
 * x y z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 0 1 2 3 4 5 6 7 8 9
 * / - ? : ( ) . , ' + Space
 *
 */
@Path("/")
public interface AccountInformationServiceAisApi {

	/**
	 * Create consent
	 *
	 * This method create a consent resource, defining access rights to dedicated
	 * accounts of a given PSU-ID. These accounts are addressed explicitly in the
	 * method as parameters as a core function. **Side Effects** When this consent
	 * request is a request where the \&quot;recurringIndicator\&quot; equals
	 * \&quot;true\&quot;, and if it exists already a former consent for recurring
	 * access on account information for the addressed PSU, then the former consent
	 * automatically expires as soon as the new consent request is authorised by the
	 * PSU. Optional Extension: As an option, an ASPSP might optionally accept a
	 * specific access right on the access on all PSD2 related services for all
	 * available accounts. As another option an ASPSP might optionally also accept a
	 * command, where only access rights are inserted without mentioning the
	 * addressed account. The relation to accounts is then handled afterwards
	 * between PSU and ASPSP. This option is not supported for the Embedded SCA
	 * Approach. As a last option, an ASPSP might in addition accept a command with
	 * access rights * to see the list of available payment accounts or * to see the
	 * list of available payment accounts with balances.
	 *
	 */
	@POST
	@Path("/v1/consents")
	@Consumes({ "application/json" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Create consent")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)") })
	@APIResponses(value = {
			@APIResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = ConsentsResponse201.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public ConsentsResponse201 createConsent(@HeaderParam("X-Request-ID") UUID xRequestID,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @Valid Consents body,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-ID") String PSU_ID, @HeaderParam("PSU-ID-Type") String psUIDType,
			@HeaderParam("PSU-Corporate-ID") String psUCorporateID,
			@HeaderParam("PSU-Corporate-ID-Type") String psUCorporateIDType,
			@HeaderParam("TPP-Redirect-Preferred") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI") String tpPNokRedirectURI,
			@HeaderParam("TPP-Explicit-Authorisation-Preferred") Boolean tpPExplicitAuthorisationPreferred,
			@HeaderParam("TPP-Brand-Logging-Information") String tpPBrandLoggingInformation,
			@HeaderParam("TPP-Notification-URI") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred") String tpPNotificationContentPreferred,
			@HeaderParam("PSU-IP-Port") String psUIPPort, @HeaderParam("PSU-Accept") String psUAccept,
			@HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Delete consent
	 *
	 * The TPP can delete an account information consent object if needed.
	 *
	 */
	@DELETE
	@Path("/v1/consents/{consentId}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Delete consent")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)") })
	@APIResponses(value = { @APIResponse(responseCode = "204", description = "No Content"),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public void deleteConsent(@PathParam("consentId") String consentId, @HeaderParam("X-Request-ID") UUID xRequestID,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Read account list
	 *
	 * Read the identifiers of the available payment account together with booking
	 * balance information, depending on the consent granted. It is assumed that a
	 * consent of the PSU to this access is already given and stored on the ASPSP
	 * system. The addressed list of accounts depends then on the PSU ID and the
	 * stored consent addressed by consentId, respectively the OAuth2 access token.
	 * Returns all identifiers of the accounts, to which an account access has been
	 * granted to through the /consents endpoint by the PSU. In addition, relevant
	 * information about the accounts and hyperlinks to corresponding account
	 * information resources are provided if a related consent has been already
	 * granted. Remark: Note that the /consents endpoint optionally offers to grant
	 * an access on all available payment accounts of a PSU. In this case, this
	 * endpoint will deliver the information about all available payment accounts of
	 * the PSU at this ASPSP.
	 *
	 */
	@GET
	@Path("/v1/accounts")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read account list")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)") })
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = AccountList.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public AccountList getAccountList(@HeaderParam("X-Request-ID") UUID xRequestID,
			@HeaderParam("Consent-ID") String consentID, @QueryParam("withBalance") Boolean withBalance,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Read balance
	 *
	 * Reads account data from a given account addressed by
	 * \&quot;account-id\&quot;. **Remark:** This account-id can be a tokenised
	 * identification due to data protection reason since the path information might
	 * be logged on intermediary servers within the ASPSP sphere. This account-id
	 * then can be retrieved by the \&quot;Get account list\&quot; call. The
	 * account-id is constant at least throughout the lifecycle of a given consent.
	 *
	 */
	@GET
	@Path("/v1/accounts/{account-id}/balances")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read balance")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)") })
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ReadAccountBalanceResponse200.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public ReadAccountBalanceResponse200 getBalances(@PathParam("account-id") String accountId,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("Consent-ID") String consentID,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Read a list of card accounts
	 *
	 * Reads a list of card accounts with additional information, e.g. balance
	 * information. It is assumed that a consent of the PSU to this access is
	 * already given and stored on the ASPSP system. The addressed list of card
	 * accounts depends then on the PSU ID and the stored consent addressed by
	 * consentId, respectively the OAuth2 access token.
	 *
	 */
	@GET
	@Path("/v1/card-accounts")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read a list of card accounts")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)") })
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = CardAccountList.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public CardAccountList getCardAccount(@HeaderParam("X-Request-ID") UUID xRequestID,
			@HeaderParam("Consent-ID") String consentID, @HeaderParam("Digest") String digest,
			@HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Read card account balances
	 *
	 * Reads balance data from a given card account addressed by
	 * \&quot;account-id\&quot;. Remark: This account-id can be a tokenised
	 * identification due to data protection reason since the path information might
	 * be logged on intermediary servers within the ASPSP sphere. This account-id
	 * then can be retrieved by the \&quot;Get card account list\&quot; call.
	 *
	 */
	@GET
	@Path("/v1/card-accounts/{account-id}/balances")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read card account balances")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)") })
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ReadCardAccountBalanceResponse200.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public ReadCardAccountBalanceResponse200 getCardAccountBalances(@PathParam("account-id") String accountId,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("Consent-ID") String consentID,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Read transaction list of an account
	 *
	 * Reads account data from a given card account addressed by
	 * \&quot;account-id\&quot;.
	 *
	 */
	@GET
	@Path("/v1/card-accounts/{account-id}/transactions")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read transaction list of an account")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)") })
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = CardAccountsTransactionsResponse200.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public CardAccountsTransactionsResponse200 getCardAccountTransactionList(@PathParam("account-id") String accountId,
			@QueryParam("bookingStatus") @NotNull String bookingStatus, @HeaderParam("X-Request-ID") UUID xRequestID,
			@HeaderParam("Consent-ID") String consentID, @QueryParam("dateFrom") LocalDate dateFrom,
			@QueryParam("dateTo") LocalDate dateTo, @QueryParam("entryReferenceFrom") String entryReferenceFrom,
			@QueryParam("deltaList") Boolean deltaList, @QueryParam("withBalance") Boolean withBalance,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Get consent authorisation sub-resources request
	 *
	 * Return a list of all authorisation subresources IDs which have been created.
	 * This function returns an array of hyperlinks to all generated authorisation
	 * sub-resources.
	 *
	 */
	@GET
	@Path("/v1/consents/{consentId}/authorisations")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Get consent authorisation sub-resources request")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)") })
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = Authorisations.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public Authorisations getConsentAuthorisation(@PathParam("consentId") String consentId,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("Digest") String digest,
			@HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Get consent request
	 *
	 * Returns the content of an account information consent object. This is
	 * returning the data for the TPP especially in cases, where the consent was
	 * directly managed between ASPSP and PSU e.g. in a redirect SCA Approach.
	 *
	 */
	@GET
	@Path("/v1/consents/{consentId}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Get consent request")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)") })
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ConsentInformationResponse200Json.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public ConsentInformationResponse200Json getConsentInformation(@PathParam("consentId") String consentId,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("Digest") String digest,
			@HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Read the SCA status of the consent authorisation
	 *
	 * This method returns the SCA status of a consent initiation&#x27;s
	 * authorisation sub-resource.
	 *
	 */
	@GET
	@Path("/v1/consents/{consentId}/authorisations/{authorisationId}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read the SCA status of the consent authorisation")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)"), @Tag(name = "Common Services") })
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ScaStatusResponse.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public ScaStatusResponse getConsentScaStatus(@PathParam("consentId") String consentId,
			@PathParam("authorisationId") String authorisationId, @HeaderParam("X-Request-ID") UUID xRequestID,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Consent status request
	 *
	 * Read the status of an account information consent resource.
	 *
	 */
	@GET
	@Path("/v1/consents/{consentId}/status")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Consent status request")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)")

	})
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ConsentStatusResponse200.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public ConsentStatusResponse200 getConsentStatus(@PathParam("consentId") String consentId,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("Digest") String digest,
			@HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Read transaction details
	 *
	 * Reads transaction details from a given transaction addressed by
	 * \&quot;transactionId\&quot; on a given account addressed by
	 * \&quot;account-id\&quot;. This call is only available on transactions as
	 * reported in a JSON format. **Remark:** Please note that the PATH might be
	 * already given in detail by the corresponding entry of the response of the
	 * \&quot;Read Transaction List\&quot; call within the _links subfield.
	 *
	 */
	@GET
	@Path("/v1/accounts/{account-id}/transactions/{transactionId}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read transaction details")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)")

	})
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = InlineResponse2006.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public InlineResponse2006 getTransactionDetails(@PathParam("account-id") String accountId,
			@PathParam("transactionId") String transactionId, @HeaderParam("X-Request-ID") UUID xRequestID,
			@HeaderParam("Consent-ID") String consentID, @HeaderParam("Digest") String digest,
			@HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Read transaction list of an account
	 *
	 * Read transaction reports or transaction lists of a given account ddressed by
	 * \&quot;account-id\&quot;, depending on the steering parameter
	 * \&quot;bookingStatus\&quot; together with balances. For a given account,
	 * additional parameters are e.g. the attributes \&quot;dateFrom\&quot; and
	 * \&quot;dateTo\&quot;. The ASPSP might add balance information, if transaction
	 * lists without balances are not supported.
	 *
	 */
	@GET
	@Path("/v1/accounts/{account-id}/transactions")
	@Produces({ "application/json", "application/xml", "text/plain", "application/problem+json" })
	@Operation(summary = "Read transaction list of an account")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)")

	})
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = TransactionsResponse200Json.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public TransactionsResponse200Json getTransactionList(@PathParam("account-id") String accountId,
			@QueryParam("bookingStatus") @NotNull String bookingStatus, @HeaderParam("X-Request-ID") UUID xRequestID,
			@HeaderParam("Consent-ID") String consentID, @QueryParam("dateFrom") LocalDate dateFrom,
			@QueryParam("dateTo") LocalDate dateTo, @QueryParam("entryReferenceFrom") String entryReferenceFrom,
			@QueryParam("deltaList") Boolean deltaList, @QueryParam("withBalance") Boolean withBalance,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Read account details
	 *
	 * Reads details about an account, with balances where required. It is assumed
	 * that a consent of the PSU to this access is already given and stored on the
	 * ASPSP system. The addressed details of this account depends then on the
	 * stored consent addressed by consentId, respectively the OAuth2 access token.
	 * **NOTE:** The account-id can represent a multicurrency account. In this case
	 * the currency code is set to \&quot;XXX\&quot;. Give detailed information
	 * about the addressed account. Give detailed information about the addressed
	 * account together with balance information
	 *
	 */
	@GET
	@Path("/v1/accounts/{account-id}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read account details")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)")

	})
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = InlineResponse2003.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public InlineResponse2003 readAccountDetails(@PathParam("account-id") String accountId,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("Consent-ID") String consentID,
			@QueryParam("withBalance") Boolean withBalance, @HeaderParam("Digest") String digest,
			@HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Read details about a card account
	 *
	 * Reads details about a card account. It is assumed that a consent of the PSU
	 * to this access is already given and stored on the ASPSP system. The addressed
	 * details of this account depends then on the stored consent addressed by
	 * consentId, respectively the OAuth2 access token.
	 *
	 */
	@GET
	@Path("/v1/card-accounts/{account-id}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read details about a card account")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)")

	})
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = InlineResponse2007.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public InlineResponse2007 readCardAccount(@PathParam("account-id") String accountId,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("Consent-ID") String consentID,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Start the authorisation process for a consent
	 *
	 * Create an authorisation sub-resource and start the authorisation process of a
	 * consent. The message might in addition transmit authentication and
	 * authorisation related data. his method is iterated n times for a n times SCA
	 * authorisation in a corporate context, each creating an own authorisation
	 * sub-endpoint for the corresponding PSU authorising the consent. The ASPSP
	 * might make the usage of this access method unnecessary, since the related
	 * authorisation resource will be automatically created by the ASPSP after the
	 * submission of the consent data with the first POST consents call. The start
	 * authorisation process is a process which is needed for creating a new
	 * authorisation or cancellation sub-resource. This applies in the following
	 * scenarios: * The ASPSP has indicated with an &#x27;startAuthorisation&#x27;
	 * hyperlink in the preceding Payment initiation response that an explicit start
	 * of the authorisation process is needed by the TPP. The
	 * &#x27;startAuthorisation&#x27; hyperlink can transport more information about
	 * data which needs to be uploaded by using the extended forms: *
	 * &#x27;startAuthorisationWithPsuIdentfication&#x27;, *
	 * &#x27;startAuthorisationWithPsuAuthentication&#x27; *
	 * &#x27;startAuthorisationWithEncryptedPsuAuthentication&#x27; *
	 * &#x27;startAuthorisationWithAuthentciationMethodSelection&#x27; * The related
	 * payment initiation cannot yet be executed since a multilevel SCA is mandated.
	 * * The ASPSP has indicated with an &#x27;startAuthorisation&#x27; hyperlink in
	 * the preceding payment cancellation response that an explicit start of the
	 * authorisation process is needed by the TPP. The
	 * &#x27;startAuthorisation&#x27; hyperlink can transport more information about
	 * data which needs to be uploaded by using the extended forms as indicated
	 * above. * The related payment cancellation request cannot be applied yet since
	 * a multilevel SCA is mandate for executing the cancellation. * The signing
	 * basket needs to be authorised yet.
	 *
	 */
	@POST
	@Path("/v1/consents/{consentId}/authorisations")
	@Consumes({ "application/json" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Start the authorisation process for a consent")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)"), @Tag(name = "Common Services")

	})
	@APIResponses(value = {
			@APIResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = StartScaprocessResponse.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public StartScaprocessResponse startConsentAuthorisation(@HeaderParam("X-Request-ID") UUID xRequestID,
			@PathParam("consentId") String consentId, @Valid Body body, @HeaderParam("Digest") String digest,
			@HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-ID") String PSU_ID, @HeaderParam("PSU-ID-Type") String psUIDType,
			@HeaderParam("PSU-Corporate-ID") String psUCorporateID,
			@HeaderParam("PSU-Corporate-ID-Type") String psUCorporateIDType,
			@HeaderParam("TPP-Redirect-Preferred") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI") String tpPNokRedirectURI,
			@HeaderParam("TPP-Notification-URI") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred") String tpPNotificationContentPreferred,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Update PSU Data for consents
	 *
	 * This method update PSU data on the consents resource if needed. It may
	 * authorise a consent within the Embedded SCA Approach where needed.
	 * Independently from the SCA Approach it supports e.g. the selection of the
	 * authentication method and a non-SCA PSU authentication. This methods updates
	 * PSU data on the cancellation authorisation resource if needed. There are
	 * several possible update PSU data requests in the context of a consent request
	 * if needed, which depends on the SCA approach: * Redirect SCA Approach: A
	 * specific Update PSU data request is applicable for * the selection of
	 * authentication methods, before choosing the actual SCA approach. * Decoupled
	 * SCA Approach: A specific update PSU data request is only applicable for *
	 * adding the PSU Identification, if not provided yet in the payment initiation
	 * request or the Account Information Consent Request, or if no OAuth2 access
	 * token is used, or * the selection of authentication methods. * Embedded SCA
	 * Approach: The Update PSU data request might be used * to add credentials as a
	 * first factor authentication data of the PSU and * to select the
	 * authentication method and * transaction authorisation. The SCA Approach might
	 * depend on the chosen SCA method. For that reason, the following possible
	 * update PSU data request can apply to all SCA approaches: * Select an SCA
	 * method in case of several SCA methods are available for the customer. There
	 * are the following request types on this access path: * Update PSU
	 * identification * Update PSU authentication * Select PSU autorization method
	 * WARNING: This method needs a reduced header, therefore many optional elements
	 * are not present. Maybe in a later version the access path will change. *
	 * Transaction Authorisation WARNING: This method needs a reduced header,
	 * therefore many optional elements are not present. Maybe in a later version
	 * the access path will change.
	 *
	 */
	@PUT
	@Path("/v1/consents/{consentId}/authorisations/{authorisationId}")
	@Consumes({ "application/json" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Update PSU Data for consents")
	@Tags(value = { @Tag(name = "Account Information Service (AIS)"), @Tag(name = "Common Services")

	})
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = InlineResponse2002.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGAIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGAIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGAIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGAIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable", content = @Content(schema = @Schema(implementation = Error406NGAIS.class))),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGAIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests", content = @Content(schema = @Schema(implementation = Error429NGAIS.class))),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public InlineResponse2002 updateConsentsPsuData(@HeaderParam("X-Request-ID") UUID xRequestID,
			@PathParam("consentId") String consentId, @PathParam("authorisationId") String authorisationId,
			@Valid Body body, @HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-ID") String PSU_ID, @HeaderParam("PSU-ID-Type") String psUIDType,
			@HeaderParam("PSU-Corporate-ID") String psUCorporateID,
			@HeaderParam("PSU-Corporate-ID-Type") String psUCorporateIDType,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);
}
