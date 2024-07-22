# Card Payments Application

This is a sample Spring Boot application integrated with Drools to handle an card payments rules.

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- Node.js and Angular CLI (for front-end)

### Running the Application

1. Clone the repository:

   ```
   sh
   git clone https://github.com/anvaperi/card_payments.git
   cd card_payments
   ```

2. Build and run the Spring Boot application:

  ```
  mvn clean install
  mvn spring-boot:run
  ```
   
3. Navigate to the Angular front-end directory and run it:

  ```
  cd src/main/resources/static
  npm install
  ng serve
  ```

4. Open your browser and go to `http://localhost:4200`.

Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change. 
Keep in mind, though, that this project aims to illustrate in the simplest way possible how to use Drools.

License: MIT
```
MIT License

Copyright (c) 2024 Anvaperi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
