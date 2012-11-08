package org.simplemodeling.SimpleModeler.runtime;

import java.util.*;
import java.math.*;

/*
 * @since   Feb. 10, 2012
 * @version Nov.  8, 2012
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

    /*
     * plus
     */
    public static int plus(int lhs, int rhs) {
        return lhs + rhs;
    }

    public static long plus(int lhs, long rhs) {
        return lhs + rhs;
    }

    public static long plus(long lhs, int rhs) {
        return lhs + rhs;
    }

    public static long plus(long lhs, long rhs) {
        return lhs + rhs;
    }

    public static float plus(float lhs, float rhs) {
        return lhs + rhs;
    }

    public static double plus(double lhs, double rhs) {
        return lhs + rhs;
    }

    public static BigInteger plus(int lhs, BigInteger rhs) {
        return BigInteger.valueOf(lhs).add(rhs);
    }

    public static BigInteger plus(BigInteger lhs, int rhs) {
        return lhs.add(BigInteger.valueOf(rhs));
    }

    public static BigInteger plus(BigInteger lhs, BigInteger rhs) {
        return lhs.add(rhs);
    }

    public static BigDecimal plus(int lhs, BigDecimal rhs) {
        return BigDecimal.valueOf(lhs).add(rhs);
    }

    public static BigDecimal plus(BigDecimal lhs, int rhs) {
        return lhs.add(BigDecimal.valueOf(rhs));
    }

    public static BigDecimal plus(BigDecimal lhs, BigDecimal rhs) {
        return lhs.add(rhs);
    }

    public static BigDecimal plus(BigDecimal lhs, BigInteger rhs) {
        return lhs.add(new BigDecimal(rhs));
    }

    public static BigDecimal plus(BigInteger lhs, BigDecimal rhs) {
        return new BigDecimal(lhs).add(rhs);
    }

    /*
     * subtract
     */
    public static int subtract(int lhs, int rhs) {
        return lhs - rhs;
    }

    public static long subtract(int lhs, long rhs) {
        return lhs - rhs;
    }

    public static long subtract(long lhs, int rhs) {
        return lhs - rhs;
    }

    public static long subtract(long lhs, long rhs) {
        return lhs - rhs;
    }

    public static float subtract(float lhs, float rhs) {
        return lhs - rhs;
    }

    public static double subtract(double lhs, double rhs) {
        return lhs - rhs;
    }

    public static BigInteger subtract(int lhs, BigInteger rhs) {
        return BigInteger.valueOf(lhs).subtract(rhs);
    }

    public static BigInteger subtract(BigInteger lhs, int rhs) {
        return lhs.subtract(BigInteger.valueOf(rhs));
    }

    public static BigInteger subtract(BigInteger lhs, BigInteger rhs) {
        return lhs.subtract(rhs);
    }

    public static BigDecimal subtract(int lhs, BigDecimal rhs) {
        return BigDecimal.valueOf(lhs).subtract(rhs);
    }

    public static BigDecimal subtract(BigDecimal lhs, int rhs) {
        return lhs.subtract(BigDecimal.valueOf(rhs));
    }

    public static BigDecimal subtract(BigDecimal lhs, BigDecimal rhs) {
        return lhs.subtract(rhs);
    }

    public static BigDecimal subtract(BigDecimal lhs, BigInteger rhs) {
        return lhs.subtract(new BigDecimal(rhs));
    }

    public static BigDecimal subtract(BigInteger lhs, BigDecimal rhs) {
        return new BigDecimal(lhs).subtract(rhs);
    }

    /*
     * multiply
     */
    public static int multiply(int lhs, int rhs) {
        return lhs * rhs;
    }

    public static long multiply(int lhs, long rhs) {
        return lhs * rhs;
    }

    public static long multiply(long lhs, int rhs) {
        return lhs * rhs;
    }

    public static long multiply(long lhs, long rhs) {
        return lhs * rhs;
    }

    public static float multiply(float lhs, float rhs) {
        return lhs * rhs;
    }

    public static double multiply(double lhs, double rhs) {
        return lhs * rhs;
    }

    public static BigInteger multiply(int lhs, BigInteger rhs) {
        return BigInteger.valueOf(lhs).multiply(rhs);
    }

    public static BigInteger multiply(BigInteger lhs, int rhs) {
        return lhs.multiply(BigInteger.valueOf(rhs));
    }

    public static BigInteger multiply(BigInteger lhs, BigInteger rhs) {
        return lhs.multiply(rhs);
    }

    public static BigDecimal multiply(int lhs, BigDecimal rhs) {
        return BigDecimal.valueOf(lhs).multiply(rhs);
    }

    public static BigDecimal multiply(BigDecimal lhs, int rhs) {
        return lhs.multiply(BigDecimal.valueOf(rhs));
    }

    public static BigDecimal multiply(BigDecimal lhs, BigDecimal rhs) {
        return lhs.multiply(rhs);
    }

    public static BigDecimal multiply(BigDecimal lhs, BigInteger rhs) {
        return lhs.multiply(new BigDecimal(rhs));
    }

    public static BigDecimal multiply(BigInteger lhs, BigDecimal rhs) {
        return new BigDecimal(lhs).multiply(rhs);
    }

    /*
     * divide
     */
    public static int divide(int lhs, int rhs) {
        return lhs / rhs;
    }

    public static long divide(int lhs, long rhs) {
        return lhs / rhs;
    }

    public static long divide(long lhs, int rhs) {
        return lhs / rhs;
    }

    public static long divide(long lhs, long rhs) {
        return lhs / rhs;
    }

    public static float divide(float lhs, float rhs) {
        return lhs / rhs;
    }

    public static double divide(double lhs, double rhs) {
        return lhs / rhs;
    }

    public static BigInteger divide(int lhs, BigInteger rhs) {
        return BigInteger.valueOf(lhs).divide(rhs);
    }

    public static BigInteger divide(BigInteger lhs, int rhs) {
        return lhs.divide(BigInteger.valueOf(rhs));
    }

    public static BigInteger divide(BigInteger lhs, BigInteger rhs) {
        return lhs.divide(rhs);
    }

    public static BigDecimal divide(int lhs, BigDecimal rhs) {
        return BigDecimal.valueOf(lhs).divide(rhs);
    }

    public static BigDecimal divide(BigDecimal lhs, int rhs) {
        return lhs.divide(BigDecimal.valueOf(rhs));
    }

    public static BigDecimal divide(BigDecimal lhs, BigDecimal rhs) {
        return lhs.divide(rhs);
    }

    public static BigDecimal divide(BigDecimal lhs, BigInteger rhs) {
        return lhs.divide(new BigDecimal(rhs));
    }

    public static BigDecimal divide(BigInteger lhs, BigDecimal rhs) {
        return new BigDecimal(lhs).divide(rhs);
    }

    /*
     * mod
     */
    public static int mod(int lhs, int rhs) {
        return lhs % rhs;
    }

    public static long mod(int lhs, long rhs) {
        return lhs % rhs;
    }

    public static long mod(long lhs, int rhs) {
        return lhs % rhs;
    }

    public static long mod(long lhs, long rhs) {
        return lhs % rhs;
    }

    public static float mod(float lhs, float rhs) {
        return lhs % rhs;
    }

    public static double mod(double lhs, double rhs) {
        return lhs % rhs;
    }

    public static BigInteger mod(int lhs, BigInteger rhs) {
        return BigInteger.valueOf(lhs).mod(rhs);
    }

    public static BigInteger mod(BigInteger lhs, int rhs) {
        return lhs.mod(BigInteger.valueOf(rhs));
    }

    public static BigInteger mod(BigInteger lhs, BigInteger rhs) {
        return lhs.mod(rhs);
    }

