package io.ankushs92.thesis.domain

trait Window[Level, State] {

  def getLevel() : Level

  def getState() : State

}
