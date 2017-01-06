package scala.net.solooo.scala.demo.json

import com.alibaba.fastjson.{JSON, JSONObject}


/**
  * Title:
  * Description:
  * Copyright:Copyright 2016 HtDataCloud
  * Author:裴健(peij@htdatacloud.com)
  * Date:17/1/6-006
  * History:
  * his1:
  */
object JsonTest {

  def main(args: Array[String]) {
    val str2 = "{\"et\":\"kanqiu_client_join\",\"vtm\":1435898329434,\"body\":{\"client\":\"866963024862254\",\"client_type\":\"android\",\"room\":\"NBA_HOME\",\"gid\":\"\",\"type\":\"\",\"roomid\":\"\"},\"time\":1435898329}"
    val json=JSON.parseObject(str2)
    //获取成员
    val fet=json.get("et")
    println(fet)
    //返回字符串成员
    val etString=json.getString("et")
    println(etString)
    //返回整形成员
    val vtm=json.getInteger("vtm")
    println(vtm)
    //返回多级成员
    val client=json.getJSONObject("body").get("client")
    println(client)
  }
}
