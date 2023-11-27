    function YeniKullaniciKaydi() {
        var kad = document.getElementById('Ad').value;
        var ksoyad = document.getElementById('Soyad').value;
        var kullaniciad = document.getElementById('kullanici').value;
        var keposta = document.getElementById('eposta').value;
        var ksifre = document.getElementById('sifre').value;
        $.ajax({
            type: "GET",
            url: "/newuser/save?name="+kad+"&lastname="+ksoyad+"&username="+kullaniciad+"&email="+keposta+"&pass="+ksifre,
            dataType: "json",
            success: function(result, status, xhr) {

              document.getElementById('kayit').innerText = "Kayıt yapildi";
            },

            error: function(xhr, status, error) {

            }
        });
    }

