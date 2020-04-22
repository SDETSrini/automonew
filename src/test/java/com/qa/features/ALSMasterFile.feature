Feature: Verification of ALS Master File

  @Progression
  Scenario Outline: Verification of ALS Master File Layout Structure
    Given User is having the File "<FileName>" in drop location
    Then Verify "<Field>" is having length of "<Length>" in position "<Position>"


    Examples: 
      | FileName                                    | Field         | Length | Position |
      | ALS Master File Extract- UTTI Unit test.txt | AccountNumber |     14 |        0 |
      | ALS Master File Extract- UTTI Unit test.txt | ACLASS        |      2 |        1 |
