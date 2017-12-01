package com.clg

import java.util

object ScalaMain extends App {

  if (args.length != 1) {
    throw new IllegalArgumentException(s"Expected one argument got ${args.mkString(",")}")
  }

  private val intPattern = "^\\d+$".r.pattern

  private val vars = new util.HashMap[String, Int]()
  vars.put("$", 0)

  processFile(args(0))

  def processFile(filename: String): Int = {
    readLines(filename).foldLeft(vars.get("$")) {
      case (lastResult, line) =>
        val tokens = line.split("\\s")
        val (command, left, right) = if (tokens.length == 2) {
          (tokens(0), tokens(1), null)
        } else {
          (tokens(0), tokens(1), tokens(2))
        }
        try {
          val res = command match {
            case "add" =>
              getVal(vars, left) + getVal(vars, right)
            case "sub" =>
              getVal(vars, left) - getVal(vars, right)
            case "mul" =>
              getVal(vars, left) * getVal(vars, right)
            case "div" =>
              // check r != 0
              getVal(vars, left) / getVal(vars, right)
            case "set" =>
              vars.put(left, getVal(vars, right))
              lastResult
            case "run" =>
              val dir = filename.substring(0, filename.lastIndexOf("/"))
              processFile(s"$dir/$left")
          }
          val p = if (command == "set") {
            vars.get(left)
          } else {
            res
          }
          vars.put("$", res)
          println(s"res $p")
          res
        } catch {
          case e: Exception =>
            println(s"error")
            lastResult
        }
    }
  }

  private def getVal(vars: java.util.Map[String, Int], arg: String): Int = {
    arg match {
      case s if isInt(s) => s.toInt
      case v => vars.get(v)
    }
  }

  def isInt(s: String): Boolean = intPattern.matcher(s).matches()

  def readLines(filename: String): Iterator[String] = {
    io.Source.fromFile(filename, "UTF-8").getLines()
  }
}
