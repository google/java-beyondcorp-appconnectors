// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/beyondcorp/appconnectors/v1/app_connector_instance_config.proto

package com.google.cloud.beyondcorp.appconnectors.v1;

public interface ImageConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.beyondcorp.appconnectors.v1.ImageConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The initial image the remote agent will attempt to run for the control
   * plane.
   * </pre>
   *
   * <code>string target_image = 1;</code>
   * @return The targetImage.
   */
  java.lang.String getTargetImage();
  /**
   * <pre>
   * The initial image the remote agent will attempt to run for the control
   * plane.
   * </pre>
   *
   * <code>string target_image = 1;</code>
   * @return The bytes for targetImage.
   */
  com.google.protobuf.ByteString
      getTargetImageBytes();

  /**
   * <pre>
   * The stable image that the remote agent will fallback to if the target image
   * fails.
   * </pre>
   *
   * <code>string stable_image = 2;</code>
   * @return The stableImage.
   */
  java.lang.String getStableImage();
  /**
   * <pre>
   * The stable image that the remote agent will fallback to if the target image
   * fails.
   * </pre>
   *
   * <code>string stable_image = 2;</code>
   * @return The bytes for stableImage.
   */
  com.google.protobuf.ByteString
      getStableImageBytes();
}