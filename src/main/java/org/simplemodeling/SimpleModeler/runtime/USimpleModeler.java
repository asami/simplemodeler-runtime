package org.simplemodeling.SimpleModeler.runtime;

import java.util.*;

/**
 * @since   Feb. 10, 2012
 * @version Feb. 10, 2012
 * @author  ASAMI, Tomoharu
 */
public final class USimpleModeler {
    public static int toHashCode(Object value) {
        return value == null ? 0 : value.hashCode();
    }
    
    public static boolean isEquals(boolean lhs, boolean rhs) {
        return lhs == rhs;
    }
    
    public static boolean isEquals(byte lhs, byte rhs) {
        return lhs == rhs;
    }
    
    public static boolean isEquals(short lhs, short rhs) {
        return lhs == rhs;
    }
    
    public static boolean isEquals(int lhs, int rhs) {
        return lhs == rhs;
    }
    
    public static boolean isEquals(long lhs, long rhs) {
        return lhs == rhs;
    }
    
    public static boolean isEquals(float lhs, float rhs) {
        return lhs == rhs;
    }
    
    public static boolean isEquals(double lhs, double rhs) {
        return lhs == rhs;
    }
    
    public static boolean isEquals(Object lhs, Object rhs) {
        if (lhs == null) return rhs == null;
        else return lhs.equals(rhs);
    }
    
    public static void toString(StringBuilder buf, String value) {
        buf.append(value);
    }

    public static void toString(StringBuilder buf, Object value) {
        buf.append(_to_string(value));
    }
    
    public static void toString(StringBuilder buf, Date value) {
        buf.append(_to_string(value));
    }
    
    private static String _to_string(Object value) {
        return value.toString();
    }
    
    public static void toXml(StringBuilder buf, String name, Object value) {
        if (value == null) return;
        buf.append("<"); 
        buf.append(name); 
        buf.append(">"); 
        toString(buf, value);
        buf.append("</"); 
        buf.append(name); 
        buf.append(">");
    } 
    
    public static void toXml(StringBuilder buf, String name, String value) {
        if (value == null) return;
        buf.append("<"); 
        buf.append(name); 
        buf.append(">"); 
        toString(buf, value);
        buf.append("</"); 
        buf.append(name); 
        buf.append(">");
    } 
    
    public static void toXml(StringBuilder buf, String name, Date value) {
        if (value == null) return;
        buf.append("<"); 
        buf.append(name); 
        buf.append(">"); 
        toString(buf, value);
        buf.append("</"); 
        buf.append(name); 
        buf.append(">");
    } 
        
    public static void toXml(StringBuilder buf, String name, List<String> values) {
        if (values == null) return;
        for (String v: values) {
            toXml(buf, name, v);
        }
    } 

    public static void toJson(StringBuilder buf, String name, Object value) {
        if (value == null) return;
        buf.append(name); 
        buf.append(":"); 
        buf.append("\""); 
        toString(buf, value); 
        buf.append("\""); 
    } 
    
    public static void toJson(StringBuilder buf, String name, String value) {
        if (value == null) return;
        buf.append(name); 
        buf.append(":"); 
        buf.append("\""); 
        toString(buf, value); 
        buf.append("\""); 
    } 
    
    public static void toJson(StringBuilder buf, String name, Date value) {
        if (value == null) return;
        buf.append(name); 
        buf.append(":");
        buf.append("\"");
        toString(buf, value); 
        buf.append("\""); 
    } 
        
    public static void toJson(StringBuilder buf, String name, List<String> values) {
        if (values == null) return;
        buf.append(name);
        buf.append(": [");
        boolean first = true;
        for (String v: values) {
            if (!first) {
                first = false;
                buf.append(", ");
            }
            buf.append("\"");
            toString(buf, v);
            buf.append("\"");
        }
        buf.append("]");
    } 
    
    public static void toMap(Map<String, Object> map, String name, Object value) {
        if (value == null) return;
        map.put(name, value);
    }
    
    public static void toStringMap(Map<String, String> map, String name, Object value) {
        if (value == null) return;
        map.put(name, _to_string(value));
    }
}
