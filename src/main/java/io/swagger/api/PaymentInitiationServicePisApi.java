package io.swagger.api;

import io.swagger.model.Authorisations;
import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.Body2;
import io.swagger.model.Body3;
import io.swagger.model.Error400NGPIS;
import io.swagger.model.Error401NGPIS;
import io.swagger.model.Error403NGPIS;
import io.swagger.model.Error404NGPIS;
import io.swagger.model.Error405NGPIS;
import io.swagger.model.Error405NGPISCANC;
import io.swagger.model.Error409NGPIS;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.PaymentInitationRequestResponse201;
import io.swagger.model.PaymentInitiationCancelResponse202;
import io.swagger.model.PaymentInitiationStatusResponse200Json;
import io.swagger.model.PeriodicPaymentInitiationXmlPart2StandingorderTypeJson;
import io.swagger.model.ScaStatusResponse;
import io.swagger.model.StartScaprocessResponse;
import java.util.UUID;
import org.eclipse.microprofile.openapi.annotations.Operation;
//import org.eclipse.microprofile.openapi.annotations.media.ArraySchema;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.openapi.annotations.tags.Tags;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import javax.validation.constraints.*;
import javax.validation.Valid;

import org.eclipse.microprofile.openapi.annotations.Operation;

//import org.eclipse.microprofile.openapi.annotations.media.ArraySchema;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.openapi.annotations.tags.Tags;

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
public interface PaymentInitiationServicePisApi {

