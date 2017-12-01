package com.clg.http

import org.http4s._
import org.http4s.dsl._
import org.http4s.server.blaze.BlazeBuilder

/**
  * http://http4s.org/v0.17/service/
  * @param port port to run on.
  */
class HttpServer(port: Int) {

  private val helloWorldService = HttpService {
    case GET -> Root / "hello" / name =>
      Ok(s"Hello, $name.")
  }

  private val server = BlazeBuilder
    .bindHttp(port, "0.0.0.0")
    .mountService(helloWorldService, "/")

  def run(): Unit = server.run

}
