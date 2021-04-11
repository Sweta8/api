Feature: Validating Place API

Scenario: Verify if Place is being successfully added using AddPlaceAPI

Given Add Place Payload
When user calls "AddPlaceAPI" using POST http request
Then API call is success with status code 200
And "status" in response body is "OK"
And "scope" in response body is "APP"