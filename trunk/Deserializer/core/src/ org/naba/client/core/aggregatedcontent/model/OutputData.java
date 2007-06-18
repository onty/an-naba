/**
 * OutputData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package  org.naba.client.core.aggregatedcontent.model;

public class OutputData  implements java.io.Serializable {
    private java.lang.String[] description;
    private java.lang.String[] originalSource;
    private java.util.Calendar[] publishDate;
    private java.lang.String[] title;

    public OutputData() {
    }

    public OutputData(
           java.lang.String[] description,
           java.lang.String[] originalSource,
           java.util.Calendar[] publishDate,
           java.lang.String[] title) {
           this.description = description;
           this.originalSource = originalSource;
           this.publishDate = publishDate;
           this.title = title;
    }


    /**
     * Gets the description value for this OutputData.
     * 
     * @return description
     */
    public java.lang.String[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OutputData.
     * 
     * @param description
     */
    public void setDescription(java.lang.String[] description) {
        this.description = description;
    }


    /**
     * Gets the originalSource value for this OutputData.
     * 
     * @return originalSource
     */
    public java.lang.String[] getOriginalSource() {
        return originalSource;
    }


    /**
     * Sets the originalSource value for this OutputData.
     * 
     * @param originalSource
     */
    public void setOriginalSource(java.lang.String[] originalSource) {
        this.originalSource = originalSource;
    }


    /**
     * Gets the publishDate value for this OutputData.
     * 
     * @return publishDate
     */
    public java.util.Calendar[] getPublishDate() {
        return publishDate;
    }


    /**
     * Sets the publishDate value for this OutputData.
     * 
     * @param publishDate
     */
    public void setPublishDate(java.util.Calendar[] publishDate) {
        this.publishDate = publishDate;
    }


    /**
     * Gets the title value for this OutputData.
     * 
     * @return title
     */
    public java.lang.String[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OutputData.
     * 
     * @param title
     */
    public void setTitle(java.lang.String[] title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OutputData)) return false;
        OutputData other = (OutputData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.originalSource==null && other.getOriginalSource()==null) || 
             (this.originalSource!=null &&
              java.util.Arrays.equals(this.originalSource, other.getOriginalSource()))) &&
            ((this.publishDate==null && other.getPublishDate()==null) || 
             (this.publishDate!=null &&
              java.util.Arrays.equals(this.publishDate, other.getPublishDate()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOriginalSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOriginalSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOriginalSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPublishDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublishDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublishDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OutputData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.mdlwr.naba.org", "OutputData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publishDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
