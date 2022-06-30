# java-aqa-course

Java automation quality assurance course

### 5 Session covers:

- [Encapsulation](encapsulation)
- [Inheritance](inheritance)
- [Polymorphism](polymorphism)

### Home-task:

1. Class 'Phone'
    - create Phone class with fields: number, model, weight
    - add setters/getters
    - create constructor with 2 params(model, weight)
    - create constructor with 3 params(inside u call the constructor with 2 params)
    - add a method with name 'receiveCall' with one param - name of a caller. Output in console: "Call from {name}"
    - add an overloaded method 'receiveCall' with two params: callerName, callerNumber
    - add a method with name 'sendMessage' with two params:
      receiverNumber, message. Output in console: "Message {message} was sent to {receiverNumber}"
    - add 'Device' class which will be a superclass for Phone class
    - within Device class add method 'getDeviceName()' with proper field 'deviceName'
    - within Phone class add method getDeviceName() which will override super method
    - add Demo class with usage of code above to see how it works