Feature: sample karate test script

  Background:
    * url baseURL
    * def requestPayload = request

  @Test
  Scenario Outline: Validation Test
    Given path '/events'
    * set requestPayload.eventCode = <eventCode>
    * request requestPayload
    And header Authorization = 'Bearer ' + request_token.access_token
    When method post
    Then status 200
    
    * match requestPayload.eventCode == response.results.eventCode
    * match response.results.eventSubType == <eventSubType>
    * match requestPayload.trackingNumber == response.results.trackingNumber

    Examples:
      | eventCode | eventSubType |
      | 'EMA'     | '13'         |
      | 'EMI'     | '22'         |