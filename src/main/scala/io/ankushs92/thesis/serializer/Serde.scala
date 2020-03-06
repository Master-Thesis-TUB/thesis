package io.ankushs92.thesis.serializer

trait Serde[IN , OUT] {

  def serialize(in : IN) : OUT

  def deserialize(out : OUT) : IN

}
