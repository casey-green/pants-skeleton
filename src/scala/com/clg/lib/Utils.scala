package com.clg.lib

object Utils {

  def toLines(path: String): Iterator[String] = {
    io.Source.fromFile(path, "UTF-8").getLines()
  }

  def stdInToLines(): Iterator[String] = {
    io.Source.fromInputStream(System.in).getLines()
  }
}
