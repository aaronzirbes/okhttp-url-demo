package org.zirbes.sandbox

import com.squareup.okhttp.HttpUrl

class UrlSandbox {
    static void main(String[] args) {
        println 'testing new OkHTTP Url thing'

        HttpUrl url = HttpUrl.parse('http://search-service:8080/search?show=this&show=that&show=wippleballbat')

        println 'show :' + url.queryParameter('show')
        println 'show :' + url.queryParameterValues('show')

        println 'all done.'

    }
}
