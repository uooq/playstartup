# this sticking "sayHello" onto the global scope is evil--
window.sayHello = () ->
    alert "Now that I've had my coffee, I'll say hello!"