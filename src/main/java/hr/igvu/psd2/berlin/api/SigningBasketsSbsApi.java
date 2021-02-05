package hr.igvu.psd2.berlin.api;

import java.util.UUID;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.openapi.annotations.Operation;
//import org.eclipse.microprofile.openapi.annotations.media.ArraySchema;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.openapi.annotations.tags.Tags;

import hr.igvu.psd2.berlin.api.model.Authorisations;
import hr.igvu.psd2.berlin.api.model.Body;
import hr.igvu.psd2.berlin.api.model.InlineResponse2002;
import hr.igvu.psd2.berlin.api.model.ScaStatusResponse;
import hr.igvu.psd2.berlin.api.model.SigningBasket;
import hr.igvu.psd2.berlin.api.model.SigningBasketResponse200;
import hr.igvu.psd2.berlin.api.model.SigningBasketResponse201;
import hr.igvu.psd2.berlin.api.model.SigningBasketStatusResponse200;
import hr.igvu.psd2.berlin.api.model.StartScaprocessResponse;
import hr.igvu.psd2.berlin.api.model.error.Error400NGSBS;
import hr.igvu.psd2.berlin.api.model.error.Error401NGSBS;
import hr.igvu.psd2.berlin.api.model.error.Error403NGSBS;
import hr.igvu.psd2.berlin.api.model.error.Error404NGSBS;
import hr.igvu.psd2.berlin.api.model.error.Error405NGSBS;
import hr.igvu.psd2.berlin.api.model.error.Error409NGSBS;

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
public interface SigningBasketsSbsApi {

