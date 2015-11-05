/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserAttachRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserAttachRequest\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"userVerifierId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"userExternalId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"userAccessToken\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"direction\":\"out\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String userVerifierId;
   private java.lang.String userExternalId;
   private java.lang.String userAccessToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public UserAttachRequest() {}

  /**
   * All-args constructor.
   */
  public UserAttachRequest(java.lang.String userVerifierId, java.lang.String userExternalId, java.lang.String userAccessToken) {
    this.userVerifierId = userVerifierId;
    this.userExternalId = userExternalId;
    this.userAccessToken = userAccessToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userVerifierId;
    case 1: return userExternalId;
    case 2: return userAccessToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userVerifierId = (java.lang.String)value$; break;
    case 1: userExternalId = (java.lang.String)value$; break;
    case 2: userAccessToken = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userVerifierId' field.
   */
  public java.lang.String getUserVerifierId() {
    return userVerifierId;
  }

  /**
   * Sets the value of the 'userVerifierId' field.
   * @param value the value to set.
   */
  public void setUserVerifierId(java.lang.String value) {
    this.userVerifierId = value;
  }

  /**
   * Gets the value of the 'userExternalId' field.
   */
  public java.lang.String getUserExternalId() {
    return userExternalId;
  }

  /**
   * Sets the value of the 'userExternalId' field.
   * @param value the value to set.
   */
  public void setUserExternalId(java.lang.String value) {
    this.userExternalId = value;
  }

  /**
   * Gets the value of the 'userAccessToken' field.
   */
  public java.lang.String getUserAccessToken() {
    return userAccessToken;
  }

  /**
   * Sets the value of the 'userAccessToken' field.
   * @param value the value to set.
   */
  public void setUserAccessToken(java.lang.String value) {
    this.userAccessToken = value;
  }

  /** Creates a new UserAttachRequest RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder();
  }
  
  /** Creates a new UserAttachRequest RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder(other);
  }
  
  /** Creates a new UserAttachRequest RecordBuilder by copying an existing UserAttachRequest instance */
  public static org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest other) {
    return new org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for UserAttachRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserAttachRequest>
    implements org.apache.avro.data.RecordBuilder<UserAttachRequest> {

    private java.lang.String userVerifierId;
    private java.lang.String userExternalId;
    private java.lang.String userAccessToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userVerifierId)) {
        this.userVerifierId = data().deepCopy(fields()[0].schema(), other.userVerifierId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userExternalId)) {
        this.userExternalId = data().deepCopy(fields()[1].schema(), other.userExternalId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.userAccessToken)) {
        this.userAccessToken = data().deepCopy(fields()[2].schema(), other.userAccessToken);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing UserAttachRequest instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest other) {
            super(org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.userVerifierId)) {
        this.userVerifierId = data().deepCopy(fields()[0].schema(), other.userVerifierId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userExternalId)) {
        this.userExternalId = data().deepCopy(fields()[1].schema(), other.userExternalId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.userAccessToken)) {
        this.userAccessToken = data().deepCopy(fields()[2].schema(), other.userAccessToken);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'userVerifierId' field */
    public java.lang.String getUserVerifierId() {
      return userVerifierId;
    }
    
    /** Sets the value of the 'userVerifierId' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder setUserVerifierId(java.lang.String value) {
      validate(fields()[0], value);
      this.userVerifierId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'userVerifierId' field has been set */
    public boolean hasUserVerifierId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'userVerifierId' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder clearUserVerifierId() {
      userVerifierId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'userExternalId' field */
    public java.lang.String getUserExternalId() {
      return userExternalId;
    }
    
    /** Sets the value of the 'userExternalId' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder setUserExternalId(java.lang.String value) {
      validate(fields()[1], value);
      this.userExternalId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'userExternalId' field has been set */
    public boolean hasUserExternalId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'userExternalId' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder clearUserExternalId() {
      userExternalId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'userAccessToken' field */
    public java.lang.String getUserAccessToken() {
      return userAccessToken;
    }
    
    /** Sets the value of the 'userAccessToken' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder setUserAccessToken(java.lang.String value) {
      validate(fields()[2], value);
      this.userAccessToken = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'userAccessToken' field has been set */
    public boolean hasUserAccessToken() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'userAccessToken' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest.Builder clearUserAccessToken() {
      userAccessToken = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public UserAttachRequest build() {
      try {
        UserAttachRequest record = new UserAttachRequest();
        record.userVerifierId = fieldSetFlags()[0] ? this.userVerifierId : (java.lang.String) defaultValue(fields()[0]);
        record.userExternalId = fieldSetFlags()[1] ? this.userExternalId : (java.lang.String) defaultValue(fields()[1]);
        record.userAccessToken = fieldSetFlags()[2] ? this.userAccessToken : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}