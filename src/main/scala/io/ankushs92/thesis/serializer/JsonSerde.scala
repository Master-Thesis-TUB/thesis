package io.ankushs92.thesis.serializer

import io.ankushs92.util.Json

class JsonSerde[IN : Manifest] extends Serde[IN, String] {

  override def serialize(in: IN) = Json.encode(in)

  override def deserialize(jsonStr: String): IN = Json.toObject[IN](jsonStr)

}