/*
    public static BigDecimal mod(int lhs, BigDecimal rhs) {
        return BigDecimal.valueOf(lhs).mod(rhs);
    }

    public static BigDecimal mod(BigDecimal lhs, int rhs) {
        return lhs.mod(BigDecimal.valueOf(rhs));
    }

    public static BigDecimal mod(BigDecimal lhs, BigDecimal rhs) {
        return lhs.mod(rhs);
    }

    public static BigDecimal mod(BigDecimal lhs, BigInteger rhs) {
        return lhs.mod(new BigDecimal(rhs));
    }

    public static BigDecimal mod(BigInteger lhs, BigDecimal rhs) {
        return new BigDecimal(lhs).mod(rhs);
    }
*/

    /*
     *
     */
    private static String _to_string(Object value) {
        return value.toString();
    }

    // XML
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

    // Json
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

    // Csv
    public static void toCsv(StringBuilder buf, String name, Object value) {
        if (value == null) return;
        buf.append(name); 
        buf.append(":"); 
        buf.append("\""); 
        toString(buf, value); 
        buf.append("\""); 
    } 
    
    public static void toCsv(StringBuilder buf, String name, String value) {
        if (value == null) return;
        buf.append(name); 
        buf.append(":"); 
        buf.append("\""); 
        toString(buf, value); 
        buf.append("\""); 
    } 
    
    public static void toCsv(StringBuilder buf, String name, Date value) {
        if (value == null) return;
        buf.append(name); 
        buf.append(":");
        buf.append("\"");
        toString(buf, value); 
        buf.append("\""); 
    } 
        
    public static void toCsv(StringBuilder buf, String name, List<String> values) {
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

    // Yaml
    public static void toYaml(StringBuilder buf, String name, Object value) {
        if (value == null) return;
        buf.append(name); 
        buf.append(":"); 
        buf.append("\""); 
        toString(buf, value); 
        buf.append("\""); 
    } 
    
    public static void toYaml(StringBuilder buf, String name, String value) {
        if (value == null) return;
        buf.append(name); 
        buf.append(":"); 
        buf.append("\""); 
        toString(buf, value); 
        buf.append("\""); 
    } 
    
    public static void toYaml(StringBuilder buf, String name, Date value) {
        if (value == null) return;
        buf.append(name); 
        buf.append(":");
        buf.append("\"");
        toString(buf, value); 
        buf.append("\""); 
    } 
        
    public static void toYaml(StringBuilder buf, String name, List<String> values) {
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

    // Map
    public static void toMap(Map<String, Object> map, String name, Object value) {
        if (value == null) return;
        map.put(name, value);
    }
    
    public static void toStringMap(Map<String, String> map, String name, Object value) {
        if (value == null) return;
        map.put(name, _to_string(value));
    }
}
