$("#submit").click(function(e){
    e.preventDefault();


//    var url2 = "api/rooms/getAll"

    var formData = {number:$("#jsonNo").val()};

    $.ajax({
                contentType: "application/json",
                url: "/api/requestroom",
                type: "POST",
                data: JSON.stringify(formData),
                success: function(result){
                    $("#room").text(result.number);
                    $("#type").text(result.type);
                    $("#price").text(result.price);
                    console.log(result);
                    // var resultToShow = result.loc + " - " + result.age + " - " + result.name;
                    // $("#result").append(resultToShow);
                },
                error: function(jqXHR, textStatus, errorThrown){

                    //
                }
       });

});

//    function allRooms(result){
//
//        for(var i = 0; i < result.length; i++) {
//            var typeToShow = result[i].type + " " + result[i].number + " " + result[i].price + "<br>";
//            $("#allrooms").append(typeToShow + "<br>");
//        }
//    }
//
//    $.get(url2,allRooms );