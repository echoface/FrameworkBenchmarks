package com.hexagonkt

import com.hexagonkt.core.Jvm.systemSetting

data class Settings(
    val bindPort: Int = systemSetting("bindPort") ?: 9090,
    val bindAddress: String = "0.0.0.0",

    val database: String = "hello_world",
    val worldCollection: String = "world",
    val fortuneCollection: String = "fortune",

    val databaseUsername: String = "benchmarkdbuser",
    val databasePassword: String = "benchmarkdbpass",

    val maximumPoolSize: Int = systemSetting("maximumPoolSize") ?: 96,

    val webEngine: String = systemSetting("WEBENGINE") ?: "jetty",

    val worldName: String = systemSetting("worldCollection") ?: "world",
    val fortuneName: String = systemSetting("fortuneCollection") ?: "fortune",
    val databaseName: String = systemSetting("database") ?: "hello_world",
    val databaseDriver: String = systemSetting("databaseDriver") ?: "org.postgresql.Driver",

    val sendDateHeader: Boolean = systemSetting("sendDateHeader") ?: true,
    val sendServerVersion: Boolean = systemSetting("sendServerVersion") ?: true,
    val sendXPoweredBy: Boolean = systemSetting("sendXPoweredBy") ?: false,

    val worldRows: Int = 10_000,
    val textMessage: String = "Hello, World!",
    val queriesParam: String = "queries",
    val cachedQueriesParam: String = "count",
)
