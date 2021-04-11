Feature: Validating Place API's

Scenario Outline: Verify new Place is successfully created using AddPlace API

Given Add Place Payload with "<latitude>" "<longitude>" "<accuracy>" "<name>" "<phone_number>" "<address>" "<types1>" "<types2>" "<website>" "<language>"
When user calls "AddPlaceAPI" with "POST" http request
Then verify API call is successful with status code 200
And "status" in response is "OK"
And "scope" in response is "APP"
And verify place id created maps to "<name>" using "GetPlaceAPI"

Examples:

| latitude | longitude | accuracy  | name  |  phone_number | address   |  types1   |   types2  |  website   | language      |
|-38.383494	|33.427362|  50  |  Frontline house|  (+91) 983 893 3937|29, side layout, cohen 09|shoe park |shop | http://google.com|French-IN" |
	