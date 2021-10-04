# java-fundamentals
In this repo you can check some java fundamentals for practicing Java starting from the basics.

## Basics
- In the `Basics folder` in `Main file` I have a class with 3 methods:
  - **Pluralize method:**  is for making the input word plural or keep it singular based on the number
  - **Clock Method:** To print the time every second and show how many Mega Hertz that program operates
  - **FlipNHead method:** is for counting how many times we need to at least get the specified number of heads in a row

## Basic Library
- In the `basiclibrary` folder in `Library file` I have 4 methods:
  - `roll`its accept integer as input and return and array with a length of the input and random values from 1 to 6
  - `containsDuplicates`  accept an array of integer as input and return true if there were duplicates and false if there wasn't
  - `average` accept an array of integer and return the average of that array
  - `lowestAvg`accept an array of integer arrays and return the array with the lowest average

  In the `test file` I had it to test every method in the code.

## Linter
- In the linter file I have 1 method:
- missingSemicolon: this method accept a path to a file and check every line for missing semicolons and ignore the line if:
  - `line ends With }`
  - `line ends With {`
  - `line contains if`
  - `line contains else`
  - `line starts With //`
  - `empty lines`

## Inheritance
 - **Restaurant:** In this class there is a constructor to define the variables and there are getters and setters
    - There is an array list to store all the reviews for a restaurant
    - When a review is added the stars for that restaurant is going to change according to the average of the stars
    - There is toString method to print all the defined fields
 - **Review:** In this class there is a constructor to define the variables and there are getters and setters
   - I created a field with type of restaurant to associate the restaurant with multiple reviews
   - a plural method to return if the stars are plural or singular
   - there is toString method to print all the defined fields
 - **AddReview:** In this interface there is a method that accepts a Review object

=======     =======    =======   =======  ======= =======
## Lab06 & Lab07 : Composition and Inheritance

**Finished Tasks :**<br>
**Add a Review for Restaurants :**
- Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars between 0 and 5, and a price category
- Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
- A Review should be about a single Restaurant. Choose an implementation for this, and implement it.
- Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant
- When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately
<hr>

**Finished Tasks :**<br>
**Shops,Theater & Movies:**
- The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs.
- The users also want to review shops
- The users want theaters! Create a Theater class; a Theater should have a name and all the movies currently showing there
- Review all the things
- Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a Theater, they also want to specify which movie they saw.


