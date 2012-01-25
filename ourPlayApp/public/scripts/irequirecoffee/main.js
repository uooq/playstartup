
var configuration = {
    baseUrl: "/public/",
  paths: {
    cs: "ext/require/cs"
  }
};

require(configuration, ["cs!scripts/irequirecoffee/sayhello"], function() {
    document.getElementById("theButton").onclick = window.sayHello;
});
