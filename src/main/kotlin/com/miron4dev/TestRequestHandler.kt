package com.miron4dev

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class TestRequestHandler: RequestHandler<TestModel, TestModel> {

    override fun handleRequest(input: TestModel, context: Context): TestModel {
        // do nothing, just return input
        return input
    }
}