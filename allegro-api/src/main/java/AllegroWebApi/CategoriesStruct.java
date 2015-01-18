/**
 * CategoriesStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AllegroWebApi;

public class CategoriesStruct  implements java.io.Serializable {
    private int categoryId;

    private java.lang.String categoryName;

    private int categoryParentId;

    private int categoryItemsCount;

    public CategoriesStruct() {
    }

    public CategoriesStruct(
           int categoryId,
           java.lang.String categoryName,
           int categoryParentId,
           int categoryItemsCount) {
           this.categoryId = categoryId;
           this.categoryName = categoryName;
           this.categoryParentId = categoryParentId;
           this.categoryItemsCount = categoryItemsCount;
    }


    /**
     * Gets the categoryId value for this CategoriesStruct.
     * 
     * @return categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this CategoriesStruct.
     * 
     * @param categoryId
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * Gets the categoryName value for this CategoriesStruct.
     * 
     * @return categoryName
     */
    public java.lang.String getCategoryName() {
        return categoryName;
    }


    /**
     * Sets the categoryName value for this CategoriesStruct.
     * 
     * @param categoryName
     */
    public void setCategoryName(java.lang.String categoryName) {
        this.categoryName = categoryName;
    }


    /**
     * Gets the categoryParentId value for this CategoriesStruct.
     * 
     * @return categoryParentId
     */
    public int getCategoryParentId() {
        return categoryParentId;
    }


    /**
     * Sets the categoryParentId value for this CategoriesStruct.
     * 
     * @param categoryParentId
     */
    public void setCategoryParentId(int categoryParentId) {
        this.categoryParentId = categoryParentId;
    }


    /**
     * Gets the categoryItemsCount value for this CategoriesStruct.
     * 
     * @return categoryItemsCount
     */
    public int getCategoryItemsCount() {
        return categoryItemsCount;
    }


    /**
     * Sets the categoryItemsCount value for this CategoriesStruct.
     * 
     * @param categoryItemsCount
     */
    public void setCategoryItemsCount(int categoryItemsCount) {
        this.categoryItemsCount = categoryItemsCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoriesStruct)) return false;
        CategoriesStruct other = (CategoriesStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.categoryId == other.getCategoryId() &&
            ((this.categoryName==null && other.getCategoryName()==null) || 
             (this.categoryName!=null &&
              this.categoryName.equals(other.getCategoryName()))) &&
            this.categoryParentId == other.getCategoryParentId() &&
            this.categoryItemsCount == other.getCategoryItemsCount();
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
        _hashCode += getCategoryId();
        if (getCategoryName() != null) {
            _hashCode += getCategoryName().hashCode();
        }
        _hashCode += getCategoryParentId();
        _hashCode += getCategoryItemsCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategoriesStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "CategoriesStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryParentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category-parent-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryItemsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category-items-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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