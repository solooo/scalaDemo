package net.solooo.scala.demo.http


/**
  * Title:
  * Description:
  * Copyright:Copyright 2016 HtDataCloud
  * Author:裴健(peij@htdatacloud.com)
  * Date:17/1/6-006
  * History:
  * his1:
  */
object HttpPostTester {

  def main(args: Array[String]) {
    val url = "http://192.168.1.82:8083/gms/auth/login?userName=admin&password=123456"
    val result = scala.io.Source.fromURL(url, "utf-8").mkString
    println(result)
  }
}
