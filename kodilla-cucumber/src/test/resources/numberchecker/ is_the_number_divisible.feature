Feature:  Is a number divisible by 3, 5 or both?

  Scenario: Divisibility by 3

    Given  a number which is equal to 9
    When I call Fizz algorithm
    Then  I should be told "Fizz"


  Scenario: Divisibility by 5

    Given a number which is equal to 25
    When I call "Buzz" algorithm
    Then  I should be told "Buzz"


  Scenario: Divisibility by 3 and 5

    Given a number which is equal to 15
    When I call "FizzBuzz" algorithm
    Then  I should be told "FizzBuzz"


  Scenario: Indivisibility by 3 and 5

    Given a number which is equal to 7
    When I call "None" algorithm
    Then  I should be told "None"
