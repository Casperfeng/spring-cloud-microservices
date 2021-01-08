package com.fc.netflixzuulapigatewayserver.shared

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import javax.servlet.http.HttpServletRequest

@Component
class ZuulLoggingFilter(): ZuulFilter() {

    val logger: Logger = LoggerFactory.getLogger("package.ClassName")

    override fun shouldFilter(): Boolean {
        return true
    }

    override fun run(): Any {
        val request: HttpServletRequest = RequestContext.getCurrentContext().request
        logger.info("request -> $request request uri -> ${request.requestURI}")
        return 0
    }

    override fun filterType(): String {
        return "pre"
    }

    override fun filterOrder(): Int {
        TODO("Not yet implemented")
    }
}