Feature: There Will be smart bear website Scenarios

  Background:
#    Given The user wants to login with username as "Tester" and password as test "test"

       @Regression @TC_1  @Smoke
  Scenario: Verify that delete all orders
    Given The user wants to login with username as Tester and password as test
    When The user wants to check all orders
    Then The user wants to delete all selected orders
    And The user wants to logout

  @TC_2
 Scenario: Verify that delete all orders
   Given The user wants to login with username as "Tester" and password as test "test"
   When The user wants to check all orders
   Then The user wants to delete all selected orders
   And The user wants to logout


  @TC_3
    Scenario: Verify that we can edit first order
      Given The user wants to login with username as "Tester" and password as test "test"
      When The use want edit the first order
      Then the user want update card number as "4568769379"
      Then The user want update order
      Then The user wants to logout


  @TC_4
    Scenario: Verify that total is correct for FamilyAlbum
      When The user want to order
      Then The user wants to product "FamilyAlbum"
      Then The user wants to buy "10"
      And The user wants to calculate total
      And The user wants to verify total 10 and "FamilyAlbum"

  @TC_5
    Scenario:  Verify that total is correct for FamilyAlbum
      When The user want to order
      Then The user wants to enter
      |product| FamilyAlbum|
      |quantity| 30        |
      |price   | 50        |
      |Name    | ibo       |
      And  The user wants to calculate total


  @TC_6
  Scenario:  Verify that total is correct for FamilyAlbum
    When The user want to order
    Then The user wants to enter
      |product| FamilyAlbum|
      |quantity| 30        |
      |price   | 50        |

    Then The user wants to enter address information
      |CustomerName| Gem     |
      |Street      |1234 l st|
      |City        | Lincoln  |
      |State       | Nebraska|
      |ZipCode     |45563    |


  @TC_7
  Scenario:  Verify that total is correct for FamilyAlbum
    When The user want to order
    Then The user wants to enter
      |product| FamilyAlbum|
      |quantity| 30        |
      |price   | 50        |

  Then The user wants to enter address information
  |CustomerName| Gem     |
  |Street      |1234 l st|
  |City        | Lincoln  |
  |State       | Nebraska|
  |ZipCode     |45563    |

      Then The user wants  to payment  information
    |card      | visa |
    |cardNumber| 12497037277084 |
    |ExpireDate| 12/25          |
    And  The user wants finish the process
    Then The user wants to logout



  @TC_8
    Scenario:  Verify that total is correct for FamilyAlbum
    Given The user wants to login with username as "Tester" and password as test "test"
    When The user want to order
    Then The user wants to enter list
      | product     | quantity| price  |Name|
      | FamilyAlbum |   30    | 50     | ibo |
   And  The user wants to calculate total

  @TC_9
    Scenario: Create new address
      Given The user wants to sign
      Then The user wants to see address
      And  The user wants to enter new address

    @TC_10
    Scenario: Enter all address fields
    Given The user wants to sign
      Then The user wants to see address
      And  The user wants to enter new address
      And The user wants to enter addresses details
      |FistName  | ibo |
      |LastName  | belke|
      |Address1  |11 fake st  |
      |Address2  |12 fake st  |
      |City      | Lincoln    |
      |State     | Nebraska   |
      |ZipCode   | 35464      |
      |Country   | Canada     |
      |Birthday  | 10/11/1999 |
      |Age       |  99        |
      |Website   | www.ibo    |
      |Phone     |4028991788  |
      |commonIntrest|Dancing  |
      |Note         | fake address|
    And  The user wants to create an address

  @TC_11
  Scenario: Enter all address fields
    Given The user wants to sign
    Then The user wants to see address
    And  The user wants to enter new address
    And The user wants to enter addresses details as list
      |FistName |  LastName|  Address1    |Address2  |City   |State   |ZipCode | Country| Birthday |Age|
      |ibo      | belke    |  11 fake st  |11 fake st|Lincoln|Nebraska|35464   |Canada  |10/11/1999|99|
    And  The user wants to create an address
