# _Ceaser Cipher_

#### By Margaret Mutungi

## Description

This java application allows a user to enter a string and a key to apply on the string. The application encrypts the text using Ceaser Cipher encryption technique. It gives the user their original text, their encrypted text and finally the text decrypted again.

## Specs
 
| Behaviour     | Example Input | Example Output  |
| ------------- | ------------- | ------------- |
| A single character should shift forward by the number of the shift key   | "A",2  | "C"  |
| Each character in a word should shift forward by the number of the shift key  | "cat",2  | "ecv"  |
| Numerical strings are not encrypted  | "1",1  | "1"  |
| Spaces and punctuation marks should not be encrypted  | "?",2  | "?"  |
| Each character in a sentence should shift forward by the number of the shift key  | "I am happy",2  | "K co jcrra"  |
| Shift key must be numerical  | "A","f"  | Throws error and ends program  |
| Shift key must be in range 1-25  | "A",50  | Throws error and ends program  |
| Return nothing when empty string is submitted  | "",2  | ""  |
| Encrypt lower and uppercase letters appropriately  | "A caT",1  | "B dbU"  |
| Ensure looping through the alphabet shift  | "Z",1  | "A"  |

## Setup/Installation Requirements

* Clone this repository
* run it on a console or your IDE

## Technologies Used

* _Java_
* _JUnit_

### Acknowledgements
_Samuel Ngigi (My instructor)_

### License

*This software is licensed under the MIT license.*

Copyright (c) 2019 **_Margaret Mutungi_**

