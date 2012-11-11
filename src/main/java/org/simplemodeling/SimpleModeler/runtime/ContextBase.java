package org.simplemodeling.SimpleModeler.runtime;

import java.util.*;
import java.security.AccessControlException;

/*
 * @since   Nov. 11, 2012
 * @version Nov. 11, 2012
 * @author  ASAMI, Tomoharu
 */
public abstract class ContextBase {
    /*
     * Security
     */
    public void authorize(ISecurityContext security) throws AccessControlException {
    }

    public void authorizeAll() throws AccessControlException {
    }

    /*
     * Logging
     */
    public void log_enter(String context, String method, Object in) {
    }

    public void log_leave(String context, String method, Object out) {
    }

    public void log_leave(String context, String method) {
    }

    public Response<Void> ok(String context, String method) {
        log_leave(context, method);
        return Response.ok();
    }

    public <T> Response<T> ok(String context, String method, T out) {
        log_leave(context, method, out);
        return Response.ok(out);
    }

    public <T> Response<T> ok(String context, String method, Response<T> out) {
        log_leave(context, method, out);
        return out;
    }

    public void log_exception(String context, String method, Throwable e) {
    }
}
