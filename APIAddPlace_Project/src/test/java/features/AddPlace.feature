Feature: Validating Add Place API's

Scenario Outline: Verify if Place is veing successfully added with Add Place API

Given Add Place PayLoad with "<name>" "<language>" "<adddress>"
When user calls "AddPlaceAPI" with "Post" http request 
Then verify the API call is success with status code 200
And "status" in response is "OK"
And "scope" in response is "APP"
And verify place_id created maps to "<name>" using "GetPlaceAPI"

Examples:

|    name       |    language        | address       |
|Aaahouse|English|world centre|
|sweta|Hindi|Jamshedpur|

Scenario: Verify if Delete Place functionality is working

Given DeletePlace Payload
When user calls "DeletePlaceAPI" with "Delete" http request
Then verify the API call is success with status code 200
And "status" in response is "OK"