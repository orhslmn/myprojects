/*
Originally found at https://cssdeck.com/labs/login-form-using-html5-and-css3
*/

/*function giris(){

var username = document.getElementById("username").value;
var password = document.getElementById("password").value;

if (username === "admin" && password === "1" ){
 window.location.href = '/main/index.html';
} else {
 window.location.href = '/login/login.html';
}

}
*/

/*function giris() {
    var theusername = document.getElementById("username").value;
    var pword = document.getElementById("paword").value;

    $.ajax({
        type: "GET",
        url: "/newuser/usergiris?username=" + username + "&password=" + pword,
        dataType: "json",
        success: function(result, status, xhr) {
            if (result.success) {
                window.location.href = '/main/index.html'; // Kullanıcı veritabanında bulunduğunda başarılı giriş
            } else {
                console.log("Kullanıcı adı bulunamadı veya geçersiz"); // Kullanıcı veritabanında bulunamadığında veya geçersiz olduğunda
                // Başarısız girişte başka bir işlem yapabilirsiniz
            }
        },
        error: function(xhr, status, error) {
            console.error("Hata:", error);
        }
    });
}

*/


function giris() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    $.ajax({
        type: "GET",
        url: "/newuser/usergiris",
        data: {
            username: username,
            pass: password
        },
        dataType: "json",
        success: function(result, status, xhr) {
            if (result.success) {
                window.location.href = '/main/index.html';
            } else {
                alert("kullanici adi yada sifre hatali");
            }
        },
        error: function(xhr, status, error) {
            console.error("Hata:", error);
        }
    });
}

