package org.simplemodeling.SimpleModeler.runtime;

import java.util.*;

/*
 * @since   Nov. 10, 2012
 * @version Nov. 11, 2012
 * @author  ASAMI, Tomoharu
 */
public class Response<T> {
    // http://en.wikipedia.org/wiki/List_of_HTTP_status_codes
    public static int CODE_CONTINUE = 100;
    public static int CODE_SWITCHING_PROTOCOLS = 101;
    public static int CODE_PROCESSING = 102; // WebDAV; RFC 2518
    public static int CODE_OK = 200;
    public static int CODE_CREATED = 201;
    public static int CODE_ACCEPTED = 202;
    public static int CODE_NON_AUTHORITATIVE_INFORMATION = 203; // HTTP/1.1
    public static int CODE_NO_CONTENT = 204;
    public static int CODE_RESET_CONTENT = 205;
    public static int CODE_PARTIAL_CONTENT = 206;
    public static int CODE_MULTI_STATUS = 207; // WebDAV; RFC 4918
    public static int CODE_ALREADY_REPORTED = 208; // WebDAV; RFC 5842
    public static int CODE_IM_USED = 226; // RFC 3229
    public static int CODE_MULTIPLE_CHOICES = 300;
    public static int CODE_MOVED_PERMANENTLY = 301;
    public static int CODE_FOUND = 302;
    public static int CODE_SEE_OTHER = 303; // HTTP/1.1
    public static int CODE_NOT_MODIFIED = 304;
    public static int CODE_USE_PROXY = 305; // HTTP/1.1
    public static int CODE_SWITCH_PROXY = 306;
    public static int CODE_TEMPORARY_REDIRECT = 307;
    public static int CODE_PERMANENT_REDIRECT = 308; // experimental
    public static int CODE_BAD_REQUEST = 400;
    public static int CODE_UNAUTHORIZED = 401;
    public static int CODE_PAYMENT_REQUIRED = 402;
    public static int CODE_FORBIDDEN = 403;
    public static int CODE_NOT_FOUND = 404;
    public static int CODE_METHOD_NOT_ALLOWED = 405;
    public static int CODE_NOT_ACCEPTABLE = 406;
    public static int CODE_PROXY_AUTHENTICATION_REQUIRED = 407;
    public static int CODE_REQUEST_TIMEOUT = 408;
    public static int CODE_CONFLICT = 409;
    public static int CODE_GONE = 410;
    public static int CODE_LENGTH_REQUIRED = 411;
    public static int CODE_PRECONDITION_FAILED = 412;
    public static int CODE_REQUEST_ENTITY_TOO_LARGE = 413;
    public static int CODE_REQUEST_URI_TOO_LONG = 414;
    public static int CODE_UNSUPPORTED_MEDIA_TYPE = 415;
    public static int CODE_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
    public static int CODE_EXPECTATION_FAILED = 417;
    public static int CODE_IM_A_TEAPOT = 418; // RFC2324
    public static int CODE_ENHANCE_YOUR_CALM = 420; // twitter
    public static int CODE_UNPROCESSABLE_ENTITY = 422; // WebDAV; RFC 4918
    public static int CODE_LOCKED = 423; // WebDAV; RFC 4918
    public static int CODE_FAILED_DEPENDENCY = 424; // WebDAV; RFC 4918
    public static int CODE_METHOD_FAILURE = 424; // WebDAV
    public static int CODE_UNORDERED_COLLECTION = 425; // Internet draft
    public static int CODE_UPGRADE_REQUIRED = 426; // RFC 2817
    public static int CODE_PRECONDITION_REQUIRED = 428; // RFC 6585
    public static int CODE_TOO_MANY_REQUEST = 429; // RFC 6585
    public static int CODE_REQUEST_HEADER_FIELDS_TOO_LARGE = 431; // RFC 6585
    public static int CODE_NO_RESPONSE = 444; // Nginx
    public static int CODE_RETRY_WITH = 449; // Microsoft
    public static int CODE_BLOCKED_BY_WINDOWS_PARENTAL_CONTROLS = 450; // Microsoft
    public static int CODE_UNAVAILABLE_FOR_LEGAL_REASONS = 451; // Internet draft
    public static int CODE_REDIRECT = 451; // Microsoft
    public static int CODE_REQUEST_HEADER_TOO_LARGE = 494; // Nginx
    public static int CODE_CERT_ERROR = 495; // Nginx
    public static int CODE_NO_CERT = 496; // Nginx
    public static int CODE_HTTP_TO_HTTPS = 497; // Nginx
    public static int CODE_CLIENT_CLOSED_REQUEST = 499; // Nginx
    public static int CODE_INTERNAL_SERVER_ERROR = 500;
    public static int CODE_NOT_IMPLEMENTED = 501;
    public static int CODE_BAD_GATEWAY = 502;
    public static int CODE_SERVICE_UNAVAILABLE = 503;
    public static int CODE_GATEWAY_TIMEOUT = 504;
    public static int CODE_HTTP_VERSION_NOT_SUPPORTED = 505;
    public static int CODE_VARIANT_ALSO_NEGOTIATES = 506; // RFC 2295
    public static int CODE_INSUFFICIENT_STORAGE = 507; // WebDAV; RFC 4918
    public static int CODE_LOOP_DETECTED = 508; // WebDAV; RFC 5842
    public static int CODE_BANDWIDTH_LIMIT_EXCEEDED = 509; // Apache bw/limited extension
    public static int CODE_NOT_EXTENDED = 510; // RFC 2774
    public static int CODE_NETWORK_AUTHENTICATION_REQUIRED = 511; // RFC 6585
    public static int CODE_NETWORK_READ_TIMEOUT_ERROR = 598; // Unknown
    public static int CODE_NETWORK_CONNECT_TIMEOUT_ERROR = 599; // Unknown