	/**
	 * Payment cancellation request
	 *
	 * This method initiates the cancellation of a payment. Depending on the
	 * payment-service, the payment-product and the ASPSP&#x27;s implementation,
	 * this TPP call might be sufficient to cancel a payment. If an authorisation of
	 * the payment cancellation is mandated by the ASPSP, a corresponding hyperlink
	 * will be contained in the response message. Cancels the addressed payment with
	 * resource identification paymentId if applicable to the payment-service,
	 * payment-product and received in product related timelines (e.g. before end of
	 * business day for scheduled payments of the last business day before the
	 * scheduled execution day). The response to this DELETE command will tell the
	 * TPP whether the * access method was rejected, * access method was successful,
	 * or * access method is generally applicable, but further authorisation
	 * processes are needed.
	 *
	 */
	@DELETE
	@Path("/v1/{payment-service}/{payment-product}/{paymentId}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Payment cancellation request")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public PaymentInitiationCancelResponse202 cancelPayment(@PathParam("payment-service") String paymentService,
			@PathParam("payment-product") String paymentProduct, @PathParam("paymentId") String paymentId,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("Digest") String digest,
			@HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("TPP-Redirect-Preferred") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Nok-Redirect-URI") String tpPNokRedirectURI,
			@HeaderParam("TPP-Redirect-URI") String tpPRedirectURI,
			@HeaderParam("TPP-Explicit-Authorisation-Preferred") Boolean tpPExplicitAuthorisationPreferred,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Read the SCA status of the payment cancellation&#x27;s authorisation
	 *
	 * This method returns the SCA status of a payment initiation&#x27;s
	 * authorisation sub-resource.
	 *
	 */
	@GET
	@Path("/v1/{payment-service}/{payment-product}/{paymentId}/cancellation-authorisations/{authorisationId}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read the SCA status of the payment cancellation's authorisation")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)"), @Tag(name = "Common Services") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public ScaStatusResponse getPaymentCancellationScaStatus(@PathParam("payment-service") String paymentService,
			@PathParam("payment-product") String paymentProduct, @PathParam("paymentId") String paymentId,
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
	 * Get payment information
	 *
	 * Returns the content of a payment object
	 *
	 */
	@GET
	@Path("/v1/{payment-service}/{payment-product}/{paymentId}")
	@Produces({ "application/json", "application/xml", "multipart/form-data", "application/problem+json" })
	@Operation(summary = "Get payment information")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public InlineResponse200 getPaymentInformation(@PathParam("payment-service") String paymentService,
			@PathParam("payment-product") String paymentProduct, @PathParam("paymentId") String paymentId,
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
	 * Get payment initiation authorisation sub-resources request
	 *
	 * Read a list of all authorisation subresources IDs which have been created.
	 * This function returns an array of hyperlinks to all generated authorisation
	 * sub-resources.
	 *
	 */
	@GET
	@Path("/v1/{payment-service}/{payment-product}/{paymentId}/authorisations")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Get payment initiation authorisation sub-resources request")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)"), @Tag(name = "Common Services") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public Authorisations getPaymentInitiationAuthorisation(@PathParam("payment-service") String paymentService,
			@PathParam("payment-product") String paymentProduct, @PathParam("paymentId") String paymentId,
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
	 * Will deliver an array of resource identifications to all generated
	 * cancellation authorisation sub-resources
	 *
	 * Retrieve a list of all created cancellation authorisation sub-resources.
	 *
	 */
	@GET
	@Path("/v1/{payment-service}/{payment-product}/{paymentId}/cancellation-authorisations")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Will deliver an array of resource identifications to all generated cancellation authorisation sub-resources")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public Authorisations getPaymentInitiationCancellationAuthorisationInformation(
			@PathParam("payment-service") String paymentService, @PathParam("payment-product") String paymentProduct,
			@PathParam("paymentId") String paymentId, @HeaderParam("X-Request-ID") UUID xRequestID,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Read the SCA status of the payment authorisation
	 *
	 * This method returns the SCA status of a payment initiation&#x27;s
	 * authorisation sub-resource.
	 *
	 */
	@GET
	@Path("/v1/{payment-service}/{payment-product}/{paymentId}/authorisations/{authorisationId}")
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Read the SCA status of the payment authorisation")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)"), @Tag(name = "Common Services") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public ScaStatusResponse getPaymentInitiationScaStatus(@PathParam("payment-service") String paymentService,
			@PathParam("payment-product") String paymentProduct, @PathParam("paymentId") String paymentId,
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
	 * Payment initiation status request
	 *
	 * Check the transaction status of a payment initiation.
	 *
	 */
	@GET
	@Path("/v1/{payment-service}/{payment-product}/{paymentId}/status")
	@Produces({ "application/json", "application/xml", "application/problem+json" })
	@Operation(summary = "Payment initiation status request")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public PaymentInitiationStatusResponse200Json getPaymentInitiationStatus(
			@PathParam("payment-service") String paymentService, @PathParam("payment-product") String paymentProduct,
			@PathParam("paymentId") String paymentId, @HeaderParam("X-Request-ID") UUID xRequestID,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Payment initiation request
	 *
	 * This method is used to initiate a payment at the ASPSP. ## Variants of
	 * payment initiation requests This method to initiate a payment initiation at
	 * the ASPSP can be sent with either a JSON body or an pain.001 body depending
	 * on the payment product in the path. There are the following **payment
	 * products**: - Payment products with payment information in *JSON* format: -
	 * ***sepa-credit-transfers*** - ***instant-sepa-credit-transfers*** -
	 * ***target-2-payments*** - ***cross-border-credit-transfers*** - Payment
	 * products with payment information in *pain.001* XML format: -
	 * ***pain.001-sepa-credit-transfers*** -
	 * ***pain.001-instant-sepa-credit-transfers*** -
	 * ***pain.001-target-2-payments*** -
	 * ***pain.001-cross-border-credit-transfers*** Furthermore the request body
	 * depends on the **payment-service**: * ***payments***: A single payment
	 * initiation request. * ***bulk-payments***: A collection of several payment
	 * initiation requests. In case of a *pain.001* message there are more than one
	 * payments contained in the *pain.001 message. In case of a *JSON* there are
	 * several JSON payment blocks contained in a joining list. *
	 * ***periodic-payments***: Create a standing order initiation resource for
	 * recurrent i.e. periodic payments addressable under {paymentId} with all data
	 * relevant for the corresponding payment product and the execution of the
	 * standing order contained in a JSON body. This is the first step in the API to
	 * initiate the related recurring/periodic payment. ## Single and mulitilevel
	 * SCA Processes The payment initiation requests are independent from the need
	 * of one or multilevel SCA processing, i.e. independent from the number of
	 * authorisations needed for the execution of payments. But the response
	 * messages are specific to either one SCA processing or multilevel SCA
	 * processing. For payment initiation with multilevel SCA, this specification
	 * requires an explicit start of the authorisation, i.e. links directly
	 * associated with SCA processing like &#x27;scaRedirect&#x27; or
	 * &#x27;scaOAuth&#x27; cannot be contained in the response message of a Payment
	 * Initation Request for a payment, where multiple authorisations are needed.
	 * Also if any data is needed for the next action, like selecting an SCA method
	 * is not supported in the response, since all starts of the multiple
	 * authorisations are fully equal. In these cases, first an authorisation
	 * sub-resource has to be generated following the &#x27;startAuthorisation&#x27;
	 * link.
	 *
	 */
	@POST
	@Path("/v1/{payment-service}/{payment-product}")
	@Consumes({ "application/json", "application/xml", "multipart/form-data" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Payment initiation request")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public PaymentInitationRequestResponse201 initiatePayment(@Valid Object body,
			@Multipart(value = "xml_sct") Object xmlSct,
			@Multipart(value = "json_standingorderType") PeriodicPaymentInitiationXmlPart2StandingorderTypeJson jsonStandingorderType,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("PSU-IP-Address") String psUIPAddress,
			@PathParam("payment-service") String paymentService, @PathParam("payment-product") String paymentProduct,
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
			@HeaderParam("TPP-Rejection-NoFunds-Preferred") Boolean tpPRejectionNoFundsPreferred,
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
	 * Payment initiation request
	 *
	 * This method is used to initiate a payment at the ASPSP. ## Variants of
	 * payment initiation requests This method to initiate a payment initiation at
	 * the ASPSP can be sent with either a JSON body or an pain.001 body depending
	 * on the payment product in the path. There are the following **payment
	 * products**: - Payment products with payment information in *JSON* format: -
	 * ***sepa-credit-transfers*** - ***instant-sepa-credit-transfers*** -
	 * ***target-2-payments*** - ***cross-border-credit-transfers*** - Payment
	 * products with payment information in *pain.001* XML format: -
	 * ***pain.001-sepa-credit-transfers*** -
	 * ***pain.001-instant-sepa-credit-transfers*** -
	 * ***pain.001-target-2-payments*** -
	 * ***pain.001-cross-border-credit-transfers*** Furthermore the request body
	 * depends on the **payment-service**: * ***payments***: A single payment
	 * initiation request. * ***bulk-payments***: A collection of several payment
	 * initiation requests. In case of a *pain.001* message there are more than one
	 * payments contained in the *pain.001 message. In case of a *JSON* there are
	 * several JSON payment blocks contained in a joining list. *
	 * ***periodic-payments***: Create a standing order initiation resource for
	 * recurrent i.e. periodic payments addressable under {paymentId} with all data
	 * relevant for the corresponding payment product and the execution of the
	 * standing order contained in a JSON body. This is the first step in the API to
	 * initiate the related recurring/periodic payment. ## Single and mulitilevel
	 * SCA Processes The payment initiation requests are independent from the need
	 * of one or multilevel SCA processing, i.e. independent from the number of
	 * authorisations needed for the execution of payments. But the response
	 * messages are specific to either one SCA processing or multilevel SCA
	 * processing. For payment initiation with multilevel SCA, this specification
	 * requires an explicit start of the authorisation, i.e. links directly
	 * associated with SCA processing like &#x27;scaRedirect&#x27; or
	 * &#x27;scaOAuth&#x27; cannot be contained in the response message of a Payment
	 * Initation Request for a payment, where multiple authorisations are needed.
	 * Also if any data is needed for the next action, like selecting an SCA method
	 * is not supported in the response, since all starts of the multiple
	 * authorisations are fully equal. In these cases, first an authorisation
	 * sub-resource has to be generated following the &#x27;startAuthorisation&#x27;
	 * link.
	 *
	 */
	@POST
	@Path("/v1/{payment-service}/{payment-product}")
	@Consumes({ "application/json", "application/xml", "multipart/form-data" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Payment initiation request")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public PaymentInitationRequestResponse201 initiatePayment(@Valid Object body,
			@Multipart(value = "xml_sct") Object xmlSct,
			@Multipart(value = "json_standingorderType") PeriodicPaymentInitiationXmlPart2StandingorderTypeJson jsonStandingorderType,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("PSU-IP-Address") String psUIPAddress,
			@PathParam("payment-service") String paymentService, @PathParam("payment-product") String paymentProduct,
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
			@HeaderParam("TPP-Rejection-NoFunds-Preferred") Boolean tpPRejectionNoFundsPreferred,
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
	 * Payment initiation request
	 *
	 * This method is used to initiate a payment at the ASPSP. ## Variants of
	 * payment initiation requests This method to initiate a payment initiation at
	 * the ASPSP can be sent with either a JSON body or an pain.001 body depending
	 * on the payment product in the path. There are the following **payment
	 * products**: - Payment products with payment information in *JSON* format: -
	 * ***sepa-credit-transfers*** - ***instant-sepa-credit-transfers*** -
	 * ***target-2-payments*** - ***cross-border-credit-transfers*** - Payment
	 * products with payment information in *pain.001* XML format: -
	 * ***pain.001-sepa-credit-transfers*** -
	 * ***pain.001-instant-sepa-credit-transfers*** -
	 * ***pain.001-target-2-payments*** -
	 * ***pain.001-cross-border-credit-transfers*** Furthermore the request body
	 * depends on the **payment-service**: * ***payments***: A single payment
	 * initiation request. * ***bulk-payments***: A collection of several payment
	 * initiation requests. In case of a *pain.001* message there are more than one
	 * payments contained in the *pain.001 message. In case of a *JSON* there are
	 * several JSON payment blocks contained in a joining list. *
	 * ***periodic-payments***: Create a standing order initiation resource for
	 * recurrent i.e. periodic payments addressable under {paymentId} with all data
	 * relevant for the corresponding payment product and the execution of the
	 * standing order contained in a JSON body. This is the first step in the API to
	 * initiate the related recurring/periodic payment. ## Single and mulitilevel
	 * SCA Processes The payment initiation requests are independent from the need
	 * of one or multilevel SCA processing, i.e. independent from the number of
	 * authorisations needed for the execution of payments. But the response
	 * messages are specific to either one SCA processing or multilevel SCA
	 * processing. For payment initiation with multilevel SCA, this specification
	 * requires an explicit start of the authorisation, i.e. links directly
	 * associated with SCA processing like &#x27;scaRedirect&#x27; or
	 * &#x27;scaOAuth&#x27; cannot be contained in the response message of a Payment
	 * Initation Request for a payment, where multiple authorisations are needed.
	 * Also if any data is needed for the next action, like selecting an SCA method
	 * is not supported in the response, since all starts of the multiple
	 * authorisations are fully equal. In these cases, first an authorisation
	 * sub-resource has to be generated following the &#x27;startAuthorisation&#x27;
	 * link.
	 *
	 */
	@POST
	@Path("/v1/{payment-service}/{payment-product}")
	@Consumes({ "application/json", "application/xml", "multipart/form-data" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Payment initiation request")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public PaymentInitationRequestResponse201 initiatePayment(@Valid Object body,
			@Multipart(value = "xml_sct") Object xmlSct,
			@Multipart(value = "json_standingorderType") PeriodicPaymentInitiationXmlPart2StandingorderTypeJson jsonStandingorderType,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("PSU-IP-Address") String psUIPAddress,
			@PathParam("payment-service") String paymentService, @PathParam("payment-product") String paymentProduct,
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
			@HeaderParam("TPP-Rejection-NoFunds-Preferred") Boolean tpPRejectionNoFundsPreferred,
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
	 * Start the authorisation process for a payment initiation
	 *
	 * Create an authorisation sub-resource and start the authorisation process. The
	 * message might in addition transmit authentication and authorisation related
	 * data. This method is iterated n times for a n times SCA authorisation in a
	 * corporate context, each creating an own authorisation sub-endpoint for the
	 * corresponding PSU authorising the transaction. The ASPSP might make the usage
	 * of this access method unnecessary in case of only one SCA process needed,
	 * since the related authorisation resource might be automatically created by
	 * the ASPSP after the submission of the payment data with the first POST
	 * payments/{payment-product} call. The start authorisation process is a process
	 * which is needed for creating a new authorisation or cancellation
	 * sub-resource. This applies in the following scenarios: * The ASPSP has
	 * indicated with a &#x27;startAuthorisation&#x27; hyperlink in the preceding
	 * Payment initiation response that an explicit start of the authorisation
	 * process is needed by the TPP. The &#x27;startAuthorisation&#x27; hyperlink
	 * can transport more information about data which needs to be uploaded by using
	 * the extended forms: * &#x27;startAuthorisationWithPsuIdentfication&#x27; *
	 * &#x27;startAuthorisationWithPsuAuthentication&#x27; *
	 * &#x27;startAuthorisationWithEncryptedPsuAuthentication&#x27; *
	 * &#x27;startAuthorisationWithAuthentciationMethodSelection&#x27; * The related
	 * payment initiation cannot yet be executed since a multilevel SCA is mandated.
	 * * The ASPSP has indicated with a &#x27;startAuthorisation&#x27; hyperlink in
	 * the preceding Payment cancellation response that an explicit start of the
	 * authorisation process is needed by the TPP. The
	 * &#x27;startAuthorisation&#x27; hyperlink can transport more information about
	 * data which needs to be uploaded by using the extended forms as indicated
	 * above. * The related payment cancellation request cannot be applied yet since
	 * a multilevel SCA is mandate for executing the cancellation. * The signing
	 * basket needs to be authorised yet.
	 *
	 */
	@POST
	@Path("/v1/{payment-service}/{payment-product}/{paymentId}/authorisations")
	@Consumes({ "application/json" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Start the authorisation process for a payment initiation")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)"), @Tag(name = "Common Services") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public StartScaprocessResponse startPaymentAuthorisation(@HeaderParam("X-Request-ID") UUID xRequestID,
			@PathParam("payment-service") String paymentService, @PathParam("payment-product") String paymentProduct,
			@PathParam("paymentId") String paymentId, @Valid Body body, @HeaderParam("PSU-ID") String PSU_ID,
			@HeaderParam("PSU-ID-Type") String psUIDType, @HeaderParam("PSU-Corporate-ID") String psUCorporateID,
			@HeaderParam("PSU-Corporate-ID-Type") String psUCorporateIDType,
			@HeaderParam("TPP-Redirect-Preferred") Boolean tpPRedirectPreferred,
			@HeaderParam("TPP-Redirect-URI") String tpPRedirectURI,
			@HeaderParam("TPP-Nok-Redirect-URI") String tpPNokRedirectURI,
			@HeaderParam("TPP-Notification-URI") String tpPNotificationURI,
			@HeaderParam("TPP-Notification-Content-Preferred") String tpPNotificationContentPreferred,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate,
			@HeaderParam("PSU-IP-Address") String psUIPAddress, @HeaderParam("PSU-IP-Port") String psUIPPort,
			@HeaderParam("PSU-Accept") String psUAccept, @HeaderParam("PSU-Accept-Charset") String psUAcceptCharset,
			@HeaderParam("PSU-Accept-Encoding") String psUAcceptEncoding,
			@HeaderParam("PSU-Accept-Language") String psUAcceptLanguage,
			@HeaderParam("PSU-User-Agent") String psUUserAgent, @HeaderParam("PSU-Http-Method") String psUHttpMethod,
			@HeaderParam("PSU-Device-ID") UUID psUDeviceID, @HeaderParam("PSU-Geo-Location") String psUGeoLocation);

	/**
	 * Start the authorisation process for the cancellation of the addressed payment
	 *
	 * Creates an authorisation sub-resource and start the authorisation process of
	 * the cancellation of the addressed payment. The message might in addition
	 * transmit authentication and authorisation related data. This method is
	 * iterated n times for a n times SCA authorisation in a corporate context, each
	 * creating an own authorisation sub-endpoint for the corresponding PSU
	 * authorising the cancellation-authorisation. The ASPSP might make the usage of
	 * this access method unnecessary in case of only one SCA process needed, since
	 * the related authorisation resource might be automatically created by the
	 * ASPSP after the submission of the payment data with the first POST
	 * payments/{payment-product} call. The start authorisation process is a process
	 * which is needed for creating a new authorisation or cancellation
	 * sub-resource. This applies in the following scenarios: * The ASPSP has
	 * indicated with a &#x27;startAuthorisation&#x27; hyperlink in the preceding
	 * payment initiation response that an explicit start of the authorisation
	 * process is needed by the TPP. The &#x27;startAuthorisation&#x27; hyperlink
	 * can transport more information about data which needs to be uploaded by using
	 * the extended forms: * &#x27;startAuthorisationWithPsuIdentfication&#x27; *
	 * &#x27;startAuthorisationWithPsuAuthentication&#x27; *
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
	@Path("/v1/{payment-service}/{payment-product}/{paymentId}/cancellation-authorisations")
	@Consumes({ "application/json" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Start the authorisation process for the cancellation of the addressed payment")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)"), @Tag(name = "Common Services") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public StartScaprocessResponse startPaymentInitiationCancellationAuthorisation(
			@HeaderParam("X-Request-ID") UUID xRequestID, @PathParam("payment-service") String paymentService,
			@PathParam("payment-product") String paymentProduct, @PathParam("paymentId") String paymentId,
			@Valid Body2 body, @HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
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
	 * Update PSU data for payment initiation cancellation
	 *
	 * This method updates PSU data on the cancellation authorisation resource if
	 * needed. It may authorise a cancellation of the payment within the Embedded
	 * SCA Approach where needed. Independently from the SCA Approach it supports
	 * e.g. the selection of the authentication method and a non-SCA PSU
	 * authentication. This methods updates PSU data on the cancellation
	 * authorisation resource if needed. There are several possible update PSU data
	 * requests in the context of a cancellation authorisation within the payment
	 * initiation services needed, which depends on the SCA approach: * Redirect SCA
	 * Approach: A specific Update PSU data request is applicable for * the
	 * selection of authentication methods, before choosing the actual SCA approach.
	 * * Decoupled SCA Approach: A specific Update PSU data request is only
	 * applicable for * adding the PSU Identification, if not provided yet in the
	 * payment initiation request or the Account Information Consent Request, or if
	 * no OAuth2 access token is used, or * the selection of authentication methods.
	 * * Embedded SCA Approach: The Update PSU data request might be used * to add
	 * credentials as a first factor authentication data of the PSU and * to select
	 * the authentication method and * transaction authorisation. The SCA approach
	 * might depend on the chosen SCA method. For that reason, the following
	 * possible update PSU data request can apply to all SCA approaches: * Select an
	 * SCA method in case of several SCA methods are available for the customer.
	 * There are the following request types on this access path: * Update PSU
	 * identification * Update PSU authentication * Select PSU autorization method
	 * WARNING: This method needs a reduced header, therefore many optional elements
	 * are not present. Maybe in a later version the access path will change. *
	 * Transaction Authorisation WARNING: This method needs a reduced header,
	 * therefore many optional elements are not present. Maybe in a later version
	 * the access path will change.
	 *
	 */
	@PUT
	@Path("/v1/{payment-service}/{payment-product}/{paymentId}/cancellation-authorisations/{authorisationId}")
	@Consumes({ "application/json" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Update PSU data for payment initiation cancellation")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)"), @Tag(name = "Common Services") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public InlineResponse2002 updatePaymentCancellationPsuData(@HeaderParam("X-Request-ID") UUID xRequestID,
			@PathParam("payment-service") String paymentService, @PathParam("payment-product") String paymentProduct,
			@PathParam("paymentId") String paymentId, @PathParam("authorisationId") String authorisationId,
			@Valid Body3 body, @HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
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
	 * Update PSU data for payment initiation
	 *
	 * This methods updates PSU data on the authorisation resource if needed. It may
	 * authorise a payment within the Embedded SCA Approach where needed.
	 * Independently from the SCA Approach it supports e.g. the selection of the
	 * authentication method and a non-SCA PSU authentication. There are several
	 * possible update PSU data requests in the context of payment initiation
	 * services needed, which depends on the SCA approach: * Redirect SCA Approach:
	 * A specific update PSU data request is applicable for * the selection of
	 * authentication methods, before choosing the actual SCA approach. * Decoupled
	 * SCA Approach: A specific update PSU data request is only applicable for *
	 * adding the PSU identification, if not provided yet in the payment initiation
	 * request or the account information consent request, or if no OAuth2 access
	 * token is used, or * the selection of authentication methods. * Embedded SCA
	 * Approach: The Update PSU Data request might be used * to add credentials as a
	 * first factor authentication data of the PSU and * to select the
	 * authentication method and * transaction authorisation. The SCA Approach might
	 * depend on the chosen SCA method. For that reason, the following possible
	 * Update PSU data request can apply to all SCA approaches: * Select an SCA
	 * method in case of several SCA methods are available for the customer. There
	 * are the following request types on this access path: * Update PSU
	 * identification * Update PSU authentication * Select PSU autorization method
	 * WARNING: This method needs a reduced header, therefore many optional elements
	 * are not present. Maybe in a later version the access path will change. *
	 * Transaction authorisation WARNING: This method needs a reduced header,
	 * therefore many optional elements are not present. Maybe in a later version
	 * the access path will change.
	 *
	 */
	@PUT
	@Path("/v1/{payment-service}/{payment-product}/{paymentId}/authorisations/{authorisationId}")
	@Consumes({ "application/json" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Update PSU data for payment initiation")
	@Tags(value = { @Tag(name = "Payment Initiation Service (PIS)"), @Tag(name = "Common Services") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public InlineResponse2002 updatePaymentPsuData(@HeaderParam("X-Request-ID") UUID xRequestID,
			@PathParam("payment-service") String paymentService, @PathParam("payment-product") String paymentProduct,
			@PathParam("paymentId") String paymentId, @PathParam("authorisationId") String authorisationId,
			@Valid Body1 body, @HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
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
