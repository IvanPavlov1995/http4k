/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Update this file with
 *   `$ ./gradlew buildSrcVersions`
 */
object Libs {
     /**
      * http://wiki.fasterxml.com/JacksonExtensionXmlDataBinding
      */
     const val jackson_dataformat_xml: String =
               "com.fasterxml.jackson.dataformat:jackson-dataformat-xml:" +
               Versions.jackson_dataformat_xml

     /**
      * https://github.com/FasterXML/jackson-module-kotlin
      */
     const val jackson_module_kotlin: String =
               "com.fasterxml.jackson.module:jackson-module-kotlin:" +
               Versions.jackson_module_kotlin

     const val jackson_databind: String =
               "com.fasterxml.jackson.core:jackson-databind:" +
               Versions.jackson_databind

     /**
      * https://github.com/javadev/underscore-java
      */
     const val underscore: String = "com.github.javadev:underscore:" + Versions.underscore

     /**
      * https://github.com/jknack/handlebars.java
      */
     const val handlebars: String = "com.github.jknack:handlebars:" + Versions.handlebars

     const val com_github_kt3k_coveralls_gradle_plugin: String =
               "com.github.kt3k.coveralls:com.github.kt3k.coveralls.gradle.plugin:" +
               Versions.com_github_kt3k_coveralls_gradle_plugin

     /**
      * https://github.com/google/gson
      */
     const val gson: String = "com.google.code.gson:gson:" + Versions.gson

     const val com_jfrog_bintray_gradle_plugin: String =
               "com.jfrog.bintray:com.jfrog.bintray.gradle.plugin:" +
               Versions.com_jfrog_bintray_gradle_plugin

     /**
      * https://github.com/npryce/hamkrest
      */
     const val hamkrest: String = "com.natpryce:hamkrest:" + Versions.hamkrest

     /**
      * https://github.com/npryce/result4k
      */
     const val result4k: String = "com.natpryce:result4k:" + Versions.result4k

     /**
      * https://github.com/square/moshi
      */
     const val moshi_kotlin: String = "com.squareup.moshi:moshi-kotlin:" +
               Versions.com_squareup_moshi

     /**
      * https://github.com/square/moshi
      */
     const val moshi: String = "com.squareup.moshi:moshi:" + Versions.com_squareup_moshi

     /**
      * https://github.com/square/okhttp
      */
     const val okhttp: String = "com.squareup.okhttp3:okhttp:" + Versions.okhttp

     const val de_fayard_buildsrcversions_gradle_plugin: String =
               "de.fayard.buildSrcVersions:de.fayard.buildSrcVersions.gradle.plugin:" +
               Versions.de_fayard_buildsrcversions_gradle_plugin

     /**
      * https://github.com/resilience4j/resilience4j
      */
     const val resilience4j_bulkhead: String = "io.github.resilience4j:resilience4j-bulkhead:" +
               Versions.io_github_resilience4j

     /**
      * https://github.com/resilience4j/resilience4j
      */
     const val resilience4j_circuitbreaker: String =
               "io.github.resilience4j:resilience4j-circuitbreaker:" +
               Versions.io_github_resilience4j

     /**
      * https://github.com/resilience4j/resilience4j
      */
     const val resilience4j_ratelimiter: String =
               "io.github.resilience4j:resilience4j-ratelimiter:" + Versions.io_github_resilience4j

     /**
      * https://github.com/resilience4j/resilience4j
      */
     const val resilience4j_retry: String = "io.github.resilience4j:resilience4j-retry:" +
               Versions.io_github_resilience4j

     /**
      * https://github.com/ktorio/ktor
      */
     const val ktor_server_cio: String = "io.ktor:ktor-server-cio:" + Versions.ktor_server_cio

     /**
      * https://github.com/micrometer-metrics/micrometer
      */
     const val micrometer_core: String = "io.micrometer:micrometer-core:" + Versions.micrometer_core

     /**
      * https://netty.io/
      */
     const val netty_codec_http2: String = "io.netty:netty-codec-http2:" +
               Versions.netty_codec_http2

     /**
      * http://pebbletemplates.io
      */
     const val pebble: String = "io.pebbletemplates:pebble:" + Versions.pebble

     /**
      * http://www.jboss.org
      */
     const val undertow_core: String = "io.undertow:undertow-core:" + Versions.io_undertow

     /**
      * http://www.jboss.org
      */
     const val undertow_servlet: String = "io.undertow:undertow-servlet:" + Versions.io_undertow

     /**
      * https://javaee.github.io/servlet-spec/
      */
     const val javax_servlet_api: String = "javax.servlet:javax.servlet-api:" +
               Versions.javax_servlet_api

     const val nebula_provided_base_gradle_plugin: String =
               "nebula.provided-base:nebula.provided-base.gradle.plugin:" +
               Versions.nebula_provided_base_gradle_plugin

     const val net_saliman_cobertura_gradle_plugin: String =
               "net.saliman.cobertura:net.saliman.cobertura.gradle.plugin:" +
               Versions.net_saliman_cobertura_gradle_plugin

