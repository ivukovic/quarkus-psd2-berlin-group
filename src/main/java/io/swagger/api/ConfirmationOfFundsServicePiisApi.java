package io.swagger.api;

import java.util.UUID;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.openapi.annotations.Operation;
//import org.eclipse.microprofile.openapi.annotations.media.ArraySchema;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.openapi.annotations.tags.Tags;

import io.swagger.model.ConfirmationOfFunds;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.error.Error400NGAIS;
import io.swagger.model.error.Error401NGPIIS;
import io.swagger.model.error.Error403NGPIIS;
import io.swagger.model.error.Error404NGPIIS;
import io.swagger.model.error.Error405NGPIIS;
import io.swagger.model.error.Error409NGPIIS;

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
public interface ConfirmationOfFundsServicePiisApi {

	/**
	 * Confirmation of funds request
	 *
	 * Creates a confirmation of funds request at the ASPSP. Checks whether a
	 * specific amount is available at point of time of the request on an account
	 * linked to a given tuple card issuer(TPP)/card number, or addressed by IBAN
	 * and TPP respectively. If the related extended services are used a conditional
	 * Consent-ID is contained in the header. This field is contained but commented
	 * out in this specification.
	 *
	 */
	@POST
	@Path("/v1/funds-confirmations")
	@Consumes({ "application/json" })
	@Produces({ "application/json", "application/problem+json" })
	@Operation(summary = "Confirmation of funds request")
	@Tags(value = { @Tag(name = "Confirmation of Funds Service (PIIS)") })
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
			@APIResponse(responseCode = "503", description = "Service Unavailable") })
	public InlineResponse2008 checkAvailabilityOfFunds(@Valid ConfirmationOfFunds body,
			@HeaderParam("X-Request-ID") UUID xRequestID, @HeaderParam("Authorization") String authorization,
			@HeaderParam("Digest") String digest, @HeaderParam("Signature") String signature,
			@HeaderParam("TPP-Signature-Certificate") byte[] tpPSignatureCertificate);
}
