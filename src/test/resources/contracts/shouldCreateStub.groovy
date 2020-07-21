package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method("POST")
        url("/stub")
        body([
                "p1": "one",
                "p2": "two"
        ])
        headers {
            contentType("application/json;charset=UTF-8")
        }
    }
    response {
        status(OK())
        body([
                "status": "CREATED"
        ])
        headers {
            contentType("application/json")
        }
    }
}