     /**
      * https://github.com/stevesaliman/gradle-cobertura-plugin
      */
     const val gradle_cobertura_plugin: String = "net.saliman:gradle-cobertura-plugin:" +
               Versions.gradle_cobertura_plugin

     /**
      * http://argo.sourceforge.net
      */
     const val argo: String = "net.sourceforge.argo:argo:" + Versions.argo

     /**
      * http://cobertura.sourceforge.net
      */
     const val cobertura: String = "net.sourceforge.cobertura:cobertura:" + Versions.cobertura

     /**
      * https://commons.apache.org/proper/commons-pool/
      */
     const val commons_pool2: String = "org.apache.commons:commons-pool2:" + Versions.commons_pool2

     /**
      * http://hc.apache.org/httpcomponents-asyncclient
      */
     const val httpasyncclient: String = "org.apache.httpcomponents:httpasyncclient:" +
               Versions.httpasyncclient

     /**
      * http://hc.apache.org/httpcomponents-client
      */
     const val httpclient: String = "org.apache.httpcomponents:httpclient:" + Versions.httpclient

     /**
      * http://hc.apache.org/httpcomponents-core-ga
      */
     const val httpcore: String = "org.apache.httpcomponents:httpcore:" + Versions.httpcore

     /**
      * https://eclipse.org/jetty
      */
     const val http2_server: String = "org.eclipse.jetty.http2:http2-server:" +
               Versions.http2_server

     /**
      * http://www.eclipse.org/jetty
      */
     const val javax_websocket_server_impl: String =
               "org.eclipse.jetty.websocket:javax-websocket-server-impl:" +
               Versions.javax_websocket_server_impl

     /**
      * https://eclipse.org/jetty
      */
     const val jetty_alpn_conscrypt_server: String =
               "org.eclipse.jetty:jetty-alpn-conscrypt-server:" + Versions.org_eclipse_jetty

     /**
      * http://www.eclipse.org/jetty
      */
     const val jetty_client: String = "org.eclipse.jetty:jetty-client:" + Versions.org_eclipse_jetty

     /**
      * http://www.eclipse.org/jetty
      */
     const val jetty_server: String = "org.eclipse.jetty:jetty-server:" + Versions.org_eclipse_jetty

     /**
      * http://www.eclipse.org/jetty
      */
     const val jetty_servlet: String = "org.eclipse.jetty:jetty-servlet:" +
               Versions.org_eclipse_jetty

     /**
      * https://freemarker.apache.org/
      */
     const val freemarker: String = "org.freemarker:freemarker:" + Versions.freemarker

     /**
      * https://github.com/TooTallNate/Java-WebSocket
      */
     const val java_websocket: String = "org.java-websocket:Java-WebSocket:" +
               Versions.java_websocket

     const val dokka_gradle_plugin: String = "org.jetbrains.dokka:dokka-gradle-plugin:" +
               Versions.dokka_gradle_plugin

     /**
      * https://kotlinlang.org/
      */
     const val kotlin_gradle_plugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:" +
               Versions.org_jetbrains_kotlin

     /**
      * https://kotlinlang.org/
      */
     const val kotlin_reflect: String = "org.jetbrains.kotlin:kotlin-reflect:" +
               Versions.org_jetbrains_kotlin

     /**
      * https://kotlinlang.org/
      */
     const val kotlin_scripting_compiler_embeddable: String =
               "org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:" +
               Versions.org_jetbrains_kotlin

     /**
      * https://kotlinlang.org/
      */
     const val kotlin_stdlib_jdk8: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:" +
               Versions.org_jetbrains_kotlin

     /**
      * https://github.com/douglascrockford/JSON-java
      */
     const val json: String = "org.json:json:" + Versions.json

     /**
      * https://jsoup.org/
      */
     const val jsoup: String = "org.jsoup:jsoup:" + Versions.jsoup

     /**
      * https://junit.org/junit5/
      */
     const val junit_jupiter_api: String = "org.junit.jupiter:junit-jupiter-api:" +
               Versions.org_junit_jupiter

     /**
      * https://junit.org/junit5/
      */
     const val junit_jupiter_engine: String = "org.junit.jupiter:junit-jupiter-engine:" +
               Versions.org_junit_jupiter

     /**
      * http://github.com/kt3k/coveralls-gradle-plugin/
      */
     const val coveralls_gradle_plugin: String = "org.kt3k.gradle.plugin:coveralls-gradle-plugin:" +
               Versions.coveralls_gradle_plugin

     /**
      * http://www.eclipse.org/jetty
      */
     const val alpn_boot: String = "org.mortbay.jetty.alpn:alpn-boot:" + Versions.alpn_boot

     /**
      * https://openapi-generator.tech
      */
     const val openapi_generator_gradle_plugin: String =
               "org.openapitools:openapi-generator-gradle-plugin:" +
               Versions.openapi_generator_gradle_plugin

     /**
      * http://www.seleniumhq.org/
      */
     const val selenium_api: String = "org.seleniumhq.selenium:selenium-api:" +
               Versions.selenium_api

     /**
      * http://www.thymeleaf.org
      */
     const val thymeleaf: String = "org.thymeleaf:thymeleaf:" + Versions.thymeleaf
}
