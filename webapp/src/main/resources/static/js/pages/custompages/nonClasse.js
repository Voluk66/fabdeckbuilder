let nbPage = 0;
let listCard = {};

$(document).ready(function (){
    $("#apl1").click(function (){
        let idap = "";
        let idr = "";

        if (!$("#ap1").hasClass("active")){
            $("#pagination").find("li").each(
                function () {
                    if ($(this).hasClass('active')){
                        idap = "#" + $(this).attr('id');
                    }
                }
            );
            idr = "r"+idap.split("ap")[1];
            $(idap).removeClass("active");
            $("#ap1").addClass("active");
            document.getElementById(idr).hidden = true;
            document.getElementById("r1").hidden = false;
        }
    });
    $("#previous").click( function (){
        let idap = "";
        let ldap_1 = "";
        let idr = "";
        let idr_1 = "";
        if (!$("#ap1").hasClass("active")){
            $("#pagination").find("li").each(
                function () {
                    if ($(this).hasClass('active')){
                        idap = "#" + $(this).attr('id');
                        idap_1 = "#ap" + (parseInt(idap.split("#ap")[1])-1);
                    }
                }
            );
            idr = "r" + idap.split("ap")[1];
            idr_1 = "r" + idap_1.split("ap")[1];
            $(idap).removeClass("active");
            $(idap_1).addClass("active");
            document.getElementById(idr).hidden = true;
            document.getElementById(idr_1).hidden = false;
        }
    });
    $("#next").click(function (){
        let idap = "";
        let ldap_1 = "";
        let idr = "";
        let idr_1 = "";
        if (!$("#ap"+nbPage).hasClass('active')){
            $("#pagination").find("li").each(
                function () {
                    if ($(this).hasClass('active')){
                        idap = "#" + $(this).attr('id');
                        idap_1 = "#ap" + (parseInt(idap.split("#ap")[1])+1);
                    }
                }
            );
            idr = "r" + idap.split("ap")[1];
            idr_1 = "r" + idap_1.split("ap")[1];
            $(idap).removeClass("active");
            $(idap_1).addClass("active");
            document.getElementById(idr).hidden = true;
            document.getElementById(idr_1).hidden = false;
        }
    })
    $.ajax({
        url: "https://api.fabdb.net/cards?class=none&per_page=30",
        type: "GET",
        async: "true",
        success: function (result) {
            nbPage = parseInt(result.meta.last_page);
            listCard = result.data;
        },
        complete: function (){
            if (nbPage > 1){
                for (let i = 2;i <= nbPage;i++){
                    let id = "#ap" + i;
                    $(id).addClass("page-item");
                    $(id).append("<a class='page-link' id='apl"+ i +"'>"+ i +"</a>")
                    let listCardpage = [];
                    let idr = "r" + i;
                    let idap = "";
                    let idr_1 = "";
                    $.ajax({
                        url: "https://api.fabdb.net/cards?class=none&per_page=30&page=" + i,
                        type: "GET",
                        async: "true",
                        success: function (result) {
                            listCardpage = result.data;
                        },
                        complete: function () {
                            for (let j = 0; j < listCardpage.length; j++) {
                                $("#" + idr).append("<div class='col-md-2'>" +
                                    "<div class='card'>" +
                                    "<div class='card-header'>" +
                                    "<h5>" + listCardpage[j].name + "</h5>" +
                                    "</div>" +
                                    "<div class='card-body' style='text-align: center'>" +
                                    "<img src='" + listCardpage[j].image + "' style='width: 100%'>" +
                                    "</div>" +
                                    "</div>" +
                                    "</div>");
                            };
                        }
                    });
                    $("#apl"+i).click(function (){

                        $("#pagination").find("li").each(
                            function () {
                                if ($(this).hasClass('active')){
                                    idap = "#" + $(this).attr('id');
                                }
                            }
                        )
                        idr_1 = "r" + idap.split("ap")[1]
                        $(idap).removeClass("active");
                        $("#ap" + i).addClass("active");
                        document.getElementById(idr_1).hidden = true;
                        document.getElementById(idr).hidden = false;
                    });
                }
            }
            for (let i = 0; i < listCard.length; i++){
                $("#r1").append("<div class='col-md-2'>" +
                    "<div class='card'>" +
                    "<div class='card-header'>" +
                    "<h5>"+ listCard[i].name + "</h5>" +
                    "</div>" +
                    "<div class='card-body' style='text-align: center'>" +
                    "<img src='"+ listCard[i].image +"' style='width: 100%'>" +
                    "</div>" +
                    "</div>" +
                    "</div>"
                );
            }
            document.getElementById("r1").hidden = false;

        }
    });
})

