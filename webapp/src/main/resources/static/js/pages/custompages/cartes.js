const listcards = [];
let nbPage = 0;


$(document).ready(function (){
    $.ajax({
        url: "https://api.fabdb.net",
        type: "GET",
        async: "true",
        success: function (result) {
            nbPage = 12;
        },
        complete: function (){
            console.log(nbPage);
        }
    })



    $.ajax({
        url: "https://api.fabdb.net/cards",
        type: "GET",
        beforeSend: function (){
          console.log(nbPage);
        },
        success: function (result) {
            console.log(result);
        }
    })

})