	/**
	 * Create a signing basket resource
	 *
	 * Create a signing basket resource for authorising several transactions with
	 * one SCA method. The resource identifications of these transactions are
	 * contained in the payload of this access method
	 *
	 */
	@POST
	@Path("/v1/signing-baskets")
	@Consumes({ "application/json" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Create a signing basket resource")
	@Tags(value = { @Tag(name = "Signing Baskets (SBS)") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public SigningBasketResponse201 createSigningBasket(@HeaderParam("X-Request-ID") UUID xRequestID,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @Valid SigningBasket body,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-ID") String PSU_ID, @HeaderParam("PSU-ID-Type") String psUIDType,
			@HeaderParam("PSU-Corporate-ID") String psUCorporateID,
			@HeaderParam("PSU-Corporate-ID-Type") String psUCorporateIDType,
			@HeaderParam("Consent-ID") String consentID,
			@HeaderParam("TPP-Redirect-Preferred") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI") String tpPNokRedirectURI,
			@HeaderParam("TPP-Explicit-Authorisation-Preferred") Boolean tpPExplicitAuthorisationPreferred,
			@HeaderParam("TPP-Notification-URI") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred") String tpPNotificationContentPreferred,
			@HeaderParam("PSU-IP-Port") String psUIPPort, @HeaderParam("PSU-Accept") String psUAccept,
			@HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Delete the signing basket
	 *
	 * Delete the signing basket structure as long as no (partial) authorisation has
	 * yet been applied. The undlerying transactions are not affected by this
	 * deletion. Remark: The signing basket as such is not deletable after a first
	 * (partial) authorisation has been applied. Nevertheless, single transactions
	 * might be cancelled on an individual basis on the XS2A interface.
	 *
	 */
	@DELETE
	@Path("/v1/signing-baskets/{basketId}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Delete the signing basket")
	@Tags(value = { @Tag(name = "Signing Baskets (SBS)"), @Tag(name = "Common Services"), })
	@APIResponses(value = { @APIResponse(responseCode = "204", description = "No Content"),
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public void deleteSigningBasket(@PathParam("basketId") String basketId,
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
	 * Returns the content of an signing basket object
	 *
	 * Returns the content of a signing basket object.
	 *
	 */
	@GET
	@Path("/v1/signing-baskets/{basketId}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Returns the content of an signing basket object")
	@Tags(value = { @Tag(name = "Signing Baskets (SBS)")

	})
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public SigningBasketResponse200 getSigningBasket(@PathParam("basketId") String basketId,
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
	 * Get signing basket authorisation sub-resources request
	 *
	 * Read a list of all authorisation subresources IDs which have been created.
	 * This function returns an array of hyperlinks to all generated authorisation
	 * sub-resources.
	 *
	 */
	@GET
	@Path("/v1/signing-baskets/{basketId}/authorisations")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Get signing basket authorisation sub-resources request")
	@Tags(value = { @Tag(name = "Signing Baskets (SBS)"), @Tag(name = "Common Services"), })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public Authorisations getSigningBasketAuthorisation(@PathParam("basketId") String basketId,
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
	 * Read the SCA status of the signing basket authorisation
	 *
	 * This method returns the SCA status of a signing basket&#x27;s authorisation
	 * sub-resource.
	 *
	 */
	@GET
	@Path("/v1/signing-baskets/{basketId}/authorisations/{authorisationId}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read the SCA status of the signing basket authorisation")
	@Tags(value = { @Tag(name = "Signing Baskets (SBS)"), @Tag(name = "Common Services"), })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public ScaStatusResponse getSigningBasketScaStatus(@PathParam("basketId") String basketId,
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
	 * Read the status of the signing basket
	 *
	 * Returns the status of a signing basket object.
	 *
	 */
	@GET
	@Path("/v1/signing-baskets/{basketId}/status")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read the status of the signing basket")
	@Tags(value = { @Tag(name = "Signing Baskets (SBS)"), @Tag(name = "Common Services"), })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public SigningBasketStatusResponse200 getSigningBasketStatus(@PathParam("basketId") String basketId,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("Digest") String digest,
			@HeaderParam("Signature") String signature,
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

	/**
	 * Start the authorisation process for a signing basket
	 *
	 * Create an authorisation sub-resource and start the authorisation process of a
	 * signing basket. The message might in addition transmit authentication and
	 * authorisation related data. This method is iterated n times for a n times SCA
	 * authorisation in a corporate context, each creating an own authorisation
	 * sub-endpoint for the corresponding PSU authorising the signing-baskets. The
	 * ASPSP might make the usage of this access method unnecessary in case of only
	 * one SCA process needed, since the related authorisation resource might be
	 * automatically created by the ASPSP after the submission of the payment data
	 * with the first POST signing basket call. The start authorisation process is a
	 * process which is needed for creating a new authorisation or cancellation
	 * sub-resource. This applies in the following scenarios: * The ASPSP has
	 * indicated with a &#x27;startAuthorisation&#x27; hyperlink in the preceding
	 * payment initiation response that an explicit start of the authorisation
	 * process is needed by the TPP. The &#x27;startAuthorisation&#x27; hyperlink
	 * can transport more information about data which needs to be uploaded by using
	 * the extended forms: * &#x27;startAuthorisationWithPsuIdentfication&#x27;, *
	 * &#x27;startAuthorisationWithPsuAuthentication&#x27; *
	 * &#x27;startAuthorisationWithEncryptedPsuAuthentication&#x27; *
	 * &#x27;startAuthorisationWithAuthentciationMethodSelection&#x27; * The related
	 * payment initiation cannot yet be executed since a multilevel SCA is mandated.
	 * * The ASPSP has indicated with a &#x27;startAuthorisation&#x27; hyperlink in
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
	@Path("/v1/signing-baskets/{basketId}/authorisations")
	@Consumes({ "application/json" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Start the authorisation process for a signing basket")
	@Tags(value = { @Tag(name = "Signing Baskets (SBS)"), @Tag(name = "Common Services"), })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public StartScaprocessResponse startSigningBasketAuthorisation(@HeaderParam("X-Request-ID") UUID xRequestID,
			@PathParam("basketId") String basketId, @Valid Body body, @HeaderParam("Digest") String digest,
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
	 * Update PSU data for signing basket
	 *
	 * This method update PSU data on the signing basket resource if needed. It may
	 * authorise a igning basket within the embedded SCA approach where needed.
	 * Independently from the SCA Approach it supports e.g. the selection of the
	 * authentication method and a non-SCA PSU authentication. This methods updates
	 * PSU data on the cancellation authorisation resource if needed. There are
	 * several possible update PSU data requests in the context of a consent request
	 * if needed, which depends on the SCA approach: * Redirect SCA Approach: A
	 * specific Update PSU data request is applicable for * the selection of
	 * authentication methods, before choosing the actual SCA approach. * Decoupled
	 * SCA Approach: A specific Update PSU data request is only applicable for *
	 * adding the PSU Identification, if not provided yet in the payment initiation
	 * request or the account information consent request, or if no OAuth2 access
	 * token is used, or * the selection of authentication methods. * Embedded SCA
	 * Approach: The update PSU data request might be used * to add credentials as a
	 * first factor authentication data of the PSU and * to select the
	 * authentication method and * transaction authorisation. The SCA approach might
	 * depend on the chosen SCA method. For that reason, the following possible
	 * update PSU data request can apply to all SCA approaches: * Select an SCA
	 * method in case of several SCA methods are available for the customer. There
	 * are the following request types on this access path: * Update PSU
	 * identification * Update PSU authentication * Select PSU autorization Method
	 * WARNING: This method needs a reduced header, therefore many optional elements
	 * are not present. Maybe in a later version the access path will change. *
	 * Transaction Authorisation WARNING: This method needs a reduced header,
	 * therefore many optional elements are not present. Maybe in a later version
	 * the access path will change.
	 *
	 */
	@PUT
	@Path("/v1/signing-baskets/{basketId}/authorisations/{authorisationId}")
	@Consumes({ "application/json" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Update PSU data for signing basket")
	@Tags(value = { @Tag(name = "Signing Baskets (SBS)"), @Tag(name = "Common Services"), })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public InlineResponse2002 updateSigningBasketPsuData(@HeaderParam("X-Request-ID") UUID xRequestID,
			@PathParam("basketId") String basketId, @PathParam("authorisationId") String authorisationId,
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
