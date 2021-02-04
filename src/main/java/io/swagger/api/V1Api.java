package io.swagger.api;

import java.time.LocalDate;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.openapi.annotations.tags.Tags;

import io.swagger.model.AccountList;
import io.swagger.model.Authorisations;
import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.Body2;
import io.swagger.model.Body3;
import io.swagger.model.Body4;
import io.swagger.model.Body5;
import io.swagger.model.Body6;
import io.swagger.model.Body7;
import io.swagger.model.CardAccountList;
import io.swagger.model.CardAccountsTransactionsResponse200;
import io.swagger.model.ConfirmationOfFunds;
import io.swagger.model.ConsentInformationResponse200Json;
import io.swagger.model.ConsentStatusResponse200;
import io.swagger.model.Consents;
import io.swagger.model.ConsentsResponse201;
import io.swagger.model.Error400NGAIS;
import io.swagger.model.Error400NGPIS;
import io.swagger.model.Error400NGSBS;
import io.swagger.model.Error401NGAIS;
import io.swagger.model.Error401NGPIIS;
import io.swagger.model.Error401NGPIS;
import io.swagger.model.Error401NGSBS;
import io.swagger.model.Error403NGAIS;
import io.swagger.model.Error403NGPIIS;
import io.swagger.model.Error403NGPIS;
import io.swagger.model.Error403NGSBS;
import io.swagger.model.Error404NGAIS;
import io.swagger.model.Error404NGPIIS;
import io.swagger.model.Error404NGPIS;
import io.swagger.model.Error404NGSBS;
import io.swagger.model.Error405NGAIS;
import io.swagger.model.Error405NGPIIS;
import io.swagger.model.Error405NGPIS;
import io.swagger.model.Error405NGPISCANC;
import io.swagger.model.Error405NGSBS;
import io.swagger.model.Error406NGAIS;
import io.swagger.model.Error409NGAIS;
import io.swagger.model.Error409NGPIIS;
import io.swagger.model.Error409NGPIS;
import io.swagger.model.Error409NGSBS;
import io.swagger.model.Error429NGAIS;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.PaymentInitationRequestResponse201;
import io.swagger.model.PaymentInitiationCancelResponse202;
import io.swagger.model.PaymentInitiationStatusResponse200Json;
import io.swagger.model.PeriodicPaymentInitiationXmlPart2StandingorderTypeJson;
import io.swagger.model.ReadAccountBalanceResponse200;
import io.swagger.model.ReadCardAccountBalanceResponse200;
import io.swagger.model.ScaStatusResponse;
import io.swagger.model.SigningBasket;
import io.swagger.model.SigningBasketResponse200;
import io.swagger.model.SigningBasketResponse201;
import io.swagger.model.SigningBasketStatusResponse200;
import io.swagger.model.StartScaprocessResponse;
import io.swagger.model.TransactionsResponse200Json;

@Path("/v1")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2021-02-04T13:26:58.231Z[GMT]")
public class V1Api {