    public final int code;
    public final T value;
    public final String message;
    public final String mimetype;
    public final Throwable exception;

    public Response(int code) {
        this(code, null, null, null);
    }

    public Response(int code, T value) {
        this(code, value, null, null);
    }

    public Response(int code, T value, String message) {
        this(code, value, message, null);
    }

    public Response(int code, T value, String message, String mimetype) {
        this(code, value, message, mimetype, null);
    }

    public Response(int code, T value, String message, String mimetype, Throwable exception) {
        this.code = code;
        this.value = value;
        this.message = message;
        this.mimetype = mimetype;
        this.exception = exception;
    }

    public static <T> Response<T> ok() {
        return (Response<T>)Ok;
    }

    public static Response<Object> Ok = new Response<Object>(CODE_OK);

    public static <T> Response<T> ok(T value) {
        return new Response(CODE_OK, value);
    }

    public static <T> Response<T> failure(Throwable e) {
        if (e instanceof IllegalArgumentException) {
            return new Response(
                CODE_BAD_REQUEST, null, null, null, e);
        } else if (e instanceof NoSuchElementException) {
            return new Response(
                CODE_NOT_FOUND, null, null, null, e);
        } else if (e instanceof java.security.AccessControlException) {
            return new Response(
                CODE_UNAUTHORIZED, null, null, null, e);
        } else {
            return new Response(
                CODE_INTERNAL_SERVER_ERROR, null, null, null, e);
        }
    }
/*
    public static Response<T> badRequest = new Response(CODE_BAD_REQUEST);
    public static Response<T> unauthorized = new Response(CODE_UNAUTHORIZED);
    public static Response<T> paymentRequired = new Response(CODE_PAYMENT_REQUIRED);
    public static Response<T> forbidden = new Response(CODE_FORBIDDEN);
    public static Response<T> notFound = new Response(CODE_NOT_FOUND);
    public static Response<T> notAcceptable = new Response(CODE_NOT_ACCEPTABLE);
    public static Response<T> requestTimeout = new Response(CODE_REQUST_TIMEOUT);
    public static Response<T> conflict = new Response(CODE_CONFLICT);
    public static Response<T> preconditionFailed = new Response(CODE_PRECONDITION_FAILED);
    public static Response<T> requestEntityTooLarge = new Response(CODE_REQUEST_ENTITY_TOO_LARGE);
    public static Response<T> requestUriTooLong = new Response(CODE_REQUEST_URI_TOO_LONG);
    public static Response<T> unsupportedMediaType = new Response(CODE_UNSUPPORTED_MEDIA_TYPE);
    public static Response<T> requestedRangeNotSatisfiable = new Response(CODE_REQUEST_RANGE_NOT_SATISFIABLE);
    public static Response<T> locked = new Response(CODE_LOCKED);
    public static Response<T> tooManyRequest= new Response(CODE_TOO_MANY_REQUEST);
*/
    public static <T> Response<T> internalServerError() {
        return (Response<T>)InternalServerError;
    }

    public static Response<Object> InternalServerError = new Response(CODE_INTERNAL_SERVER_ERROR);

    public static <T> Response<T> notImplemented() {
        return (Response<T>)NotImplemented;
    }

    public static Response<Object> NotImplemented= new Response(CODE_NOT_IMPLEMENTED);
/*
    public static Response<T> badGateway = new Response(CODE_BAD_GATEWAY);
    public static Response<T> serviceUnavailable = new Response(CODE_SERVICE_UNAVAILABLE);
    public static Response<T> gatewayTimeout = new Response(CODE_GATEWAY_TIMEOUT);
*/
}
