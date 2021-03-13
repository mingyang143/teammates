// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/logging/v1/request_log.proto

package com.google.appengine.logging.v1;

/**
 * <pre>
 * A reference to a particular snapshot of the source tree used to build and
 * deploy an application.
 * </pre>
 *
 * Protobuf type {@code google.appengine.logging.v1.SourceReference}
 */
public  final class SourceReference extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.logging.v1.SourceReference)
    SourceReferenceOrBuilder {
  // Use SourceReference.newBuilder() to construct.
  private SourceReference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SourceReference() {
    repository_ = "";
    revisionId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SourceReference(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            repository_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            revisionId_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_SourceReference_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_SourceReference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.logging.v1.SourceReference.class, com.google.appengine.logging.v1.SourceReference.Builder.class);
  }

  public static final int REPOSITORY_FIELD_NUMBER = 1;
  private volatile java.lang.Object repository_;
  /**
   * <pre>
   * Optional. A URI string identifying the repository.
   * Example: "https://github.com/GoogleCloudPlatform/kubernetes.git"
   * </pre>
   *
   * <code>string repository = 1;</code>
   */
  public java.lang.String getRepository() {
    java.lang.Object ref = repository_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      repository_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. A URI string identifying the repository.
   * Example: "https://github.com/GoogleCloudPlatform/kubernetes.git"
   * </pre>
   *
   * <code>string repository = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRepositoryBytes() {
    java.lang.Object ref = repository_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      repository_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REVISION_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object revisionId_;
  /**
   * <pre>
   * The canonical and persistent identifier of the deployed revision.
   * Example (git): "0035781c50ec7aa23385dc841529ce8a4b70db1b"
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   */
  public java.lang.String getRevisionId() {
    java.lang.Object ref = revisionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      revisionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The canonical and persistent identifier of the deployed revision.
   * Example (git): "0035781c50ec7aa23385dc841529ce8a4b70db1b"
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRevisionIdBytes() {
    java.lang.Object ref = revisionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      revisionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRepositoryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, repository_);
    }
    if (!getRevisionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, revisionId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRepositoryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, repository_);
    }
    if (!getRevisionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, revisionId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.appengine.logging.v1.SourceReference)) {
      return super.equals(obj);
    }
    com.google.appengine.logging.v1.SourceReference other = (com.google.appengine.logging.v1.SourceReference) obj;

    boolean result = true;
    result = result && getRepository()
        .equals(other.getRepository());
    result = result && getRevisionId()
        .equals(other.getRevisionId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REPOSITORY_FIELD_NUMBER;
    hash = (53 * hash) + getRepository().hashCode();
    hash = (37 * hash) + REVISION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRevisionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.logging.v1.SourceReference parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.logging.v1.SourceReference parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.logging.v1.SourceReference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.logging.v1.SourceReference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.logging.v1.SourceReference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.logging.v1.SourceReference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.logging.v1.SourceReference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.logging.v1.SourceReference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.logging.v1.SourceReference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.logging.v1.SourceReference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.logging.v1.SourceReference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.logging.v1.SourceReference parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.appengine.logging.v1.SourceReference prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A reference to a particular snapshot of the source tree used to build and
   * deploy an application.
   * </pre>
   *
   * Protobuf type {@code google.appengine.logging.v1.SourceReference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.logging.v1.SourceReference)
      com.google.appengine.logging.v1.SourceReferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_SourceReference_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_SourceReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.logging.v1.SourceReference.class, com.google.appengine.logging.v1.SourceReference.Builder.class);
    }

    // Construct using com.google.appengine.logging.v1.SourceReference.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      repository_ = "";

      revisionId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_SourceReference_descriptor;
    }

    public com.google.appengine.logging.v1.SourceReference getDefaultInstanceForType() {
      return com.google.appengine.logging.v1.SourceReference.getDefaultInstance();
    }

    public com.google.appengine.logging.v1.SourceReference build() {
      com.google.appengine.logging.v1.SourceReference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.appengine.logging.v1.SourceReference buildPartial() {
      com.google.appengine.logging.v1.SourceReference result = new com.google.appengine.logging.v1.SourceReference(this);
      result.repository_ = repository_;
      result.revisionId_ = revisionId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.appengine.logging.v1.SourceReference) {
        return mergeFrom((com.google.appengine.logging.v1.SourceReference)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.logging.v1.SourceReference other) {
      if (other == com.google.appengine.logging.v1.SourceReference.getDefaultInstance()) return this;
      if (!other.getRepository().isEmpty()) {
        repository_ = other.repository_;
        onChanged();
      }
      if (!other.getRevisionId().isEmpty()) {
        revisionId_ = other.revisionId_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.appengine.logging.v1.SourceReference parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.logging.v1.SourceReference) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object repository_ = "";
    /**
     * <pre>
     * Optional. A URI string identifying the repository.
     * Example: "https://github.com/GoogleCloudPlatform/kubernetes.git"
     * </pre>
     *
     * <code>string repository = 1;</code>
     */
    public java.lang.String getRepository() {
      java.lang.Object ref = repository_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repository_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. A URI string identifying the repository.
     * Example: "https://github.com/GoogleCloudPlatform/kubernetes.git"
     * </pre>
     *
     * <code>string repository = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRepositoryBytes() {
      java.lang.Object ref = repository_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        repository_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. A URI string identifying the repository.
     * Example: "https://github.com/GoogleCloudPlatform/kubernetes.git"
     * </pre>
     *
     * <code>string repository = 1;</code>
     */
    public Builder setRepository(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      repository_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A URI string identifying the repository.
     * Example: "https://github.com/GoogleCloudPlatform/kubernetes.git"
     * </pre>
     *
     * <code>string repository = 1;</code>
     */
    public Builder clearRepository() {
      
      repository_ = getDefaultInstance().getRepository();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A URI string identifying the repository.
     * Example: "https://github.com/GoogleCloudPlatform/kubernetes.git"
     * </pre>
     *
     * <code>string repository = 1;</code>
     */
    public Builder setRepositoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      repository_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object revisionId_ = "";
    /**
     * <pre>
     * The canonical and persistent identifier of the deployed revision.
     * Example (git): "0035781c50ec7aa23385dc841529ce8a4b70db1b"
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public java.lang.String getRevisionId() {
      java.lang.Object ref = revisionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revisionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The canonical and persistent identifier of the deployed revision.
     * Example (git): "0035781c50ec7aa23385dc841529ce8a4b70db1b"
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRevisionIdBytes() {
      java.lang.Object ref = revisionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        revisionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The canonical and persistent identifier of the deployed revision.
     * Example (git): "0035781c50ec7aa23385dc841529ce8a4b70db1b"
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public Builder setRevisionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      revisionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The canonical and persistent identifier of the deployed revision.
     * Example (git): "0035781c50ec7aa23385dc841529ce8a4b70db1b"
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public Builder clearRevisionId() {
      
      revisionId_ = getDefaultInstance().getRevisionId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The canonical and persistent identifier of the deployed revision.
     * Example (git): "0035781c50ec7aa23385dc841529ce8a4b70db1b"
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public Builder setRevisionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      revisionId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.appengine.logging.v1.SourceReference)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.logging.v1.SourceReference)
  private static final com.google.appengine.logging.v1.SourceReference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.logging.v1.SourceReference();
  }

  public static com.google.appengine.logging.v1.SourceReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceReference>
      PARSER = new com.google.protobuf.AbstractParser<SourceReference>() {
    public SourceReference parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SourceReference(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SourceReference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceReference> getParserForType() {
    return PARSER;
  }

  public com.google.appengine.logging.v1.SourceReference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
