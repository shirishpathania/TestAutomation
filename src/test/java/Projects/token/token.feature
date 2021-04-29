Feature: Generate Token

  Scenario: Generate Token
    Given url 'https://oauth.nzpost.co.nz/as/token.oauth2'
    And param grant_type = 'client_credentials'
    And param client_id = 'a6024f82d9204bebb949d1a10c7af08f'
    And param client_secret = '3d272F28980c4Cb1827C89cc6813F4Fe'
    When method post
    Then status 200
    * def access_token = response.access_token