package com.clg.http

import scalaj.http._

object Fetcher {

  def getContent(url: String): String = {
    // https://github.com/scalaj/scalaj-http
    val response: HttpResponse[String] = Http(url).asString
    response.body
  }
}