	@DELETE
	@Path("/{payment-service}/{payment-product}/{paymentId}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Payment cancellation request", description = "This method initiates the cancellation of a payment.  Depending on the payment-service, the payment-product and the ASPSP's implementation,  this TPP call might be sufficient to cancel a payment.  If an authorisation of the payment cancellation is mandated by the ASPSP,  a corresponding hyperlink will be contained in the response message.  Cancels the addressed payment with resource identification paymentId if applicable to the payment-service, payment-product and received in product related timelines (e.g. before end of business day for scheduled payments of the last business day before the scheduled execution day).   The response to this DELETE command will tell the TPP whether the   * access method was rejected,   * access method was successful, or   * access method is generally applicable, but further authorisation processes are needed. ", security = {
			@SecurityRequirement(name = "BearerAuthOAuth") })
	@Tag(name = "Payment Initiation Service (PIS)")
	@APIResponses(value = {
			@APIResponse(responseCode = "202", description = "Received", content = @Content(schema = @Schema(implementation = PaymentInitiationCancelResponse202.class))),
			@APIResponse(responseCode = "204", description = "No Content"),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPISCANC.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response cancelPayment(@PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@PathParam("paymentId")

			@Parameter(description = "Resource identification of the generated payment initiation resource.") String paymentId, @NotNull @HeaderParam("X-Request-ID")

			@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("TPP-Redirect-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. ") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Nok-Redirect-URI")

			@Parameter(description = "If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. ") String tpPNokRedirectURI, @HeaderParam("TPP-Redirect-URI")

			@Parameter(description = "URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. ") String tpPRedirectURI,
			@HeaderParam("TPP-Explicit-Authorisation-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers to start the authorisation process separately,  e.g. because of the usage of a signing basket.  This preference might be ignored by the ASPSP, if a signing basket is not supported as functionality.  If it equals \"false\" or if the parameter is not used, there is no preference of the TPP.  This especially indicates that the TPP assumes a direct authorisation of the transaction in the next step,  without using a signing basket. ") Boolean tpPExplicitAuthorisationPreferred,
			@HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@POST @Path("/funds-confirmations")@Consumes({"application/json"})@Produces({"application/json","application/problem+json"})@Operation(summary="Confirmation of funds request",description="Creates a confirmation of funds request at the ASPSP. Checks whether a specific amount is available at point of time of the request on an account linked to a given tuple card issuer(TPP)/card number, or addressed by IBAN and TPP respectively. If the related extended services are used a conditional Consent-ID is contained in the header. This field is contained but commented out in this specification.",security={@SecurityRequirement(name="BearerAuthOAuth")},"Confirmation of Funds Service (PIIS)"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = InlineResponse2008.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGAIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response checkAvailabilityOfFunds(@Valid ConfirmationOfFunds body, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Authorization")

	@Parameter(description = "This field  might be used in case where a consent was agreed between ASPSP and PSU through an OAuth2 based protocol,  facilitated by the TPP. ") String authorization, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate) {
		return Response.ok().entity("magic!").build();
	}

	@POST @Path("/consents")@Consumes({"application/json"})@Produces({"application/json","application/problem+json"})@Operation(summary="Create consent",description="This method create a consent resource, defining access rights to dedicated accounts of  a given PSU-ID. These accounts are addressed explicitly in the method as  parameters as a core function.  **Side Effects** When this consent request is a request where the \"recurringIndicator\" equals \"true\", and if it exists already a former consent for recurring access on account information  for the addressed PSU, then the former consent automatically expires as soon as the new  consent request is authorised by the PSU.  Optional Extension: As an option, an ASPSP might optionally accept a specific access right on the access on all PSD2 related services for all available accounts.  As another option an ASPSP might optionally also accept a command, where only access rights are inserted without mentioning the addressed account.  The relation to accounts is then handled afterwards between PSU and ASPSP.  This option is not supported for the Embedded SCA Approach.  As a last option, an ASPSP might in addition accept a command with access rights   * to see the list of available payment accounts or   * to see the list of available payment accounts with balances. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response createConsent(@NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. If not available, the TPP shall use the IP Address used by the TPP when submitting this request. ") String psUIPAddress, @Valid Consents body, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

	@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("TPP-Redirect-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. ") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI")

			@Parameter(description = "URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. ") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI")

			@Parameter(description = "If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. ") String tpPNokRedirectURI, @HeaderParam("TPP-Explicit-Authorisation-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers to start the authorisation process separately,  e.g. because of the usage of a signing basket.  This preference might be ignored by the ASPSP, if a signing basket is not supported as functionality.  If it equals \"false\" or if the parameter is not used, there is no preference of the TPP.  This especially indicates that the TPP assumes a direct authorisation of the transaction in the next step,  without using a signing basket. ") Boolean tpPExplicitAuthorisationPreferred,
			@HeaderParam("TPP-Brand-Logging-Information")

			@Parameter(description = "This header might be used by TPPs to inform the ASPSP about the brand used by the TPP towards the PSU.  This information is meant for logging entries to enhance communication between ASPSP and PSU or ASPSP and TPP.  This header might be ignored by the ASPSP. ") String tpPBrandLoggingInformation, @HeaderParam("TPP-Notification-URI")

			@Parameter(description = "URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. ") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred")

			@Parameter(description = "The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. ") String tpPNotificationContentPreferred,
			@HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@POST @Path("/signing-baskets")@Consumes({"application/json"})@Produces({"application/json","application/problem+json"})@Operation(summary="Create a signing basket resource",description="Create a signing basket resource for authorising several transactions with one SCA method.  The resource identifications of these transactions are contained in the payload of this access method ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Signing Baskets (SBS)"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = SigningBasketResponse201.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGSBS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGSBS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGSBS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGSBS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGSBS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGSBS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response createSigningBasket(@NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. If not available, the TPP shall use the IP Address used by the TPP when submitting this request. ") String psUIPAddress, @Valid SigningBasket body, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

	@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("Consent-ID")

			@Parameter(description = "This data element may be contained, if the payment initiation transaction is part of a session, i.e. combined AIS/PIS service. This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @HeaderParam("TPP-Redirect-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. ") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI")

			@Parameter(description = "URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. ") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI")

			@Parameter(description = "If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. ") String tpPNokRedirectURI, @HeaderParam("TPP-Explicit-Authorisation-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers to start the authorisation process separately,  e.g. because of the usage of a signing basket.  This preference might be ignored by the ASPSP, if a signing basket is not supported as functionality.  If it equals \"false\" or if the parameter is not used, there is no preference of the TPP.  This especially indicates that the TPP assumes a direct authorisation of the transaction in the next step,  without using a signing basket. ") Boolean tpPExplicitAuthorisationPreferred,
			@HeaderParam("TPP-Notification-URI")

			@Parameter(description = "URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. ") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred")

			@Parameter(description = "The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. ") String tpPNotificationContentPreferred,
			@HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@DELETE @Path("/consents/{consentId}")@Produces({"application/json","application/problem+json"})@Operation(summary="Delete consent",description="The TPP can delete an account information consent object if needed.",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "204", description = "No Content"),
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response deleteConsent(@PathParam("consentId")

	@Parameter(description = "ID of the corresponding consent object as returned by an account information consent request. ") String consentId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@DELETE @Path("/signing-baskets/{basketId}")@Produces({"application/json","application/problem+json"})@Operation(summary="Delete the signing basket",description="Delete the signing basket structure as long as no (partial) authorisation has yet been applied.  The undlerying transactions are not affected by this deletion.  Remark: The signing basket as such is not deletable after a first (partial) authorisation has been applied.  Nevertheless, single transactions might be cancelled on an individual basis on the XS2A interface. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Signing Baskets (SBS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "204", description = "No Content"),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGSBS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGSBS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGSBS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGSBS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGSBS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGSBS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response deleteSigningBasket(@PathParam("basketId")

	@Parameter(description = "This identification of the corresponding signing basket object. ") String basketId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/accounts")@Produces({"application/json","application/problem+json"})@Operation(summary="Read account list",description="Read the identifiers of the available payment account together with  booking balance information, depending on the consent granted.  It is assumed that a consent of the PSU to this access is already given and stored on the ASPSP system.  The addressed list of accounts depends then on the PSU ID and the stored consent addressed by consentId,  respectively the OAuth2 access token.   Returns all identifiers of the accounts, to which an account access has been granted to through  the /consents endpoint by the PSU.  In addition, relevant information about the accounts and hyperlinks to corresponding account  information resources are provided if a related consent has been already granted.  Remark: Note that the /consents endpoint optionally offers to grant an access on all available  payment accounts of a PSU.  In this case, this endpoint will deliver the information about all available payment accounts  of the PSU at this ASPSP. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getAccountList(@NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("Consent-ID")

	@Parameter(description = "This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @QueryParam("withBalance")

	@Parameter(description = "If contained, this function reads the list of accessible payment accounts including the booking balance,  if granted by the PSU in the related consent and available by the ASPSP.  This parameter might be ignored by the ASPSP.  ") Boolean withBalance, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/accounts/{account-id}/balances")@Produces({"application/json","application/problem+json"})@Operation(summary="Read balance",description="Reads account data from a given account addressed by \"account-id\".   **Remark:** This account-id can be a tokenised identification due to data protection reason since the path  information might be logged on intermediary servers within the ASPSP sphere.  This account-id then can be retrieved by the \"Get account list\" call.  The account-id is constant at least throughout the lifecycle of a given consent. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getBalances(@PathParam("account-id")

	@Parameter(description = "This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. ") String accountId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("Consent-ID")

	@Parameter(description = "This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/card-accounts")@Produces({"application/json","application/problem+json"})@Operation(summary="Read a list of card accounts",description="Reads a list of card accounts with additional information, e.g. balance information.  It is assumed that a consent of the PSU to this access is already given and stored on the ASPSP system.  The addressed list of card accounts depends then on the PSU ID and the stored consent addressed by consentId,  respectively the OAuth2 access token.  ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getCardAccount(@NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("Consent-ID")

	@Parameter(description = "This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/card-accounts/{account-id}/balances")@Produces({"application/json","application/problem+json"})@Operation(summary="Read card account balances",description="Reads balance data from a given card account addressed by  \"account-id\".   Remark: This account-id can be a tokenised identification due  to data protection reason since the path information might be  logged on intermediary servers within the ASPSP sphere.  This account-id then can be retrieved by the  \"Get card account list\" call. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getCardAccountBalances(@PathParam("account-id")

	@Parameter(description = "This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. ") String accountId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("Consent-ID")

	@Parameter(description = "This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/card-accounts/{account-id}/transactions")@Produces({"application/json","application/problem+json"})@Operation(summary="Read transaction list of an account",description="Reads account data from a given card account addressed by \"account-id\". ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getCardAccountTransactionList(@PathParam("account-id")

	@Parameter(description = "This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. ") String accountId, @NotNull @QueryParam("bookingStatus")

	@Parameter(description = "Permitted codes are    * \"information\",   * \"booked\",   * \"pending\", and    * \"both\" \"booked\" shall be supported by the ASPSP. To support the \"pending\" and \"both\" feature is optional for the ASPSP,  Error code if not supported in the online banking frontend ") String bookingStatus, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("Consent-ID")

	@Parameter(description = "This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @QueryParam("dateFrom")

	@Parameter(description = "Conditional: Starting date (inclusive the date dateFrom) of the transaction list, mandated if no delta access is required and if bookingStatus does not equal \"information\".  For booked transactions, the relevant date is the booking date.   For pending transactions, the relevant date is the entry date, which may not be transparent  neither in this API nor other channels of the ASPSP. ") LocalDate dateFrom,
			@QueryParam("dateTo")

			@Parameter(description = "End date (inclusive the data dateTo) of the transaction list, default is \"now\" if not given.   Might be ignored if a delta function is used.  For booked transactions, the relevant date is the booking date.   For pending transactions, the relevant date is the entry date, which may not be transparent  neither in this API nor other channels of the ASPSP. ") LocalDate dateTo,
			@QueryParam("entryReferenceFrom")

			@Parameter(description = "This data attribute is indicating that the AISP is in favour to get all transactions after  the transaction with identification entryReferenceFrom alternatively to the above defined period.  This is a implementation of a delta access.  If this data element is contained, the entries \"dateFrom\" and \"dateTo\" might be ignored by the ASPSP  if a delta report is supported.  Optional if supported by API provider. ") String entryReferenceFrom,
			@QueryParam("deltaList")

			@Parameter(description = "This data attribute is indicating that the AISP is in favour to get all transactions after the last report access for this PSU on the addressed account. This is another implementation of a delta access-report. This delta indicator might be rejected by the ASPSP if this function is not supported. Optional if supported by API provider") Boolean deltaList,
			@QueryParam("withBalance")

			@Parameter(description = "If contained, this function reads the list of accessible payment accounts including the booking balance,  if granted by the PSU in the related consent and available by the ASPSP.  This parameter might be ignored by the ASPSP.  ") Boolean withBalance, @HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/consents/{consentId}/authorisations")@Produces({"application/json","application/problem+json"})@Operation(summary="Get consent authorisation sub-resources request",description="Return a list of all authorisation subresources IDs which have been created.  This function returns an array of hyperlinks to all generated authorisation sub-resources. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getConsentAuthorisation(@PathParam("consentId")

	@Parameter(description = "ID of the corresponding consent object as returned by an account information consent request. ") String consentId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/consents/{consentId}")@Produces({"application/json","application/problem+json"})@Operation(summary="Get consent request",description="Returns the content of an account information consent object.  This is returning the data for the TPP especially in cases,  where the consent was directly managed between ASPSP and PSU e.g. in a redirect SCA Approach. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getConsentInformation(@PathParam("consentId")

	@Parameter(description = "ID of the corresponding consent object as returned by an account information consent request. ") String consentId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/consents/{consentId}/authorisations/{authorisationId}")@Produces({"application/json","application/problem+json"})@Operation(summary="Read the SCA status of the consent authorisation",description="This method returns the SCA status of a consent initiation's authorisation sub-resource. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)","Common Services"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getConsentScaStatus(@PathParam("consentId")

	@Parameter(description = "ID of the corresponding consent object as returned by an account information consent request. ") String consentId, @PathParam("authorisationId")

	@Parameter(description = "Resource identification of the related SCA.") String authorisationId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/consents/{consentId}/status")@Produces({"application/json","application/problem+json"})@Operation(summary="Consent status request",description="Read the status of an account information consent resource.",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getConsentStatus(@PathParam("consentId")

	@Parameter(description = "ID of the corresponding consent object as returned by an account information consent request. ") String consentId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/{payment-service}/{payment-product}/{paymentId}/cancellation-authorisations/{authorisationId}")@Produces({"application/json","application/problem+json"})@Operation(summary="Read the SCA status of the payment cancellation's authorisation",description="This method returns the SCA status of a payment initiation's authorisation sub-resource. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ScaStatusResponse.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getPaymentCancellationScaStatus(@PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@PathParam("paymentId")

			@Parameter(description = "Resource identification of the generated payment initiation resource.") String paymentId, @PathParam("authorisationId")

			@Parameter(description = "Resource identification of the related SCA.") String authorisationId, @NotNull @HeaderParam("X-Request-ID")

			@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/{payment-service}/{payment-product}/{paymentId}")@Produces({"application/json","application/xml","multipart/form-data","application/problem+json"})@Operation(summary="Get payment information",description="Returns the content of a payment object",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = InlineResponse200.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getPaymentInformation(@PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@PathParam("paymentId")

			@Parameter(description = "Resource identification of the generated payment initiation resource.") String paymentId, @NotNull @HeaderParam("X-Request-ID")

			@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/{payment-service}/{payment-product}/{paymentId}/authorisations")@Produces({"application/json","application/problem+json"})@Operation(summary="Get payment initiation authorisation sub-resources request",description="Read a list of all authorisation subresources IDs which have been created.  This function returns an array of hyperlinks to all generated authorisation sub-resources. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = Authorisations.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getPaymentInitiationAuthorisation(@PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@PathParam("paymentId")

			@Parameter(description = "Resource identification of the generated payment initiation resource.") String paymentId, @NotNull @HeaderParam("X-Request-ID")

			@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/{payment-service}/{payment-product}/{paymentId}/cancellation-authorisations")@Produces({"application/json","application/problem+json"})@Operation(summary="Will deliver an array of resource identifications to all generated cancellation authorisation sub-resources",description="Retrieve a list of all created cancellation authorisation sub-resources. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = Authorisations.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getPaymentInitiationCancellationAuthorisationInformation(@PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@PathParam("paymentId")

			@Parameter(description = "Resource identification of the generated payment initiation resource.") String paymentId, @NotNull @HeaderParam("X-Request-ID")

			@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/{payment-service}/{payment-product}/{paymentId}/authorisations/{authorisationId}")@Produces({"application/json","application/problem+json"})@Operation(summary="Read the SCA status of the payment authorisation",description="This method returns the SCA status of a payment initiation's authorisation sub-resource. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ScaStatusResponse.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getPaymentInitiationScaStatus(@PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@PathParam("paymentId")

			@Parameter(description = "Resource identification of the generated payment initiation resource.") String paymentId, @PathParam("authorisationId")

			@Parameter(description = "Resource identification of the related SCA.") String authorisationId, @NotNull @HeaderParam("X-Request-ID")

			@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/{payment-service}/{payment-product}/{paymentId}/status")@Produces({"application/json","application/xml","application/problem+json"})@Operation(summary="Payment initiation status request",description="Check the transaction status of a payment initiation.",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = PaymentInitiationStatusResponse200Json.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getPaymentInitiationStatus(@PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@PathParam("paymentId")

			@Parameter(description = "Resource identification of the generated payment initiation resource.") String paymentId, @NotNull @HeaderParam("X-Request-ID")

			@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/signing-baskets/{basketId}")@Produces({"application/json","application/problem+json"})@Operation(summary="Returns the content of an signing basket object",description="Returns the content of a signing basket object.",security={@SecurityRequirement(name="BearerAuthOAuth")},"Signing Baskets (SBS)"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = SigningBasketResponse200.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGSBS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGSBS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGSBS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGSBS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGSBS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGSBS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getSigningBasket(@PathParam("basketId")

	@Parameter(description = "This identification of the corresponding signing basket object. ") String basketId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/signing-baskets/{basketId}/authorisations")@Produces({"application/json","application/problem+json"})@Operation(summary="Get signing basket authorisation sub-resources request",description="Read a list of all authorisation subresources IDs which have been created.  This function returns an array of hyperlinks to all generated authorisation sub-resources. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Signing Baskets (SBS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = Authorisations.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGSBS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGSBS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGSBS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGSBS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGSBS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGSBS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getSigningBasketAuthorisation(@PathParam("basketId")

	@Parameter(description = "This identification of the corresponding signing basket object. ") String basketId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/signing-baskets/{basketId}/authorisations/{authorisationId}")@Produces({"application/json","application/problem+json"})@Operation(summary="Read the SCA status of the signing basket authorisation",description="This method returns the SCA status of a signing basket's authorisation sub-resource. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Signing Baskets (SBS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ScaStatusResponse.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGSBS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGSBS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGSBS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGSBS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGSBS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGSBS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getSigningBasketScaStatus(@PathParam("basketId")

	@Parameter(description = "This identification of the corresponding signing basket object. ") String basketId, @PathParam("authorisationId")

	@Parameter(description = "Resource identification of the related SCA.") String authorisationId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/signing-baskets/{basketId}/status")@Produces({"application/json","application/problem+json"})@Operation(summary="Read the status of the signing basket",description="Returns the status of a signing basket object.  ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Signing Baskets (SBS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = SigningBasketStatusResponse200.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGSBS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGSBS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGSBS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGSBS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGSBS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGSBS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getSigningBasketStatus(@PathParam("basketId")

	@Parameter(description = "This identification of the corresponding signing basket object. ") String basketId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

	@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/accounts/{account-id}/transactions/{transactionId}")@Produces({"application/json","application/problem+json"})@Operation(summary="Read transaction details",description="Reads transaction details from a given transaction addressed by \"transactionId\" on a given account addressed by \"account-id\".  This call is only available on transactions as reported in a JSON format.  **Remark:** Please note that the PATH might be already given in detail by the corresponding entry of the response of the  \"Read Transaction List\" call within the _links subfield. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getTransactionDetails(@PathParam("account-id")

	@Parameter(description = "This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. ") String accountId, @PathParam("transactionId")

	@Parameter(description = "This identification is given by the attribute transactionId of the corresponding entry of a transaction list. ") String transactionId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("Consent-ID")

	@Parameter(description = "This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/accounts/{account-id}/transactions")@Produces({"application/json","application/xml","text/plain","application/problem+json"})@Operation(summary="Read transaction list of an account",description="Read transaction reports or transaction lists of a given account ddressed by \"account-id\", depending on the steering parameter  \"bookingStatus\" together with balances.  For a given account, additional parameters are e.g. the attributes \"dateFrom\" and \"dateTo\".  The ASPSP might add balance information, if transaction lists without balances are not supported. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response getTransactionList(@PathParam("account-id")

	@Parameter(description = "This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. ") String accountId, @NotNull @QueryParam("bookingStatus")

	@Parameter(description = "Permitted codes are    * \"information\",   * \"booked\",   * \"pending\", and    * \"both\" \"booked\" shall be supported by the ASPSP. To support the \"pending\" and \"both\" feature is optional for the ASPSP,  Error code if not supported in the online banking frontend ") String bookingStatus, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("Consent-ID")

	@Parameter(description = "This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @QueryParam("dateFrom")

	@Parameter(description = "Conditional: Starting date (inclusive the date dateFrom) of the transaction list, mandated if no delta access is required and if bookingStatus does not equal \"information\".  For booked transactions, the relevant date is the booking date.   For pending transactions, the relevant date is the entry date, which may not be transparent  neither in this API nor other channels of the ASPSP. ") LocalDate dateFrom,
			@QueryParam("dateTo")

			@Parameter(description = "End date (inclusive the data dateTo) of the transaction list, default is \"now\" if not given.   Might be ignored if a delta function is used.  For booked transactions, the relevant date is the booking date.   For pending transactions, the relevant date is the entry date, which may not be transparent  neither in this API nor other channels of the ASPSP. ") LocalDate dateTo,
			@QueryParam("entryReferenceFrom")

			@Parameter(description = "This data attribute is indicating that the AISP is in favour to get all transactions after  the transaction with identification entryReferenceFrom alternatively to the above defined period.  This is a implementation of a delta access.  If this data element is contained, the entries \"dateFrom\" and \"dateTo\" might be ignored by the ASPSP  if a delta report is supported.  Optional if supported by API provider. ") String entryReferenceFrom,
			@QueryParam("deltaList")

			@Parameter(description = "This data attribute is indicating that the AISP is in favour to get all transactions after the last report access for this PSU on the addressed account. This is another implementation of a delta access-report. This delta indicator might be rejected by the ASPSP if this function is not supported. Optional if supported by API provider") Boolean deltaList,
			@QueryParam("withBalance")

			@Parameter(description = "If contained, this function reads the list of accessible payment accounts including the booking balance,  if granted by the PSU in the related consent and available by the ASPSP.  This parameter might be ignored by the ASPSP.  ") Boolean withBalance, @HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@POST @Path("/{payment-service}/{payment-product}")@Consumes({"application/json","application/xml","multipart/form-data"})@Produces({"application/json","application/problem+json"})@Operation(summary="Payment initiation request",description="This method is used to initiate a payment at the ASPSP.  ## Variants of payment initiation requests  This method to initiate a payment initiation at the ASPSP can be sent with either a JSON body or an pain.001 body depending on the payment product in the path.  There are the following **payment products**:    - Payment products with payment information in *JSON* format:     - ***sepa-credit-transfers***     - ***instant-sepa-credit-transfers***     - ***target-2-payments***     - ***cross-border-credit-transfers***   - Payment products with payment information in *pain.001* XML format:     - ***pain.001-sepa-credit-transfers***     - ***pain.001-instant-sepa-credit-transfers***     - ***pain.001-target-2-payments***     - ***pain.001-cross-border-credit-transfers***  Furthermore the request body depends on the **payment-service**:   * ***payments***: A single payment initiation request.   * ***bulk-payments***: A collection of several payment initiation requests.        In case of a *pain.001* message there are more than one payments contained in the *pain.001 message.          In case of a *JSON* there are several JSON payment blocks contained in a joining list.   * ***periodic-payments***:      Create a standing order initiation resource for recurrent i.e. periodic payments addressable under {paymentId}       with all data relevant for the corresponding payment product and the execution of the standing order contained in a JSON body.   This is the first step in the API to initiate the related recurring/periodic payment.    ## Single and mulitilevel SCA Processes  The payment initiation requests are independent from the need of one or multilevel  SCA processing, i.e. independent from the number of authorisations needed for the execution of payments.   But the response messages are specific to either one SCA processing or multilevel SCA processing.   For payment initiation with multilevel SCA, this specification requires an explicit start of the authorisation,  i.e. links directly associated with SCA processing like 'scaRedirect' or 'scaOAuth' cannot be contained in the  response message of a Payment Initation Request for a payment, where multiple authorisations are needed.  Also if any data is needed for the next action, like selecting an SCA method is not supported in the response,  since all starts of the multiple authorisations are fully equal.  In these cases, first an authorisation sub-resource has to be generated following the 'startAuthorisation' link. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "201", description = "CREATED", content = @Content(schema = @Schema(implementation = PaymentInitationRequestResponse201.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response initiatePayment(@Valid Object body, @FormParam(value = "xml_sct") Object xmlSct, @FormParam(value = "json_standingorderType") PeriodicPaymentInitiationXmlPart2StandingorderTypeJson jsonStandingorderType, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. If not available, the TPP shall use the IP Address used by the TPP when submitting this request. ") String psUIPAddress, @PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

			@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("Consent-ID")

			@Parameter(description = "This data element may be contained, if the payment initiation transaction is part of a session, i.e. combined AIS/PIS service. This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @HeaderParam("TPP-Redirect-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. ") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI")

			@Parameter(description = "URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. ") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI")

			@Parameter(description = "If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. ") String tpPNokRedirectURI, @HeaderParam("TPP-Explicit-Authorisation-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers to start the authorisation process separately,  e.g. because of the usage of a signing basket.  This preference might be ignored by the ASPSP, if a signing basket is not supported as functionality.  If it equals \"false\" or if the parameter is not used, there is no preference of the TPP.  This especially indicates that the TPP assumes a direct authorisation of the transaction in the next step,  without using a signing basket. ") Boolean tpPExplicitAuthorisationPreferred,
			@HeaderParam("TPP-Rejection-NoFunds-Preferred")

			@Parameter(description = "If it equals \"true\" then the TPP prefers a rejection of the payment initiation in case the ASPSP is  providing an integrated confirmation of funds request an the result of this is that not sufficient  funds are available.  If it equals \"false\" then the TPP prefers that the ASPSP is dealing with the payment initiation like  in the ASPSPs online channel, potentially waiting for a certain time period for funds to arrive to initiate the payment.  This parameter might be ignored by the ASPSP. ") Boolean tpPRejectionNoFundsPreferred,
			@HeaderParam("TPP-Brand-Logging-Information")

			@Parameter(description = "This header might be used by TPPs to inform the ASPSP about the brand used by the TPP towards the PSU.  This information is meant for logging entries to enhance communication between ASPSP and PSU or ASPSP and TPP.  This header might be ignored by the ASPSP. ") String tpPBrandLoggingInformation, @HeaderParam("TPP-Notification-URI")

			@Parameter(description = "URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. ") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred")

			@Parameter(description = "The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. ") String tpPNotificationContentPreferred,
			@HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@POST @Path("/{payment-service}/{payment-product}")@Consumes({"application/json","application/xml","multipart/form-data"})@Produces({"application/json","application/problem+json"})@Operation(summary="Payment initiation request",description="This method is used to initiate a payment at the ASPSP.  ## Variants of payment initiation requests  This method to initiate a payment initiation at the ASPSP can be sent with either a JSON body or an pain.001 body depending on the payment product in the path.  There are the following **payment products**:    - Payment products with payment information in *JSON* format:     - ***sepa-credit-transfers***     - ***instant-sepa-credit-transfers***     - ***target-2-payments***     - ***cross-border-credit-transfers***   - Payment products with payment information in *pain.001* XML format:     - ***pain.001-sepa-credit-transfers***     - ***pain.001-instant-sepa-credit-transfers***     - ***pain.001-target-2-payments***     - ***pain.001-cross-border-credit-transfers***  Furthermore the request body depends on the **payment-service**:   * ***payments***: A single payment initiation request.   * ***bulk-payments***: A collection of several payment initiation requests.        In case of a *pain.001* message there are more than one payments contained in the *pain.001 message.          In case of a *JSON* there are several JSON payment blocks contained in a joining list.   * ***periodic-payments***:      Create a standing order initiation resource for recurrent i.e. periodic payments addressable under {paymentId}       with all data relevant for the corresponding payment product and the execution of the standing order contained in a JSON body.   This is the first step in the API to initiate the related recurring/periodic payment.    ## Single and mulitilevel SCA Processes  The payment initiation requests are independent from the need of one or multilevel  SCA processing, i.e. independent from the number of authorisations needed for the execution of payments.   But the response messages are specific to either one SCA processing or multilevel SCA processing.   For payment initiation with multilevel SCA, this specification requires an explicit start of the authorisation,  i.e. links directly associated with SCA processing like 'scaRedirect' or 'scaOAuth' cannot be contained in the  response message of a Payment Initation Request for a payment, where multiple authorisations are needed.  Also if any data is needed for the next action, like selecting an SCA method is not supported in the response,  since all starts of the multiple authorisations are fully equal.  In these cases, first an authorisation sub-resource has to be generated following the 'startAuthorisation' link. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "201", description = "CREATED", content = @Content(schema = @Schema(implementation = PaymentInitationRequestResponse201.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response initiatePayment(@Valid Object body, @FormParam(value = "xml_sct") Object xmlSct, @FormParam(value = "json_standingorderType") PeriodicPaymentInitiationXmlPart2StandingorderTypeJson jsonStandingorderType, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. If not available, the TPP shall use the IP Address used by the TPP when submitting this request. ") String psUIPAddress, @PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

			@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("Consent-ID")

			@Parameter(description = "This data element may be contained, if the payment initiation transaction is part of a session, i.e. combined AIS/PIS service. This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @HeaderParam("TPP-Redirect-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. ") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI")

			@Parameter(description = "URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. ") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI")

			@Parameter(description = "If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. ") String tpPNokRedirectURI, @HeaderParam("TPP-Explicit-Authorisation-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers to start the authorisation process separately,  e.g. because of the usage of a signing basket.  This preference might be ignored by the ASPSP, if a signing basket is not supported as functionality.  If it equals \"false\" or if the parameter is not used, there is no preference of the TPP.  This especially indicates that the TPP assumes a direct authorisation of the transaction in the next step,  without using a signing basket. ") Boolean tpPExplicitAuthorisationPreferred,
			@HeaderParam("TPP-Rejection-NoFunds-Preferred")

			@Parameter(description = "If it equals \"true\" then the TPP prefers a rejection of the payment initiation in case the ASPSP is  providing an integrated confirmation of funds request an the result of this is that not sufficient  funds are available.  If it equals \"false\" then the TPP prefers that the ASPSP is dealing with the payment initiation like  in the ASPSPs online channel, potentially waiting for a certain time period for funds to arrive to initiate the payment.  This parameter might be ignored by the ASPSP. ") Boolean tpPRejectionNoFundsPreferred,
			@HeaderParam("TPP-Brand-Logging-Information")

			@Parameter(description = "This header might be used by TPPs to inform the ASPSP about the brand used by the TPP towards the PSU.  This information is meant for logging entries to enhance communication between ASPSP and PSU or ASPSP and TPP.  This header might be ignored by the ASPSP. ") String tpPBrandLoggingInformation, @HeaderParam("TPP-Notification-URI")

			@Parameter(description = "URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. ") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred")

			@Parameter(description = "The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. ") String tpPNotificationContentPreferred,
			@HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@POST @Path("/{payment-service}/{payment-product}")@Consumes({"application/json","application/xml","multipart/form-data"})@Produces({"application/json","application/problem+json"})@Operation(summary="Payment initiation request",description="This method is used to initiate a payment at the ASPSP.  ## Variants of payment initiation requests  This method to initiate a payment initiation at the ASPSP can be sent with either a JSON body or an pain.001 body depending on the payment product in the path.  There are the following **payment products**:    - Payment products with payment information in *JSON* format:     - ***sepa-credit-transfers***     - ***instant-sepa-credit-transfers***     - ***target-2-payments***     - ***cross-border-credit-transfers***   - Payment products with payment information in *pain.001* XML format:     - ***pain.001-sepa-credit-transfers***     - ***pain.001-instant-sepa-credit-transfers***     - ***pain.001-target-2-payments***     - ***pain.001-cross-border-credit-transfers***  Furthermore the request body depends on the **payment-service**:   * ***payments***: A single payment initiation request.   * ***bulk-payments***: A collection of several payment initiation requests.        In case of a *pain.001* message there are more than one payments contained in the *pain.001 message.          In case of a *JSON* there are several JSON payment blocks contained in a joining list.   * ***periodic-payments***:      Create a standing order initiation resource for recurrent i.e. periodic payments addressable under {paymentId}       with all data relevant for the corresponding payment product and the execution of the standing order contained in a JSON body.   This is the first step in the API to initiate the related recurring/periodic payment.    ## Single and mulitilevel SCA Processes  The payment initiation requests are independent from the need of one or multilevel  SCA processing, i.e. independent from the number of authorisations needed for the execution of payments.   But the response messages are specific to either one SCA processing or multilevel SCA processing.   For payment initiation with multilevel SCA, this specification requires an explicit start of the authorisation,  i.e. links directly associated with SCA processing like 'scaRedirect' or 'scaOAuth' cannot be contained in the  response message of a Payment Initation Request for a payment, where multiple authorisations are needed.  Also if any data is needed for the next action, like selecting an SCA method is not supported in the response,  since all starts of the multiple authorisations are fully equal.  In these cases, first an authorisation sub-resource has to be generated following the 'startAuthorisation' link. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "201", description = "CREATED", content = @Content(schema = @Schema(implementation = PaymentInitationRequestResponse201.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response initiatePayment(@Valid Object body, @FormParam(value = "xml_sct") Object xmlSct, @FormParam(value = "json_standingorderType") PeriodicPaymentInitiationXmlPart2StandingorderTypeJson jsonStandingorderType, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. If not available, the TPP shall use the IP Address used by the TPP when submitting this request. ") String psUIPAddress, @PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

			@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("Consent-ID")

			@Parameter(description = "This data element may be contained, if the payment initiation transaction is part of a session, i.e. combined AIS/PIS service. This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @HeaderParam("TPP-Redirect-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. ") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI")

			@Parameter(description = "URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. ") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI")

			@Parameter(description = "If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. ") String tpPNokRedirectURI, @HeaderParam("TPP-Explicit-Authorisation-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers to start the authorisation process separately,  e.g. because of the usage of a signing basket.  This preference might be ignored by the ASPSP, if a signing basket is not supported as functionality.  If it equals \"false\" or if the parameter is not used, there is no preference of the TPP.  This especially indicates that the TPP assumes a direct authorisation of the transaction in the next step,  without using a signing basket. ") Boolean tpPExplicitAuthorisationPreferred,
			@HeaderParam("TPP-Rejection-NoFunds-Preferred")

			@Parameter(description = "If it equals \"true\" then the TPP prefers a rejection of the payment initiation in case the ASPSP is  providing an integrated confirmation of funds request an the result of this is that not sufficient  funds are available.  If it equals \"false\" then the TPP prefers that the ASPSP is dealing with the payment initiation like  in the ASPSPs online channel, potentially waiting for a certain time period for funds to arrive to initiate the payment.  This parameter might be ignored by the ASPSP. ") Boolean tpPRejectionNoFundsPreferred,
			@HeaderParam("TPP-Brand-Logging-Information")

			@Parameter(description = "This header might be used by TPPs to inform the ASPSP about the brand used by the TPP towards the PSU.  This information is meant for logging entries to enhance communication between ASPSP and PSU or ASPSP and TPP.  This header might be ignored by the ASPSP. ") String tpPBrandLoggingInformation, @HeaderParam("TPP-Notification-URI")

			@Parameter(description = "URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. ") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred")

			@Parameter(description = "The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. ") String tpPNotificationContentPreferred,
			@HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/accounts/{account-id}")@Produces({"application/json","application/problem+json"})@Operation(summary="Read account details",description="Reads details about an account, with balances where required.  It is assumed that a consent of the PSU to  this access is already given and stored on the ASPSP system.  The addressed details of this account depends then on the stored consent addressed by consentId,  respectively the OAuth2 access token.  **NOTE:** The account-id can represent a multicurrency account.  In this case the currency code is set to \"XXX\".  Give detailed information about the addressed account.  Give detailed information about the addressed account together with balance information ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response readAccountDetails(@PathParam("account-id")

	@Parameter(description = "This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. ") String accountId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("Consent-ID")

	@Parameter(description = "This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @QueryParam("withBalance")

	@Parameter(description = "If contained, this function reads the list of accessible payment accounts including the booking balance,  if granted by the PSU in the related consent and available by the ASPSP.  This parameter might be ignored by the ASPSP.  ") Boolean withBalance, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@GET @Path("/card-accounts/{account-id}")@Produces({"application/json","application/problem+json"})@Operation(summary="Read details about a card account",description="Reads details about a card account.  It is assumed that a consent of the PSU to this access is already given  and stored on the ASPSP system. The addressed details of this account depends  then on the stored consent addressed by consentId, respectively the OAuth2  access token. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response readCardAccount(@PathParam("account-id")

	@Parameter(description = "This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. ") String accountId, @NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @NotNull @HeaderParam("Consent-ID")

	@Parameter(description = "This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. ") String consentID, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

	@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

	@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

	@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

	@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

	@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

	@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@POST @Path("/consents/{consentId}/authorisations")@Consumes({"application/json"})@Produces({"application/json","application/problem+json"})@Operation(summary="Start the authorisation process for a consent",description="Create an authorisation sub-resource and start the authorisation process of a consent.  The message might in addition transmit authentication and authorisation related data.  his method is iterated n times for a n times SCA authorisation in a  corporate context, each creating an own authorisation sub-endpoint for  the corresponding PSU authorising the consent.  The ASPSP might make the usage of this access method unnecessary,  since the related authorisation resource will be automatically created by  the ASPSP after the submission of the consent data with the first POST consents call.  The start authorisation process is a process which is needed for creating a new authorisation  or cancellation sub-resource.   This applies in the following scenarios:    * The ASPSP has indicated with an 'startAuthorisation' hyperlink in the preceding Payment      initiation response that an explicit start of the authorisation process is needed by the TPP.      The 'startAuthorisation' hyperlink can transport more information about data which needs to be      uploaded by using the extended forms:     * 'startAuthorisationWithPsuIdentfication',      * 'startAuthorisationWithPsuAuthentication'      * 'startAuthorisationWithEncryptedPsuAuthentication'     * 'startAuthorisationWithAuthentciationMethodSelection'    * The related payment initiation cannot yet be executed since a multilevel SCA is mandated.   * The ASPSP has indicated with an 'startAuthorisation' hyperlink in the preceding      payment cancellation response that an explicit start of the authorisation process is needed by the TPP.      The 'startAuthorisation' hyperlink can transport more information about data which needs to be uploaded      by using the extended forms as indicated above.   * The related payment cancellation request cannot be applied yet since a multilevel SCA is mandate for      executing the cancellation.   * The signing basket needs to be authorised yet. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)","Common Services"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response startConsentAuthorisation(@NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @PathParam("consentId")

	@Parameter(description = "ID of the corresponding consent object as returned by an account information consent request. ") String consentId, @Valid Body4 body, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

	@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("TPP-Redirect-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. ") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI")

			@Parameter(description = "URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. ") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI")

			@Parameter(description = "If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. ") String tpPNokRedirectURI, @HeaderParam("TPP-Notification-URI")

			@Parameter(description = "URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. ") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred")

			@Parameter(description = "The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. ") String tpPNotificationContentPreferred,
			@HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@POST @Path("/{payment-service}/{payment-product}/{paymentId}/authorisations")@Consumes({"application/json"})@Produces({"application/json","application/problem+json"})@Operation(summary="Start the authorisation process for a payment initiation",description="Create an authorisation sub-resource and start the authorisation process.  The message might in addition transmit authentication and authorisation related data.   This method is iterated n times for a n times SCA authorisation in a  corporate context, each creating an own authorisation sub-endpoint for  the corresponding PSU authorising the transaction.  The ASPSP might make the usage of this access method unnecessary in case  of only one SCA process needed, since the related authorisation resource  might be automatically created by the ASPSP after the submission of the  payment data with the first POST payments/{payment-product} call.  The start authorisation process is a process which is needed for creating a new authorisation  or cancellation sub-resource.   This applies in the following scenarios:    * The ASPSP has indicated with a 'startAuthorisation' hyperlink in the preceding Payment      initiation response that an explicit start of the authorisation process is needed by the TPP.      The 'startAuthorisation' hyperlink can transport more information about data which needs to be      uploaded by using the extended forms:     * 'startAuthorisationWithPsuIdentfication'     * 'startAuthorisationWithPsuAuthentication'     * 'startAuthorisationWithEncryptedPsuAuthentication'     * 'startAuthorisationWithAuthentciationMethodSelection'   * The related payment initiation cannot yet be executed since a multilevel SCA is mandated.   * The ASPSP has indicated with a 'startAuthorisation' hyperlink in the preceding      Payment cancellation response that an explicit start of the authorisation process is needed by the TPP.      The 'startAuthorisation' hyperlink can transport more information about data which needs to be uploaded      by using the extended forms as indicated above.   * The related payment cancellation request cannot be applied yet since a multilevel SCA is mandate for      executing the cancellation.   * The signing basket needs to be authorised yet. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = StartScaprocessResponse.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response startPaymentAuthorisation(@NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@PathParam("paymentId")

			@Parameter(description = "Resource identification of the generated payment initiation resource.") String paymentId, @Valid Body body, @HeaderParam("PSU-ID")

			@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("TPP-Redirect-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. ") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI")

			@Parameter(description = "URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. ") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI")

			@Parameter(description = "If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. ") String tpPNokRedirectURI, @HeaderParam("TPP-Notification-URI")

			@Parameter(description = "URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. ") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred")

			@Parameter(description = "The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. ") String tpPNotificationContentPreferred,
			@HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@POST @Path("/{payment-service}/{payment-product}/{paymentId}/cancellation-authorisations")@Consumes({"application/json"})@Produces({"application/json","application/problem+json"})@Operation(summary="Start the authorisation process for the cancellation of the addressed payment",description="Creates an authorisation sub-resource and start the authorisation process of the cancellation of the addressed payment.  The message might in addition transmit authentication and authorisation related data.  This method is iterated n times for a n times SCA authorisation in a  corporate context, each creating an own authorisation sub-endpoint for  the corresponding PSU authorising the cancellation-authorisation.  The ASPSP might make the usage of this access method unnecessary in case  of only one SCA process needed, since the related authorisation resource  might be automatically created by the ASPSP after the submission of the  payment data with the first POST payments/{payment-product} call.  The start authorisation process is a process which is needed for creating a new authorisation  or cancellation sub-resource.   This applies in the following scenarios:    * The ASPSP has indicated with a 'startAuthorisation' hyperlink in the preceding payment      initiation response that an explicit start of the authorisation process is needed by the TPP.      The 'startAuthorisation' hyperlink can transport more information about data which needs to be      uploaded by using the extended forms:     * 'startAuthorisationWithPsuIdentfication'     * 'startAuthorisationWithPsuAuthentication'     * 'startAuthorisationWithAuthentciationMethodSelection'    * The related payment initiation cannot yet be executed since a multilevel SCA is mandated.   * The ASPSP has indicated with a 'startAuthorisation' hyperlink in the preceding      payment cancellation response that an explicit start of the authorisation process is needed by the TPP.      The 'startAuthorisation' hyperlink can transport more information about data which needs to be uploaded      by using the extended forms as indicated above.   * The related payment cancellation request cannot be applied yet since a multilevel SCA is mandate for      executing the cancellation.   * The signing basket needs to be authorised yet. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = StartScaprocessResponse.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response startPaymentInitiationCancellationAuthorisation(@NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@PathParam("paymentId")

			@Parameter(description = "Resource identification of the generated payment initiation resource.") String paymentId, @Valid Body2 body, @HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

			@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("TPP-Redirect-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. ") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI")

			@Parameter(description = "URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. ") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI")

			@Parameter(description = "If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. ") String tpPNokRedirectURI, @HeaderParam("TPP-Notification-URI")

			@Parameter(description = "URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. ") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred")

			@Parameter(description = "The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. ") String tpPNotificationContentPreferred,
			@HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@POST @Path("/signing-baskets/{basketId}/authorisations")@Consumes({"application/json"})@Produces({"application/json","application/problem+json"})@Operation(summary="Start the authorisation process for a signing basket",description="Create an authorisation sub-resource and start the authorisation process of a signing basket.  The message might in addition transmit authentication and authorisation related data.  This method is iterated n times for a n times SCA authorisation in a  corporate context, each creating an own authorisation sub-endpoint for  the corresponding PSU authorising the signing-baskets.  The ASPSP might make the usage of this access method unnecessary in case  of only one SCA process needed, since the related authorisation resource  might be automatically created by the ASPSP after the submission of the  payment data with the first POST signing basket call.  The start authorisation process is a process which is needed for creating a new authorisation  or cancellation sub-resource.   This applies in the following scenarios:    * The ASPSP has indicated with a 'startAuthorisation' hyperlink in the preceding payment      initiation response that an explicit start of the authorisation process is needed by the TPP.      The 'startAuthorisation' hyperlink can transport more information about data which needs to be      uploaded by using the extended forms:     * 'startAuthorisationWithPsuIdentfication',      * 'startAuthorisationWithPsuAuthentication'      * 'startAuthorisationWithEncryptedPsuAuthentication'     * 'startAuthorisationWithAuthentciationMethodSelection'    * The related payment initiation cannot yet be executed since a multilevel SCA is mandated.   * The ASPSP has indicated with a 'startAuthorisation' hyperlink in the preceding      payment cancellation response that an explicit start of the authorisation process is needed by the TPP.     The 'startAuthorisation' hyperlink can transport more information about data which needs to be uploaded     by using the extended forms as indicated above.   * The related payment cancellation request cannot be applied yet since a multilevel SCA is mandate for      executing the cancellation.   * The signing basket needs to be authorised yet. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Signing Baskets (SBS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = StartScaprocessResponse.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGSBS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGSBS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGSBS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGSBS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGSBS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGSBS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response startSigningBasketAuthorisation(@NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @PathParam("basketId")

	@Parameter(description = "This identification of the corresponding signing basket object. ") String basketId, @Valid Body6 body, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

	@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("TPP-Redirect-Preferred")

			@Parameter(description = "If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. ") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI")

			@Parameter(description = "URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. ") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI")

			@Parameter(description = "If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. ") String tpPNokRedirectURI, @HeaderParam("TPP-Notification-URI")

			@Parameter(description = "URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. ") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred")

			@Parameter(description = "The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. ") String tpPNotificationContentPreferred,
			@HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@PUT @Path("/consents/{consentId}/authorisations/{authorisationId}")@Consumes({"application/json"})@Produces({"application/json","application/problem+json"})@Operation(summary="Update PSU Data for consents",description="This method update PSU data on the consents  resource if needed.  It may authorise a consent within the Embedded SCA Approach where needed.  Independently from the SCA Approach it supports e.g. the selection of  the authentication method and a non-SCA PSU authentication.  This methods updates PSU data on the cancellation authorisation resource if needed.   There are several possible update PSU data requests in the context of a consent request if needed,  which depends on the SCA approach:  * Redirect SCA Approach:   A specific Update PSU data request is applicable for      * the selection of authentication methods, before choosing the actual SCA approach. * Decoupled SCA Approach:   A specific update PSU data request is only applicable for   * adding the PSU Identification, if not provided yet in the payment initiation request or the Account Information Consent Request, or if no OAuth2 access token is used, or   * the selection of authentication methods. * Embedded SCA Approach:    The Update PSU data request might be used    * to add credentials as a first factor authentication data of the PSU and   * to select the authentication method and   * transaction authorisation.  The SCA Approach might depend on the chosen SCA method.  For that reason, the following possible update PSU data request can apply to all SCA approaches:  * Select an SCA method in case of several SCA methods are available for the customer.  There are the following request types on this access path:   * Update PSU identification   * Update PSU authentication   * Select PSU autorization method      WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change.   * Transaction Authorisation     WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Account Information Service (AIS)","Common Services"

	})

	@Tag(name = "")
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
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response updateConsentsPsuData(@NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @PathParam("consentId")

	@Parameter(description = "ID of the corresponding consent object as returned by an account information consent request. ") String consentId, @PathParam("authorisationId")

	@Parameter(description = "Resource identification of the related SCA.") String authorisationId, @Valid Body5 body, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

	@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@PUT @Path("/{payment-service}/{payment-product}/{paymentId}/cancellation-authorisations/{authorisationId}")@Consumes({"application/json"})@Produces({"application/json","application/problem+json"})@Operation(summary="Update PSU data for payment initiation cancellation",description="This method updates PSU data on the cancellation authorisation resource if needed.  It may authorise a cancellation of the payment within the Embedded SCA Approach where needed.  Independently from the SCA Approach it supports e.g. the selection of  the authentication method and a non-SCA PSU authentication.  This methods updates PSU data on the cancellation authorisation resource if needed.   There are several possible update PSU data requests in the context of a cancellation authorisation within the payment initiation services needed,  which depends on the SCA approach:  * Redirect SCA Approach:   A specific Update PSU data request is applicable for      * the selection of authentication methods, before choosing the actual SCA approach. * Decoupled SCA Approach:   A specific Update PSU data request is only applicable for   * adding the PSU Identification, if not provided yet in the payment initiation request or the Account Information Consent Request, or if no OAuth2 access token is used, or   * the selection of authentication methods. * Embedded SCA Approach:    The Update PSU data request might be used    * to add credentials as a first factor authentication data of the PSU and   * to select the authentication method and   * transaction authorisation.  The SCA approach might depend on the chosen SCA method.  For that reason, the following possible update PSU data request can apply to all SCA approaches:  * Select an SCA method in case of several SCA methods are available for the customer.  There are the following request types on this access path:   * Update PSU identification   * Update PSU authentication   * Select PSU autorization method      WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change.   * Transaction Authorisation     WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = InlineResponse2002.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response updatePaymentCancellationPsuData(@NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@PathParam("paymentId")

			@Parameter(description = "Resource identification of the generated payment initiation resource.") String paymentId, @PathParam("authorisationId")

			@Parameter(description = "Resource identification of the related SCA.") String authorisationId, @Valid Body3 body, @HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

			@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@PUT @Path("/{payment-service}/{payment-product}/{paymentId}/authorisations/{authorisationId}")@Consumes({"application/json"})@Produces({"application/json","application/problem+json"})@Operation(summary="Update PSU data for payment initiation",description="This methods updates PSU data on the authorisation resource if needed.  It may authorise a payment within the Embedded SCA Approach where needed.  Independently from the SCA Approach it supports e.g. the selection of  the authentication method and a non-SCA PSU authentication.  There are several possible update PSU data requests in the context of payment initiation services needed,  which depends on the SCA approach:  * Redirect SCA Approach:   A specific update PSU data request is applicable for      * the selection of authentication methods, before choosing the actual SCA approach. * Decoupled SCA Approach:   A specific update PSU data request is only applicable for   * adding the PSU identification, if not provided yet in the payment initiation request or the account information consent request, or if no OAuth2 access token is used, or   * the selection of authentication methods. * Embedded SCA Approach:    The Update PSU Data request might be used    * to add credentials as a first factor authentication data of the PSU and   * to select the authentication method and   * transaction authorisation.  The SCA Approach might depend on the chosen SCA method.  For that reason, the following possible Update PSU data request can apply to all SCA approaches:  * Select an SCA method in case of several SCA methods are available for the customer.  There are the following request types on this access path:   * Update PSU identification   * Update PSU authentication   * Select PSU autorization method      WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change.   * Transaction authorisation     WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Payment Initiation Service (PIS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = InlineResponse2002.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGPIS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGPIS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGPIS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGPIS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGPIS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGPIS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response updatePaymentPsuData(@NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @PathParam("payment-service")

	@Parameter(description = "Payment service:  Possible values are: * payments * bulk-payments * periodic-payments ") String paymentService, @PathParam("payment-product")

	@Parameter(description = "The addressed payment product endpoint, e.g. for SEPA Credit Transfers (SCT). The ASPSP will publish which of the payment products/endpoints will be supported.  The following payment products are supported:   - sepa-credit-transfers   - instant-sepa-credit-transfers   - target-2-payments   - cross-border-credit-transfers   - pain.001-sepa-credit-transfers   - pain.001-instant-sepa-credit-transfers   - pain.001-target-2-payments   - pain.001-cross-border-credit-transfers  **Remark:** For all SEPA Credit Transfer based endpoints which accept XML encoding,  the XML pain.001 schemes provided by EPC are supported by the ASPSP as a minimum for the body content.  Further XML schemes might be supported by some communities.  **Remark:** For cross-border and TARGET-2 payments only community wide pain.001 schemes do exist.  There are plenty of country specificic scheme variants. ") String paymentProduct,
			@PathParam("paymentId")

			@Parameter(description = "Resource identification of the generated payment initiation resource.") String paymentId, @PathParam("authorisationId")

			@Parameter(description = "Resource identification of the related SCA.") String authorisationId, @Valid Body1 body, @HeaderParam("Digest")

			@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

			@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

			@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

			@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}

	@PUT @Path("/signing-baskets/{basketId}/authorisations/{authorisationId}")@Consumes({"application/json"})@Produces({"application/json","application/problem+json"})@Operation(summary="Update PSU data for signing basket",description="This method update PSU data on the signing basket resource if needed.  It may authorise a igning basket within the embedded SCA approach where needed.  Independently from the SCA Approach it supports e.g. the selection of  the authentication method and a non-SCA PSU authentication.  This methods updates PSU data on the cancellation authorisation resource if needed.   There are several possible update PSU data requests in the context of a consent request if needed,  which depends on the SCA approach:  * Redirect SCA Approach:   A specific Update PSU data request is applicable for      * the selection of authentication methods, before choosing the actual SCA approach. * Decoupled SCA Approach:   A specific Update PSU data request is only applicable for   * adding the PSU Identification, if not provided yet in the payment initiation request or the account information consent request, or if no OAuth2 access token is used, or   * the selection of authentication methods. * Embedded SCA Approach:    The update PSU data request might be used    * to add credentials as a first factor authentication data of the PSU and   * to select the authentication method and   * transaction authorisation.  The SCA approach might depend on the chosen SCA method.  For that reason, the following possible update PSU data request can apply to all SCA approaches:  * Select an SCA method in case of several SCA methods are available for the customer.  There are the following request types on this access path:   * Update PSU identification   * Update PSU authentication   * Select PSU autorization Method      WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change.   * Transaction Authorisation     WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change. ",security={@SecurityRequirement(name="BearerAuthOAuth")},"Signing Baskets (SBS)","Common Services"

	})

	@Tag(name = "")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = InlineResponse2002.class))),
			@APIResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error400NGSBS.class))),
			@APIResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = Error401NGSBS.class))),
			@APIResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(implementation = Error403NGSBS.class))),
			@APIResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Error404NGSBS.class))),
			@APIResponse(responseCode = "405", description = "Method Not Allowed", content = @Content(schema = @Schema(implementation = Error405NGSBS.class))),
			@APIResponse(responseCode = "406", description = "Not Acceptable"),
			@APIResponse(responseCode = "408", description = "Request Timeout"),
			@APIResponse(responseCode = "409", description = "Conflict", content = @Content(schema = @Schema(implementation = Error409NGSBS.class))),
			@APIResponse(responseCode = "415", description = "Unsupported Media Type"),
			@APIResponse(responseCode = "429", description = "Too Many Requests"),
			@APIResponse(responseCode = "500", description = "Internal Server Error"),
			@APIResponse(responseCode = "503", description = "Service Unavailable")
	})
	public Response updateSigningBasketPsuData(@NotNull @HeaderParam("X-Request-ID")

	@Parameter(description = "ID of the request, unique to the call, as determined by the initiating party.") UUID xRequestID, @PathParam("basketId")

	@Parameter(description = "This identification of the corresponding signing basket object. ") String basketId, @PathParam("authorisationId")

	@Parameter(description = "Resource identification of the related SCA.") String authorisationId, @Valid Body7 body, @HeaderParam("Digest")

	@Parameter(description = "Is contained if and only if the \"Signature\" element is contained in the header of the request.") String digest, @HeaderParam("Signature")

	@Parameter(description = "A signature of the request by the TPP on application level. This might be mandated by ASPSP. ") String signature, @HeaderParam("TPP-Signature-Certificate")

	@Parameter(description = "The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. ") byte[] tpPSignatureCertificate, @HeaderParam("PSU-ID")

	@Parameter(description = "Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. ") String PSU_ID,
			@HeaderParam("PSU-ID-Type")

			@Parameter(description = "Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. ") String psUIDType, @HeaderParam("PSU-Corporate-ID")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateID, @HeaderParam("PSU-Corporate-ID-Type")

			@Parameter(description = "Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context. ") String psUCorporateIDType, @HeaderParam("PSU-IP-Address")

			@Parameter(description = "The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. ") String psUIPAddress, @HeaderParam("PSU-IP-Port")

			@Parameter(description = "The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. ") String psUIPPort, @HeaderParam("PSU-Accept")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAccept, @HeaderParam("PSU-Accept-Charset")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptCharset, @HeaderParam("PSU-Accept-Encoding")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptEncoding, @HeaderParam("PSU-Accept-Language")

			@Parameter(description = "The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. ") String psUAcceptLanguage, @HeaderParam("PSU-User-Agent")

			@Parameter(description = "The forwarded Agent header field of the HTTP request between PSU and TPP, if available. ") String psUUserAgent, @HeaderParam("PSU-Http-Method")

			@Parameter(description = "HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE ") String psUHttpMethod, @HeaderParam("PSU-Device-ID")

			@Parameter(description = "UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. ") UUID psUDeviceID,
			@Pattern(regexp = "GEO:-?[0-9]{1,2}\\.[0-9]{6};-?[0-9]{1,3}\\.[0-9]{6}") @HeaderParam("PSU-Geo-Location")

			@Parameter(description = "The forwarded Geo Location of the corresponding http request between PSU and TPP if available. ") String psUGeoLocation) {
		return Response.ok().entity("magic!").build();
	}
}
