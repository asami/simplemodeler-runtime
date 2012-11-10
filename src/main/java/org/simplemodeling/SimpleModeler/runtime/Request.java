package org.simplemodeling.SimpleModeler.runtime;

import java.util.*;

/*
 * @since   Nov. 10, 2012
 * @version Nov. 11, 2012
 * @author  ASAMI, Tomoharu
 */
public class Request<T> {
    public final T value;
    public final ITransactionContext transaction; // Transaction context
    public final ISecurityContext security; // Security context
    public Map<String, Object> parameters = new HashMap<String, Object>();

    public Request() {
        this(null);
    }

    public Request(T value) {
        this(value, null, null);
    }

    public Request(T value, ITransactionContext transaction, ISecurityContext security) {
        this.value = value;
        this.transaction = transaction;
        this.security = security;
    }
}
