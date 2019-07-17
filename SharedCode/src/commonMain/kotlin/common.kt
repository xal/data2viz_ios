package org.kotlin.mpp.mobile

import io.data2viz.time.Date

expect fun platformName(): String

fun createApplicationScreenMessage(): String {
  val date = Date()
  val toString = date.toString()
  return toString + " on ${platformName()}"
}

