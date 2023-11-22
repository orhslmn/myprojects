/*
Originally found at https://cssdeck.com/labs/login-form-using-html5-and-css3
*/

function giris(){

var username = document.getElementById("username").value;
var password = document.getElementById("password").value;

if (username === "admin" && password === "1" ){
 window.location.href = '/main/index.html';
} else {
 window.location.href = '/login/login.html';
}

}