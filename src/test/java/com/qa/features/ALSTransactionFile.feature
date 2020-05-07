Feature: Verification of ALS Transaction File

  @ProgressionNew
  Scenario Outline: Verification of ALS Transaction File Layout Structure 
    Given User is having the File "<FileName>" in drop location
    Then Verify "<Field>" is having length of "<Length>" in position "<Position>"

    Examples: 
      | FileName               | Field     | Length | Position |
      | ALSTransactionFile.txt | ACCOUNT   |     14 |        0 |
      | ALSTransactionFile.txt | TRANSCODE |      4 |        1 |
      | ALSTransactionFile.txt | SUPPCODE  |      4 |        2 |
      | ALSTransactionFile.txt | PROCDATE  |      8 |        3 |

      

      