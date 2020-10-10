Feature: Verification of ALS Master File

  @Progression0810
  Scenario Outline: Verification of ALS Master File Layout Structure
    Given User is having the File "<FileName>" in drop location
    Then Verify "<Field>" is having length of "<Length>" in position "<Position>"

    Examples: 
      | FileName                                    | Field         | Length | Position |
      | ALS Master File Extract- UTTI Unit test.txt | AccountNumber |     14 |        0 |
      | ALS Master File Extract- UTTI Unit test.txt | ACLASS        |      2 |        1 |
      | ALS Master File Extract- UTTI Unit test.txt | ATYP          |      1 |        2 |
      | ALS Master File Extract- UTTI Unit test.txt | APR           |     12 |        3 |
      | ALS Master File Extract- UTTI Unit test.txt | PMT           |     16 |        4 |
      | ALS Master File Extract- UTTI Unit test.txt | TERM          |      3 |        5 |
      | ALS Master File Extract- UTTI Unit test.txt | ORID          |      8 |        6 |
      | ALS Master File Extract- UTTI Unit test.txt | MATD          |      8 |        7 |
      | ALS Master File Extract- UTTI Unit test.txt | STAT          |      2 |        8 |
      
